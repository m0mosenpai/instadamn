package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.7zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180377zR implements CallerContextable {
    public static final CallerContext A00;
    public static final C9CN A01;
    public static final String __redex_internal_original_name = "CrossPostToFacebookUtil";

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "getIGXPostLinkageType", imports = {}))
    public static final Integer A00(UserSession userSession) {
        C97Q A002;
        C31590DuI c31590DuI;
        C14360o3.A0B(userSession, 0);
        if (AbstractC191398dq.A00(userSession).booleanValue()) {
            return AbstractC196078lx.A00(userSession);
        }
        C9CN c9cn = A01;
        C14360o3.A0B(c9cn, 1);
        C97N A003 = C97M.A00(userSession);
        if (A003 != null && (A002 = C97N.A00(A003)) != null && (c31590DuI = (C31590DuI) A002.AuS(c9cn)) != null && c31590DuI.A00 != null) {
            return C05F.A00;
        }
        return C05F.A0C;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "getIGXPostLinkageType", imports = {}))
    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession) == C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r2 == X.EnumC222416a.A06) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(com.instagram.common.session.UserSession r5) {
        /*
            r4 = 0
            X.C14360o3.A0B(r5, r4)
            java.lang.Boolean r0 = X.AbstractC191398dq.A00(r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            X.8lv r1 = X.C196068lw.A00(r5)
            com.facebook.common.callercontext.CallerContext r0 = X.C180377zR.A00
            X.5xZ r0 = r1.A00(r0)
            boolean r1 = X.C196068lw.A02(r0)
        L1c:
            return r1
        L1d:
            X.0sy r0 = X.C08730cb.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.16a r2 = r0.A0I()
            X.16a r0 = X.EnumC222416a.A07
            if (r2 == r0) goto L32
            X.16a r1 = X.EnumC222416a.A06
            r0 = 0
            if (r2 != r1) goto L33
        L32:
            r0 = 1
        L33:
            java.lang.String r3 = ""
            if (r0 == 0) goto L8e
            boolean r0 = A09(r5)
            if (r0 == 0) goto L8e
            X.1Ai r2 = X.AbstractC23021Ah.A00(r5)
            X.16a r0 = X.AbstractC08690cX.A01(r5)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L89
            r0 = 3
            if (r1 != r0) goto L8e
            X.0xq r1 = r2.A01
            java.lang.String r0 = "creator_account_fb_destination_backfilling_completed"
        L53:
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L8e
            r0 = 11
            X.J8c r1 = new X.J8c
            r1.<init>(r5, r0)
            java.lang.Class<X.ABH> r0 = X.ABH.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.ABH r1 = (X.ABH) r1
            com.facebook.common.callercontext.CallerContext r0 = X.C180377zR.A00
            X.8m6 r2 = r1.A00(r0)
            r1 = 0
            if (r2 == 0) goto L73
            java.lang.String r1 = r2.A01
        L73:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L8e
            if (r2 == 0) goto L80
            java.lang.String r0 = r2.A00
        L7f:
            r3 = r0
        L80:
            boolean r0 = X.AbstractC001900j.A0T(r3)
            r1 = 0
            if (r0 != 0) goto L1c
            r1 = 1
            return r1
        L89:
            X.0xq r1 = r2.A01
            java.lang.String r0 = "personal_account_fb_page_id_backfilling_completed"
            goto L53
        L8e:
            boolean r0 = A05(r5)
            if (r0 != 0) goto La2
            X.16a r1 = X.AbstractC08690cX.A01(r5)
            X.16a r0 = X.EnumC222416a.A06
            if (r1 != r0) goto L80
            boolean r0 = A02(r5)
            if (r0 == 0) goto L80
        La2:
            X.9CN r1 = X.C180377zR.A01
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            X.97N r0 = X.C97M.A00(r5)
            X.97Q r0 = X.C97N.A00(r0)
            java.lang.Object r0 = r0.AuS(r1)
            X.DuI r0 = (X.C31590DuI) r0
            if (r0 == 0) goto L80
            X.9Im r0 = r0.A00
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.A00(r1, r5)
            if (r0 != 0) goto L7f
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180377zR.A06(com.instagram.common.session.UserSession):boolean");
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC191398dq.A00(userSession).booleanValue()) {
            return C196058lv.A08.A04(A00, userSession);
        }
        if (AbstractC001900j.A0T(A01(userSession))) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A0A(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC191398dq.A00(userSession).booleanValue()) {
            if (z && C196058lv.A08.A04(A00, userSession)) {
                return true;
            }
            return false;
        }
        if (A07(userSession) && z && !C31238DoL.A00(userSession)) {
            return true;
        }
        return false;
    }

    static {
        CallerContext A002 = CallerContext.A00(C180377zR.class);
        A00 = A002;
        A01 = new C9CN(A002, "ig_android_ig_to_fb_crossposting", "ig_android_ig_to_fb_crossposting", "crossposting", "loading");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2 == X.EnumC222416a.A06) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r5) {
        /*
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r0.A01(r5)
            X.16a r2 = r0.A0I()
            X.16a r0 = X.EnumC222416a.A07
            if (r2 == r0) goto L13
            X.16a r1 = X.EnumC222416a.A06
            r0 = 0
            if (r2 != r1) goto L14
        L13:
            r0 = 1
        L14:
            java.lang.String r4 = ""
            if (r0 == 0) goto L8c
            boolean r0 = A09(r5)
            if (r0 == 0) goto L8c
            X.1Ai r3 = X.AbstractC23021Ah.A00(r5)
            r2 = 0
            X.16a r0 = X.AbstractC08690cX.A01(r5)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L87
            r0 = 3
            if (r1 != r0) goto L8c
            X.0xq r1 = r3.A01
            java.lang.String r0 = "creator_account_fb_destination_backfilling_completed"
        L35:
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L8c
            r0 = 11
            X.J8c r1 = new X.J8c
            r1.<init>(r5, r0)
            java.lang.Class<X.ABH> r0 = X.ABH.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.ABH r1 = (X.ABH) r1
            com.facebook.common.callercontext.CallerContext r0 = X.C180377zR.A00
            X.8m6 r3 = r1.A00(r0)
            r1 = 0
            if (r3 == 0) goto L85
            java.lang.String r2 = r3.A01
        L55:
            java.lang.String r0 = "FB_USER"
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L7c
            if (r3 == 0) goto L7a
            java.lang.String r2 = r3.A01
        L61:
            java.lang.String r0 = "FB_ADDITIONAL_PROFILE"
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L7c
            if (r3 == 0) goto L6d
        L6b:
            java.lang.String r1 = r3.A01
        L6d:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L8c
            if (r3 == 0) goto Lca
            java.lang.String r0 = r3.A00
        L79:
            return r0
        L7a:
            r2 = r1
            goto L61
        L7c:
            java.lang.String r1 = r3.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L6b
            return r1
        L85:
            r2 = r1
            goto L55
        L87:
            X.0xq r1 = r3.A01
            java.lang.String r0 = "personal_account_fb_page_id_backfilling_completed"
            goto L35
        L8c:
            boolean r0 = A05(r5)
            if (r0 != 0) goto Lab
            boolean r0 = A02(r5)
            if (r0 != 0) goto Lab
            X.2Ne r2 = X.AbstractC49092Nc.A00(r5)
            com.facebook.common.callercontext.CallerContext r1 = X.C180377zR.A00
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            fxcache.model.FxCalAccount r0 = r2.A01(r1, r0)
            if (r0 == 0) goto Lca
            java.lang.String r0 = r0.A07
        La8:
            if (r0 != 0) goto L79
            return r4
        Lab:
            X.9CN r1 = X.C180377zR.A01
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            X.97N r0 = X.C97M.A00(r5)
            X.97Q r0 = X.C97N.A00(r0)
            java.lang.Object r0 = r0.AuS(r1)
            X.DuI r0 = (X.C31590DuI) r0
            if (r0 == 0) goto Lca
            X.9Im r0 = r0.A00
            if (r0 == 0) goto Lca
            java.lang.String r0 = r0.A00(r1, r5)
            goto La8
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180377zR.A01(com.instagram.common.session.UserSession):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r1 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0.A00 == null) goto L10;
     */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(com.instagram.common.session.UserSession r3) {
        /*
            X.9CN r1 = X.C180377zR.A01
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            X.97N r0 = X.C97M.A00(r3)
            if (r0 == 0) goto L1f
            X.97Q r0 = X.C97N.A00(r0)
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r0.AuS(r1)
            X.DuI r0 = (X.C31590DuI) r0
            if (r0 == 0) goto L1f
            X.9Im r0 = r0.A00
            r2 = 1
            if (r0 != 0) goto L20
        L1f:
            r2 = 0
        L20:
            boolean r0 = A05(r3)
            if (r0 == 0) goto L27
            return r2
        L27:
            X.16a r1 = X.AbstractC08690cX.A01(r3)
            X.16a r0 = X.EnumC222416a.A06
            if (r1 != r0) goto L3a
            boolean r0 = A04(r3)
            if (r0 == 0) goto L38
            r0 = 1
            if (r2 != 0) goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            X.17P r0 = r0.A03
            java.lang.String r0 = r0.Baz()
            if (r0 == 0) goto L4f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L50
        L4f:
            r0 = 1
        L50:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180377zR.A02(com.instagram.common.session.UserSession):boolean");
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "isBusinessAccount", imports = {}))
    public static final boolean A05(UserSession userSession) {
        if (C17060sy.A01.A01(userSession).A0I() != EnumC222416a.A05) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A09(UserSession userSession) {
        EnumC222416a A0I = C17060sy.A01.A01(userSession).A0I();
        EnumC222416a enumC222416a = EnumC222416a.A06;
        if (A0I != enumC222416a || (AbstractC08690cX.A01(userSession) == enumC222416a && A00(userSession) == C05F.A01)) {
            return AbstractC49092Nc.A00(userSession).A03(A00, "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check");
        }
        return false;
    }

    public static final boolean A0C(C47Z c47z, InterfaceC40171tl interfaceC40171tl) {
        if (!c47z.A5T) {
            if (interfaceC40171tl != null && interfaceC40171tl.CUC()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A03(UserSession userSession) {
        if (AbstractC191398dq.A00(userSession).booleanValue()) {
            if (AbstractC196078lx.A01(userSession) && !C196058lv.A08.A04(A00, userSession)) {
                return false;
            }
        } else if (!A06(userSession) && A05(userSession)) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A08(UserSession userSession) {
        int ordinal;
        if (!AbstractC191398dq.A00(userSession).booleanValue()) {
            C08730cb c08730cb = C17060sy.A01;
            EnumC222416a A0I = c08730cb.A01(userSession).A0I();
            if (A0I == null) {
                return false;
            }
            int ordinal2 = A0I.ordinal();
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 1 || AbstractC001900j.A0T(A01(userSession))) {
                        return false;
                    }
                } else if (!AbstractC191398dq.A00(userSession).booleanValue()) {
                    EnumC222416a A0I2 = c08730cb.A01(userSession).A0I();
                    if (A0I2 == null) {
                        ordinal = -1;
                    } else {
                        ordinal = A0I2.ordinal();
                    }
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 1) {
                                return false;
                            }
                            return A09(userSession);
                        }
                        if (!A09(userSession) && !A02(userSession)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return A02(userSession);
        }
        return C196058lv.A08.A04(A00, userSession);
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A0B(UserSession userSession, boolean z) {
        boolean A002;
        if (AbstractC191398dq.A00(userSession).booleanValue()) {
            if (z) {
                A002 = C196058lv.A08.A04(A00, userSession);
            } else {
                return false;
            }
        } else if (!A07(userSession) && z) {
            A002 = C31238DoL.A00(userSession);
        } else {
            return false;
        }
        if (!A002) {
            return true;
        }
        return false;
    }
}
