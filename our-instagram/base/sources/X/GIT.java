package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class GIT implements InterfaceC37203GaE {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC37203GaE
    public final void DFf() {
    }

    public GIT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37203GaE
    public final void D6t() {
        if (this.A00 != 0) {
            C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
            AbstractC31178DnM.A1L(c36006Fv4.A06, "remove_follower_dialog_confirmed", c36006Fv4.A0C.getId());
        }
    }

    @Override // X.InterfaceC37203GaE
    public final void onCancel() {
        if (this.A00 != 0) {
            C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
            AbstractC31178DnM.A1L(c36006Fv4.A06, "remove_follower_dialog_cancelled", c36006Fv4.A0C.getId());
        }
    }

    @Override // X.InterfaceC37203GaE
    public final void onSuccess() {
        if (this.A00 != 0) {
            C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
            C9GR.A07(c36006Fv4.A00, 2131972334);
            FCA.A00(c36006Fv4.A07, c36006Fv4.A0C);
            return;
        }
        C9GR.A07((Context) this.A01, 2131972334);
    }
}
