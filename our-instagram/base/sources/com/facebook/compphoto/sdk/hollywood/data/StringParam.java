package com.facebook.compphoto.sdk.hollywood.data;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes4.dex */
public final class StringParam extends C0T6 {
    public final String name;
    public final String value;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StringParam) {
                StringParam stringParam = (StringParam) obj;
                if (!C14360o3.A0K(this.name, stringParam.name) || !C14360o3.A0K(this.value, stringParam.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ StringParam copy$default(StringParam stringParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringParam.name;
        }
        if ((i & 2) != 0) {
            str2 = stringParam.value;
        }
        AbstractC167017dG.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public String getName() {
        return this.name;
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public String m58getValue() {
        return this.value;
    }

    public int hashCode() {
        return AbstractC166987dD.A0J(this.name) + this.value.hashCode();
    }

    public StringParam(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.name = str;
        this.value = str2;
    }

    public final StringParam copy(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this.value;
    }
}
