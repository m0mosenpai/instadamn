package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.F4v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34145F4v {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "HOUR_ONE";
            case 2:
                return "HOUR_SIX";
            case 3:
                return "CUSTOM";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
