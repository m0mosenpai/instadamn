package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class OMW {
    public static C9B9 A00(CXPNoticeStateRepository cXPNoticeStateRepository, String str) {
        EnumC46582Bw enumC46582Bw = (EnumC46582Bw) EnumHelper.A00(str, EnumC46582Bw.A0Z);
        C14360o3.A07(enumC46582Bw);
        return cXPNoticeStateRepository.A00(enumC46582Bw);
    }

    public final C82H A01() {
        if (this instanceof C52760NWk) {
            return C82H.A0S;
        }
        if (this instanceof C52759NWj) {
            return C82H.A0O;
        }
        if (this instanceof C52758NWi) {
            return C82H.A0N;
        }
        if (this instanceof C52757NWh) {
            return C82H.A0M;
        }
        if (this instanceof C52756NWg) {
            return C82H.A09;
        }
        if (this instanceof C52755NWf) {
            return C82H.A0W;
        }
        if (this instanceof C52765NWp) {
            return ((C52765NWp) this).A00;
        }
        if (this instanceof C52764NWo) {
            return ((C52764NWo) this).A00;
        }
        if (this instanceof C52763NWn) {
            return ((C52763NWn) this).A00;
        }
        if (this instanceof C52754NWe) {
            return C82H.A03;
        }
        if (this instanceof C52753NWd) {
            return C82H.A0J;
        }
        if (this instanceof C52752NWc) {
            return C82H.A0I;
        }
        if (this instanceof C52761NWl) {
            return ((C52761NWl) this).A00;
        }
        if (this instanceof C52751NWb) {
            return C82H.A0G;
        }
        if (this instanceof C52750NWa) {
            return C82H.A0F;
        }
        if (this instanceof NWZ) {
            return C82H.A0A;
        }
        if (this instanceof NWY) {
            return C82H.A0l;
        }
        if (this instanceof NWX) {
            return C82H.A0h;
        }
        if (this instanceof C52762NWm) {
            return ((C52762NWm) this).A00;
        }
        if (this instanceof NWW) {
            return C82H.A0C;
        }
        return C82H.A0B;
    }

    public final C9B9 A02(UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        if (this instanceof C52760NWk) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_UNLINKED_USER_STORY");
        }
        if (this instanceof C52759NWj) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A00 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_UNIFIED_STORIES_FEED");
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            return A00.A00(AbstractC31172DnG.A01(A0x, "xpost_unified_onboarding_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x, "xpost_unified_onboarding_upsell_last_seen_sec"));
        }
        if (this instanceof C52758NWi) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A002 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED");
            InterfaceC19630xq A0x2 = AbstractC166987dD.A0x(userSession);
            return A002.A00(AbstractC31172DnG.A01(A0x2, "story_reels_ccp_user_migration_feed_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x2, "story_reels_ccp_user_migration_feed_upsell_last_seen_sec"));
        }
        if (this instanceof C52757NWh) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A003 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_STORY");
            InterfaceC19630xq A0x3 = AbstractC166987dD.A0x(userSession);
            return A003.A00(AbstractC31172DnG.A01(A0x3, "xpost_unified_onboarding_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x3, "xpost_unified_onboarding_upsell_last_seen_sec"));
        }
        if (this instanceof C52756NWg) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A004 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED");
            InterfaceC19630xq A0x4 = AbstractC166987dD.A0x(userSession);
            return A004.A00(AbstractC31172DnG.A01(A0x4, "xpost_unified_onboarding_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x4, "xpost_unified_onboarding_upsell_last_seen_sec"));
        }
        if (this instanceof C52755NWf) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A005 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_XAR_REELS");
            InterfaceC19630xq interfaceC19630xq = AbstractC46542Bs.A00(userSession).A04;
            return A005.A00(!interfaceC19630xq.getBoolean("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", true) ? 1 : 0, (int) TimeUnit.MILLISECONDS.toSeconds(AbstractC31175DnJ.A03(interfaceC19630xq, "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS")));
        }
        if (this instanceof C52765NWp) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V3");
        }
        if (this instanceof C52764NWo) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V2");
        }
        if (this instanceof C52763NWn) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A006 = A00(cXPNoticeStateRepository, "XAR_TO_CCP_MIGRATION");
            InterfaceC19630xq interfaceC19630xq2 = AbstractC46542Bs.A00(userSession).A04;
            return A006.A00(AbstractC31172DnG.A01(interfaceC19630xq2, "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT"), (int) TimeUnit.MILLISECONDS.toSeconds(AbstractC31175DnJ.A03(interfaceC19630xq2, "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS")));
        }
        if (this instanceof C52754NWe) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A007 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_CCP_REELS");
            InterfaceC19630xq interfaceC19630xq3 = AbstractC46542Bs.A00(userSession).A04;
            return A007.A00(AbstractC31172DnG.A01(interfaceC19630xq3, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT"), (int) TimeUnit.MILLISECONDS.toSeconds(AbstractC31175DnJ.A03(interfaceC19630xq3, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS")));
        }
        if (this instanceof C52753NWd) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A008 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_REEL_CCP_MIGRATION_STORY");
            InterfaceC19630xq A0x5 = AbstractC166987dD.A0x(userSession);
            return A008.A00(AbstractC31172DnG.A01(A0x5, "reels_ccp_user_migration_story_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x5, "reels_ccp_user_migration_story_upsell_last_seen_sec"));
        }
        if (this instanceof C52752NWc) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A009 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_REEL_CCP_MIGRATION_FEED");
            InterfaceC19630xq A0x6 = AbstractC166987dD.A0x(userSession);
            return A009.A00(AbstractC31172DnG.A01(A0x6, "reels_ccp_user_migration_feed_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x6, "reels_ccp_user_migration_feed_upsell_last_seen_sec"));
        }
        if (this instanceof C52761NWl) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_CCP_REELS_AGGREGATED_FEEDBACK_DISCLOSURE");
        }
        if (this instanceof C52751NWb) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A0010 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_MIGRATION_STORIES_WAVE2");
            InterfaceC19630xq A0x7 = AbstractC166987dD.A0x(userSession);
            return A0010.A00(AbstractC31172DnG.A01(A0x7, "story_xpost_user_migration_upsell_second_wave_display_count"), (int) AbstractC31175DnJ.A03(A0x7, "story_xpost_user_migration_upsell_second_wave_last_seen_sec"));
        }
        if (this instanceof C52750NWa) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A0011 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_MIGRATION_FEED_WAVE2");
            InterfaceC19630xq A0x8 = AbstractC166987dD.A0x(userSession);
            return A0011.A00(AbstractC31172DnG.A01(A0x8, "feed_xpost_user_migration_upsell_second_wave_display_count"), (int) AbstractC31175DnJ.A03(A0x8, "feed_xpost_user_migration_upsell_second_wave_last_seen_sec"));
        }
        if (this instanceof NWZ) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            C9B9 A0012 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY");
            InterfaceC19630xq A0x9 = AbstractC166987dD.A0x(userSession);
            return A0012.A00(AbstractC31172DnG.A01(A0x9, "feed_reels_ccp_user_migration_story_upsell_display_count"), (int) AbstractC31175DnJ.A03(A0x9, "feed_reels_ccp_user_migration_story_upsell_last_seen_sec"));
        }
        if (this instanceof NWY) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            return A00(cXPNoticeStateRepository, "DIALOG_STORY").A00(AbstractC31172DnG.A01(AbstractC166987dD.A0x(userSession), "direct_sharesheet_auto_share_to_fb_dialog_display_count"), (int) AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec"));
        }
        if (this instanceof NWX) {
            AbstractC167017dG.A1O(userSession, cXPNoticeStateRepository);
            return A00(cXPNoticeStateRepository, "DIALOG_FEED").A00(AbstractC166987dD.A0x(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0), (int) AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "feed_fb_autoshare_upsell_dialog_last_seen_sec"));
        }
        if (this instanceof C52762NWm) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, ((C52762NWm) this).A01);
        }
        if (this instanceof NWW) {
            C14360o3.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_THREADS_CONFIRMATION");
        }
        C14360o3.A0B(cXPNoticeStateRepository, 2);
        return A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_THREADS");
    }

    public final String A03() {
        if (this instanceof C52754NWe) {
            return "BOTTOMSHEET_CCP_REELS";
        }
        if (this instanceof C52760NWk) {
            return "BOTTOMSHEET_UNLINKED_USER_STORY";
        }
        if (this instanceof C52759NWj) {
            return "BOTTOMSHEET_UNIFIED_STORIES_FEED";
        }
        if (this instanceof C52758NWi) {
            return "BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED";
        }
        if (this instanceof C52757NWh) {
            return "BOTTOMSHEET_STORY";
        }
        if (this instanceof C52756NWg) {
            return "BOTTOMSHEET_FEED";
        }
        if (this instanceof C52755NWf) {
            return "BOTTOMSHEET_XAR_REELS";
        }
        if (this instanceof C52765NWp) {
            return "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V3";
        }
        if (this instanceof C52764NWo) {
            return "BOTTOMSHEET_XAR_CCP_MIGRATION_REELS_V2";
        }
        if (this instanceof C52763NWn) {
            return "XAR_TO_CCP_MIGRATION";
        }
        if (this instanceof C52753NWd) {
            return "BOTTOMSHEET_REEL_CCP_MIGRATION_STORY";
        }
        if (this instanceof C52752NWc) {
            return "BOTTOMSHEET_REEL_CCP_MIGRATION_FEED";
        }
        if (this instanceof C52761NWl) {
            return "BOTTOMSHEET_CCP_REELS_AGGREGATED_FEEDBACK_DISCLOSURE";
        }
        if (this instanceof C52751NWb) {
            return "BOTTOMSHEET_MIGRATION_STORIES_WAVE2";
        }
        if (this instanceof C52750NWa) {
            return "BOTTOMSHEET_MIGRATION_FEED_WAVE2";
        }
        if (this instanceof NWZ) {
            return "BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY";
        }
        if (this instanceof NWY) {
            return "DIALOG_STORY";
        }
        if (this instanceof NWX) {
            return "DIALOG_FEED";
        }
        if (this instanceof C52762NWm) {
            return ((C52762NWm) this).A01;
        }
        if (this instanceof NWW) {
            return "BOTTOMSHEET_FEED_THREADS_CONFIRMATION";
        }
        return "BOTTOMSHEET_FEED_THREADS";
    }

    public final List A04() {
        if (this instanceof C52760NWk) {
            return ((C52760NWk) this).A00;
        }
        if (this instanceof C52759NWj) {
            return ((C52759NWj) this).A00;
        }
        if (this instanceof C52758NWi) {
            return ((C52758NWi) this).A00;
        }
        if (this instanceof C52757NWh) {
            return ((C52757NWh) this).A00;
        }
        if (this instanceof C52756NWg) {
            return ((C52756NWg) this).A00;
        }
        if (this instanceof C52755NWf) {
            return ((C52755NWf) this).A00;
        }
        if (this instanceof C52765NWp) {
            return ((C52765NWp) this).A02;
        }
        if (this instanceof C52764NWo) {
            return ((C52764NWo) this).A02;
        }
        if (this instanceof C52763NWn) {
            return ((C52763NWn) this).A02;
        }
        if (this instanceof C52754NWe) {
            return ((C52754NWe) this).A00;
        }
        if (this instanceof C52753NWd) {
            return ((C52753NWd) this).A00;
        }
        if (this instanceof C52752NWc) {
            return ((C52752NWc) this).A00;
        }
        if (this instanceof C52761NWl) {
            return ((C52761NWl) this).A01;
        }
        if (this instanceof C52751NWb) {
            return ((C52751NWb) this).A00;
        }
        if (this instanceof C52750NWa) {
            return ((C52750NWa) this).A00;
        }
        if (this instanceof NWZ) {
            return ((NWZ) this).A00;
        }
        if (this instanceof NWY) {
            return ((NWY) this).A00;
        }
        if (this instanceof NWX) {
            return ((NWX) this).A00;
        }
        if (this instanceof C52762NWm) {
            return ((C52762NWm) this).A02;
        }
        if (this instanceof NWW) {
            return ((NWW) this).A00;
        }
        return ((NWV) this).A00;
    }

    public final boolean A05(C54729OFg c54729OFg) {
        Fragment n79;
        C189448aO A0y;
        boolean z;
        C195918ld c195918ld;
        InterfaceC57990Pna interfaceC57990Pna;
        C55088Oal c55088Oal;
        Activity activity;
        Fragment fragment;
        UserSession userSession;
        C82G c82g;
        String str;
        String str2;
        C82H c82h;
        boolean z2;
        InterfaceC57990Pna interfaceC57990Pna2;
        OGa oGa;
        Activity activity2;
        Fragment fragment2;
        UserSession userSession2;
        C82G c82g2;
        C82H c82h2;
        String str3;
        FragmentActivity activity3;
        C55011OVw c55011OVw;
        Fragment fragment3;
        UserSession userSession3;
        AbstractC59962oe abstractC59962oe;
        String str4;
        Fragment fragment4;
        AbstractC59962oe abstractC59962oe2;
        Fragment fragment5;
        boolean z3;
        InterfaceC57990Pna interfaceC57990Pna3;
        C55088Oal c55088Oal2;
        Activity activity4;
        Fragment fragment6;
        UserSession userSession4;
        C82G c82g3;
        String str5;
        String str6;
        OE3 oe3;
        C82H c82h3;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if (this instanceof C52760NWk) {
            Context context = c54729OFg.A01;
            if (context != null) {
                UserSession userSession5 = c54729OFg.A05;
                PKB pkb = (PKB) userSession5.A01(PKB.class, new C50152MDf(userSession5, 21));
                C54723OFa c54723OFa = c54729OFg.A0A;
                String str15 = null;
                if (c54723OFa != null) {
                    str15 = c54723OFa.A0B;
                }
                String str16 = "";
                if (str15 == null) {
                    str15 = "";
                }
                pkb.A07 = str15;
                if (c54723OFa == null || (str7 = c54723OFa.A00) == null) {
                    str7 = "";
                }
                pkb.A01 = str7;
                if (c54723OFa == null || (str8 = c54723OFa.A03) == null) {
                    str8 = "";
                }
                pkb.A03 = str8;
                if (c54723OFa == null || (str9 = c54723OFa.A06) == null) {
                    str9 = "";
                }
                pkb.A05 = str9;
                if (c54723OFa == null || (str10 = c54723OFa.A01) == null) {
                    str10 = "";
                }
                pkb.A02 = str10;
                if (c54723OFa == null || (str11 = c54723OFa.A04) == null) {
                    str11 = "";
                }
                pkb.A04 = str11;
                if (c54723OFa == null || (str12 = c54723OFa.A07) == null) {
                    str12 = "";
                }
                pkb.A06 = str12;
                if (c54723OFa == null || (str13 = c54723OFa.A09) == null) {
                    str13 = "";
                }
                pkb.A08 = str13;
                if (c54723OFa != null && (str14 = c54723OFa.A0A) != null) {
                    str16 = str14;
                }
                pkb.A09 = str16;
                pkb.A00 = c54729OFg.A06;
                AbstractC149576oA.A00(userSession5).A00 = c54729OFg.A0D;
                C14360o3.A0C(context, "null cannot be cast to non-null type android.content.Context");
                AbstractC53979Ntq.A00(context, userSession5, "IG_FB_STORY_CROSS_POSTING_AFTER_SHARE_UPSELL").showUpsell(null, c54729OFg.A00);
            }
        } else {
            if (this instanceof C52759NWj) {
                interfaceC57990Pna = c54729OFg.A08;
                if (interfaceC57990Pna == null) {
                    interfaceC57990Pna = PGO.A00;
                }
                c55088Oal = NVk.A03;
                activity = c54729OFg.A00;
                fragment = c54729OFg.A02;
                userSession = c54729OFg.A05;
                c82g = c54729OFg.A03;
                str = c54729OFg.A0B;
                str2 = "";
                if (str == null) {
                    str = "";
                }
                String str17 = c54729OFg.A0C;
                if (str17 != null) {
                    str2 = str17;
                }
                c82h = C82H.A0O;
            } else if (this instanceof C52758NWi) {
                interfaceC57990Pna = c54729OFg.A08;
                if (interfaceC57990Pna == null) {
                    interfaceC57990Pna = PGN.A00;
                }
                c55088Oal = NVk.A03;
                activity = c54729OFg.A00;
                fragment = c54729OFg.A02;
                userSession = c54729OFg.A05;
                c82g = c54729OFg.A03;
                str = c54729OFg.A0B;
                str2 = "";
                if (str == null) {
                    str = "";
                }
                String str18 = c54729OFg.A0C;
                if (str18 != null) {
                    str2 = str18;
                }
                c82h = C82H.A0N;
            } else {
                if (this instanceof C52757NWh) {
                    z3 = false;
                    interfaceC57990Pna3 = c54729OFg.A08;
                    if (interfaceC57990Pna3 == null) {
                        interfaceC57990Pna3 = PGM.A00;
                    }
                    c55088Oal2 = NVk.A03;
                    activity4 = c54729OFg.A00;
                    fragment6 = c54729OFg.A02;
                    userSession4 = c54729OFg.A05;
                    c82g3 = c54729OFg.A03;
                    str5 = c54729OFg.A0B;
                    str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str19 = c54729OFg.A0C;
                    if (str19 != null) {
                        str6 = str19;
                    }
                    oe3 = null;
                    c82h3 = C82H.A0M;
                } else if (this instanceof C52756NWg) {
                    z3 = false;
                    interfaceC57990Pna3 = c54729OFg.A08;
                    if (interfaceC57990Pna3 == null) {
                        interfaceC57990Pna3 = PGL.A00;
                    }
                    c55088Oal2 = NVk.A03;
                    activity4 = c54729OFg.A00;
                    fragment6 = c54729OFg.A02;
                    userSession4 = c54729OFg.A05;
                    c82g3 = c54729OFg.A03;
                    str5 = c54729OFg.A0B;
                    str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str20 = c54729OFg.A0C;
                    if (str20 != null) {
                        str6 = str20;
                    }
                    oe3 = null;
                    c82h3 = C82H.A09;
                } else if (this instanceof C52755NWf) {
                    if (c54729OFg.A09 != null && (fragment5 = c54729OFg.A02) != null) {
                        C55195Oe1.A01.A05(fragment5, c54729OFg);
                    } else {
                        return false;
                    }
                } else if (this instanceof C52765NWp) {
                    C52765NWp c52765NWp = (C52765NWp) this;
                    C55011OVw c55011OVw2 = c54729OFg.A09;
                    if (c55011OVw2 != null) {
                        Fragment fragment7 = c54729OFg.A02;
                        if ((fragment7 instanceof AbstractC59962oe) && (abstractC59962oe2 = (AbstractC59962oe) fragment7) != null) {
                            C55052Oa3.A00(c55011OVw2.A01, abstractC59962oe2, c54729OFg.A05, Integer.valueOf(c55011OVw2.A00), c52765NWp.A01);
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (this instanceof C52764NWo) {
                        C52764NWo c52764NWo = (C52764NWo) this;
                        c55011OVw = c54729OFg.A09;
                        if (c55011OVw != null && (fragment4 = c54729OFg.A02) != null) {
                            userSession3 = c54729OFg.A05;
                            abstractC59962oe = (AbstractC59962oe) fragment4;
                            str4 = c52764NWo.A01;
                        } else {
                            return false;
                        }
                    } else if (this instanceof C52763NWn) {
                        C52763NWn c52763NWn = (C52763NWn) this;
                        c55011OVw = c54729OFg.A09;
                        if (c55011OVw != null && (fragment3 = c54729OFg.A02) != null) {
                            userSession3 = c54729OFg.A05;
                            abstractC59962oe = (AbstractC59962oe) fragment3;
                            str4 = c52763NWn.A01;
                        } else {
                            return false;
                        }
                    } else if (this instanceof C52754NWe) {
                        C55011OVw c55011OVw3 = c54729OFg.A09;
                        if (c55011OVw3 != null) {
                            N57 A00 = AbstractC54217Nxv.A00(c55011OVw3);
                            Fragment fragment8 = c54729OFg.A02;
                            if (fragment8 != null && (activity3 = fragment8.getActivity()) != null) {
                                C189448aO A0y2 = AbstractC25225BEi.A0y(c54729OFg.A05);
                                A0y2.A16 = false;
                                C56766PHj.A00(A0y2, c54729OFg, 16);
                                AbstractC31173DnH.A0w(activity3, A00, A0y2);
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (this instanceof C52753NWd) {
                        interfaceC57990Pna = c54729OFg.A08;
                        if (interfaceC57990Pna == null) {
                            interfaceC57990Pna = PGK.A00;
                        }
                        c55088Oal = NVk.A03;
                        activity = c54729OFg.A00;
                        fragment = c54729OFg.A02;
                        userSession = c54729OFg.A05;
                        c82g = c54729OFg.A03;
                        str = c54729OFg.A0B;
                        str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str21 = c54729OFg.A0C;
                        if (str21 != null) {
                            str2 = str21;
                        }
                        c82h = C82H.A0J;
                    } else if (this instanceof C52752NWc) {
                        interfaceC57990Pna = c54729OFg.A08;
                        if (interfaceC57990Pna == null) {
                            interfaceC57990Pna = PGJ.A00;
                        }
                        c55088Oal = NVk.A03;
                        activity = c54729OFg.A00;
                        fragment = c54729OFg.A02;
                        userSession = c54729OFg.A05;
                        c82g = c54729OFg.A03;
                        str = c54729OFg.A0B;
                        str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str22 = c54729OFg.A0C;
                        if (str22 != null) {
                            str2 = str22;
                        }
                        c82h = C82H.A0I;
                    } else if (this instanceof C52761NWl) {
                        UserSession userSession6 = c54729OFg.A05;
                        Activity activity5 = c54729OFg.A00;
                        C14360o3.A0C(activity5, "null cannot be cast to non-null type android.content.Context");
                        String A002 = AbstractC201118ut.A00(c54729OFg.A03);
                        if (A002 == null) {
                            return false;
                        }
                        InterfaceC11380iw interfaceC11380iw = c54729OFg.A04;
                        if (interfaceC11380iw == null || (str3 = interfaceC11380iw.getModuleName()) == null) {
                            str3 = "";
                        }
                        HashMap A1G = AbstractC166987dD.A1G();
                        HashMap A1G2 = AbstractC166987dD.A1G();
                        HashMap A1G3 = AbstractC166987dD.A1G();
                        BitSet bitSet = new BitSet(1);
                        A1G.put("entrypoint", A002);
                        bitSet.set(0);
                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession6);
                        A0C.A0R = str3;
                        if (bitSet.nextClearBit(0) >= 1) {
                            C66277U6x A02 = C66277U6x.A02("com.bloks.www.ccp.aggregated_feedback.disclosure", AbstractC191768eY.A01(A1G), A1G2);
                            AbstractC31178DnM.A1M(A02, -1);
                            A02.A03 = null;
                            A02.A02 = null;
                            A02.A04 = null;
                            A02.A08(A1G3);
                            A02.A05(activity5, A0C);
                        } else {
                            throw AbstractC166987dD.A14("Missing Required Props");
                        }
                    } else {
                        if (this instanceof C52751NWb) {
                            z2 = false;
                            interfaceC57990Pna2 = c54729OFg.A08;
                            if (interfaceC57990Pna2 == null) {
                                interfaceC57990Pna2 = PGI.A00;
                            }
                            oGa = NVj.A01;
                            activity2 = c54729OFg.A00;
                            fragment2 = c54729OFg.A02;
                            userSession2 = c54729OFg.A05;
                            c82g2 = c54729OFg.A03;
                            c82h2 = C82H.A0G;
                        } else if (this instanceof C52750NWa) {
                            z2 = false;
                            interfaceC57990Pna2 = c54729OFg.A08;
                            if (interfaceC57990Pna2 == null) {
                                interfaceC57990Pna2 = PGH.A00;
                            }
                            oGa = NVj.A01;
                            activity2 = c54729OFg.A00;
                            fragment2 = c54729OFg.A02;
                            userSession2 = c54729OFg.A05;
                            c82g2 = c54729OFg.A03;
                            c82h2 = C82H.A0F;
                        } else if (this instanceof NWZ) {
                            interfaceC57990Pna = c54729OFg.A08;
                            if (interfaceC57990Pna == null) {
                                interfaceC57990Pna = PGG.A00;
                            }
                            c55088Oal = NVk.A03;
                            activity = c54729OFg.A00;
                            fragment = c54729OFg.A02;
                            userSession = c54729OFg.A05;
                            c82g = c54729OFg.A03;
                            str = c54729OFg.A0B;
                            str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            String str23 = c54729OFg.A0C;
                            if (str23 != null) {
                                str2 = str23;
                            }
                            c82h = C82H.A0A;
                        } else if (this instanceof NWY) {
                            Context context2 = c54729OFg.A01;
                            if (context2 == null || (c195918ld = c54729OFg.A07) == null) {
                                return false;
                            }
                            UserSession userSession7 = c54729OFg.A05;
                            C14360o3.A0C(context2, "null cannot be cast to non-null type android.content.Context");
                            C14360o3.A0C(c195918ld, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
                            String str24 = c54729OFg.A0C;
                            if (str24 == null) {
                                str24 = "";
                            }
                            AbstractC55624On9.A00(context2, userSession7, c195918ld, c54729OFg.A08, str24);
                        } else if (this instanceof NWX) {
                            Context context3 = c54729OFg.A01;
                            if (context3 == null) {
                                return false;
                            }
                            UserSession userSession8 = c54729OFg.A05;
                            C14360o3.A0C(context3, "null cannot be cast to non-null type android.content.Context");
                            InterfaceC57990Pna interfaceC57990Pna4 = c54729OFg.A08;
                            String str25 = c54729OFg.A0C;
                            if (str25 == null) {
                                str25 = "";
                            }
                            C55627OnC.A01(context3, userSession8, interfaceC57990Pna4, str25);
                        } else {
                            if (this instanceof C52762NWm) {
                                UserSession userSession9 = c54729OFg.A05;
                                boolean A1X = MSZ.A1X(C196068lw.A00(userSession9), "CrosspostingBloksUpsell");
                                C82G c82g4 = c54729OFg.A03;
                                C82H c82h4 = ((C52762NWm) this).A00;
                                C82I A0H = MSW.A0H();
                                MSX.A1I(A0H, A1X);
                                new C82L(c82g4, c82h4, A0H, userSession9, true).A02(c54729OFg.A00, new PG4());
                                return true;
                            }
                            if (this instanceof NWW) {
                                n79 = new C52150N6a();
                                z = true;
                                Bundle bundle = new Bundle(1);
                                bundle.putBoolean("is_new_user_activation_flow", false);
                                n79.setArguments(bundle);
                                A0y = AbstractC25225BEi.A0y(c54729OFg.A05);
                                A0y.A0k = true;
                            } else {
                                n79 = new N79();
                                A0y = AbstractC25225BEi.A0y(c54729OFg.A05);
                                z = true;
                                A0y.A0k = true;
                                C56766PHj.A00(A0y, c54729OFg, 15);
                            }
                            A0y.A00().A02(c54729OFg.A00, n79);
                            return z;
                        }
                        String str26 = c54729OFg.A0B;
                        if (str26 == null) {
                            str26 = "";
                        }
                        String str27 = c54729OFg.A0C;
                        if (str27 == null) {
                            str27 = "";
                        }
                        oGa.A00(activity2, fragment2, c82g2, c82h2, userSession2, interfaceC57990Pna2, str26, str27, z2);
                    }
                    C55052Oa3.A00(c55011OVw.A01, abstractC59962oe, userSession3, Integer.valueOf(c55011OVw.A00), str4);
                }
                c55088Oal2.A02(activity4, fragment6, c82g3, c82h3, userSession4, oe3, interfaceC57990Pna3, oe3, c54729OFg.A0A, str5, str6, z3);
            }
            c55088Oal.A03(activity, fragment, c82g, c82h, userSession, interfaceC57990Pna, str, str2);
        }
        return true;
    }
}
