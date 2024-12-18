package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Ru3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61809Ru3 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_PRELOAD_PROGRAM";
            case 2:
                return "DEPRECATED_FACEBOOK_DEVICE_OWNER";
            case 3:
                return "OCULUS";
            case 4:
                return "TRITIUM";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
