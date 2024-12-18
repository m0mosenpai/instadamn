package X;

import android.view.ViewStub;

/* loaded from: classes8.dex */
public final class L8U {
    public final /* synthetic */ KCO A00;

    public L8U(KCO kco) {
        this.A00 = kco;
    }

    public final void A00() {
        KCO kco = this.A00;
        if (kco.isAdded()) {
            C3FR c3fr = kco.A03;
            if (c3fr != null) {
                c3fr.EWc(false);
            }
            AbstractC167007dF.A0x(kco.A04);
            ViewStub viewStub = kco.A00;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
        }
    }

    public final void A01() {
        KCO kco = this.A00;
        if (kco.isAdded()) {
            AbstractC31178DnM.A0x(kco);
        }
    }
}
