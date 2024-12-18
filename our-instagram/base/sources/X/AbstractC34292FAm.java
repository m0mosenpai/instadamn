package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.FAm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34292FAm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "login";
            case 2:
                return "create";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
