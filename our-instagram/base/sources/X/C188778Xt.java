package X;

/* renamed from: X.8Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188778Xt extends C0T6 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C188778Xt) {
                C188778Xt c188778Xt = (C188778Xt) obj;
                if (this.A03 != c188778Xt.A03 || this.A02 != c188778Xt.A02 || this.A00 != c188778Xt.A00 || this.A04 != c188778Xt.A04 || this.A01 != c188778Xt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (((i2 + i3) * 31) + this.A00) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "MEMORIES_VIEWER";
        } else {
            str = "ARCHIVE";
        }
        return i6 + str.hashCode() + intValue;
    }

    public C188778Xt(Integer num, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A04 = z3;
        this.A01 = num;
    }
}
