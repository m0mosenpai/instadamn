package X;

/* renamed from: X.5LT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LT extends C0T6 {
    public final C5LS A00;
    public final C5LU A01;
    public final C38321qM A02;
    public final C3r3 A03;
    public final C75113Zb A04;
    public final EnumC906041v A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final Integer A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5LT) {
                C5LT c5lt = (C5LT) obj;
                if (!C14360o3.A0K(this.A07, c5lt.A07) || !C14360o3.A0K(this.A06, c5lt.A06) || this.A09 != c5lt.A09 || this.A05 != c5lt.A05 || this.A0D != c5lt.A0D || !C14360o3.A0K(this.A01, c5lt.A01) || !C14360o3.A0K(this.A0C, c5lt.A0C) || !C14360o3.A0K(this.A00, c5lt.A00) || !C14360o3.A0K(this.A04, c5lt.A04) || !C14360o3.A0K(this.A02, c5lt.A02) || !C14360o3.A0K(this.A03, c5lt.A03) || this.A08 != c5lt.A08 || this.A0B != c5lt.A0B || this.A0A != c5lt.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A07.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        EnumC906041v enumC906041v = this.A05;
        if (enumC906041v == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC906041v.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        int i6 = 1237;
        if (this.A0D) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        C5LU c5lu = this.A01;
        if (c5lu == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c5lu.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        Integer num = this.A0C;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode5 = (((((((((i8 + i) * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (hashCode5 + i9) * 31;
        int i11 = 1237;
        if (this.A0B) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0A) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    public C5LT(C5LS c5ls, C5LU c5lu, C38321qM c38321qM, C3r3 c3r3, C75113Zb c75113Zb, EnumC906041v enumC906041v, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A07 = str;
        this.A06 = str2;
        this.A09 = z;
        this.A05 = enumC906041v;
        this.A0D = z2;
        this.A01 = c5lu;
        this.A0C = num;
        this.A00 = c5ls;
        this.A04 = c75113Zb;
        this.A02 = c38321qM;
        this.A03 = c3r3;
        this.A08 = z3;
        this.A0B = z4;
        this.A0A = z5;
    }
}
