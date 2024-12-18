package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.70q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564570q {
    public static final C1564570q A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(java.lang.String r2) {
        /*
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            int r0 = r2.hashCode()
            r1 = 1
            switch(r0) {
                case -1574224499: goto L17;
                case -773734548: goto L14;
                case -664343167: goto L11;
                case 1949671265: goto Le;
                default: goto Lc;
            }
        Lc:
            r1 = 0
        Ld:
            return r1
        Le:
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            goto L19
        L11:
            java.lang.String r0 = "IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM"
            goto L19
        L14:
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_CHAINING"
            goto L19
        L17:
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
        L19:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Ld
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1564570q.A00(java.lang.String):boolean");
    }

    public final boolean A01(UserSession userSession, String str) {
        if (str == null || str.length() == 0 || str.equals("null")) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36319716630142577L);
    }
}
