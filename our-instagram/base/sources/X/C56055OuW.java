package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.OuW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56055OuW implements InterfaceC12870lZ {
    public final /* synthetic */ C2NX A00;

    public C56055OuW(C2NX c2nx) {
        this.A00 = c2nx;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1150239612);
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        ((C56057OuY) userSession.A01(C56057OuY.class, new C57241PbP(userSession, 24))).onAppBackgrounded();
        C0f9.A0A(1149098529, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1847731243);
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        ((C56057OuY) userSession.A01(C56057OuY.class, new C57241PbP(userSession, 24))).onAppForegrounded();
        C0f9.A0A(-1218518082, A03);
    }
}
