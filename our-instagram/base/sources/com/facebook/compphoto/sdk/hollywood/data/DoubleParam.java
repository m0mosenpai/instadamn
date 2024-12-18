package com.facebook.compphoto.sdk.hollywood.data;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes10.dex */
public final class DoubleParam extends C0T6 {
    public final String name;
    public final double value;

    public DoubleParam(String str, double d) {
        C14360o3.A0B(str, 1);
        this.name = str;
        this.value = d;
    }

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.value;
    }

    public final DoubleParam copy(String str, double d) {
        C14360o3.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DoubleParam) {
                DoubleParam doubleParam = (DoubleParam) obj;
                if (!C14360o3.A0K(this.name, doubleParam.name) || Double.compare(this.value, doubleParam.value) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ DoubleParam copy$default(DoubleParam doubleParam, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doubleParam.name;
        }
        if ((i & 2) != 0) {
            d = doubleParam.value;
        }
        C14360o3.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return Double.valueOf(this.value);
    }

    public int hashCode() {
        return AbstractC166987dD.A0J(this.name) + AbstractC25228BEl.A03(Double.doubleToLongBits(this.value));
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m56getValue() {
        return Double.valueOf(this.value);
    }
}
