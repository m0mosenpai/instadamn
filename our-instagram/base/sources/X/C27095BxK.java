package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.BxK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27095BxK extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27095BxK(C2NX c2nx) {
        super("scheduleMagicModNotification", 1230839144, 3, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        C11T.A03(new D15(userSession));
    }
}
