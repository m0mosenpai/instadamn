package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Klr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46734Klr {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "INTRODUCE";
            case 2:
                return "CUTOVER";
            case 3:
                return "SELL";
            case 4:
                return "WARN";
            case 5:
                return "BLOCK";
            case 6:
                return "MEX_EB_UPSELL";
            default:
                return "MEX_EB_LOW_DISK_SPACE";
        }
    }
}
