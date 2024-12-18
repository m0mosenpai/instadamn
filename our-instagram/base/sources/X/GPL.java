package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GPL implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public GPL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1L(A00, A00.A5L, C23031Ai.A8c, 416, true);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        AbstractC167017dG.A0g(interfaceC19630xq, AbstractC111324zv.A00(5469)).apply();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G(AbstractC111324zv.A00(5470), currentTimeMillis);
        ARD.apply();
        String str = this.A02;
        if (str != null) {
            C7P0 c7p0 = new C7P0(this.A00, userSession);
            String str2 = userSession.userId;
            C14360o3.A0B(str2, 1);
            C7P0.A01(null, C7P1.IMPRESSION, C7P2.TOOLTIP, c7p0, str, str2);
        }
    }
}
