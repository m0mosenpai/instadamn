package X;

/* loaded from: classes11.dex */
public final class WYU implements C7NY {
    public C70167WEj A00;

    @Override // X.C7NY
    public final void ABo(C69062VhD c69062VhD, Integer num, String str) {
        WVB wvb;
        char c;
        C14360o3.A0B(num, 1);
        C70167WEj c70167WEj = this.A00;
        if (c70167WEj != null) {
            wvb = new WVB(c70167WEj);
        } else {
            wvb = null;
        }
        C4SS A00 = AbstractC68331VMr.A00(wvb, c69062VhD, str);
        switch (num.intValue()) {
            case 0:
                c = 0;
                break;
            case 1:
                c = 1;
                break;
            default:
                c = 2;
                break;
        }
        Integer num2 = C05F.A00(3)[c];
        C14360o3.A07(num2);
        C50627MWo c50627MWo = new C50627MWo(A00, num2);
        C70167WEj c70167WEj2 = this.A00;
        if (c70167WEj2 != null) {
            c70167WEj2.A04(c50627MWo);
        }
    }

    @Override // X.C7NY
    public final void E5K(C69062VhD c69062VhD) {
    }

    @Override // X.C7NY
    public final C51593Mql BHW() {
        return new C51593Mql(0, 0L, 0);
    }
}
