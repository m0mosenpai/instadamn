package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.29x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C461329x {
    public static final C461329x A00 = new Object();

    public static final void A00(UserSession userSession, long j) {
        C14360o3.A0B(userSession, 0);
        ArrayList A04 = C123815iv.A00.A04(userSession);
        Double d = null;
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_time_spent_screen_time");
        A002.AAP("action", "ig_ts_session_end");
        A002.A8I("usage_seconds", Double.valueOf(C461529z.A00()));
        A002.AAk("weekly_screen_time", C16930sl.A00);
        A002.A8I("session_length", Double.valueOf(j));
        String id = TimeZone.getDefault().getID();
        C14360o3.A07(id);
        A002.AAP("timezone", id);
        if (((Number) AbstractC001800i.A0O(A04, A04.size() - 1)) != null) {
            d = Double.valueOf(r0.longValue());
        }
        A002.A8I("aggregated_screen_time_today", d);
        A002.Cht();
    }

    public static final void A01(UserSession userSession, EnumC456327x enumC456327x, Integer num, Map map, long j, boolean z) {
        String A08;
        C14360o3.A0B(userSession, 1);
        Long valueOf = Long.valueOf(C461529z.A00());
        if (enumC456327x == null || (A08 = enumC456327x.A00) == null) {
            A08 = AnonymousClass280.A01.A08(userSession);
        }
        A03(userSession, null, num, null, valueOf, Long.valueOf(j), A08, AbstractC16850sd.A0M(new C09530e4("is_cold_start", String.valueOf(z))), map, A09(userSession));
    }

    public static final void A02(UserSession userSession, EnumC33408Epf enumC33408Epf, Integer num, Long l, Long l2, Long l3, String str, Map map) {
        String str2 = str;
        if (str == null) {
            str2 = AnonymousClass280.A01.A08(userSession);
        }
        boolean A09 = A09(userSession);
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A03(userSession, enumC33408Epf, num, l, l2, l3, str2, map, c16920sk, A09);
    }

    public static final void A05(UserSession userSession, EnumC33408Epf enumC33408Epf, String str, long j, long j2) {
        C14360o3.A0B(userSession, 0);
        A02(userSession, enumC33408Epf, C05F.A1F, null, Long.valueOf(j), Long.valueOf(j2), str, null);
    }

    public static final void A06(UserSession userSession, EnumC33408Epf enumC33408Epf, String str, long j, long j2, long j3) {
        boolean A09;
        long A01;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C29W c29w = new C29W(userSession);
        try {
            A09 = true;
            if (str.equals("daily_limit")) {
                A01 = c29w.A00();
            } else if (str.equals("take_break")) {
                A01 = c29w.A01();
            } else {
                throw new IllegalArgumentException();
            }
            if (A01 <= 0) {
                A09 = false;
            }
        } catch (IllegalArgumentException unused) {
            A09 = A09(userSession);
        }
        Integer num = C05F.A07;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j);
        Long valueOf3 = Long.valueOf(j3);
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A03(userSession, enumC33408Epf, num, valueOf, valueOf2, valueOf3, str, null, c16920sk, A09);
    }

    public static final void A07(UserSession userSession, Integer num, Long l, String str) {
        A02(userSession, null, num, null, null, l, str, null);
    }

    public static final void A08(UserSession userSession, String str, long j) {
        C14360o3.A0B(userSession, 0);
        A02(userSession, null, C05F.A0C, null, Long.valueOf(C461529z.A00()), Long.valueOf(j), str, null);
    }

    public static final void A03(UserSession userSession, EnumC33408Epf enumC33408Epf, Integer num, Long l, Long l2, Long l3, String str, Map map, Map map2, boolean z) {
        String str2;
        String str3;
        long A002;
        Map map3;
        String str4 = str;
        Double d = null;
        List A0Q = AbstractC001900j.A0Q(C18U.A04(C06090Tz.A05, userSession, 36893764778722279L), new char[]{';'}, 0);
        switch (num.intValue()) {
            case 0:
                str2 = "ig_ts_blocking_screen_did_enter_background";
                break;
            case 1:
                str2 = "ig_ts_blocking_screen_dismiss";
                break;
            case 2:
                str2 = "ig_ts_blocking_screen_impression";
                break;
            case 3:
                str2 = "ig_ts_blocking_screen_learn_more_tap";
                break;
            case 4:
                str2 = "ig_ts_blocking_screen_manage_settings_tap";
                break;
            case 5:
                str2 = "ig_ts_blocking_screen_more_options_tap";
                break;
            case 6:
                str2 = "ig_ts_blocking_screen_settings_tap";
                break;
            case 7:
                str2 = "ig_ts_cancel_reminder_tap";
                break;
            case 8:
                str2 = "ig_ts_edit_reminder_bottom_sheet_impression";
                break;
            case 9:
                str2 = "ig_ts_in_app_notification_dismiss";
                break;
            case 10:
                str2 = "ig_ts_in_app_notification_impression";
                break;
            case 11:
                str2 = "ig_ts_in_app_notification_tap";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str2 = "ig_ts_reminder_dialog";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str2 = "ig_ts_reminder_dialog_edit_reminder_tap";
                break;
            case 14:
                str2 = "ig_ts_reminder_dialog_ok_tap";
                break;
            case Process.SIGTERM /* 15 */:
                str2 = "ig_ts_reminder_set_success";
                break;
            case 16:
                str2 = "ig_ts_screen_time_data_fetch_retry_upload";
                break;
            case 17:
                str2 = "ig_ts_session_end";
                break;
            case 18:
                str2 = "ig_ts_session_start";
                break;
            case Process.SIGSTOP /* 19 */:
                str2 = "ig_ts_reminder_already_enabled_edit";
                break;
            case 20:
                str2 = "ig_ts_reminder_already_enabled_impression";
                break;
            case 21:
                str2 = "ig_ts_take_a_break_not_shown_backgrounded";
                break;
            case 22:
                str2 = "ig_ts_take_a_break_not_shown_no_activity";
                break;
            case 23:
                str2 = "ig_ts_reminder_schedule_success";
                break;
            case 24:
                str2 = "ig_ts_reminder_set_confirmation_edit_reminder_tap";
                break;
            case 25:
                str2 = "ig_ts_reminder_set_confirmation_impression";
                break;
            case 26:
                str2 = "ig_ts_reminder_set_confirmation_ok_tap";
                break;
            case 27:
                str2 = "ig_ts_take_a_break_should_have_shown";
                break;
            case 28:
                str2 = "ig_ts_take_a_break_tips_triggered";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                str2 = "ig_ts_tips_screen_done_tap";
                break;
            case 30:
                str2 = "ig_ts_tips_screen_edit_reminder_tap";
                break;
            case 31:
                str2 = "ig_ts_tips_screen_menu_cancel_tap";
                break;
            case 32:
                str2 = "ig_ts_tips_screen_menu_help_center_tap";
                break;
            case 33:
                str2 = "ig_ts_tips_screen_menu_tap";
                break;
            case 34:
                str2 = "ig_ts_update_screen_time_attempt";
                break;
            case 35:
                str2 = "ig_ts_update_screen_time_success";
                break;
            case 36:
                str2 = "ig_ts_update_screen_time_fail";
                break;
            case 37:
                str2 = "ig_ts_your_activity";
                break;
            case 38:
                str2 = "ig_ts_should_present_reminder";
                break;
            case 39:
                str2 = "ig_ts_reminder_canceled";
                break;
            case 40:
                str2 = "ig_ts_reminder_schedule_failed";
                break;
            default:
                str2 = "ig_ts_no_reminder_to_schedule";
                break;
        }
        if (A0Q.contains(str2)) {
            long A003 = new C29W(userSession).A00();
            if (C14360o3.A0K(str4, "daily_limit")) {
                if (AnonymousClass280.A01.A0C(userSession)) {
                    str4 = "guardian_daily_limit";
                }
            } else {
                A003 = 0;
            }
            Double d2 = null;
            C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
            InterfaceC02590Ai A004 = A01.A00(A01.A00, "ig_time_spent_action");
            if (A004.isSampled()) {
                ArrayList A04 = C123815iv.A00.A04(userSession);
                A004.AAP("action", str2);
                if (enumC33408Epf != null) {
                    str3 = enumC33408Epf.A00;
                } else {
                    str3 = null;
                }
                A004.AAP("entrypoint", str3);
                A004.A7v("is_reminder_set", Boolean.valueOf(z));
                A004.AAP("reminder_type", str4);
                A004.A9K("current_reminder_seconds", Long.valueOf(A003));
                A004.A9K("previous_reminder_seconds", l);
                if (l2 != null) {
                    A002 = l2.longValue();
                } else {
                    A002 = C461529z.A00();
                }
                A004.A8I("usage_seconds", Double.valueOf(A002));
                A004.A9K("bar_idx", null);
                if (l3 != null) {
                    d = Double.valueOf(l3.longValue());
                }
                A004.A8I("session_length", d);
                String id = TimeZone.getDefault().getID();
                C14360o3.A07(id);
                A004.AAP("timezone", id);
                A004.A8I("aggregated_unenforced_time_today", Double.valueOf(AnonymousClass280.A01.A04(userSession)));
                if (((Number) AbstractC001800i.A0O(A04, A04.size() - 1)) != null) {
                    d2 = Double.valueOf(r0.longValue());
                }
                A004.A8I("aggregated_screen_time_today", d2);
                C5F2 A005 = AnonymousClass282.A00(userSession);
                if (A005 != null && A005.C0J() == XFBYPRequestStatus.A04 && A005.BAI() != null) {
                    map3 = AbstractC16850sd.A0M(new C09530e4("extension_interval", String.valueOf(A005.BAI())));
                } else {
                    map3 = C16920sk.A00;
                    C14360o3.A0C(map3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                }
                A004.A9M("active_screen_time_reminders", AbstractC06930Yk.A04(map2, map3));
                A004.A9M("extra_event_data", map);
                A004.A9K("seconds_since_midnight", Long.valueOf((System.currentTimeMillis() - C123815iv.A00()) / 1000));
                A004.Cht();
            }
        }
    }

    public static final boolean A09(UserSession userSession) {
        C29W c29w = new C29W(userSession);
        long A002 = c29w.A00();
        long A01 = c29w.A01();
        if ((A002 > 0 || A01 > 0) && !C14360o3.A0K(AnonymousClass280.A01.A08(userSession), "")) {
            return true;
        }
        return false;
    }

    public static final void A04(UserSession userSession, EnumC33408Epf enumC33408Epf, Integer num, Long l, Map map) {
        A03(userSession, enumC33408Epf, num, null, null, l, "take_break", null, map, true);
    }
}
