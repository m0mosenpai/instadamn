package X;

/* loaded from: classes10.dex */
public abstract class RyK {
    public static String A00(int i) {
        if (i == 5) {
            return "PLACES_PLACES_PICKER_LOCATION_PIN_TTI";
        }
        if (i == 6) {
            return "PLACES_PLACES_PICKER_CHECKIN_BUTTON_TTI";
        }
        if (i == 29) {
            return "PLACES_PLACE_PICKER_PERF";
        }
        if (i == 31) {
            return "PLACES_PLACE_PICKER_LOCATION_PERF";
        }
        switch (i) {
            case 22:
                return "PLACES_ANDROID_PLACE_PICKER_TAP_ACTION_TO_CHECKIN_START";
            case 23:
                return "PLACES_ANDROID_PLACE_PICKER_CHECKIN_START_TO_PLACE_FETCH_START";
            case 24:
                return "PLACES_ANDROID_PLACE_PICKER_PLACE_FETCH_START_TO_PLACE_FETCH_END";
            case 25:
                return "PLACES_ANDROID_PLACE_PICKER_PLACE_FETCH_END_TO_PLACES_RENDERED";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
