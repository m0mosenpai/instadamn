package com.facebook.mantle.common.mantledatavalue;

import X.C09170dP;
import X.C129695tZ;
import X.C14360o3;
import X.EnumC129705ta;

/* loaded from: classes3.dex */
public final class MantleDataValue {
    public static final C129695tZ Companion = new Object();
    public final EnumC129705ta type;
    public final Object value;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5tZ, java.lang.Object] */
    static {
        C09170dP.A0C("mantle-common-mantleDataValue");
    }

    private final int getTypeCode() {
        return this.type.A00;
    }

    public final EnumC129705ta getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public MantleDataValue(int i, Object obj) {
        this.type = EnumC129705ta.values()[i];
        this.value = obj;
    }

    public MantleDataValue(EnumC129705ta enumC129705ta, Object obj) {
        C14360o3.A0B(enumC129705ta, 1);
        this.type = enumC129705ta;
        this.value = obj;
    }
}
