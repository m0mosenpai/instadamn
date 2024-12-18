package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Gcg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37338Gcg implements InterfaceC42271xH {
    public final /* synthetic */ C141956bE A00;

    public C37338Gcg(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C1NB c1nb;
        C3DH c3dh = (C3DH) obj;
        C14360o3.A0B(c3dh, 0);
        for (Reel reel : c3dh.A04) {
            C141956bE c141956bE = this.A00;
            InterfaceC1118853a interfaceC1118853a = c141956bE.A06;
            String id = reel.getId();
            C14360o3.A07(id);
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
            if (reelViewerFragment.A1C.Blv(id) == null) {
                C41551w4 c41551w4 = reelViewerFragment.A0a;
                if (c41551w4 != null) {
                    Reel reel2 = c41551w4.A0H;
                    C1NB c1nb2 = reel.A0W;
                    if (c1nb2 != null && (c1nb = reel2.A0W) != null && reel.A0d() && reel2.A0d()) {
                        Integer CBs = c1nb2.CBs();
                        Integer num = C05F.A01;
                        if (CBs == num && c1nb.CBs() == num && c1nb2.getId().equals(reel2.A0W.getId())) {
                            return true;
                        }
                    }
                }
                if (reel.A0i()) {
                    UserSession userSession = c141956bE.A00;
                    if (userSession == null) {
                        AbstractC31171DnF.A0y();
                        throw C00O.createAndThrow();
                    }
                    if (!reel.A15(userSession)) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-51204387);
        int A032 = C0f9.A03(-79886056);
        this.A00.A06.De0();
        C0f9.A0A(-1058094313, A032);
        C0f9.A0A(1560884704, A03);
    }
}
