package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.CGc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27606CGc {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = AbstractC111324zv.A00(1519);
                break;
            case 2:
                str = "RESHARE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
