package X;

import java.util.ArrayList;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NiC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53332NiC {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53332NiC[] A03;
    public static final EnumC53332NiC A09;
    public final String A00;
    public final ArrayList A01;
    public static final EnumC53332NiC A1U = A00("SYSTEM_NOTIFICATION_TAPPED", "system_notification_tapped", MSX.A0m("system_notification"), 0);
    public static final EnumC53332NiC A06 = A00("ANSWER_FROM_SYSTEM_NOTIFICATION", "answer_from_system_notification", A01("system_notification", "incoming_call"), 1);
    public static final EnumC53332NiC A0I = A00("DECLINE_FROM_SYSTEM_NOTIFICATION", "decline_from_system_notification", A01("system_notification", "incoming_call"), 2);
    public static final EnumC53332NiC A0W = A00("END_CALL_FROM_SYSTEM_NOTIFICATION", "end_call_from_system_notification", MSX.A0m("system_notification"), 3);
    public static final EnumC53332NiC A0n = A00("FOREGROUND_SERVICE_STARTED", "foreground_service_started", MSX.A0m("system_notification"), 4);
    public static final EnumC53332NiC A0o = A00("FOREGROUND_SERVICE_STOPPED", "foreground_service_stopped", MSX.A0m("system_notification"), 5);
    public static final EnumC53332NiC A0l = A00("FOREGROUND_SERVICE_FAILURE", "foreground_service_failure", A01("system_notification", "error"), 6);
    public static final EnumC53332NiC A0m = A00("FOREGROUND_SERVICE_FALLBACK", "foreground_service_fallback", MSX.A0m("system_notification"), 7);
    public static final EnumC53332NiC A05 = A00("ANSWER_FROM_INCOMING_CALL_SCREEN", "answer_from_incoming_call_screen", MSX.A0m("incoming_call"), 8);
    public static final EnumC53332NiC A0H = A00("DECLINE_FROM_INCOMING_CALL_SCREEN", "decline_from_incoming_call_screen", MSX.A0m("incoming_call"), 9);
    public static final EnumC53332NiC A04 = A00("ANSWER_CALL_ABORTED", "answer_call_aborted", A01("incoming_call", "error"), 10);
    public static final EnumC53332NiC A0v = A00("INCOMING_NOTIFICATION_FALLBACK", "incoming_notification_fallback", A01("system_notification", "incoming_call"), 11);
    public static final EnumC53332NiC A0s = A00("INCOMING_CALL_WITH_DND_ENABLED", "incoming_call_with_dnd", A01("system_notification", "incoming_call"), 12);
    public static final EnumC53332NiC A0t = A00("INCOMING_CALL_WITH_NOTIFICATION_BLOCKED", "incoming_call_with_notification_blocked", A01("system_notification", "incoming_call"), 13);
    public static final EnumC53332NiC A0r = A00("INCOMING_CALL_WITH_APP_RESTRICTED", "incoming_call_with_app_restricted", A01("system_notification", "incoming_call"), 14);
    public static final EnumC53332NiC A0u = A00("INCOMING_CALL_WITH_NOTIFICATION_SHOWN", "incoming_call_with_notification_shown", A01("system_notification", "incoming_call"), 15);
    public static final EnumC53332NiC A1F = A00("OUTGOING_CALL_WITH_DND_ENABLED", "outgoing_call_with_dnd", A01("system_notification", "outgoing_call"), 16);
    public static final EnumC53332NiC A1G = A00("OUTGOING_CALL_WITH_NOTIFICATION_BLOCKED", "outgoing_call_with_notification_blocked", A01("system_notification", "outgoing_call"), 17);
    public static final EnumC53332NiC A1E = A00("OUTGOING_CALL_WITH_APP_RESTRICTED", "outgoing_call_with_app_restricted", A01("system_notification", "outgoing_call"), 18);
    public static final EnumC53332NiC A1H = A00("OUTGOING_CALL_WITH_NOTIFICATION_IN_TRAY", "outgoing_call_with_notification_in_tray", A01("system_notification", "outgoing_call"), 19);
    public static final EnumC53332NiC A07 = A00("CALL_ADDED", "call_added", A01("incoming_call", "multi_call"), 20);
    public static final EnumC53332NiC A14 = A00("MULTI_CALL_NOTIFICATION_SHOWN", "multi_call_notification_shown", A01("multi_call", "incoming_call"), 21);
    public static final EnumC53332NiC A13 = A00("MULTI_CALL_NOTIFICATION_HIDDEN", "multi_call_notification_hidden", A01("multi_call", "incoming_call"), 22);
    public static final EnumC53332NiC A12 = A00("MULTI_CALL_ENDED_BY_CALLER", "multi_call_ended_by_caller", MSX.A0m("multi_call"), 23);
    public static final EnumC53332NiC A0y = A00("MULTI_CALL_ACCEPT_VIA_NOTIFICATION", "multi_call_accept_via_notification", MSX.A0m("multi_call"), 24);
    public static final EnumC53332NiC A0z = A00("MULTI_CALL_ACCEPT_VIA_UI", "multi_call_accept_via_ui", MSX.A0m("multi_call"), 25);
    public static final EnumC53332NiC A10 = A00("MULTI_CALL_DECLINE_VIA_NOTIFICATION", "multi_call_decline_via_notification", MSX.A0m("multi_call"), 26);
    public static final EnumC53332NiC A11 = A00("MULTI_CALL_DECLINE_VIA_UI", "multi_call_decline_via_ui", MSX.A0m("multi_call"), 27);
    public static final EnumC53332NiC A17 = A00("MULTI_CALL_UNHANDLED_ACTION", "multi_call_unhandled_intent_action", MSX.A0m("multi_call"), 28);
    public static final EnumC53332NiC A0x = A00("MULTI_CALL_ACCEPT_ERROR", "multi_call_accept_error", A01("multi_call", "error"), 29);
    public static final EnumC53332NiC A16 = A00("MULTI_CALL_TRANSITIONED_TO_ACTIVE_ERROR", "multi_call_transitioned_to_active_error", A01("multi_call", "error"), 30);
    public static final EnumC53332NiC A15 = A00("MULTI_CALL_TRANSITIONED_TO_ACTIVE", "multi_call_transitioned_to_active", MSX.A0m("multi_call"), 31);
    public static final EnumC53332NiC A0k = A00("FETCH_THREAD_AND_SHOW_NOTIF", "fetch_thread_and_show_notif", MSX.A0m("multi_call"), 32);
    public static final EnumC53332NiC A0U = A00("DEVICE_PERMISSION_PROMPTED_FOR_MICROPHONE", "device_permission_prompted_for_microphone", MSX.A0m("permissions"), 33);
    public static final EnumC53332NiC A0T = A00("DEVICE_PERMISSION_PROMPTED_FOR_CAMERA", "device_permission_prompted_for_camera", MSX.A0m("permissions"), 34);
    public static final EnumC53332NiC A0V = A00("DEVICE_PERMISSION_PROMPTED_FOR_PHONE", "device_permission_prompted_for_phone", MSX.A0m("permissions"), 35);
    public static final EnumC53332NiC A0R = A00("DEVICE_PERMISSION_GRANTED_FOR_MICROPHONE", "device_permission_granted_for_microphone", MSX.A0m("permissions"), 36);
    public static final EnumC53332NiC A0Q = A00("DEVICE_PERMISSION_GRANTED_FOR_CAMERA", "device_permission_granted_for_camera", MSX.A0m("permissions"), 37);
    public static final EnumC53332NiC A0S = A00("DEVICE_PERMISSION_GRANTED_FOR_PHONE", "device_permission_granted_for_phone", MSX.A0m("permissions"), 38);
    public static final EnumC53332NiC A0O = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_MICROPHONE", "device_permission_denied_previously_for_microphone", A01("permissions", "error"), 39);
    public static final EnumC53332NiC A0N = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_CAMERA", "device_permission_denied_previously_for_camera", A01("permissions", "error"), 40);
    public static final EnumC53332NiC A0P = A00("DEVICE_PERMISSION_DENIED_PREVIOUSLY_FOR_PHONE", "device_permission_denied_previously_for_phone", A01("permissions", "error"), 41);
    public static final EnumC53332NiC A0L = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_MICROPHONE", "device_permission_denied_after_prompt_for_microphone", A01("permissions", "error"), 42);
    public static final EnumC53332NiC A0K = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_CAMERA", "device_permission_denied_after_prompt_for_camera", A01("permissions", "error"), 43);
    public static final EnumC53332NiC A0M = A00("DEVICE_PERMISSION_DENIED_AFTER_PROMPT_FOR_PHONE", "device_permission_denied_after_prompt_for_phone", A01("permissions", "error"), 44);
    public static final EnumC53332NiC A1P = A00("RSYS_SDK_CREATED", "rsys_sdk_created", MSX.A0m("rsys_sdk"), 45);
    public static final EnumC53332NiC A0q = A00("INCOMING_CALL_INTENT_RECEIVED", "incoming_call_intent_received", A01("incoming_call", "rsys_sdk"), 46);
    public static final EnumC53332NiC A1D = A00("OUTGOING_CALL_INTENT_CREATED", "outgoing_call_intent_created", A01("outgoing_call", "rsys_sdk"), 47);
    public static final EnumC53332NiC A0A = A00("CANNOT_START_OUTGOING_CALL", "cannot_start_outgoing_call", AbstractC16960so.A1M("outgoing_call", "error", "rsys_sdk"), 48);
    public static final EnumC53332NiC A18 = A00("ON_CALL_IDLE", "on_call_idle", MSX.A0m("rsys_sdk"), 49);
    public static final EnumC53332NiC A1X = A00("VIDEO_ESCALATION_SHOWN", "video_escalation_shown", A01("soc_detected", "video_escalation"), 50);
    public static final EnumC53332NiC A1K = A00("PICTURE_IN_PICTURE_REQUESTED", "picture_in_picture_requested", MSX.A0m("picture_in_picture"), 51);
    public static final EnumC53332NiC A1I = A00("PICTURE_IN_PICTURE_ENTERED", "picture_in_picture_entered", MSX.A0m("picture_in_picture"), 52);
    public static final EnumC53332NiC A1J = A00("PICTURE_IN_PICTURE_ERROR", "picture_in_picture_error", A01("picture_in_picture", "error"), 53);
    public static final EnumC53332NiC A1O = A00("PUSH_NOTIFICATION_RECEIVED", "push_notification_received", MSX.A0m("inbound_signaling"), 54);
    public static final EnumC53332NiC A1L = A00("PUSH_NOTIFICATION_DROPPED", "push_notification_dropped", A01("inbound_signaling", "error"), 55);
    public static final EnumC53332NiC A1N = A00("PUSH_NOTIFICATION_OFFER_IGNORED", "push_notification_offer_ignored", A01("inbound_signaling", "error"), 56);
    public static final EnumC53332NiC A1M = A00("PUSH_NOTIFICATION_OFFER_ACKED", "push_notification_offer_acked", MSX.A0m("inbound_signaling"), 57);
    public static final EnumC53332NiC A1T = A00("SIGNAL_HANDOFF_TO_ENGINE", "signal_handoff_to_engine", MSX.A0m("inbound_signaling"), 58);
    public static final EnumC53332NiC A1W = A00("USER_NOT_AVAILABLE", "user_not_available", A01("inbound_signaling", "error"), 59);
    public static final EnumC53332NiC A1V = A00("TRANSPORT_NOT_AVAILABLE", "transport_not_available", A01("inbound_signaling", "error"), 60);
    public static final EnumC53332NiC A1Z = A00("VIDEO_QUALITY_BUTTON_TAP", "video_quality_button_tap", A01("soc_detected", "soc_video_quality_picker"), 61);
    public static final EnumC53332NiC A0p = A00("HD_QUALITY_BUTTON_TAP", "hd_quality_button_tap", A01("soc_detected", "soc_video_quality_picker"), 62);
    public static final EnumC53332NiC A0J = A00("DEFAULT_QUALITY_BUTTON_TAP", "default_quality_button_tap", A01("soc_detected", "soc_video_quality_picker"), 63);
    public static final EnumC53332NiC A1S = A00("SD_QUALITY_BUTTON_TAP", "sd_quality_button_tap", A01("soc_detected", "soc_video_quality_picker"), 64);
    public static final EnumC53332NiC A1Y = A00("VIDEO_QUALITY_ADJUSTED", "video_quality_adjusted", A01("soc_mitigated", "soc_video_quality_picker"), 65);
    public static final EnumC53332NiC A1a = A00("VIDEO_QUALITY_NOT_ADJUSTED", "video_quality_not_adjusted", A01("soc_unmitigated", "soc_video_quality_picker"), 66);
    public static final EnumC53332NiC A0g = A00("FCM_PUSH_RECEIVED", "fcm_incoming_push_received", MSX.A0m("inbound_signaling"), 67);
    public static final EnumC53332NiC A0f = A00("FCM_PUSH_PASSED_TO_RSYS", "fcm_incoming_push_passed_to_rsys", MSX.A0m("inbound_signaling"), 68);
    public static final EnumC53332NiC A0a = A00("FCM_NOT_FCM_MULTIWAY_TOPIC", "fcm_not_fcm_multiway_topic", A01("push_process", "error"), 69);
    public static final EnumC53332NiC A0b = A00("FCM_NULL_MULTIWAY_MESSAGE", "fcm_null_multiway_message", A01("push_process", "error"), 70);
    public static final EnumC53332NiC A0d = A00("FCM_NULL_PAYLOAD_IN_PUSH_HANDLER", "fcm_null_payload_in_push_handler", A01("push_process", "error"), 71);
    public static final EnumC53332NiC A0e = A00("FCM_PAGE_NOT_IN_EXPERIMENT", "fcm_page_not_in_experiment", A01("push_process", "error"), 72);
    public static final EnumC53332NiC A0j = A00("FCM_TARGET_USER_MISMATCH", "fcm_target_user_mismatch", A01("push_process", "error"), 73);
    public static final EnumC53332NiC A0c = A00("FCM_NULL_PAYLOAD_IN_PUSH_DATA_PROCESSOR", "fcm_null_payload_in_push_data_processor", A01("push_process", "error"), 74);
    public static final EnumC53332NiC A0i = A00("FCM_RECIPIENT_USER_NOT_ADMIN_OF_PAGE", "fcm_recipient_user_not_admin_of_page", A01("push_process", "error"), 75);
    public static final EnumC53332NiC A0h = A00("FCM_RECIPIENT_PAGE_ID_NOT_CURRENT_PAGE_ID", "fcm_recipient_page_id_not_current_page_id", A01("push_process", "error"), 76);
    public static final EnumC53332NiC A0Z = A00("ENGINE_INIT_STARTED", "engine_init_started", AbstractC166987dD.A1E(), 77);
    public static final EnumC53332NiC A0X = A00("ENGINE_INIT_COMPLETED", "engine_init_completed", AbstractC166987dD.A1E(), 78);
    public static final EnumC53332NiC A0Y = A00("ENGINE_INIT_FAILED", "engine_init_failed", MSX.A0m("error"), 79);
    public static final EnumC53332NiC A19 = A00("OUTBOUND_CALL_INTENT", "outbound_call_intent", MSX.A0m("outgoing_call"), 80);
    public static final EnumC53332NiC A1A = A00("OUTBOUND_CALL_INTENT_ERROR", "outbound_call_intent_error", A01("outgoing_call", "error"), 81);
    public static final EnumC53332NiC A1C = A00("OUTBOUND_CALL_TRANSPORT_STATUS", "outbound_call_transport_status", MSX.A0m("outgoing_call"), 82);
    public static final EnumC53332NiC A1B = A00("OUTBOUND_CALL_STUN_CONNECTION_TEST_FAILED", "outbound_call_stun_connection_test_failed", MSX.A0m("outgoing_call"), 83);
    public static final EnumC53332NiC A1Q = A00("RTC_CHATD_NECESSARY_LOGIN", "rtc_chatd_necessary_login", MSX.A0m("chatd"), 84);
    public static final EnumC53332NiC A0B = A00("CONNECTION_SERVICE_AUTO_REJECT", "connection_service_auto_reject", A01("incoming_call", "connection_service"), 85);
    public static final EnumC53332NiC A0G = A00("CONNECTION_SERVICE_REQUEST_CALL_START", "connection_service_request_call_start", MSX.A0m("connection_service"), 86);
    public static final EnumC53332NiC A0C = A00("CONNECTION_SERVICE_CONNECTION_CREATED", "connection_service_connection_created", MSX.A0m("connection_service"), 87);
    public static final EnumC53332NiC A0D = A00("CONNECTION_SERVICE_CONTINUE_AFTER_ENDED", "connection_service_continue_after_ended", A01("connection_service", "error"), 88);
    public static final EnumC53332NiC A0F = A00("CONNECTION_SERVICE_NOT_PERMITTED_AFTER_ENDED", "connection_service_reject_after_ended", A01("connection_service", "error"), 89);
    public static final EnumC53332NiC A0E = A00("CONNECTION_SERVICE_INACTIVE_CALL_CLEARED", "connection_service_inactive_call_cleared", A01("connection_service", "error"), 90);
    public static final EnumC53332NiC A0w = A00("LOCAL_CALL_ID_NULL", "local_call_id_null", MSX.A0m("error"), 91);
    public static final EnumC53332NiC A08 = A00("CALL_NOT_FOUND", "call_not_found", MSX.A0m("error"), 92);
    public static final EnumC53332NiC A1R = A00("SCREEN_SHARE_INIT_FAILED", "screen_share_init_failed", MSX.A0m("error"), 93);

    static {
        EnumC53332NiC A00 = A00("CAMERA_CAPTURE_ERROR", "camera_capture_error", MSX.A0m("error"), 94);
        A09 = A00;
        EnumC53332NiC[] enumC53332NiCArr = new EnumC53332NiC[95];
        System.arraycopy(new EnumC53332NiC[]{A1U, A06, A0I, A0W, A0n, A0o, A0l, A0m, A05, A0H, A04, A0v, A0s, A0t, A0r, A0u, A1F, A1G, A1E, A1H, A07, A14, A13, A12, A0y, A0z, A10}, 0, enumC53332NiCArr, 0, 27);
        System.arraycopy(new EnumC53332NiC[]{A11, A17, A0x, A16, A15, A0k, A0U, A0T, A0V, A0R, A0Q, A0S, A0O, A0N, A0P, A0L, A0K, A0M, A1P, A0q, A1D, A0A, A18, A1X, A1K, A1I, A1J}, 0, enumC53332NiCArr, 27, 27);
        System.arraycopy(new EnumC53332NiC[]{A1O, A1L, A1N, A1M, A1T, A1W, A1V, A1Z, A0p, A0J, A1S, A1Y, A1a, A0g, A0f, A0a, A0b, A0d, A0e, A0j, A0c, A0i, A0h, A0Z, A0X, A0Y, A19}, 0, enumC53332NiCArr, 54, 27);
        System.arraycopy(new EnumC53332NiC[]{A1A, A1C, A1B, A1Q, A0B, A0G, A0C, A0D, A0F, A0E, A0w, A08, A1R, A00}, 0, enumC53332NiCArr, 81, 14);
        A03 = enumC53332NiCArr;
        A02 = AbstractC12190kN.A00(enumC53332NiCArr);
    }

    public static EnumC53332NiC A00(String str, String str2, ArrayList arrayList, int i) {
        return new EnumC53332NiC(str, str2, arrayList, i);
    }

    public static EnumC53332NiC valueOf(String str) {
        return (EnumC53332NiC) Enum.valueOf(EnumC53332NiC.class, str);
    }

    public static EnumC53332NiC[] values() {
        return (EnumC53332NiC[]) A03.clone();
    }

    public EnumC53332NiC(String str, String str2, ArrayList arrayList, int i) {
        this.A00 = str2;
        this.A01 = arrayList;
    }

    public static ArrayList A01(String str, String str2) {
        return AbstractC16960so.A1M(str, str2);
    }
}
