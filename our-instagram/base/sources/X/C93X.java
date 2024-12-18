package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.93X, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C93X {
    public static final C93Z A00(Integer num) {
        return new C93Z(new C93Y(null, null, 0), num, "", "explore_popular", null, null, 64192, false, true, false, false, false, false);
    }

    public static final String A01(C93Y c93y) {
        String str;
        int i = c93y.A01;
        if (i != 0) {
            if (i != 2) {
                ExploreTopicCluster exploreTopicCluster = c93y.A00;
                if (exploreTopicCluster != null) {
                    str = exploreTopicCluster.A06;
                } else {
                    throw new IllegalStateException("Topic Channels must have a Topic Cluster set.");
                }
            } else {
                str = AnonymousClass001.A0R("EXPLORE_ALL_", c93y.A02);
            }
        } else {
            str = "EXPLORE_ALL";
        }
        return AnonymousClass001.A0R("explore:topic_cluster_id:", str);
    }
}
