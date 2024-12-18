package X;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class XVe extends AbstractC107474ss {
    public C42Q A00;
    public final AbstractC107474ss A03;
    public final int A04;
    public boolean A02 = false;
    public boolean A01 = false;

    @Override // X.AbstractC107474ss
    public final void A08() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = null;
            AbstractC107474ss abstractC107474ss = this.A03;
            if (abstractC107474ss.A0B()) {
                abstractC107474ss.A08();
            }
        }
    }

    @Override // X.AbstractC107474ss
    public final void A09(C42Q c42q) {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = c42q;
            if (!A06()) {
                A02();
                return;
            }
            A05();
            this.A01 = true;
            AbstractC107474ss abstractC107474ss = this.A03;
            abstractC107474ss.A07();
            abstractC107474ss.A01.add(new YBC(this));
            C107504sv.A00().A02(new C72190XVg(this), this.A04);
            return;
        }
        throw AbstractC166987dD.A18(AbstractC111324zv.A00(1801));
    }

    @Override // X.AbstractC107474ss
    public final void A0A(ArrayList arrayList) {
        this.A03.A0A(arrayList);
    }

    public XVe(AbstractC107474ss abstractC107474ss, int i) {
        this.A04 = i;
        this.A03 = abstractC107474ss;
    }

    @Override // X.AbstractC107474ss
    public final void A07() {
        A04();
        this.A03.A07();
    }

    @Override // X.AbstractC107474ss
    public final boolean A0B() {
        return this.A01;
    }
}
