package X;

/* loaded from: classes6.dex */
public abstract class FVY {
    public static Integer A00(String str) {
        if (str.equals("UNKNOWN")) {
            return C05F.A00;
        }
        if (str.equals("SETTINGS_MENU")) {
            return C05F.A01;
        }
        if (str.equals("PUSH_NOTIFICATION")) {
            return C05F.A0C;
        }
        if (str.equals("ACTIVITY_FEED_NOTIFICATION")) {
            return C05F.A0N;
        }
        if (str.equals("QUICK_PROMOTION")) {
            return C05F.A0Y;
        }
        if (str.equals("BLOCK_FLOW")) {
            return C05F.A0j;
        }
        if (str.equals("DEEP_LINK")) {
            return C05F.A0u;
        }
        if (str.equals("SUPERVISION_WEB")) {
            return C05F.A15;
        }
        if (str.equals("BLOCKING_LIST")) {
            return C05F.A1F;
        }
        if (str.equals("PROFILE_MENU")) {
            return C05F.A1I;
        }
        if (str.equals("BARCELONA_SETTINGS_MENU")) {
            return C05F.A02;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "unknown";
            case 1:
                return "settings_menu";
            case 2:
                return "push_notification";
            case 3:
                return "activity_feed_notification";
            case 4:
                return "quick_promotion";
            case 5:
                return "block_flow";
            case 6:
                return "deep_link";
            case 7:
                return "supervision_web";
            case 8:
                return "blocking_list";
            case 9:
                return "profile_menu";
            default:
                return "barcelona_settings_menu";
        }
    }
}
