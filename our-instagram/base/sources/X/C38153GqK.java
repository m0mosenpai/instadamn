package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.GqK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38153GqK extends C3CI {
    public final C38083GpC A00;
    public final C44211JgF A01;

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        C14360o3.A0B(c3ab, 0);
    }

    @Override // X.C36Z
    public final Class CAO() {
        return ExploreTopicCluster.class;
    }

    @Override // X.C3CI, X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        ExploreTopicCluster exploreTopicCluster = (ExploreTopicCluster) obj;
        C14360o3.A0B(exploreTopicCluster, 0);
        C38083GpC c38083GpC = this.A00;
        HashSet hashSet = c38083GpC.A05;
        if (!hashSet.contains(exploreTopicCluster.A06)) {
            hashSet.add(exploreTopicCluster.A06);
            UserSession userSession = c38083GpC.A02;
            InterfaceC60442pS interfaceC60442pS = c38083GpC.A03;
            String str = c38083GpC.A04;
            C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "explore_topic_tray_impression");
            c82713mZ.A70 = str;
            C11520jB A0B = AbstractC37300Gc1.A0B();
            A0B.A04(C5I8.A6Y, AbstractC31171DnF.A0V(i));
            c82713mZ.A0E(A0B);
            c82713mZ.A7N = exploreTopicCluster.A06;
            c82713mZ.A7O = exploreTopicCluster.A0A;
            c82713mZ.A7P = AbstractC127885qH.A00(exploreTopicCluster.A00());
            C11520jB A0B2 = AbstractC37300Gc1.A0B();
            A0B2.A04(C5I8.A9I, exploreTopicCluster.A05);
            c82713mZ.A0E(A0B2);
            C38321qM c38321qM = exploreTopicCluster.A02;
            String A00 = AbstractC111324zv.A00(4190);
            String A002 = AbstractC111324zv.A00(855);
            if (c38321qM != null) {
                C11520jB A0B3 = AbstractC37300Gc1.A0B();
                A0B3.A0A(A002, c38321qM.getId());
                c82713mZ.A0E(A0B3);
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    C11520jB A0B4 = AbstractC37300Gc1.A0B();
                    A0B4.A0A(A00, A2E.getId());
                    c82713mZ.A0E(A0B4);
                }
            }
            if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A01)) {
                C19280xC A003 = C19280xC.A00(interfaceC60442pS, "explore_topic_tray_impression");
                A003.A07(C5I8.A83, str);
                A003.A08(Integer.valueOf(i), "position");
                AbstractC38159GqQ.A00(A003, exploreTopicCluster);
                if (c38321qM != null) {
                    A003.A0C(A002, c38321qM.getId());
                    User A2E2 = c38321qM.A2E(userSession);
                    if (A2E2 != null) {
                        A003.A0C(A00, A2E2.getId());
                    }
                }
                AbstractC31173DnH.A1S(A003, userSession);
            }
        }
    }

    public C38153GqK(C44211JgF c44211JgF, C38083GpC c38083GpC) {
        this.A01 = c44211JgF;
        this.A00 = c38083GpC;
    }
}
