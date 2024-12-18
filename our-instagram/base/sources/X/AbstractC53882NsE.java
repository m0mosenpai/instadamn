package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.NsE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53882NsE {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 2:
                str = "TAB_ONLY";
                break;
            default:
                str = "ALL";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
