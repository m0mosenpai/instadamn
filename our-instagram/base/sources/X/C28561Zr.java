package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.1Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28561Zr extends AbstractC28571Zs {
    @Override // X.AbstractC28571Zs
    public final void A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C1WZ A00 = C3J1.A00();
        A00.A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(userSession.userId, str, null));
        C1WZ A002 = C3J1.A00();
        A002.A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(userSession.userId, str, "rr"));
        AbstractC162187Oc.A00(new C9C9(str, null, 7), userSession).A02(new C9C9(str, null, 7));
    }
}
