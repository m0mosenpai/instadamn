package X;

import java.util.HashSet;

/* renamed from: X.VzT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70008VzT {
    public static final HashSet A00 = new HashSet(AbstractC16960so.A1Q("delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"));

    public static final String A00(int i, Object obj) {
        if (obj == null) {
            return "";
        }
        String A0d = AbstractC002300n.A0d(AbstractC002300n.A0d(AbstractC002300n.A0d(obj.toString(), " \n", " ", false), "\n", " ", false), "\"", "", false);
        if (A0d.length() <= i) {
            return A0d;
        }
        return AnonymousClass001.A0R(AbstractC25227BEk.A0w(A0d, 0, i), "...");
    }
}
