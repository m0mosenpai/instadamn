package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.offsite.models.message.PayButtonCTAType$Companion;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NjT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53378NjT implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC53378NjT[] A01;
    public static final EnumC53378NjT A02;
    public static final EnumC53378NjT A03;
    public static final EnumC53378NjT A04;
    public static final EnumC53378NjT A05;
    public final String A00;

    static {
        EnumC53378NjT[] enumC53378NjTArr = new EnumC53378NjT[284];
        System.arraycopy(new EnumC53378NjT[]{A00("ACCEPT", "accept", 0), A00("ADD_EXISTING_USER", "add_existing_user", 1), A00("ADD_LABEL", "add_label", 2), A00("ADD_MESSAGING_USERS", "add_messaging_users", 3), A00("ADD_SUGGESTED_KEYWORD", "add_suggested_keyword", 4), A00("ALLOW", "allow", 5), A00("ANIMATION", "animation", 6), A00("APPLY", "apply", 7), A00("ASYNC_SCHEDULED", "async_scheduled", 8), A00("ASYNC_SUCCESS", "async_success", 9), A00("ASYNC_TRIGGERED", "async_triggered", 10), A00("AWAY_MESSAGE_AUTOMATION_SUGGESTION", "away_message_automation_suggestion", 11), A00("BACK", "back", 12), A00("BACKFILL_JOB_FINISHED", "backfill_job_finished", 13), A00("BACKFILL_JOB_MESSENGER_THREADS_QUERIED", "backfill_job_messenger_threads_queried", 14), A00("BACKFILL_JOB_SCHEDULED", "backfill_job_scheduled", 15), A00("BACKFILL_JOB_STARTED", "backfill_job_started", 16), A00("BLOCK", "block", 17), A00("BLUR", "blur", 18), A00("BOOST", "boost", 19), A00("BOOST_FAILURE", "boost_failure", 20), A00("BOOST_SUCCESS", "boost_success", 21), A00("CAN_PRIVATE_REPLY_FALSE", "can_private_reply_false", 22), A00("CAN_PRIVATE_REPLY_TRUE", "can_private_reply_true", 23), A00("CANCEL", "cancel", 24), A00("CANCEL_FLOW", "cancel_flow", 25), A00("CANDIDATE_FOUND", "candidate_found", 26)}, 0, enumC53378NjTArr, 0, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("CHANGE", "change", 27), A00("CHECK_CONDITIONS", "check_conditions", 28), A00("CHECK_DEVICE_PERMISSION_AUTH_STATUS", "check_device_permission_auth_status", 29), A00("CLEAR", QuickExperimentDumperPlugin.CLEAR_CMD, 30), A00("CLICK", "click", 31), A00("CLICK_DISABLED", "click_disabled", 32), A00("CLICK_EDIT", "click_edit", 33), A00("CLICK_ENTRY", "click_entry", 34), A00("CLICK_READ", "click_read", 35), A00("CLICK_SECONDARY_BUTTON", "click_secondary_button", 36), A00("CLICK_SYSTEM_BACK_BUTTON", "click_system_back_button", 37), A00("CLICK_UNREAD", "click_unread", 38), A00("CLICK_UNREAD_FILTER", "click_unread_filter", 39), A00("CLOSE", "close", 40), A00("COLLAPSE", "collapse", 41), A00("COMMENT_TO_MESSAGE_AUTOMATION_SUGGESTION", "comment_to_message_automation_suggestion", 42), A00("CONFIG_IS_NOT_NULL", "config_is_not_null", 43), A00("CONFIG_IS_NULL", "config_is_null", 44), A00("CONFIRM", "confirm", 45), A00(PayButtonCTAType$Companion.CONTINUE, "continue", 46), A00("CREATE", "create", 47), A00("CREATE_ERROR", "create_error", 48), A00("CREATE_LEGACY", "create_legacy", 49), A00("CREATE_SUCCESS", "create_success", 50), A00("CRITICAL", "critical", 51), A00("CTA_CLICK_IRIS_OBSERVER", "cta_click_iris_observer", 52), A00("CUSTOMER_MESSAGE_INFO_PASS_CONDITION", "customer_message_info_pass_condition", 53)}, 0, enumC53378NjTArr, 27, 27);
        EnumC53378NjT A00 = A00("DEBUG", "debug", 54);
        EnumC53378NjT A002 = A00("DELETE", "delete", 55);
        EnumC53378NjT A003 = A00("DELETE_ERROR", "delete_error", 56);
        EnumC53378NjT A004 = A00("DELETE_SUCCESS", "delete_success", 57);
        EnumC53378NjT A005 = A00("DENY", "deny", 58);
        A02 = A005;
        EnumC53378NjT A006 = A00("DETECTOR", "detector", 59);
        EnumC53378NjT A007 = A00("DISABLE", "disable", 60);
        EnumC53378NjT A008 = A00("DISMISS", "dismiss", 61);
        EnumC53378NjT A009 = A00("DISMISS_SAVED_REPLY_SUGGESTION", "dismiss_saved_reply_suggestion", 62);
        EnumC53378NjT A0010 = A00("DISMISS_TOAST", "dismiss_toast", 63);
        EnumC53378NjT A0011 = A00("DISPLAY_LOADING_VIEW", "display_loading_view", 64);
        EnumC53378NjT A0012 = A00("DISPLAY_NEW_FEATURE_INDICATOR", "display_new_feature_indicator", 65);
        EnumC53378NjT A0013 = A00("DOES_CONSENT_EXIST", "does_consent_exist", 66);
        EnumC53378NjT A0014 = A00("DONE", "done", 67);
        EnumC53378NjT A0015 = A00("DRAG", "drag", 68);
        EnumC53378NjT A0016 = A00("DROP", "drop", 69);
        EnumC53378NjT A0017 = A00("ELIGIBLE", "eligible", 70);
        EnumC53378NjT A0018 = A00("ENABLE", "enable", 71);
        EnumC53378NjT A0019 = A00("ENTER_FLOW", "enter_flow", 72);
        EnumC53378NjT A0020 = A00("ERROR", "error", 73);
        A03 = A0020;
        System.arraycopy(new EnumC53378NjT[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A00("EVENT_BROADCAST_ATTEMPT", "event_broadcast_attempt", 74), A00("EVENT_BROADCAST_FAILURE", "event_broadcast_failure", 75), A00("EVENT_BROADCAST_SUCCESS", "event_broadcast_success", 76), A00("EXECUTE", "execute", 77), A00("EXIT", "exit", 78), A00("EXIT_FLOW", "exit_flow", 79), A00("EXPAND", "expand", 80)}, 0, enumC53378NjTArr, 54, 27);
        EnumC53378NjT A0021 = A00("EXTERNAL_EVENT", "external_event", 81);
        EnumC53378NjT A0022 = A00("FAIL_CONDITION", "fail_condition", 82);
        EnumC53378NjT A0023 = A00("FAIL_INTEGRITY_GATING", "fail_integrity_gating", 83);
        EnumC53378NjT A0024 = A00("FAILURE", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 84);
        EnumC53378NjT A0025 = A00("FALLBACK", "fallback", 85);
        EnumC53378NjT A0026 = A00("FALLBACK_RECOVERY", "fallback_recovery", 86);
        EnumC53378NjT A0027 = A00("FEATURES_GENERATED", "features_generated", 87);
        EnumC53378NjT A0028 = A00("FETCH", "fetch", 88);
        EnumC53378NjT A0029 = A00("FILTER", "filter", 89);
        EnumC53378NjT A0030 = A00("FINISH", "finish", 90);
        EnumC53378NjT A0031 = A00("FLOW_STEP_IMPRESSION", "flow_step_impression", 91);
        EnumC53378NjT A0032 = A00("FOCUS", "focus", 92);
        EnumC53378NjT A0033 = A00("FOCUS_ACQUIRED", "focus_acquired", 93);
        EnumC53378NjT A0034 = A00("FOCUS_LOST", "focus_lost", 94);
        EnumC53378NjT A0035 = A00("GESTURE", "gesture", 95);
        EnumC53378NjT A0036 = A00("GET_ML_INTENT", "get_ml_intent", 96);
        EnumC53378NjT A0037 = A00("GET_STARTED_NOT_RENDERED", "get_started_not_rendered", 97);
        EnumC53378NjT A0038 = A00("GRANT", "grant", 98);
        A04 = A0038;
        System.arraycopy(new EnumC53378NjT[]{A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A00("HANDLE_FAILURE", "handle_failure", 99), A00("HANDLE_SUCCESS", "handle_success", 100), A00("HIDE_SUGGESTION", "hide_suggestion", 101), A00("HOVER", "hover", 102), A00("HYDRATION_FAILURE", "hydration_failure", 103), A00("HYDRATION_SUCCESS", "hydration_success", 104), A00("IG_THREAD_CONDITION_INFO", "ig_thread_condition_info", 105), A00("IMPORT", "import", 106), A00("IMPRESSION", "impression", 107)}, 0, enumC53378NjTArr, 81, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("INELIGIBLE", "ineligible", 108), A00("INFO", "info", 109), A00("INIT_POSE_LOAD_ERROR", "init_pose_load_error", 110), A00("INIT_POSE_LOADED", "init_pose_loaded", 111), A00("INIT_RENDER", "init_render", 112), A00("INIT_SERVER", "init_server", 113), A00("INSTANT_REPLY_AUTOMATION_SUGGESTION", "instant_reply_automation_suggestion", 114), A00("INSUFFICIENT_PERMISSIONS_FAILURE", "insufficient_permissions_failure", 115), A00("INVITE", "invite", 116), A00("INVITE_USER_NONRETRYABLE_ERROR", "invite_user_nonretryable_error", 117), A00("IS_CONSENTED", "is_consented", 118), A00("IS_REVOKED", "is_revoked", 119), A00("LAND_ATTEMPT", "land_attempt", HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A00("LAND_FAILURE", "land_failure", 121), A00("LAUNCH", "launch", 122), A00("LAUNCH_MARKETPLACE_EXPOSURE", "launch_marketplace_exposure", 123), A00("LINK", "link", 124), A00("LISTEN", "listen", 125), A00("LONG_PRESS", "long_press", 126), A00("MARK_AS_FOLLOW_UP", "mark_as_follow_up", StringTreeSet.MAX_SYMBOL_COUNT), A00("MARK_AS_UNREAD", "mark_as_unread", 128), A00("MARK_IMPORTANT", "mark_important", 129), A00("MARK_UNIMPORTANT", "mark_unimportant", 130), A00("MATCH", "match", 131), A00("MISMATCH", "mismatch", 132), A00("ML_DECISION", "ml_decision", 133), A00("MODIFY", "modify", 134)}, 0, enumC53378NjTArr, 108, 27);
        EnumC53378NjT A0039 = A00("MOVE_TO_MAIN", "move_to_main", 135);
        EnumC53378NjT A0040 = A00("MUTATION_ERROR", "mutation_error", 136);
        EnumC53378NjT A0041 = A00("MUTATION_START", "mutation_start", 137);
        EnumC53378NjT A0042 = A00("MUTATION_SUCCESS", "mutation_success", 138);
        EnumC53378NjT A0043 = A00("NEW_MESSAGE_RECEIVED", "new_message_received", 139);
        EnumC53378NjT A0044 = A00("NEXT", "next", 140);
        EnumC53378NjT A0045 = A00("OBSERVER_BACKUP_ASYNC_JOB_FAILURE", "observer_backup_async_job_failure", 141);
        EnumC53378NjT A0046 = A00("OBSERVER_BACKUP_ASYNC_JOB_SUCCESS", "observer_backup_async_job_success", 142);
        EnumC53378NjT A0047 = A00("OBSERVER_EARLY_EXIT", "observer_early_exit", 143);
        EnumC53378NjT A0048 = A00("OBSERVER_FAILURE", "observer_failure", 144);
        EnumC53378NjT A0049 = A00("OBSERVER_SCHEDULE_BACKUP_ASYNC_JOB", "observer_schedule_backup_async_job", 145);
        EnumC53378NjT A0050 = A00("OBSERVER_START", "observer_start", 146);
        EnumC53378NjT A0051 = A00("OBSERVER_SUCCESS", "observer_success", 147);
        EnumC53378NjT A0052 = A00("OBSERVER_TRIGGERED", "observer_triggered", 148);
        EnumC53378NjT A0053 = A00("OBSERVER_WRITE", "observer_write", 149);
        EnumC53378NjT A0054 = A00("OFF", "off", 150);
        EnumC53378NjT A0055 = A00("ON", "on", 151);
        EnumC53378NjT A0056 = A00("OPEN", "open", 152);
        EnumC53378NjT A0057 = A00("OUTCOME", "outcome", 153);
        EnumC53378NjT A0058 = A00("PARSING_MESSAGE_FAILURE", "parsing_message_failure", 154);
        EnumC53378NjT A0059 = A00("PARSING_MESSAGE_SUCCESS", "parsing_message_success", 155);
        EnumC53378NjT A0060 = A00("PARTIAL", "partial", 156);
        A05 = A0060;
        System.arraycopy(new EnumC53378NjT[]{A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0059, A0060, A00("PASS", "pass", 157), A00("PASS_CONDITION", "pass_condition", 158), A00("PASS_ELIGIBILITY_CHECK", "pass_eligibility_check", 159), A00("PAUSE", "pause", 160), A00("PERFORM_ACTION", "perform_action", 161)}, 0, enumC53378NjTArr, 135, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("PLAY", "play", 162), A00("PRE_MESSAGE_GET_TEXT_FAILURE", "pre_message_get_text_failure", 163), A00("PRE_MESSAGE_GET_TEXT_IS_NOT_NULL", "pre_message_get_text_is_not_null", 164), A00("PRE_MESSAGE_GET_TEXT_IS_NULL", "pre_message_get_text_is_null", 165), A00("PRE_MESSAGE_GET_TEXT_SUCCESS", "pre_message_get_text_success", 166), A00("PRE_MESSAGE_SEND_FAILURE", "pre_message_send_failure", 167), A00("PRE_MESSAGE_SEND_SUCCESS", "pre_message_send_success", 168), A00("PREDICTION_EN_FALSE", "prediction_en_false", 169), A00("PREDICTION_EN_TRUE", "prediction_en_true", AbstractC62862SUj.MAX_FACTORIAL), A00("PREDICTION_OTHER_FALSE", "prediction_other_false", 171), A00("PREDICTION_OTHER_TRUE", "prediction_other_true", 172), A00("PREDICTION_TH_FALSE", "prediction_th_false", 173), A00("PREDICTION_TH_TRUE", "prediction_th_true", 174), A00("PREDICTION_VI_FALSE", "prediction_vi_false", 175), A00("PREDICTION_VI_TRUE", "prediction_vi_true", 176), A00("PREDICTOR_FAILURE", "predictor_failure", 177), A00("PREDICTOR_SUCCESS", "predictor_success", 178), A00("PREVIEW", "preview", 179), A00("PREVIEW_FAILURE", "preview_failure", 180), A00("PREVIEW_SUCCESS", "preview_success", 181), A00("PRIVACY_ALLOWED_FALSE", "privacy_allowed_false", 182), A00("PRIVACY_ALLOWED_TRUE", "privacy_allowed_true", 183), A00("PROCESSING_FAILURE", "processing_failure", 184), A00("PROCESSING_SUCCESS", "processing_success", 185), A00("PROVIDE_CONSENT", "provide_consent", 186), A00("PROVIDE_CONSENT_FOR_CHANGESET", "provide_consent_for_changeset", 187), A00("PUBLISH", "publish", 188)}, 0, enumC53378NjTArr, 162, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("PUBLISH_FAILURE", "publish_failure", 189), A00("PUBLISH_SUCCESS", "publish_success", 190), A00("QUERY", "query", 191), A00("RANKED", "ranked", 192), A00("READ_CONSENT_DATA", "read_consent_data", 193), A00("READ_DATA_LEGACY", "read_data_legacy", 194), A00("READ_DATA_WITH_DEVICE_PERMISSION", "read_data_with_device_permission", 195), A00("RECEIVE", "receive", 196), A00("RECEIVE_REQUEST", "receive_request", 197), A00("RECEIVE_REQUEST_FALSE", "receive_request_false", 198), A00("RECEIVE_REQUEST_TRUE", "receive_request_true", 199), A00("RECEIVE_RESPONSE", "receive_response", 200), A00("RECEIVE_RESPONSE_FAILURE", "receive_response_failure", 201), A00("RECEIVE_RESPONSE_SUCCESS", "receive_response_success", 202), A00("REDIRECT", "redirect", 203), A00("REDIRECT_MARKETPLACE_EXPOSURE", "redirect_marketplace_exposure", 204), A00("REJECT", "reject", 205), A00("REMOVE_SUGGESTED_KEYWORD", "remove_suggested_keyword", 206), A00("REMOVE_TOKEN", "remove_token", 207), A00("RENDER_GET_STARTED", "render_get_started", 208), A00("RENDER_MESSAGE_FAILURE", "render_message_failure", 209), A00("RENDER_MESSAGE_SUCCESS", "render_message_success", 210), A00("RENDER_VIEW", "render_view", 211), A00("REQUEST", "request", 212), A00("REQUEST_DEVICE_PERMISSION", "request_device_permission", 213), A00("RESET_CONSENT", "reset_consent", 214), A00("RESTRICT", "restrict", 215)}, 0, enumC53378NjTArr, 189, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("RETRIEVE_ERROR", "retrieve_error", 216), A00("REVOKE_CONSENT", "revoke_consent", 217), A00("REVOKE_CONSENT_FOR_CHANGESET", "revoke_consent_for_changeset", 218), A00("SAVE", "save", 219), A00("SAVE_FAILURE", "save_failure", 220), A00("SAVE_SUCCESS", "save_success", 221), A00("SCHEDULE", "schedule", 222), A00("SCHEDULE_FAILURE", "schedule_failure", 223), A00("SCHEDULE_SUCCESS", "schedule_success", 224), A00("SCROLL", "scroll", 225), A00("SCROLL_END", "scroll_end", 226), A00("SEARCH", "search", 227), A00("SEE_ALL", "see_all", 228), A00("SELECT", "select", 229), A00("SELECT_STAGE", "select_stage", 230), A00("SELECT_TEXT", "select_text", 231), A00("SELECTED", "selected", 232), A00("SEND", "send", 233), A00("SEND_FAILURE", "send_failure", 234), A00("SEND_REQUEST", "send_request", 235), A00("SEND_RESPONSE", "send_response", 236), A00("SEND_RESUBMIT", "send_resubmit", 237), A00("SEND_SUCCESS", "send_success", 238), A00("SERVER_BLOCK", "server_block", 239), A00("SHOW_SUGGESTION", "show_suggestion", 240), A00("SIGN", "sign", 241), A00("SNOOZE", "snooze", 242)}, 0, enumC53378NjTArr, 216, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("SORT", "sort", 243), A00("SPAM_FALSE", "spam_false", 244), A00("SPAM_TRUE", "spam_true", 245), A00("START", "start", 246), A00("SUBMIT", "submit", 247), A00("SUBMIT_FLOW", "submit_flow", 248), A00("SUBMIT_FLOW_CANCEL", "submit_flow_cancel", 249), A00("SUBMIT_FLOW_FAILURE", "submit_flow_failure", C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), A00("SUBMIT_FLOW_SUCCESS", "submit_flow_success", 251), A00("SUCCESS", "success", 252), A00("SWITCH_PROFILE", "switch_profile", 253), A00("TOGGLE", "toggle", 254), A00("TRIGGER", "trigger", 255), A00("TRIGGER_ATTEMPT", "trigger_attempt", 256), A00("TRIGGER_FAILURE", "trigger_failure", 257), A00("TRIGGER_SUCCESS", "trigger_success", 258), A00("TRIGGERED", "triggered", 259), A00("TURN_OFF", "turn_off", 260), A00("TURN_ON", "turn_on", 261), A00("TYPING", "typing", 262), A00("UNDO", "undo", 263), A00("UNDO_DISMISS", "undo_dismiss", 264), A00("UNDO_SNOOZE", "undo_snooze", 265), A00("UNLISTEN", "unlisten", 266), A00("UNSELECT", "unselect", 267), A00("UPDATE", "update", 268), A00("UPDATE_ERROR", "update_error", 269)}, 0, enumC53378NjTArr, 243, 27);
        System.arraycopy(new EnumC53378NjT[]{A00("UPDATE_LEGACY", "update_legacy", 270), A00("UPDATE_SUCCESS", "update_success", 271), A00("UPDATE_VALUE", "update_value", 272), A00("UPLOAD", "upload", 273), A00("UPLOAD_FAILURE", "upload_failure", 274), A00("UPLOAD_SUCCESS", "upload_success", 275), A00("UPSERT", "upsert", 276), A00("UPSERT_AND_SEND", "upsert_and_send", 277), A00("UPSERT_AND_SEND_ERROR", "upsert_and_send_error", 278), A00("UPSERT_AND_SEND_SUCCESS", "upsert_and_send_success", 279), A00("UPSERT_ERROR", "upsert_error", 280), A00("UPSERT_SUCCESS", "upsert_success", 281), A00("WARNING", "warning", 282), A00("WATERFALL", "waterfall", 283)}, 0, enumC53378NjTArr, 270, 14);
        A01 = enumC53378NjTArr;
    }

    public static EnumC53378NjT A00(String str, String str2, int i) {
        return new EnumC53378NjT(str, i, str2);
    }

    public static EnumC53378NjT valueOf(String str) {
        return (EnumC53378NjT) Enum.valueOf(EnumC53378NjT.class, str);
    }

    public static EnumC53378NjT[] values() {
        return (EnumC53378NjT[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    public EnumC53378NjT(String str, int i, String str2) {
        this.A00 = str2;
    }
}
