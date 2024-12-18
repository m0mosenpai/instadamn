package com.facebook.papaya.store;

import X.C14360o3;
import X.EnumC61174Rga;

/* loaded from: classes10.dex */
public final class Property {
    public final long id;
    public final EnumC61174Rga type;
    public final Object value;

    private final int getTypeCode() {
        return this.type.A00;
    }

    public final long getId() {
        return this.id;
    }

    public final EnumC61174Rga getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public Property(long j, Object obj, int i) {
        this.id = j;
        this.type = EnumC61174Rga.values()[i];
        this.value = obj;
    }

    public Property(long j, Object obj, EnumC61174Rga enumC61174Rga) {
        C14360o3.A0B(enumC61174Rga, 3);
        this.id = j;
        this.type = enumC61174Rga;
        this.value = obj;
    }
}
