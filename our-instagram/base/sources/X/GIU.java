package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIU implements InterfaceC37203GaE {
    public final /* synthetic */ User A00;
    public final /* synthetic */ GIS A01;

    @Override // X.InterfaceC37203GaE
    public final void DFf() {
    }

    @Override // X.InterfaceC37203GaE
    public final void onCancel() {
    }

    public GIU(User user, GIS gis) {
        this.A01 = gis;
        this.A00 = user;
    }

    @Override // X.InterfaceC37203GaE
    public final void D6t() {
        AbstractC31178DnM.A1L(this.A01.A06.A00, "remove_follower_dialog_confirmed", this.A00.getId());
    }

    @Override // X.InterfaceC37203GaE
    public final void onSuccess() {
        GIS gis = this.A01;
        C9GR.A07(gis.A02.getContext(), 2131972334);
        FCA.A00(gis.A04, this.A00);
    }
}
