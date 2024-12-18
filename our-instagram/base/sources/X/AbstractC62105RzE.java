package X;

/* renamed from: X.RzE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62105RzE {
    public static String A00(int i) {
        if (i == 1) {
            return "TIMELINE_TIMELINE_HEADER_TTI";
        }
        if (i == 16) {
            return "TIMELINE_TIMELINE_FIRST_UNITS_NETWORK_FETCH";
        }
        if (i == 21) {
            return "TIMELINE_TIMELINE_VISIBLE_SCROLL_FETCH_UNITS";
        }
        if (i == 26) {
            return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER";
        }
        if (i == 40) {
            return "TIMELINE_PROTILES_WAIT_TIME";
        }
        if (i == 61) {
            return "TIMELINE_FETCH_STORIES";
        }
        if (i == 63) {
            return "TIMELINE_TIMELINE_SPINNER_VISIBLE_FETCHING_STORIES";
        }
        if (i == 67) {
            return "Additional Content Restoration Time";
        }
        if (i == 13) {
            return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER_FROM_SERVER";
        }
        if (i == 14) {
            return "TIMELINE_TIMELINE_RENDER_LOWRES_HEADER_FROM_DISK_CACHE";
        }
        switch (i) {
            case 9:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER";
            case 10:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER_FROM_SERVER";
            case 11:
                return "TIMELINE_TIMELINE_RENDER_ENTIRE_HEADER_FROM_DISK_CACHE";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
