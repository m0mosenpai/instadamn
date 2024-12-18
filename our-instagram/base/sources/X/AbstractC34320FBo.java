package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FBo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34320FBo {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.6X9] */
    public static C6X9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("taken_at_seconds".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("timestamp_seconds".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("reel_id", c16l, "PendingReelSeenState.SeenReelMediaInfo");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c16l, "PendingReelSeenState.SeenReelMediaInfo");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("taken_at_seconds", c16l, "PendingReelSeenState.SeenReelMediaInfo");
                } else if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("timestamp_seconds", c16l, "PendingReelSeenState.SeenReelMediaInfo");
                } else {
                    long longValue = l.longValue();
                    long longValue2 = l2.longValue();
                    ?? obj = new Object();
                    obj.A05 = str;
                    obj.A02 = str2;
                    obj.A06 = str3;
                    obj.A01 = longValue;
                    obj.A00 = longValue2;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V("media_id", c16l, "PendingReelSeenState.SeenReelMediaInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
