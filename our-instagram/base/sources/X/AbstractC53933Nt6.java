package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Nt6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53933Nt6 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "TOOL";
                break;
            case 2:
                str = "ADJUST";
                break;
            case 3:
                str = "AUDIO";
                break;
            case 4:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "FILTER";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
