package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Ntl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53974Ntl {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "edit";
                    break;
                case 2:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "retry";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A0C;
    }
}
