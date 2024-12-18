package X;

/* renamed from: X.MsO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51693MsO extends C0T6 {
    public final int A00;
    public final MUD A01;
    public final EnumC33370Ep3 A02;
    public final Integer A03;

    public C51693MsO(MUD mud, EnumC33370Ep3 enumC33370Ep3, Integer num, int i) {
        this.A02 = enumC33370Ep3;
        this.A03 = num;
        this.A00 = i;
        this.A01 = mud;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51693MsO) {
                C51693MsO c51693MsO = (C51693MsO) obj;
                if (this.A02 != c51693MsO.A02 || this.A03 != c51693MsO.A03 || this.A00 != c51693MsO.A00 || !C14360o3.A0K(this.A01, c51693MsO.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C51693MsO(OAY oay) {
        int i = oay.A02;
        EnumC33370Ep3 enumC33370Ep3 = oay.A01;
        MUD mud = oay.A00;
        this.A02 = enumC33370Ep3;
        this.A03 = null;
        this.A00 = i;
        this.A01 = mud;
    }

    public final int hashCode() {
        String str;
        int A02;
        int A0M = AbstractC167017dG.A0M(this.A02) * 31;
        Integer num = this.A03;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "UNFOLLOW";
                    break;
                case 2:
                    str = "CONFIRM";
                    break;
                case 3:
                    str = "REQUEST_CANCELLED";
                    break;
                case 4:
                    str = "UNBLOCK";
                    break;
                case 5:
                    str = "DELETE";
                    break;
                default:
                    str = "FOLLOW";
                    break;
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return ((((A0M + A02) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
