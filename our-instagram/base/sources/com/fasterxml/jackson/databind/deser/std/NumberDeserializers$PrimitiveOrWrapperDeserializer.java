package com.fasterxml.jackson.databind.deser.std;

/* loaded from: classes2.dex */
public abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer extends StdScalarDeserializer {
    public final Integer A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public NumberDeserializers$PrimitiveOrWrapperDeserializer(Class cls, Integer num, Object obj, Object obj2) {
        super(cls);
        this.A00 = num;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = cls.isPrimitive();
    }
}
