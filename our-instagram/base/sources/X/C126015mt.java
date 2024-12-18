package X;

/* renamed from: X.5mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126015mt extends C0T6 implements InterfaceC126025mu {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C126015mt) {
                C126015mt c126015mt = (C126015mt) obj;
                if (this.A00 != c126015mt.A00 || this.A01 != c126015mt.A01 || this.A02 != c126015mt.A02 || this.A03 != c126015mt.A03 || this.A04 != c126015mt.A04 || this.A05 != c126015mt.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A03) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A04) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A05) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C126015mt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }
}
