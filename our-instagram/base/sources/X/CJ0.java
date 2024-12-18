package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes5.dex */
public abstract class CJ0 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "checkmark";
                    break;
                case 2:
                    str2 = "hidden";
                    break;
                case 3:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "circle_checkmark_outline";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A01;
    }
}
