package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Olq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55556Olq implements InterfaceC65626Tpm, C07W {
    public OF6 A00;
    public C19L A01;
    public boolean A02;
    public final UserSession A03;

    @Override // X.InterfaceC65626Tpm
    public final void onCreate(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A02 = true;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        OF6 of6 = this.A00;
        if (of6 != null) {
            AKN akn = of6.A03;
            if (akn == null) {
                C14360o3.A0F("richMediaViewer3d");
                throw C00O.createAndThrow();
            }
            akn.A09.destroy();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
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

    public C55556Olq(UserSession userSession) {
        this.A03 = userSession;
    }
}
