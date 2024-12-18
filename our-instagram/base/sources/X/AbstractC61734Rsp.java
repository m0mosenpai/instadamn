package X;

/* renamed from: X.Rsp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61734Rsp {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ELIGIBILITY_SUCCESS";
            case 2:
                return "DISCLAIMER_IMPRESSION";
            case 3:
                return "OPT_OUT";
            case 4:
                return "URL_INTERCEPT_INIT";
            case 5:
                return "URL_INTERCEPT_SUCCESS";
            case 6:
                return "URL_INTERCEPT_FAIL";
            case 7:
                return "UNKNOWN";
            default:
                return "CHECKOUT_LOADING_SCREEN_IMPRESSION";
        }
    }
}
