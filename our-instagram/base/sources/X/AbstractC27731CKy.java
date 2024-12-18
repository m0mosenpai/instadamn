package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.CKy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27731CKy {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "CAPTURE_CONSENT";
            case 2:
                return "LIVE_CAPTURE";
            default:
                return "EXTENDED_CAPTURE";
        }
    }
}
