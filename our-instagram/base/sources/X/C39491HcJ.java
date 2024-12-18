package X;

/* renamed from: X.HcJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39491HcJ extends AbstractC39675Hj7 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39491HcJ) {
                C39491HcJ c39491HcJ = (C39491HcJ) obj;
                if (!C14360o3.A0K(this.A01, c39491HcJ.A01) || this.A00 != c39491HcJ.A00 || !C14360o3.A0K(this.A02, c39491HcJ.A02) || this.A03 != c39491HcJ.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        int A0J = AbstractC166987dD.A0J(this.A01);
        Integer num = this.A00;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "BANNER_AD_SHOWN";
            } else {
                str = "DEFAULT";
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0K(this.A02, (A0J + A02) * 31));
    }

    public C39491HcJ(Integer num, String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
        this.A03 = z;
    }
}
