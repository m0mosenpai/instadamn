package X;

/* renamed from: X.GyX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38630GyX extends C0T6 {
    public final int A00;
    public final C50679MYx A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38630GyX) {
                C38630GyX c38630GyX = (C38630GyX) obj;
                if (!C14360o3.A0K(this.A03, c38630GyX.A03) || !C14360o3.A0K(this.A04, c38630GyX.A04) || !C14360o3.A0K(this.A05, c38630GyX.A05) || this.A00 != c38630GyX.A00 || this.A06 != c38630GyX.A06 || this.A02 != c38630GyX.A02 || !C14360o3.A0K(this.A01, c38630GyX.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        int A0D = (AbstractC167007dF.A0D(this.A06, (((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0O(this.A05)) * 31 * 31 * 31 * 31) + this.A00) * 31) + AbstractC53644Nnp.A00()) * 31;
        Integer num = this.A02;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "Reply";
            } else {
                str = "Parent";
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return ((A0D + A02) * 31 * 31 * 31 * 31 * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38630GyX(C50679MYx c50679MYx, Integer num, String str, String str2, String str3, int i, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = z;
        this.A02 = num;
        this.A01 = c50679MYx;
    }
}
