package X;

/* renamed from: X.MsK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51689MsK extends C0T6 {
    public final int A00 = 1;
    public final Object A01;

    public C51689MsK(Integer num) {
        C14360o3.A0B(num, 1);
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51689MsK) {
                    C51689MsK c51689MsK = (C51689MsK) obj;
                    if (c51689MsK.A00 != 1 || !C14360o3.A0K(this.A01, c51689MsK.A01)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51689MsK)) {
                return false;
            }
            C51689MsK c51689MsK2 = (C51689MsK) obj;
            if (c51689MsK2.A00 != 0 || this.A01 != c51689MsK2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        int A0H = AbstractC166987dD.A0H(this.A01);
        switch (A0H) {
            case 1:
                str = "RICH_CREATIVES";
                break;
            case 2:
                str = "CONTEXT_CARD";
                break;
            case 3:
                str = "THANK_YOU_SCREEN";
                break;
            case 4:
                str = "MULTI_SUBMIT_THANK_YOU_SCREEN";
                break;
            default:
                str = "MULTI_STEP";
                break;
        }
        return AbstractC25226BEj.A02(str, A0H);
    }

    public C51689MsK(C38321qM c38321qM) {
        this.A01 = c38321qM;
    }
}
