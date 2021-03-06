package com.github.kamefrede.rpsideas.spells.operator;

import com.github.kamefrede.rpsideas.spells.base.SpellParams;
import vazkii.psi.api.internal.Vector3;
import vazkii.psi.api.spell.*;
import vazkii.psi.api.spell.param.ParamVector;
import vazkii.psi.api.spell.piece.PieceOperator;

public class PieceOperatorVectorAbsolute extends PieceOperator {

    public SpellParam vec;

    public PieceOperatorVectorAbsolute(Spell spell) {
        super(spell);
    }

    @Override
    public void initParams() {
        addParam(vec = new ParamVector(SpellParams.GENERIC_NAME_VECTOR, SpellParam.RED, false, false));
    }

    @Override
    public void addToMetadata(SpellMetadata meta) throws SpellCompilationException {
        super.addToMetadata(meta);
    }

    @Override
    public Object execute(SpellContext context) throws SpellRuntimeException {
        Vector3 vector = this.<Vector3>getParamValue(context, vec);
        if(vector == null || vector.isZero()) throw new SpellRuntimeException(SpellRuntimeException.NULL_VECTOR);
        return new Vector3(Math.abs(vector.x), Math.abs(vector.y), Math.abs(vector.z));
    }

    @Override
    public Class<?> getEvaluationType() {
        return Vector3.class;
    }
}
