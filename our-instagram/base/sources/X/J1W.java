package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class J1W implements C7EV {
    public final /* synthetic */ HCB A00;

    @Override // X.C7EV
    public final void E2D(View view) {
        HCB hcb = this.A00;
        hcb.A06 = false;
        hcb.A07 = false;
        hcb.A06(view, false);
    }

    public J1W(HCB hcb) {
        this.A00 = hcb;
    }

    @Override // X.C7EV
    public final void E2E(View view) {
        HCB hcb = this.A00;
        hcb.A07 = true;
        hcb.A06(view, true);
        hcb.A06 = true;
    }
}
