package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JYH implements InterfaceC65626Tpm {
    public final /* synthetic */ C106144qU A00;
    public final /* synthetic */ C4FE A01;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C106144qU c106144qU = this.A00;
        c106144qU.A0A.A03.A04(c106144qU.A03);
        C4FE c4fe = this.A01;
        UserSession userSession = c4fe.A02;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36326378123048791L)) {
            c4fe.A00.A0A(this);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C14360o3.A0B(c07x, 0);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public JYH(C106144qU c106144qU, C4FE c4fe) {
        this.A00 = c106144qU;
        this.A01 = c4fe;
    }
}
