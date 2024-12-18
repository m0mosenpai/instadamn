package X;

import com.instagram.common.session.UserSession;
import go.Seq;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2BI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BI {
    public final UserSession A00;
    public final InterfaceC19630xq A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0067. Please report as an issue. */
    public final void A02(Long l, Map map) {
        InterfaceC19610xo ARD;
        long millis;
        String str;
        String str2;
        C14360o3.A0B(map, 0);
        if (!map.isEmpty()) {
            InterfaceC19610xo ARD2 = this.A01.ARD();
            for (Map.Entry entry : map.entrySet()) {
                ARD2.E7K(entry.getKey().toString(), AnonymousClass488.A00((C9B9) entry.getValue()));
                UserSession userSession = this.A00;
                EnumC46582Bw enumC46582Bw = (EnumC46582Bw) entry.getKey();
                C9B9 c9b9 = (C9B9) entry.getValue();
                C14360o3.A0B(enumC46582Bw, 1);
                C14360o3.A0B(c9b9, 2);
                if (C5SP.A01(userSession, enumC46582Bw)) {
                    C46552Bt A00 = AbstractC46542Bs.A00(userSession);
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    int i = c9b9.A00;
                    long j = c9b9.A03;
                    int ordinal = enumC46582Bw.ordinal();
                    boolean z = true;
                    switch (ordinal) {
                        case 2:
                            InterfaceC19630xq interfaceC19630xq = A002.A01;
                            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                            ARD3.E7D("fb_feed_crossposting_only_me_privacy_prompt_times_shown", i);
                            ARD3.apply();
                            millis = TimeUnit.SECONDS.toMillis(j);
                            ARD = interfaceC19630xq.ARD();
                            str = "fb_feed_crossposting_only_me_privacy_prompt_time_stamp_ms";
                            ARD.E7G(str, millis);
                            ARD.apply();
                            break;
                        case 3:
                            A00.A01(i);
                            A00.A02(TimeUnit.SECONDS.toMillis(j));
                            break;
                        case 20:
                            A002.A0Y(i);
                            A002.A0i(j);
                            break;
                        case 24:
                            A002.A0a(i);
                            A002.A0l(j);
                            break;
                        case 25:
                            if (i <= 0) {
                                z = false;
                            }
                            A002.A1S(z);
                            break;
                        case 33:
                            A002.A0b(i);
                            A002.A0n(j);
                            break;
                        case 37:
                            if (i > 0) {
                                InterfaceC19610xo ARD4 = A002.A01.ARD();
                                ARD4.E77("fx_cal_profile_photo_chaining_ac_upsell_seen", true);
                                ARD4.apply();
                            }
                            ARD = A00.A04.ARD();
                            str2 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED";
                            ARD.E7G(str2, j);
                            ARD.apply();
                            break;
                        case Seq.NULL_REFNUM /* 41 */:
                            millis = TimeUnit.SECONDS.toMillis(j);
                            ARD = A00.A04.ARD();
                            str = "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN";
                            ARD.E7G(str, millis);
                            ARD.apply();
                            break;
                        case Seq.RefTracker.REF_OFFSET /* 42 */:
                            if (i != 0) {
                                z = false;
                            }
                            A00.A0B(z);
                            A00.A03(TimeUnit.SECONDS.toMillis(j));
                            break;
                        case 52:
                            A002.A0X(i);
                            A002.A0h(j);
                            break;
                        case 57:
                            InterfaceC19630xq interfaceC19630xq2 = A002.A01;
                            InterfaceC19610xo ARD5 = interfaceC19630xq2.ARD();
                            ARD5.E7D("direct_sharesheet_auto_share_to_fb_dialog_display_count", i);
                            ARD5.apply();
                            ARD = interfaceC19630xq2.ARD();
                            str2 = "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec";
                            ARD.E7G(str2, j);
                            ARD.apply();
                            break;
                        case 78:
                            InterfaceC19610xo ARD6 = A002.A01.ARD();
                            ARD6.E7D("fb_feed_crossposting_toggle_tooltip_show_times", i);
                            ARD6.apply();
                            A002.A0g(TimeUnit.SECONDS.toMillis(j));
                            break;
                        case 79:
                            ARD = A002.A01.ARD();
                            ARD.E7D("fb_currently_sharing_feed_tooltip_show_times", i);
                            ARD.apply();
                            break;
                        case 80:
                            InterfaceC19610xo ARD7 = A002.A01.ARD();
                            ARD7.E7D("reel_one_tap_fbshare_tooltip_count", i);
                            ARD7.apply();
                            A002.A0j(j);
                            break;
                        case 81:
                            InterfaceC19630xq interfaceC19630xq3 = A002.A01;
                            InterfaceC19610xo ARD8 = interfaceC19630xq3.ARD();
                            ARD8.E7D("xshare_facebook_page_nux_impression", i);
                            ARD8.apply();
                            millis = TimeUnit.SECONDS.toMillis(j);
                            ARD = interfaceC19630xq3.ARD();
                            str = "xshare_facebook_page_nux_last_seen_time";
                            ARD.E7G(str, millis);
                            ARD.apply();
                            break;
                        case 82:
                            if (i <= 0) {
                                z = false;
                            }
                            A002.A1P(z);
                            ARD = A00.A04.ARD();
                            str2 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL";
                            ARD.E7G(str2, j);
                            ARD.apply();
                            break;
                        case 83:
                            if (i <= 0) {
                                z = false;
                            }
                            A00.A08(z);
                            ARD = A00.A04.ARD();
                            str2 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL";
                            ARD.E7G(str2, j);
                            ARD.apply();
                            break;
                        case 85:
                            InterfaceC19630xq interfaceC19630xq4 = A002.A01;
                            InterfaceC19610xo ARD9 = interfaceC19630xq4.ARD();
                            ARD9.E7D("story_composer_my_story_fb_share_nux_tooltip_count", i);
                            ARD9.apply();
                            millis = TimeUnit.SECONDS.toMillis(j);
                            ARD = interfaceC19630xq4.ARD();
                            str = "story_composer_my_story_fb_share_nux_tooltip_last_seen";
                            ARD.E7G(str, millis);
                            ARD.apply();
                            break;
                        case 86:
                            InterfaceC19630xq interfaceC19630xq5 = A002.A01;
                            InterfaceC19610xo ARD10 = interfaceC19630xq5.ARD();
                            ARD10.E7D("story_composer_my_story_button_nux_tooltip_count", i);
                            ARD10.apply();
                            ARD = interfaceC19630xq5.ARD();
                            ARD.E7D("story_last_server_xposting_turn_on_time_in_second", (int) j);
                            ARD.apply();
                            break;
                        case 89:
                            InterfaceC19630xq interfaceC19630xq6 = A00.A04;
                            InterfaceC19610xo ARD11 = interfaceC19630xq6.ARD();
                            ARD11.E7D("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", i);
                            ARD11.apply();
                            millis = TimeUnit.SECONDS.toMillis(j);
                            ARD = interfaceC19630xq6.ARD();
                            str = "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS";
                            ARD.E7G(str, millis);
                            ARD.apply();
                            break;
                    }
                }
            }
            ARD2.E77("has_synced_notice_states", true);
            if (l != null) {
                ARD2.E7G("upsell_states_sync_sequence_number", l.longValue());
            }
            ARD2.apply();
        }
    }

    public final C9B9 A00(EnumC46582Bw enumC46582Bw) {
        C9B9 c9b9 = null;
        String string = this.A01.getString(enumC46582Bw.toString(), null);
        if (string != null) {
            try {
                c9b9 = AnonymousClass488.parseFromJson(C16V.A00(string));
                return c9b9;
            } catch (IOException e) {
                C0K8.A0G("CXPNoticeStateClientCache", "Unable to deserialize the cxp notice state data", e);
            }
        }
        return c9b9;
    }

    public C2BI(UserSession userSession, C1AV c1av) {
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(c1av, C2BI.class);
        C14360o3.A0B(A04, 1);
        this.A01 = A04;
        this.A00 = userSession;
    }

    public final void A01(C9B9 c9b9, EnumC46582Bw enumC46582Bw) {
        String A00 = AnonymousClass488.A00(c9b9);
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E7K(enumC46582Bw.toString(), A00);
        ARD.apply();
    }
}
