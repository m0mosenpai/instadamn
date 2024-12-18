package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes11.dex */
public abstract class VR2 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(5)) {
            if (!C14360o3.A0K(U6u.A04(num), str)) {
                switch (num.intValue()) {
                    case 1:
                        str2 = "right_in";
                        break;
                    case 2:
                        str2 = "right_out";
                        break;
                    case 3:
                        str2 = "bottom_in";
                        break;
                    case 4:
                        str2 = "cds_fade_in";
                        break;
                    default:
                        str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                }
                if (str2.equals(str)) {
                    return num;
                }
            } else {
                return num;
            }
        }
        return C05F.A00;
    }
}
