package X;

import com.instagram.user.model.FollowStatus;

/* renamed from: X.4T3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4T3 {
    public static final C4T8 A00(FollowStatus followStatus) {
        FollowStatus followStatus2 = FollowStatus.A08;
        C4T8 c4t8 = C4T8.UNKNOWN;
        C4T8 c4t82 = (C4T8) AbstractC06930Yk.A06(new C09530e4(followStatus2, c4t8), new C09530e4(FollowStatus.A04, C4T8.FETCHING), new C09530e4(FollowStatus.A06, C4T8.NOT_FOLLOWING), new C09530e4(FollowStatus.A05, C4T8.FOLLOWING), new C09530e4(FollowStatus.A07, C4T8.REQUESTED)).get(followStatus);
        if (c4t82 == null) {
            return c4t8;
        }
        return c4t82;
    }

    public static final String A01(C75363a3 c75363a3, boolean z, boolean z2) {
        if (z || c75363a3 == null) {
            return null;
        }
        return (z2 || !c75363a3.A08()) ? "progressive" : "dash";
    }
}
