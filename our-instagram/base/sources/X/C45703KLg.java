package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KLg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45703KLg extends AbstractRunnableC14200nk {
    public final /* synthetic */ C94054Kp A00;

    @Override // java.lang.Runnable
    public final void run() {
        C94054Kp c94054Kp = this.A00;
        UserSession userSession = c94054Kp.A03;
        if (C4MG.A01(userSession)) {
            C49795Lz2.A00(C137766Ly.A00(C137746Lw.A00(userSession, "RealtimePresenceDataProvider").A01).A0M(new C43601JQh(this, 14)).A0J(new C43597JQd(this, 70)), c94054Kp.A02, c94054Kp, 6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45703KLg(C94054Kp c94054Kp) {
        super(1457941718);
        this.A00 = c94054Kp;
    }
}
