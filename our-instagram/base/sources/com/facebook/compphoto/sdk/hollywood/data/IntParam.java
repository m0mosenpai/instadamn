package com.facebook.compphoto.sdk.hollywood.data;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes4.dex */
public final class IntParam extends C0T6 {
    public final String name;
    public final int value;

    public IntParam(String str, int i) {
        C14360o3.A0B(str, 1);
        this.name = str;
        this.value = i;
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.value;
    }

    public final IntParam copy(String str, int i) {
        C14360o3.A0B(str, 0);
        return new IntParam(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntParam) {
                IntParam intParam = (IntParam) obj;
                if (!C14360o3.A0K(this.name, intParam.name) || this.value != intParam.value) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ IntParam copy$default(IntParam intParam, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = intParam.name;
        }
        if ((i2 & 2) != 0) {
            i = intParam.value;
        }
        C14360o3.A0B(str, 0);
        return new IntParam(str, i);
    }

    public String getName() {
        return this.name;
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m57getValue() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return AbstractC166987dD.A0J(this.name) + this.value;
    }

    public Integer getValue() {
        return Integer.valueOf(this.value);
    }
}
