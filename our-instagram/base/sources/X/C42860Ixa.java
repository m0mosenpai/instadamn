package X;

import java.util.List;

/* renamed from: X.Ixa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42860Ixa implements JHO {
    public final /* synthetic */ HCB A00;

    @Override // X.JHO
    public final void DFf() {
    }

    @Override // X.JHO
    public final void Dq6(HAX hax) {
        HCB hcb = this.A00;
        hcb.A05 = false;
        List A00 = HCB.A00(AbstractC41661Ibt.A02(AbstractC166987dD.A0r(hcb.A0G), AbstractC31172DnG.A19(hax.A01)));
        hcb.A04 = A00;
        C38309Gsv c38309Gsv = hcb.A02;
        if (c38309Gsv != null) {
            C14360o3.A0B(A00, 0);
            c38309Gsv.A02 = A00;
            C0fA.A00(c38309Gsv, 612254867);
        }
        AbstractC37304Gc5.A0L(hcb).A03(hcb.A04.size(), hcb.A00, System.currentTimeMillis() - hcb.A01);
    }

    public C42860Ixa(HCB hcb) {
        this.A00 = hcb;
    }
}
