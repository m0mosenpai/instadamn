package X;

/* loaded from: classes9.dex */
public final class MX6 extends C0T6 {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public MX6(Integer num, Integer num2, String str, String str2, int i) {
        this.A05 = 0;
        this.A01 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A05 != 0) {
            if (this != obj) {
                if (obj instanceof MX6) {
                    MX6 mx6 = (MX6) obj;
                    if (mx6.A05 != 1 || !C14360o3.A0K(this.A02, mx6.A02) || this.A01 != mx6.A01 || !C14360o3.A0K(this.A03, mx6.A03) || this.A00 != mx6.A00 || !C14360o3.A0K(this.A04, mx6.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof MX6)) {
                return false;
            }
            MX6 mx62 = (MX6) obj;
            if (mx62.A05 != 0 || this.A01 != mx62.A01 || !C14360o3.A0K(this.A04, mx62.A04) || !C14360o3.A0K(this.A03, mx62.A03) || this.A02 != mx62.A02 || this.A00 != mx62.A00) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0H;
        int i;
        if (this.A05 != 0) {
            A0H = (AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31;
            i = AbstractC25227BEk.A07(this.A04);
        } else {
            int A0H2 = AbstractC166987dD.A0H(this.A01);
            switch (A0H2) {
                case 1:
                    str = "PREVIEW";
                    break;
                case 2:
                    str = "CUSTOM";
                    break;
                default:
                    str = "DRAFT";
                    break;
            }
            int A0K = AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A04, AbstractC25228BEl.A0F(str, A0H2)));
            int A0H3 = AbstractC166987dD.A0H(this.A02);
            switch (A0H3) {
                case 1:
                    str2 = "MANAGE";
                    break;
                case 2:
                    str2 = "SEE_ALL";
                    break;
                case 3:
                    str2 = "SEE_FEWER";
                    break;
                default:
                    str2 = "HIDE";
                    break;
            }
            A0H = AbstractC25231BEo.A0H(str2, A0H3, A0K);
            i = this.A00;
        }
        return A0H + i;
    }

    public final String toString() {
        if (1 - this.A05 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserPaySupporter(user=");
        A1C.append(this.A02);
        A1C.append(", supporterTier=");
        A1C.append(this.A01);
        A1C.append(", timeSeries=");
        A1C.append(this.A03);
        A1C.append(", badgesCount=");
        A1C.append(this.A00);
        A1C.append(", totalAmount=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    public MX6() {
        this.A05 = 1;
        this.A05 = 1;
        this.A05 = 1;
        this.A02 = null;
        this.A01 = null;
        this.A03 = "";
        this.A00 = 0;
        this.A04 = null;
    }
}
