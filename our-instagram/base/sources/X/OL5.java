package X;

/* loaded from: classes9.dex */
public final class OL5 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
                OL5 ol5 = (OL5) obj;
                if (this.A05 != ol5.A05 || this.A06 != ol5.A06 || !C14360o3.A0K(this.A01, ol5.A01) || !C14360o3.A0K(this.A03, ol5.A03) || !C14360o3.A0K(this.A02, ol5.A02) || this.A08 != ol5.A08 || !C14360o3.A0K(this.A04, ol5.A04) || this.A00 != ol5.A00 || this.A07 != ol5.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = 0;
        int A0D = (AbstractC167007dF.A0D(this.A08, (((((AbstractC167007dF.A0D(this.A06, AbstractC25225BEi.A08(this.A05)) + AbstractC31177DnL.A04(this.A01)) * 31) + AbstractC31177DnL.A04(this.A03)) * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC31177DnL.A04(this.A04)) * 31;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "RECOMMEND";
            } else {
                str = "CROSSPOST";
            }
            i = AbstractC25226BEj.A02(str, intValue);
        }
        return AbstractC166987dD.A0K(this.A07, (A0D + i) * 31);
    }
}
