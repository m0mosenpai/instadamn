package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MeX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50902MeX extends AbstractC52922bZ {
    public O86 A00;
    public final OAR A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;

    public /* synthetic */ C50902MeX(C152406tQ c152406tQ, UserSession userSession) {
        OAR oar = new OAR(userSession);
        this.A01 = oar;
        this.A02 = oar.A01;
        this.A03 = AbstractC25227BEk.A0z();
        String A0h = AbstractC50522MSa.A0h(c152406tQ, "mediaID");
        FVK.A01(oar.A00, C1GJ.A01(), new P2O(oar, 2), A0h == null ? "" : A0h);
    }
}
