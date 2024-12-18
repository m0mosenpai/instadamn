package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151386rg {
    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        Long l;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_story_p92_link_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A00.A9K("media_id", Long.valueOf(Long.parseLong(A2u)));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            A00.AAP("interaction_source", str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A00.A9K("target_user_id", l);
            A00.A7v("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC11380iw r5, com.instagram.common.session.UserSession r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r2 = 0
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 3
            X.C14360o3.A0B(r11, r0)
            X.0wW r3 = X.AbstractC12220kQ.A01(r5, r6)
            java.lang.String r1 = "barcelona_growth_integration_tap"
            X.0kM r0 = r3.A00
            X.0Ai r3 = r3.A00(r0, r1)
            r1 = 0
            if (r12 == 0) goto L30
            X.1rC r0 = X.C38321qM.A0h
            java.lang.String r4 = X.C38801rC.A06(r12)
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r0 = 10
            java.lang.Long r4 = X.AbstractC003100w.A0k(r0, r4)
        L28:
            java.lang.String r0 = "media_id"
            r3.A9K(r0, r4)
            if (r12 == 0) goto L41
            goto L32
        L30:
            r4 = r2
            goto L28
        L32:
            X.1rC r0 = X.C38321qM.A0h     // Catch: java.lang.IndexOutOfBoundsException -> L41
            java.lang.String r4 = X.C38801rC.A04(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            if (r4 == 0) goto L41
            r0 = 10
            java.lang.Long r4 = X.AbstractC003100w.A0k(r0, r4)
            goto L42
        L41:
            r4 = r2
        L42:
            java.lang.String r0 = "media_author_id"
            r3.A9K(r0, r4)
            X.1QN r0 = X.C1QM.A00
            X.1QQ r0 = r0.A02
            java.lang.String r4 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAP(r0, r4)
            java.lang.String r4 = r5.getModuleName()
            java.lang.String r0 = "module"
            r3.AAP(r0, r4)
            java.lang.String r0 = "interaction_source"
            r3.AAP(r0, r10)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "interaction_string"
            r3.AAP(r0, r4)
            r5 = 10
            java.lang.Long r4 = X.AbstractC003100w.A0k(r5, r11)
            java.lang.String r0 = "target_user_id"
            r3.A9K(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_barcelona_installed"
            r3.A7v(r0, r4)
            if (r13 == 0) goto La6
            java.lang.Long r4 = X.AbstractC003100w.A0k(r5, r13)
        L83:
            java.lang.String r0 = "quick_promotion_id"
            r3.A9K(r0, r4)
            if (r14 == 0) goto L8e
            java.lang.Long r1 = X.AbstractC003100w.A0k(r5, r14)
        L8e:
            java.lang.String r0 = "netego_id"
            r3.A9K(r0, r1)
            java.lang.String r0 = "total_num_candidates"
            r3.A8p(r0, r8)
            java.lang.String r0 = "media_index"
            r3.A8p(r0, r7)
            java.lang.String r0 = "design_version"
            r3.AAP(r0, r2)
            r3.Cht()
            return
        La6:
            r4 = r2
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC151386rg.A03(X.0iw, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, boolean z) {
        Long l;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_growth_integration_impression");
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAP("module", interfaceC11380iw.getModuleName());
        A00.AAP("impression_source", str);
        A00.A9K("target_user_id", AbstractC003100w.A0k(10, str2));
        A00.A7v("is_barcelona_installed", Boolean.valueOf(z));
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        A00.A9K("badge_num_notifs", l);
        A00.Cht();
    }

    public static final void A05(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str, 2);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "barcelona_get_app_tap");
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAP("module", interfaceC11380iw.getModuleName());
        A00.AAP("interaction_source", str);
        A00.A9K("target_user_id", AbstractC003100w.A0k(10, str2));
        A00.A7v("is_barcelona_installed", Boolean.valueOf(z));
        A00.Cht();
    }

    public static final boolean A06(String str) {
        if (str != null) {
            return AbstractC001900j.A0a(str, "threads.net", false) || AbstractC001900j.A0a(str, "www.threads.net", false);
        }
        return false;
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_reel_p92_link_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A00.A9K("media_id", Long.valueOf(Long.parseLong(A2u)));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            A00.AAP("interaction_source", str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A00.A9K("target_user_id", l);
            A00.A7v("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_feed_p92_link_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A00.A9K("media_id", Long.valueOf(Long.parseLong(A2u)));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            A00.AAP("interaction_source", str);
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            } else {
                l = null;
            }
            A00.A9K("target_user_id", l);
            A00.A7v("is_barcelona_installed", Boolean.valueOf(z));
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
