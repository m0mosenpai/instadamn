package com.facebook.compphoto.sdk.hollywood.data;

import X.AbstractC166987dD;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes4.dex */
public final class BooleanParam extends C0T6 {
    public final String name;
    public final boolean value;

    public BooleanParam(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.name = str;
        this.value = z;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final BooleanParam copy(String str, boolean z) {
        C14360o3.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BooleanParam) {
                BooleanParam booleanParam = (BooleanParam) obj;
                if (!C14360o3.A0K(this.name, booleanParam.name) || this.value != booleanParam.value) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ BooleanParam copy$default(BooleanParam booleanParam, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = booleanParam.name;
        }
        if ((i & 2) != 0) {
            z = booleanParam.value;
        }
        C14360o3.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public String getName() {
        return this.name;
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m55getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return AbstractC166987dD.A0K(this.value, AbstractC166987dD.A0J(this.name));
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
