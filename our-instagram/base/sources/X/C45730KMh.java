package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KMh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45730KMh extends AbstractC18280vF {
    public final /* synthetic */ C2DG A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45730KMh(C2DG c2dg) {
        super("maybeInitializeMsysPresence", 398171298);
        this.A00 = c2dg;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2DG c2dg = this.A00;
        UserSession userSession = c2dg.A09;
        C47751L6v A00 = AbstractC46874KoH.A00(userSession);
        A00.A00();
        if (A00.A00 != null) {
            if (C4MG.A00(userSession)) {
                C2DG.A05(c2dg, C05F.A0C);
            }
            if (C4MG.A01(userSession)) {
                C14120nc.A00().ATO(new C45703KLg((C94054Kp) userSession.A01(C94054Kp.class, new C94064Kq(userSession, c2dg.A07))));
            }
        }
    }
}
