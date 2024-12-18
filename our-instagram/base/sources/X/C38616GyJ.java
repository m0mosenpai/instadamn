package X;

/* renamed from: X.GyJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38616GyJ extends C0T6 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38616GyJ) {
                C38616GyJ c38616GyJ = (C38616GyJ) obj;
                if (this.A00 != c38616GyJ.A00 || this.A01 != c38616GyJ.A01 || this.A03 != c38616GyJ.A03 || this.A02 != c38616GyJ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        int A0D = (AbstractC167007dF.A0D(this.A03, ((this.A00 * 31) + this.A01) * 31) + AbstractC53644Nnp.A00()) * 31;
        Integer num = this.A02;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "SHOWN_HIGHLIGHTED";
                    break;
                case 2:
                    str = "SHOWN_MIDSCENE";
                    break;
                case 3:
                    str = "NOT_SHOWN";
                    break;
                default:
                    str = "SHOWN_NOT_HIGHLIGHTED";
                    break;
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return A0D + A02;
    }

    public C38616GyJ(Integer num, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = num;
    }
}
