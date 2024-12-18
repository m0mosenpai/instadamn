package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200108tF {
    public static final C200108tF A01 = new Object();
    public static final CallerContext A00 = CallerContext.A01("ReelsShareToFacebookUtils");

    public static final long A00(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        boolean A02 = C196068lw.A02(C196068lw.A00(userSession).A00(A00));
        InterfaceC19630xq interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
        if (A02) {
            str = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS";
        } else {
            str = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS";
        }
        return interfaceC19630xq.getLong(str, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51624MrH A01(com.facebook.common.callercontext.CallerContext r13, com.instagram.common.session.UserSession r14) {
        /*
            r4 = 0
            X.C14360o3.A0B(r14, r4)
            r6 = 1
            X.8lv r0 = X.C196068lw.A00(r14)
            X.5xZ r2 = r0.A00(r13)
            X.5oR r7 = r2.A00
            r8 = 0
            if (r7 == 0) goto L3f
            java.lang.Class<X.5oW> r5 = X.C126925oW.class
            r3 = 2
            java.lang.String r1 = "fb_reels_privacy_setting_service_data"
            r0 = 580306095(0x2296c4af, float:4.086583E-18)
            X.2JS r3 = r7.getOptionalTreeField(r3, r1, r5, r0)
        L1e:
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L49
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L49
            boolean r0 = X.C196068lw.A02(r2)
            if (r0 == 0) goto L41
            com.instagram.share.facebook.model.FBReelsAudienceType r10 = com.instagram.share.facebook.model.FBReelsAudienceType.A08
            java.lang.String r12 = r2.A03
            java.lang.String r13 = r2.A04
            java.lang.String r14 = r2.A05
            r9 = 0
            java.lang.String r11 = ""
            X.MrH r8 = new X.MrH
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L3f:
            r3 = r8
            goto L1e
        L41:
            java.lang.String r1 = "ReelsShareToFacebookUtils"
            java.lang.String r0 = "(CrosspostingAccountLinkingManager) getFbReelsPrivacyInfo() returns null"
            X.C0K8.A0C(r1, r0)
            return r8
        L49:
            if (r3 == 0) goto L57
            r0 = 5092(0x13e4, float:7.135E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r10 = r3.getOptionalStringField(r6, r0)
            if (r10 != 0) goto L85
        L57:
            java.lang.String r10 = ""
            if (r3 != 0) goto L85
            r1 = r8
        L5c:
            java.util.Map r0 = com.instagram.share.facebook.model.FBReelsAudienceType.A01
            java.lang.Object r9 = r0.get(r1)
            com.instagram.share.facebook.model.FBReelsAudienceType r9 = (com.instagram.share.facebook.model.FBReelsAudienceType) r9
            if (r9 != 0) goto L68
            com.instagram.share.facebook.model.FBReelsAudienceType r9 = com.instagram.share.facebook.model.FBReelsAudienceType.A07
        L68:
            java.lang.String r11 = r2.A03
            java.lang.String r12 = r2.A04
            java.lang.String r13 = r2.A05
            if (r3 == 0) goto L7f
            X.Nhb r2 = X.EnumC53299Nhb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 2
            r0 = 2587(0xa1b, float:3.625E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Enum r8 = r3.getOptionalEnumField(r1, r0, r2)
            X.Nhb r8 = (X.EnumC53299Nhb) r8
        L7f:
            X.MrH r7 = new X.MrH
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L85:
            X.Nhs r1 = X.EnumC53316Nhs.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 4438(0x1156, float:6.219E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Enum r1 = r3.getOptionalEnumField(r4, r0, r1)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200108tF.A01(com.facebook.common.callercontext.CallerContext, com.instagram.common.session.UserSession):X.MrH");
    }

    public static final void A02(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        AbstractC25651Mw.A00(userSession).A05(new C56020Otr(C05F.A01, z, z));
    }

    public static final boolean A03(C31200Dnj c31200Dnj, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        if (!C196058lv.A08.A04(A00, userSession)) {
            if (c31200Dnj != null) {
                str = "NO_LINKED_FACEBOOK_ACCOUNT";
                c31200Dnj.A00 = str;
            }
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315687949831668L)) {
            if (c31200Dnj != null) {
                str = "USER_IN_NO_SHARING_GK";
                c31200Dnj.A00 = str;
            }
            return false;
        }
        if (!C18U.A06(c06090Tz, userSession, 36314554078071485L)) {
            if (c31200Dnj != null) {
                str = "CCP_LAUNCHER_IS_ENABLED_IS_FALSE";
                c31200Dnj.A00 = str;
            }
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        if (!C196058lv.A08.A04(A00, userSession)) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315687949831668L)) {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, 36315687950028277L);
    }

    public static final boolean A06(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        FbAutoCrossPostingSettingManager A002 = C196018lq.A00(userSession);
        if (A002.isCrossPostingSettingsPlatformizationReadEnabled()) {
            return A002.getDataProvider().Blx();
        }
        boolean A02 = C196068lw.A02(C196068lw.A00(userSession).A00(A00));
        InterfaceC19630xq interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
        if (A02) {
            str = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING";
        } else {
            str = "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED";
        }
        return interfaceC19630xq.getBoolean(str, false);
    }

    public static final boolean A07(UserSession userSession) {
        if (C173057nJ.A00.A00(userSession, true) && !AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_IS_REELS_XAR_UNAVAILABLE", false) && (new CXPNoticeStateRepository(userSession, C05F.A00).A00(EnumC46582Bw.A0K).A00 <= 0 || !C18U.A06(C06090Tz.A05, userSession, 2342161368633448560L))) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C196058lv.A08.A04(A00, userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36321533400720945L) && C18U.A06(c06090Tz, userSession, 36322396688361688L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        InterfaceC19610xo ARD;
        long currentTimeMillis;
        String str2;
        String str3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        C131995xZ A002 = C196068lw.A00(userSession).A00(A00);
        String A012 = C9H5.A01(A002.A01);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A003 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A003.AAP("flow_name", "ig_reels_share_to_fb");
        A003.AAP("event_name", "client_setting_updated");
        A003.AAP("xposting_setting_location", str);
        A003.A7v("client_setting", Boolean.valueOf(z));
        A003.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A003.AAP("destination_account_linkage_type", A012);
        A003.Cht();
        C46552Bt A004 = AbstractC46542Bs.A00(userSession);
        boolean A022 = C196068lw.A02(A002);
        InterfaceC19630xq interfaceC19630xq = A004.A04;
        if (A022) {
            z3 = false;
            z4 = interfaceC19630xq.getBoolean("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING", false);
            A004.A06(z);
            if (z2) {
                ARD = interfaceC19630xq.ARD();
                currentTimeMillis = System.currentTimeMillis();
                str2 = "PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS";
                ARD.E7G(str2, currentTimeMillis);
                ARD.apply();
            }
        } else {
            z3 = false;
            z4 = interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", false);
            A004.A09(z);
            if (z2) {
                ARD = interfaceC19630xq.ARD();
                currentTimeMillis = System.currentTimeMillis();
                str2 = "PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS";
                ARD.E7G(str2, currentTimeMillis);
                ARD.apply();
            }
        }
        if (z4 != z && AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED", z3)) {
            if (z) {
                str3 = "enable";
            } else {
                str3 = "disable";
            }
            C9GR.A0G(AnonymousClass001.A0g("[DEBUG ONLY] Attempting to ", str3, " reels auto-crossposting"));
        }
        return z4;
    }

    public final void A0B(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        C14360o3.A0B(str, 2);
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        if (A002.A04.getBoolean("PREFERENCE_IS_REELS_XAR_UNAVAILABLE", false)) {
            C0K8.A0C("ReelsShareToFacebookUtils", "toggleXarAllReels: xar is unavailable");
            return;
        }
        boolean A0C = A002.A0C();
        A0A(userSession, str, false, false);
        A002.A0A(z);
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        Integer num = C05F.A00;
        A003.A05(new C56020Otr(num, z, false));
        if (!z2) {
            return;
        }
        C19K A02 = AbstractC24771Iv.A02(1677891942, 3);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new ReelsShareToFacebookUtils$toggleXarAllReels$1(interfaceC11380iw, userSession, A002, null, interfaceC16820sZ, z, A0C), A02);
    }

    public final void A0C(UserSession userSession, String str, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        A002.A0A(false);
        InterfaceC19630xq interfaceC19630xq = A002.A04;
        long j = interfaceC19630xq.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0L) - 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", j);
        ARD.apply();
        boolean A0A = A0A(userSession, str, z, true);
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        Integer num = C05F.A01;
        A003.A05(new C56020Otr(num, z, z));
        if (z2) {
            if (C196018lq.A00(userSession).isCrossPostingSettingsPlatformizationWriteEnabled()) {
                C196018lq.A00(userSession).updateAutoCrossPostingSetting(new C51761Mtk(AbstractC16850sd.A0M(new C09530e4(EnumC222709sB.A03, Boolean.valueOf(z)))), null);
                return;
            }
            D8R d8r = new D8R(userSession, str, 6, A0A);
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A004 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
            A004.AAP("flow_name", "ig_reels_share_to_fb");
            A004.AAP("event_name", "server_setting_update_attempt");
            A004.AAP("xposting_setting_location", "reels");
            A004.A7v("user_attempted_client_setting", Boolean.valueOf(z));
            A004.AAP("account_type", AbstractC08690cX.A01(userSession).name());
            A004.AAP("destination_account_linkage_type", null);
            A004.Cht();
            C131995xZ A005 = C196068lw.A00(userSession).A00(A00);
            if (C196068lw.A02(A005)) {
                B86 b86 = B86.A00;
                MY8 my8 = MY8.A00;
                List singletonList = Collections.singletonList(new OTO("REELS", z));
                C14360o3.A07(singletonList);
                my8.A01(userSession, new C24050Alm(userSession, b86, d8r, z), singletonList);
                return;
            }
            Integer num2 = A005.A02;
            if (num2 != num && num2 != C05F.A0C) {
                d8r.invoke();
                return;
            }
            B87 b87 = B87.A00;
            OVK ovk = OVK.A00;
            List singletonList2 = Collections.singletonList(new OTO("REELS", z));
            C14360o3.A07(singletonList2);
            ovk.A00(userSession, new C24046Ali(userSession, b87, d8r, z), singletonList2);
        }
    }

    public final boolean A0F(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C196218mC.A00(userSession) && !A06(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession) {
        if (!C196058lv.A08.A04(A00, userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36321533400786482L) && C18U.A06(c06090Tz, userSession, 36326541332330448L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04(C31200Dnj c31200Dnj, UserSession userSession, C200108tF c200108tF) {
        String str;
        boolean A06 = A06(userSession);
        boolean A0C = AbstractC46542Bs.A00(userSession).A0C();
        if (A06 && A0C) {
            C0w9.A03("ReelsShareToFacebook", "<shouldShowShareToFacebook> both ccp && xar are true");
        }
        if (!A06) {
            if (A0C) {
                if (c31200Dnj != null) {
                    str = "XAR_IS_ENABLED_ON_SERVER";
                    c31200Dnj.A00 = str;
                }
                return false;
            }
            if (!c200108tF.A0E(userSession)) {
                if (c31200Dnj != null) {
                    str = "XAR_TOGGLE_IS_MORE_RECENT_THAN_CCP";
                    c31200Dnj.A00 = str;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (A05(r7) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0D(X.C31200Dnj r6, com.instagram.common.session.UserSession r7, boolean r8) {
        /*
            r5 = this;
            boolean r2 = A03(r6, r7)
            if (r8 == 0) goto L10
            if (r2 != 0) goto Lf
            boolean r0 = A05(r7)
            r2 = 0
            if (r0 == 0) goto L10
        Lf:
            r2 = 1
        L10:
            boolean r1 = A07(r7)
            boolean r0 = A04(r6, r7, r5)
            if (r2 == 0) goto L37
            if (r0 != 0) goto L1e
            if (r1 != 0) goto L37
        L1e:
            r4 = 1
        L1f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r3, r2, r1, r0}
            X.AbstractC16960so.A1Q(r0)
            return r4
        L37:
            r4 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200108tF.A0D(X.Dnj, com.instagram.common.session.UserSession, boolean):boolean");
    }

    public final boolean A0E(UserSession userSession) {
        C46552Bt A002 = AbstractC46542Bs.A00(userSession);
        if (!A002.A0C()) {
            long A003 = A00(userSession);
            InterfaceC19630xq interfaceC19630xq = A002.A04;
            if (A003 > interfaceC19630xq.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0L) || System.currentTimeMillis() - interfaceC19630xq.getLong("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", 0L) > C18U.A01(C06090Tz.A05, userSession, 36603227419972513L) * 86400000) {
                return true;
            }
            return false;
        }
        return false;
    }
}
