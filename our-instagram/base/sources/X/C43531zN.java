package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RawSkywalkerSubscription;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43531zN implements RealtimeClientManager.RawSkywalkerSubscriptionsProvider {
    public static final C43531zN A00 = new C43531zN();

    @Override // com.instagram.realtimeclient.RealtimeClientManager.RawSkywalkerSubscriptionsProvider
    public final List get(UserSession userSession) {
        ArrayList arrayList = new ArrayList();
        String A0R = AnonymousClass001.A0R(RawSkywalkerSubscription.REALTIME_USER_TOPIC_PREFIX, userSession.userId);
        C14360o3.A07(A0R);
        arrayList.add(A0R);
        return arrayList;
    }
}
