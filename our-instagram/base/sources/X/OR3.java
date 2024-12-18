package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes9.dex */
public abstract class OR3 {
    public static final Integer[] A00 = C05F.A00(3);

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "MASK";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "OVERLAY";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
