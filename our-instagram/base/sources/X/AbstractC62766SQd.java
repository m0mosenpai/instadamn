package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.SQd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62766SQd {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return C05F.A00;
        }
        if (str.equals("FACEBOOK_APPLICATION_WEB")) {
            return C05F.A01;
        }
        if (str.equals("FACEBOOK_APPLICATION_NATIVE")) {
            return C05F.A0C;
        }
        if (str.equals("FACEBOOK_APPLICATION_SERVICE")) {
            return C05F.A0N;
        }
        if (str.equals("CHROME_CUSTOM_TAB")) {
            return C05F.A0Y;
        }
        if (str.equals("WEB_VIEW")) {
            return C05F.A0j;
        }
        if (str.equals("TEST_USER")) {
            return C05F.A0u;
        }
        if (str.equals("CLIENT_TOKEN")) {
            return C05F.A15;
        }
        if (str.equals("FXCAL")) {
            return C05F.A1F;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_APPLICATION_WEB";
            case 2:
                return "FACEBOOK_APPLICATION_NATIVE";
            case 3:
                return "FACEBOOK_APPLICATION_SERVICE";
            case 4:
                return "CHROME_CUSTOM_TAB";
            case 5:
                return "WEB_VIEW";
            case 6:
                return "TEST_USER";
            case 7:
                return "CLIENT_TOKEN";
            case 8:
                return "FXCAL";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
