package com.github.kamefrede.rpsideas.spells.operator;

import com.github.kamefrede.rpsideas.spells.base.SpellParams;
import com.github.kamefrede.rpsideas.spells.base.SpellRuntimeExceptions;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.api.spell.SpellParam;
import vazkii.psi.api.spell.SpellRuntimeException;
import vazkii.psi.api.spell.param.ParamEntity;
import vazkii.psi.api.spell.piece.PieceOperator;

public class PieceOperatorVisibleToEntity extends PieceOperator {

    SpellParam entity1;
    SpellParam entity2;




    public PieceOperatorVisibleToEntity(Spell spell) {
        super(spell);
    }

    @Override
    public void initParams() {
        super.initParams();
        addParam(entity1 = new ParamEntity(SpellParams.GENERIC_NAME_ENTITY1, SpellParam.BLUE, false, false));
        addParam(entity2 = new ParamEntity(SpellParams.GENERIC_NAME_ENTITY2, SpellParam.RED, false, false));
    }

    @Override
    public Object execute(SpellContext context) throws SpellRuntimeException {
        if(context.caster.world.isRemote) return null;
        Entity entval1 = this.<Entity>getParamValue(context, entity1);
        Entity entval2 = this.<Entity>getParamValue(context, entity2);
        if(entval1 == null || entval2 == null) throw new SpellRuntimeException(SpellRuntimeException.NULL_TARGET);
        if(entval1 instanceof EntityLivingBase){
           if(((EntityLivingBase) entval1).canEntityBeSeen(entval2)){
               return 1;
           } else {
               return 0;
           }

        }else{
            throw new SpellRuntimeException(SpellRuntimeExceptions.ENTITY_NOT_LIVING);
        }

    }

    @Override
    public Class<?> getEvaluationType() {
        return Double.class;
    }
}
