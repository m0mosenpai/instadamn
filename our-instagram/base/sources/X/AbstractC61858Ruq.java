package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ruq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61858Ruq {
    public static String A00(int i) {
        if (i == 1) {
            return "BUGREPORT_UPLOAD";
        }
        if (i == 2) {
            return "BUGREPORT_UPLOAD_ATTACHMENTS";
        }
        if (i == 4) {
            return "BUGREPORT_GET_EXTRA_ANDROID";
        }
        if (i == 5) {
            return "BUGREPORT_REPORT_FLOW";
        }
        if (i == 6) {
            return "BUGREPORT_FINALIZE";
        }
        if (i == 7) {
            return "BUGREPORT_PERSIST_TO_DISK";
        }
        if (i == 14) {
            return "BUGREPORT_UPLOAD_SHADOW";
        }
        if (i == 15) {
            return "BUGREPORT_FINALIZE_SHADOW";
        }
        if (i == 23) {
            return "BUGREPORT_OPEN_MENU";
        }
        if (i == 24) {
            return "BUGREPORT_BUGREPORT_FUNNEL";
        }
        switch (i) {
            case 10:
                return "BUGREPORT_GET_EXTRA";
            case 11:
                return "BUGREPORT_LOOM_VIDEO_PROFILER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "BUGREPORT_CAPTURE_SCREENSHOT";
            default:
                switch (i) {
                    case 1061:
                        return "BUGREPORT_ANALYTICS_LOGGER";
                    case 3797:
                        return "BUGREPORT_TAP_BUGNUB";
                    case 5389:
                        return "BUGREPORT_ISSUE_CATEGORY_TTRC";
                    case 5620:
                        return "BUGREPORT_THANK_YOU_TTRC";
                    case 5870:
                        return "BUGREPORT_GENERATE_REPORT";
                    case 6064:
                        return "BUGREPORT_UNEXPECTED_EVENT";
                    case 6366:
                        return "BUGREPORT_BUG_BUBBLE_ON_CLICK";
                    case 7852:
                        return "BUGREPORT_OUTLIER_DETECTED";
                    case 8156:
                        return "BUGREPORT_DRAG_BUGNUB";
                    case 9342:
                        return "BUGREPORT_RAGESHAKE_STATUS_CHANGE";
                    case 9767:
                        return "BUGREPORT_BUG_REPORT_FORM_TTRC";
                    case 10408:
                        return "BUGREPORT_ON_RAGESHAKE";
                    case 10758:
                        return "BUGREPORT_RAGESHAKE_STATUS";
                    case 12924:
                        return "BUGREPORT_BUG_REPORT_CORE_INFRA_FUNNEL";
                    case 13245:
                        return "BUGREPORT_PRIVACY_CONSENT_TTRC";
                    case 14580:
                        return "BUGREPORT_BUG_REPORTER_FUNNEL";
                    case 15393:
                        return "BUGREPORT_CHOOSE_FEATURE_TTRC";
                    case 16073:
                        return "BUGREPORT_SHOW_BUGNUB";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
