package X;

/* renamed from: X.7ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174587ps extends C0T6 {
    public static final C174587ps A07 = new C174587ps(null, null, false, false, false, false, false);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174587ps) {
                C174587ps c174587ps = (C174587ps) obj;
                if (!C14360o3.A0K(this.A01, c174587ps.A01) || !C14360o3.A0K(this.A00, c174587ps.A00) || this.A06 != c174587ps.A06 || this.A03 != c174587ps.A03 || this.A02 != c174587ps.A02 || this.A04 != c174587ps.A04 || this.A05 != c174587ps.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A04) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A05) {
            i12 = 1231;
        }
        return i11 + i12;
    }

    public C174587ps(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = str;
        this.A00 = str2;
        this.A06 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A05 = z5;
    }
}
