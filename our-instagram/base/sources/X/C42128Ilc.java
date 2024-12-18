package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Ilc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42128Ilc implements C53S {
    public final /* synthetic */ C38P A00;

    public C42128Ilc(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
        String str;
        C14360o3.A0B(c19280xC, 0);
        C38P c38p = this.A00;
        C37934GmW c37934GmW = c38p.A0E;
        if (c37934GmW == null) {
            str = "dataStore";
        } else {
            ExploreTopicCluster exploreTopicCluster = c37934GmW.A02;
            if (exploreTopicCluster != null) {
                String str2 = c38p.A0V;
                str = "exploreSessionId";
                if (str2 != null) {
                    AbstractC38158GqP.A00(str2);
                    AbstractC38159GqQ.A00(c19280xC, exploreTopicCluster);
                    c19280xC.A0C("topic_cluster_session_id", str2);
                    c19280xC.A08(0, "topic_nav_order");
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
