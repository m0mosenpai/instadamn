package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.HashSet;

/* renamed from: X.GpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38083GpC {
    public ExploreTopicCluster A00;
    public final int A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final HashSet A05;

    public C38083GpC(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = i;
        this.A04 = str;
        this.A05 = AbstractC166987dD.A1H();
    }

    public static final void A00(C38083GpC c38083GpC) {
        ExploreTopicCluster exploreTopicCluster = c38083GpC.A00;
        if (exploreTopicCluster != null) {
            UserSession userSession = c38083GpC.A02;
            C55782hJ A00 = C55772hI.A00(userSession);
            InterfaceC60442pS interfaceC60442pS = c38083GpC.A03;
            if (Systrace.A0E(1L)) {
                C0fO.A01("NavigationTracker.reportStartNavigation", -1148048430);
            }
            try {
                AbstractC37300Gc1.A0Z();
                A00.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
                C19280xC A002 = C19280xC.A00(interfaceC60442pS, "navigation");
                A002.A0C("click_point", "explore_topic_load");
                A002.A08(0, "nav_depth");
                A00.A03 = A002;
                A00.A01 = new C140976Yz(interfaceC60442pS, "explore_topic_load", A00.A00);
                C19280xC c19280xC = A00.A03;
                if (c19280xC != null) {
                    String str = c38083GpC.A04;
                    AbstractC38158GqP.A00(str);
                    AbstractC38159GqQ.A00(c19280xC, exploreTopicCluster);
                    c19280xC.A0C("topic_cluster_session_id", str);
                    c19280xC.A08(0, "topic_nav_order");
                }
                if (A00.A0F) {
                    A00.A0H.A00(interfaceC60442pS, "explore_topic_load", 0);
                }
                C1KM.A09.A0E(interfaceC60442pS, A00.A0I.A02.A00, "explore_topic_load");
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1954234074);
                }
                C55772hI.A00(userSession).A0D("intentional_double_logging", interfaceC60442pS);
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-168180057);
                }
                throw th;
            }
        }
    }
}
