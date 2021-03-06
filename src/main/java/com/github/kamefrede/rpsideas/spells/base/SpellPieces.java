package com.github.kamefrede.rpsideas.spells.base;


import com.github.kamefrede.rpsideas.compat.botania.BotaniaCompatPieces;
import com.github.kamefrede.rpsideas.spells.operator.*;
import com.github.kamefrede.rpsideas.spells.selector.*;
import com.github.kamefrede.rpsideas.spells.trick.*;
import com.github.kamefrede.rpsideas.util.libs.LibPieces;
import com.github.kamefrede.rpsideas.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import vazkii.psi.api.PsiAPI;
import vazkii.psi.api.spell.SpellPiece;
import vazkii.psi.common.lib.LibPieceGroups;

public class SpellPieces  {

    public static void init(){

        PsiAPI.setGroupRequirements(LibPieces.ALTERNATE_CONJURATION, 21, LibPieceGroups.BLOCK_CONJURATION);
        PsiAPI.setGroupRequirements(LibPieces.SECONDARY_VECTOR_OPERATORS, 21, LibPieceGroups.TRIGNOMETRY);
        PsiAPI.setGroupRequirements(LibPieces.SECONDARY_VECTOR_OPERATORS, 21, LibPieceGroups.TRIGNOMETRY);
        PsiAPI.setGroupRequirements(LibPieces.BLOCK_PROPERTIES, 21, LibPieceGroups.BLOCK_CONJURATION);

        register(PieceTrickConjureEtherealBlock.class, LibPieces.TRICK_CONJURE_ETHEREAL_BLOCK, LibPieceGroups.BLOCK_CONJURATION);
        register(PieceTrickConjureEtherealBlockSequence.class, LibPieces.TRICK_CONJURE_ETHEREAL_BLOCK_SEQUENCE, LibPieceGroups.BLOCK_CONJURATION);
        register(PieceSelectorNearbyPlayers.class, LibPieces.SELECTOR_NEARBY_PLAYERS, LibPieceGroups.ENTITIES_INTRO);
        register(PieceTrickDirectionPlaceBlock.class, LibPieces.TRICK_DIRECTION_PLACE_BLOCK, LibPieceGroups.BLOCK_WORKS);
        register(PieceOperatorExtractSign.class, LibPieces.OPERATOR_EXTRACT_SIGN, LibPieceGroups.TRIGNOMETRY);
        register(PieceOperatorToDegrees.class, LibPieces.OPERATOR_TO_DEGREES, LibPieceGroups.TRIGNOMETRY);
        register(PieceOperatorToRadians.class, LibPieces.OPERATOR_TO_RADIANS, LibPieceGroups.TRIGNOMETRY);
        register(PieceOperatorRoot.class, LibPieces.OPERATOR_ROOT, LibPieceGroups.TRIGNOMETRY);
        register(PieceTrickPlant.class, LibPieces.TRICK_PLANT, LibPieceGroups.BLOCK_WORKS);
        register(PieceTrickPlantSequence.class, LibPieces.TRICK_PLANT_SEQUENCE, LibPieceGroups.BLOCK_WORKS);
        register(PieceTrickTill.class, LibPieces.TRICK_TILL, LibPieceGroups.BLOCK_WORKS);
        register(PieceTrickTillSequence.class, LibPieces.TRICK_TILL_SEQUENCE, LibPieceGroups.BLOCK_WORKS);
        register(PieceOperatorListSize.class, LibPieces.OPERATOR_LIST_SIZE, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorGetBlockHardness.class, LibPieces.OPERATOR_GET_BLOCK_HARDNESS, LibPieces.BLOCK_PROPERTIES);
        register(PieceOperatorGetBlockLight.class, LibPieces.OPERATOR_GET_BLOCK_LIGHT, LibPieces.BLOCK_PROPERTIES);
        register(PieceOperatorGetBlockComparatorStrength.class, LibPieces.OPERATOR_GET_COMPARATOR_STRENGTH, LibPieces.BLOCK_PROPERTIES);
        register(PieceOperatorGetBlockSolidity.class, LibPieces.OPERATOR_GET_BLOCK_SOLIDITY, LibPieces.BLOCK_PROPERTIES);
        register(PieceOperatorGetBlockProperties.class, LibPieces.OPERATOR_GET_BLOCK_PROPERTIES, LibPieces.BLOCK_PROPERTIES, true);
        register(PieceOperatorVectorRotate.class, LibPieces.OPERATOR_VECTOR_ROTATE, LibPieces.SECONDARY_VECTOR_OPERATORS);
        register(PieceOperatorVectorFallback.class, LibPieces.OPERATOR_VECTOR_FALLBACK, LibPieces.SECONDARY_VECTOR_OPERATORS);
        register(PieceOperatorVectorStrongRaycast.class, LibPieces.OPERATOR_VECTOR_STRONG_RAYCAST, LibPieces.SECONDARY_VECTOR_OPERATORS);
        register(PiecePieceOperatorVectorStrongRaycastAxis.class, LibPieces.OPERATOR_STRONG_VECTOR_RAYCAST_AXIS, LibPieces.SECONDARY_VECTOR_OPERATORS);
        register(PieceOperatorPlanarNormalVector.class, LibPieces.OPERATOR_PLANAR_NORMAL_VECTOR, LibPieces.SECONDARY_VECTOR_OPERATORS, true);
        register(PieceTrickConjurePulsar.class, LibPieces.TRICK_PULSAR, LibPieces.ALTERNATE_CONJURATION, true);
        register(PieceTrickConjurePulsarSequence.class, LibPieces.TRICK_PULSAR_SEQUENCE, LibPieces.ALTERNATE_CONJURATION);
        register(PieceTrickPulsarLight.class, LibPieces.TRICK_PULSAR_LIGHT, LibPieces.ALTERNATE_CONJURATION);
        register(PieceTrickParticleTrail.class, LibPieces.TRICK_PARTICLE_TRAIL, LibPieces.ALTERNATE_CONJURATION);
        register(PieceTrickDebugSpamless.class, LibPieces.TRICK_DEBUG_SPAMLESS, LibPieceGroups.TUTORIAL_1);
        register(PieceTrickConjureStar.class, LibPieces.TRICK_CONJURE_STAR, LibPieces.ALTERNATE_CONJURATION);
        register(PieceTrickBreakLoop.class, LibPieces.TRICK_BREAK_LOOP, LibPieceGroups.FLOW_CONTROL);
        register(PieceSelectorCasterBattery.class, LibPieces.SELECTOR_CASTER_BATTERY, LibPieceGroups.MEMORY_MANAGEMENT);
        register(PieceSelectorCasterEnergy.class, LibPieces.SELECTOR_CASTER_ENERGY, LibPieceGroups.MEMORY_MANAGEMENT);
        register(PieceSelectorEmptyList.class, LibPieces.SELECTOR_EMPTY_LIST, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorListUnion.class, LibPieces.OPERATOR_LIST_UNION, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorListIntersection.class, LibPieces.OPERATOR_LIST_INTERSECTION, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorListExclusion.class, LibPieces.OPERATOR_LIST_EXCLUSION, LibPieceGroups.ENTITIES_INTRO);
        register(PieceTrickNausea.class, LibPieces.PIECE_TRICK_NAUSEA, LibPieceGroups.NEGATIVE_EFFECTS);
        register(PieceTrickBlindness.class, LibPieces.PIECE_TRICK_BLINDNESS, LibPieceGroups.NEGATIVE_EFFECTS);
        register(PieceSelectorEidosTimestamp.class, LibPieces.PIECE_SELECTOR_EIDOS_TIMESTAMP, LibPieceGroups.EIDOS_REVERSAL);
        register(PieceSelectorNearbyVehicles.class, LibPieces.SELECTOR_NEARBY_VECHICLES, LibPieceGroups.ENTITIES_INTRO);
        register(PieceSelectorFallingBlocks.class, LibPieces.SELECTOR_NEARBY_FALLING_BLOCKS, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorGetSignText.class, LibPieces.OPERATOR_GET_SIGN_TEXT, LibPieceGroups.MEMORY_MANAGEMENT);
        register(PieceTrickMoveBlockSequence.class, LibPieces.TRICK_MOVE_BLOCK_SEQUENCE, LibPieceGroups.BLOCK_MOVEMENT);
        register(PieceOperatorGetComment.class, LibPieces.OPERATOR_GET_COMMENT, LibPieceGroups.MEMORY_MANAGEMENT);
        register(PieceSelectorGlowing.class, LibPieces.SELECTOR_GLOWING, LibPieceGroups.ENTITIES_INTRO);
        register(PieceSelectorListFilter.class, LibPieces.SELECTOR_LIST_FILTER, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorVisibleToEntity.class, LibPieces.OPERATOR_IS_VISIBLE, LibPieceGroups.DETECTION_DYNAMICS);
        register(PieceSelectorAffectedByPotions.class, LibPieces.SELECTOR_AFFECTED_BY_POTIONS, LibPieceGroups.ENTITIES_INTRO);
        register(PieceSelectorVisibleEntities.class, LibPieces.SELECTOR_VISIBLE_ENTITIES, LibPieceGroups.ENTITIES_INTRO);
        register(PieceOperatorVectorAbsolute.class, LibPieces.OPERATOR_VECTOR_ABSOLUTE, LibPieceGroups.VECTORS_INTRO);
        register(OperatorDistanceFromGround.class, LibPieces.OPERATOR_GET_DISTANCE_FROM_GROUND, LibPieceGroups.SECONDARY_OPERATORS);
        register(PieceOperatorEntityRaycast.class, LibPieces.OPERATOR_ENTITY_RAYCAST, LibPieceGroups.SECONDARY_OPERATORS);
        register(PieceTrickConjureGravityBlock.class, LibPieces.TRICK_CONJURE_GRAVITY, LibPieceGroups.BLOCK_CONJURATION);
        register(PieceTrickConjureGravityBlockSequence.class, LibPieces.TRICK_CONJURE_GRAVITY_SEQUENCE, LibPieceGroups.BLOCK_CONJURATION);
        if(Loader.isModLoaded("botania")) {
            BotaniaCompatPieces.init();
        }


    }

    public static void register(Class<? extends SpellPiece> pieceClass, String name, String group) {
        register(pieceClass, name, group, false);
    }

    public static void register(Class<? extends SpellPiece> pieceClass, String name, String group, boolean main) {
        String key = Reference.MODID + "." + name;
        PsiAPI.registerSpellPiece(key, pieceClass);
        PsiAPI.simpleSpellTextures.put(key, new ResourceLocation(Reference.MODID, "textures/spell/" + name + ".png"));
        PsiAPI.addPieceToGroup(pieceClass, group, main);
    }
}
