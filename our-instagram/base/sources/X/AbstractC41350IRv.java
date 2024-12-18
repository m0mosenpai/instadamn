package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.IRv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41350IRv {
    public static Integer A00(String str) {
        if (str.equals("PUSH")) {
            return C05F.A00;
        }
        if (str.equals("MQTT")) {
            return C05F.A01;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MQTT";
            case 2:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "PUSH";
        }
    }
}
