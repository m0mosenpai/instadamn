package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gfn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37531Gfn {
    public static final List A01;
    public final UserSession A00;

    public C37531Gfn(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        if (A01.contains(str)) {
            return true;
        }
        if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str) || "direct_ad_feed_of_ads".equals(str)) {
            UserSession userSession = this.A00;
            if (C7M3.A01(userSession) || C7M3.A00(userSession)) {
                return false;
            }
        }
        return !GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(str);
    }

    static {
        List A1Q = AbstractC16960so.A1Q(ClipsViewerSource.A0g, ClipsViewerSource.A12, ClipsViewerSource.A13, ClipsViewerSource.A0V, ClipsViewerSource.A1S, ClipsViewerSource.A1Y, ClipsViewerSource.A1A, ClipsViewerSource.A1Z, ClipsViewerSource.A0Q, ClipsViewerSource.A1E, ClipsViewerSource.A26, ClipsViewerSource.A1X, ClipsViewerSource.A1T, ClipsViewerSource.A1D, ClipsViewerSource.A25);
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            A0i.add(AnonymousClass001.A0R("clips_viewer_", ((ClipsViewerSource) it.next()).A00));
        }
        A01 = A0i;
    }
}
