package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes5.dex */
public abstract class CCA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_WIFI;
            case 1:
                return "5g";
            case 2:
                return NetInfoModule.EFFECTIVE_CONNECTION_TYPE_4G;
            case 3:
                return "mobile_data";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
