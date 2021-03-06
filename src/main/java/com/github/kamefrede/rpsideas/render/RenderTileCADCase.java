package com.github.kamefrede.rpsideas.render;

import com.github.kamefrede.rpsideas.blocks.BlockCADCase;
import com.github.kamefrede.rpsideas.blocks.PsionicBlocksCompat;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.items.IItemHandler;
import com.github.kamefrede.rpsideas.tiles.TileCADCase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderTileCADCase extends TileEntitySpecialRenderer<TileCADCase> {
    @CapabilityInject(IItemHandler.class)
    public static final Capability<IItemHandler> ITEM_HANDLER_CAPABILITY = null;

    @Override
    public void render(TileCADCase cadCase, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        IBlockState state = cadCase.getWorld().getBlockState(cadCase.getPos());
        if(state.getBlock() != PsionicBlocksCompat.cadCase || !state.getValue(BlockCADCase.OPEN)) return;

        IItemHandler itemHandler = cadCase.getCapability(ITEM_HANDLER_CAPABILITY, null);
        if(itemHandler == null) return;

        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x, y, z);

        EnumFacing facing = state.getValue(BlockCADCase.FACING);
        GlStateManager.rotate(-facing.getHorizontalAngle(), 0f, 1f, 0f);
        if(facing == EnumFacing.NORTH) {
            GlStateManager.translate(-1f, 0f, -1f);
        } else if (facing == EnumFacing.WEST) {
            GlStateManager.translate(0f, 0f, -1f);
        } else if (facing == EnumFacing.EAST) {
            GlStateManager.translate(-1f, 0f, 0f);
        }

        GlStateManager.pushMatrix();
        GlStateManager.rotate(-90f, 1f, 0f, 0f);
        GlStateManager.scale(0.35d, 0.35d, 0.35d);
        GlStateManager.translate(2.0f, -1.45f, 0.3f);
        renderItem.renderItem(itemHandler.getStackInSlot(0), ItemCameraTransforms.TransformType.FIXED);
        GlStateManager.popMatrix();

        GlStateManager.rotate(-90f, 1f, 0f, 0f);
        GlStateManager.scale(0.35d, 0.35d, 0.35d);
        GlStateManager.translate(0.75f, -1.45f, 0.3f);
        renderItem.renderItem(itemHandler.getStackInSlot(1), ItemCameraTransforms.TransformType.FIXED);

        GlStateManager.color(1f, 1f, 1f);
        GlStateManager.disableBlend();
        GlStateManager.enableRescaleNormal();
        GlStateManager.popMatrix();
    }
}
