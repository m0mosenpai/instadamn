package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4B5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4B5 {
    public int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public C4B5(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A07 = str6;
        this.A0H = z9;
        this.A0I = z10;
        this.A0E = z6;
        this.A0D = z5;
        this.A0C = z4;
        this.A0B = z3;
        this.A0A = z2;
        this.A09 = z;
        this.A0J = z11;
        this.A05 = str4;
        this.A06 = str5;
        this.A04 = str3;
        this.A08 = str7;
        this.A02 = str;
        this.A0G = z8;
        this.A01 = i;
        this.A0F = z7;
        this.A0K = z12;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4B5 c4b5 = (C4B5) obj;
            int i2 = this.A00;
            return (i2 == 0 || (i = c4b5.A00) == 0 || i2 == i) && Util.A0I(this.A07, c4b5.A07) && this.A0H == c4b5.A0H && this.A0I == c4b5.A0I && this.A0E == c4b5.A0E && this.A0D == c4b5.A0D && this.A0C == c4b5.A0C && this.A0B == c4b5.A0B && this.A0A == c4b5.A0A && this.A09 == c4b5.A09 && this.A0J == c4b5.A0J && Util.A0I(this.A05, c4b5.A05) && Util.A0I(this.A06, c4b5.A06) && Util.A0I(this.A04, c4b5.A04) && Util.A0I(this.A08, c4b5.A08) && Util.A0I(this.A02, c4b5.A02) && this.A0G == c4b5.A0G && this.A01 == c4b5.A01 && this.A0F == c4b5.A0F && this.A0K == c4b5.A0K && Util.A0I(this.A03, c4b5.A03);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.A00;
        if (i == 0) {
            String str = this.A07;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (((((((((((((((((((527 + hashCode) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31;
            String str2 = this.A05;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i4 = (i3 + hashCode2) * 31;
            String str3 = this.A06;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i5 = (i4 + hashCode3) * 31;
            String str4 = this.A04;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i6 = (i5 + hashCode4) * 31;
            String str5 = this.A08;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i7 = (i6 + hashCode5) * 31;
            String str6 = this.A02;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i8 = (((((((((i7 + hashCode6) * 31) + (this.A0G ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31;
            String str7 = this.A03;
            if (str7 != null) {
                i2 = str7.hashCode();
            }
            int i9 = i8 + i2;
            this.A00 = i9;
            return i9;
        }
        return i;
    }

    public C4B5(C4B4 c4b4) {
        this.A07 = c4b4.A06;
        this.A0H = c4b4.A0G;
        this.A0I = c4b4.A0H;
        this.A0E = c4b4.A0D;
        this.A0D = c4b4.A0C;
        this.A0C = c4b4.A0B;
        this.A0B = c4b4.A0A;
        this.A0A = c4b4.A09;
        this.A09 = c4b4.A08;
        this.A0J = c4b4.A0I;
        this.A05 = c4b4.A04;
        this.A06 = c4b4.A05;
        this.A04 = c4b4.A03;
        this.A08 = c4b4.A07;
        this.A02 = c4b4.A01;
        this.A0G = c4b4.A0F;
        this.A01 = c4b4.A00;
        this.A0F = c4b4.A0E;
        this.A0K = c4b4.A0J;
        this.A03 = c4b4.A02;
    }
}
