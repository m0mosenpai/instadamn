package X;

import java.util.Arrays;

/* renamed from: X.5oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127215oz {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C127215oz)) {
            return false;
        }
        C127215oz c127215oz = (C127215oz) obj;
        if (!AbstractC50102Ry.A00(this.A00, c127215oz.A00) || this.A01 != c127215oz.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A01)});
    }

    public C127215oz(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
