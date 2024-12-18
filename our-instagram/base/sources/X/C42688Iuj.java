package X;

/* renamed from: X.Iuj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42688Iuj implements GZD {
    public final int A00;
    public final Object A01;

    public C42688Iuj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        PIC pic;
        Integer num;
        int i = this.A00;
        C14360o3.A0B(str, 0);
        switch (i) {
            case 0:
                ((C38322GtH) ((HCD) this.A01).A02.getValue()).A01(str);
                return;
            case 1:
                HCO.A02((HCO) this.A01, str);
                return;
            case 2:
                HCL hcl = (HCL) this.A01;
                C38369Gu5 c38369Gu5 = hcl.A0M;
                if (C14360o3.A0K(c38369Gu5.A01, str) && AbstractC166987dD.A1b(c38369Gu5.A03)) {
                    num = C05F.A0Y;
                } else {
                    num = C05F.A00;
                }
                c38369Gu5.A00 = num;
                c38369Gu5.A01 = str;
                c38369Gu5.notifyDataSetChanged();
                pic = hcl.A07;
                if (pic == null) {
                    C14360o3.A0F("networkHelper");
                    throw C00O.createAndThrow();
                }
                break;
            case 3:
                AbstractC37301Gc2.A0Q((HCE) this.A01).A01(str);
                return;
            case 4:
                C38328GtN c38328GtN = (C38328GtN) ((HCF) this.A01).A0A.getValue();
                C38328GtN.A00(c38328GtN, new DHI(str, 4));
                pic = c38328GtN.A03;
                break;
            default:
                ((C38330GtP) ((HCK) this.A01).A0E.getValue()).A02(str, true, null);
                return;
        }
        pic.A01 = str;
        pic.A06(true);
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }
}
