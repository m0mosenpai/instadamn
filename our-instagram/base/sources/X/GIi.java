package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GIi implements InterfaceC37219GaU {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C7U0 A01;

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
    }

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
    }

    public GIi(UserSession userSession, C7U0 c7u0) {
        this.A00 = userSession;
        this.A01 = c7u0;
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        UserSession userSession = this.A00;
        String C7I = this.A01.C7r().C7I();
        String str = userSession.userId;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_thread";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), AbstractC111324zv.A00(392));
        A0f.AAP("sender_id", str);
        AbstractC31171DnF.A1F(A0f, C7I);
        AbstractC31175DnJ.A15(A0f, "block_user");
    }
}
