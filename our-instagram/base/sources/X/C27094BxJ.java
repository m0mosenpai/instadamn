package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.BxJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27094BxJ extends AbstractC18280vF {
    public final /* synthetic */ C2NX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27094BxJ(C2NX c2nx) {
        super("maybePrefetchContentNotesFeedAvailability", 849665190, 3, false, false);
        this.A00 = c2nx;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        UserSession userSession = c2nx.A04;
        C14360o3.A0B(userSession, 0);
        C25482BOw c25482BOw = (C25482BOw) userSession.A01(C25482BOw.class, new C29889DGd(userSession, 19));
        if (C14360o3.A0K(c25482BOw.A02.getValue(), C25483BOx.A00)) {
            AbstractC166987dD.A1Z(new MBT(c25482BOw, null, 39), ((C4A7) c25482BOw).A01);
        }
    }
}
