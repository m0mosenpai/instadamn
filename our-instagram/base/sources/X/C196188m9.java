package X;

import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196188m9 implements CallerContextable {
    public static final C196198mA A04 = new Object();
    public static final String __redex_internal_original_name = "FacebookCrosspostingSettingFetcher";
    public C34486FHy A00;
    public final UserSession A01;
    public final C196208mB A02;
    public final C195918ld A03;

    public C196188m9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new C196208mB(userSession);
        this.A03 = new C195918ld(userSession, null);
    }

    public final void A06(final String str, boolean z) {
        if (z) {
            C196198mA.A00(this.A01);
        }
        UserSession userSession = this.A01;
        if (C196018lq.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            C196018lq.A00(userSession).refreshAutoCrossPostingSettings(null);
            return;
        }
        EnumC222416a A01 = AbstractC08690cX.A01(userSession);
        EnumC222416a enumC222416a = EnumC222416a.A05;
        if (A01 != enumC222416a && !C180377zR.A07(userSession)) {
            C196218mC c196218mC = C196208mB.A03;
            if (!C196218mC.A00(userSession) && !C196008lp.A00(userSession)) {
                return;
            }
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
            A00.AAP("flow_name", "not_cal_flow");
            A00.AAP("event_name", "server_setting_fetch_attempt");
            A00.AAP("xposting_setting_location", str);
            A00.A7v("client_setting", false);
            A00.A7v("user_interaction", false);
            A00.AAP("account_type", AbstractC08690cX.A01(userSession).name());
            A00.Cht();
            c196218mC.A01(userSession, null, AnonymousClass001.A0R(str, ":linking_reset"), false, false);
            C195918ld.A05.A01(userSession, null, AnonymousClass001.A0R(str, ":linking_reset"), false, false);
            return;
        }
        if (!C180377zR.A07(userSession)) {
            return;
        }
        if (A01 == EnumC222416a.A06) {
            A04(C05F.A00, str);
            MY8.A00(A00(), userSession, new InterfaceC58074Poz() { // from class: X.9P5
                @Override // X.InterfaceC58074Poz
                public final void DFf() {
                    C196188m9.A02(C196188m9.this, C05F.A00, str);
                }

                @Override // X.InterfaceC58074Poz
                public final void Dq4(C9MA c9ma) {
                    C196188m9 c196188m9 = C196188m9.this;
                    String str2 = str;
                    Integer num = C05F.A00;
                    C196188m9.A03(c196188m9, num, str2);
                    c196188m9.A02.A02(num, str2, C196188m9.A05(EnumC128745rh.FEED, c9ma));
                    boolean A05 = C196188m9.A05(EnumC128745rh.STORY, c9ma);
                    C196008lp c196008lp = C195918ld.A05;
                    UserSession userSession2 = c196188m9.A01;
                    c196008lp.A01(userSession2, num, str2, A05, false);
                    boolean A052 = C196188m9.A05(EnumC128745rh.REELS, c9ma);
                    C9LK.A03(userSession2, str2, "server_setting_fetch_success_not_null", String.valueOf(A052), C9H5.A01(num), C200108tF.A06(userSession2));
                    C200108tF.A0A(userSession2, str2, A052, false);
                }
            });
        } else if (A01 == enumC222416a) {
            A04(C05F.A00, str);
            MY8.A00(A00(), userSession, new InterfaceC58074Poz() { // from class: X.9P5
                @Override // X.InterfaceC58074Poz
                public final void DFf() {
                    C196188m9.A02(C196188m9.this, C05F.A00, str);
                }

                @Override // X.InterfaceC58074Poz
                public final void Dq4(C9MA c9ma) {
                    C196188m9 c196188m9 = C196188m9.this;
                    String str2 = str;
                    Integer num = C05F.A00;
                    C196188m9.A03(c196188m9, num, str2);
                    c196188m9.A02.A02(num, str2, C196188m9.A05(EnumC128745rh.FEED, c9ma));
                    boolean A05 = C196188m9.A05(EnumC128745rh.STORY, c9ma);
                    C196008lp c196008lp = C195918ld.A05;
                    UserSession userSession2 = c196188m9.A01;
                    c196008lp.A01(userSession2, num, str2, A05, false);
                    boolean A052 = C196188m9.A05(EnumC128745rh.REELS, c9ma);
                    C9LK.A03(userSession2, str2, "server_setting_fetch_success_not_null", String.valueOf(A052), C9H5.A01(num), C200108tF.A06(userSession2));
                    C200108tF.A0A(userSession2, str2, A052, false);
                }
            });
            return;
        }
        A04(C05F.A01, str);
        AbstractC196298mL.A00(A00(), userSession, new InterfaceC196288mK() { // from class: X.9LI
            @Override // X.InterfaceC196288mK
            public final void DFf() {
                C196188m9.A02(C196188m9.this, C05F.A01, str);
            }

            @Override // X.InterfaceC196288mK
            public final void Dq2(C196308mM c196308mM) {
                C2JS c2js;
                C196188m9 c196188m9 = C196188m9.this;
                String str2 = str;
                Integer num = C05F.A01;
                C196188m9.A03(c196188m9, num, str2);
                EnumC128695rc enumC128695rc = EnumC128695rc.FB;
                if (c196308mM != null) {
                    c2js = c196308mM.A03(C128685rb.class, "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)", 144118627);
                } else {
                    c2js = null;
                }
                C128705rd c128705rd = null;
                if (c2js != null && c2js.A06(C128705rd.class, "account_linking_configs", -1116170300) != null) {
                    C1LC it = c2js.A06(C128705rd.class, "account_linking_configs", -1116170300).iterator();
                    C14360o3.A07(it);
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C128705rd c128705rd2 = (C128705rd) it.next();
                        if (c128705rd2.getOptionalEnumField(2, "destination_app", EnumC128695rc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128695rc) {
                            c128705rd = c128705rd2;
                            break;
                        }
                    }
                }
                C128735rg A012 = C196188m9.A01(EnumC128745rh.FEED, c128705rd);
                if (A012 != null) {
                    c196188m9.A02.A02(num, str2, A012.getCoercedBooleanField(1, "is_auto_crosspost_enabled"));
                }
                EnumC128745rh enumC128745rh = EnumC128745rh.STORY;
                C128735rg A013 = C196188m9.A01(enumC128745rh, c128705rd);
                if (A013 != null) {
                    c196188m9.A03.A03(A013, num, str2);
                }
                if (c128705rd != null) {
                    C1LC it2 = c128705rd.getRequiredCompactedTreeListField(1, "close_friends_xpost_settings", C128725rf.class, -1588117046).iterator();
                    C14360o3.A07(it2);
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C128735rg c128735rg = (C128735rg) ((C2JS) it2.next()).reinterpretRequired(0, C128735rg.class, -986182339);
                        C14360o3.A07(c128735rg);
                        if (c128735rg.getOptionalEnumField(0, "source_surface", EnumC128745rh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128745rh) {
                            c196188m9.A03.A03(c128735rg, num, str2);
                            break;
                        }
                    }
                }
                C128735rg A014 = C196188m9.A01(EnumC128745rh.REELS, c128705rd);
                if (A014 != null) {
                    UserSession userSession2 = c196188m9.A01;
                    boolean coercedBooleanField = A014.getCoercedBooleanField(1, "is_auto_crosspost_enabled");
                    C9LK.A03(userSession2, str2, "server_setting_fetch_success_not_null", String.valueOf(coercedBooleanField), C9H5.A01(num), C200108tF.A06(userSession2));
                    C200108tF.A0A(userSession2, str2, coercedBooleanField, false);
                }
            }
        });
    }

    public static final C2JO A00() {
        C2JO c2jo = new C2JO();
        ImmutableList.Builder builder = ImmutableList.builder();
        C2JO c2jo2 = new C2JO();
        c2jo2.A09("FB", "destination_app");
        c2jo2.A09("STORY", "destination_surface");
        c2jo2.A09("STORY", "source_surface");
        C2JO c2jo3 = new C2JO();
        c2jo3.A09("FB", "destination_app");
        c2jo3.A09("FEED", "destination_surface");
        c2jo3.A09("FEED", "source_surface");
        builder.add((Object) c2jo2);
        builder.add((Object) c2jo3);
        C2JO c2jo4 = new C2JO();
        c2jo4.A09("FB", "destination_app");
        c2jo4.A09("REELS", "destination_surface");
        c2jo4.A09("REELS", "source_surface");
        builder.add((Object) c2jo4);
        c2jo.A05("crosspost_app_surface_list", builder.build());
        c2jo.A09("IG", "source_app");
        return c2jo;
    }

    public static final C128735rg A01(EnumC128745rh enumC128745rh, C128705rd c128705rd) {
        if (c128705rd != null) {
            C1LC it = c128705rd.getRequiredCompactedTreeListField(0, "crosspost_settings", C128715re.class, -2037360975).iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                C128735rg c128735rg = (C128735rg) ((C2JS) it.next()).reinterpretRequired(0, C128735rg.class, -986182339);
                C14360o3.A07(c128735rg);
                if (c128735rg.getOptionalEnumField(0, "source_surface", EnumC128745rh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128745rh) {
                    return c128735rg;
                }
            }
            return null;
        }
        return null;
    }

    public static final void A02(C196188m9 c196188m9, Integer num, String str) {
        UserSession userSession = c196188m9.A01;
        C9LK.A02(userSession, str, "server_setting_fetch_failed", null, C9H5.A01(num), C196218mC.A00(userSession));
        C9LK.A04(userSession, str, "server_setting_fetch_failed", null, C9H5.A01(num), C196008lp.A00(userSession));
        C9LK.A04(userSession, str, "server_setting_fetch_failed", null, C9H5.A01(num), C196008lp.A00(userSession));
        C9LK.A03(userSession, str, "server_setting_fetch_failed", null, C9H5.A01(num), C200108tF.A06(userSession));
    }

    public static final void A03(C196188m9 c196188m9, Integer num, String str) {
        UserSession userSession = c196188m9.A01;
        C9LK.A04(userSession, str, "server_setting_fetch_success", null, C9H5.A01(num), C196008lp.A00(userSession));
        C9LK.A04(userSession, str, "server_setting_fetch_success", null, C9H5.A01(num), C196008lp.A00(userSession));
        C9LK.A02(userSession, str, "server_setting_fetch_success", null, C9H5.A01(num), C196218mC.A00(userSession));
        C9LK.A03(userSession, str, "server_setting_fetch_success", null, C9H5.A01(num), C200108tF.A06(userSession));
    }

    private final void A04(Integer num, String str) {
        UserSession userSession = this.A01;
        boolean A00 = C196218mC.A00(userSession);
        String A01 = C9H5.A01(num);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A002.AAP("flow_name", "ig_feed_share_to_fb");
        A002.AAP("event_name", "server_setting_fetch_attempt");
        A002.AAP("xposting_setting_location", str);
        A002.A7v("client_setting", Boolean.valueOf(A00));
        A002.A7v("user_interaction", false);
        A002.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A002.AAP("destination_account_linkage_type", A01);
        A002.Cht();
        boolean A003 = C196008lp.A00(userSession);
        boolean z = AbstractC46542Bs.A00(userSession).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", false);
        String A012 = C9H5.A01(num);
        C18920wW A022 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A004 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A004.AAP("flow_name", "ig_story_share_to_fb");
        A004.AAP("event_name", "server_setting_fetch_attempt");
        A004.AAP("xposting_setting_location", str);
        A004.A7v("client_setting", Boolean.valueOf(A003));
        A004.A7v("user_interaction", false);
        A004.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A004.AAP("destination_account_linkage_type", A012);
        A004.Cht();
        C18920wW A023 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A005 = A023.A00(A023.A00, "ig_auto_xposting_to_fb_setting");
        A005.AAP("flow_name", "ig_cf_story_share_to_fb");
        A005.AAP("event_name", "server_setting_fetch_attempt");
        A005.AAP("xposting_setting_location", str);
        A005.A7v("client_setting", Boolean.valueOf(z));
        A005.A7v("user_interaction", false);
        A005.AAP("destination_account_linkage_type", A012);
        A005.Cht();
        boolean A06 = C200108tF.A06(userSession);
        String A013 = C9H5.A01(num);
        C18920wW A024 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A006 = A024.A00(A024.A00, "ig_auto_xposting_to_fb_setting");
        A006.AAP("flow_name", "ig_reels_share_to_fb");
        A006.AAP("event_name", "server_setting_fetch_attempt");
        A006.AAP("xposting_setting_location", str);
        A006.A7v("client_setting", Boolean.valueOf(A06));
        A006.A7v("user_interaction", false);
        A006.AAP("account_type", AbstractC08690cX.A01(userSession).name());
        A006.AAP("destination_account_linkage_type", A013);
        A006.Cht();
    }

    public static final boolean A05(EnumC128745rh enumC128745rh, C9MA c9ma) {
        ImmutableList immutableList;
        C2JS optionalTreeField;
        if (c9ma != null && (optionalTreeField = c9ma.getOptionalTreeField(0, "xcxp_bpl_auto_crosspost_settings_root(configs_request:$configs_request)", C9MB.class, -1047456758)) != null) {
            immutableList = optionalTreeField.getRequiredCompactedTreeListField(0, "auto_xpost_setting", C9PM.class, 304935101);
        } else {
            immutableList = null;
        }
        if (immutableList != null && (!(immutableList instanceof Collection) || !immutableList.isEmpty())) {
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                C2JS c2js = (C2JS) it.next();
                if (c2js.getOptionalEnumField(0, "source_surface", EnumC128745rh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == enumC128745rh && c2js.getCoercedBooleanField(1, "is_auto_crosspost_enabled")) {
                    return true;
                }
            }
        }
        return false;
    }
}
