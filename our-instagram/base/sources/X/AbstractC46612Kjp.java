package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Kjp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46612Kjp {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FIRST_TIME_FULL_SCREEN";
                break;
            case 2:
                str = "PERSISTENT_EDUCATION";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
