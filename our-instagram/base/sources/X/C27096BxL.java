package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.BxL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27096BxL extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27096BxL(C2NX c2nx) {
        super("fetchMagicModConsentState", 282852313, 4, true, true);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        C28174CbM.A00(DH4.A00(userSession), false);
    }
}
