package X;

/* renamed from: X.5yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132335yC extends C0T6 {
    public final int A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final C5Hc A05;
    public final C5Hc A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C132335yC(Boolean bool, Integer num, String str, String str2, C5Hc c5Hc, C5Hc c5Hc2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(c5Hc, 4);
        C14360o3.A0B(c5Hc2, 5);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = num;
        this.A06 = c5Hc;
        this.A05 = c5Hc2;
        this.A0A = z;
        this.A00 = i;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A01 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132335yC) {
                C132335yC c132335yC = (C132335yC) obj;
                if (!C14360o3.A0K(this.A03, c132335yC.A03) || !C14360o3.A0K(this.A04, c132335yC.A04) || this.A02 != c132335yC.A02 || !C14360o3.A0K(this.A06, c132335yC.A06) || !C14360o3.A0K(this.A05, c132335yC.A05) || this.A0A != c132335yC.A0A || this.A00 != c132335yC.A00 || this.A07 != c132335yC.A07 || this.A08 != c132335yC.A08 || this.A09 != c132335yC.A09 || !C14360o3.A0K(this.A01, c132335yC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31;
        Integer num = this.A02;
        int hashCode3 = (((((hashCode2 + AbstractC123875j1.A00(num).hashCode() + num.intValue()) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int i2 = (((hashCode3 + i) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Boolean bool = this.A01;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return i8 + hashCode;
    }
}
