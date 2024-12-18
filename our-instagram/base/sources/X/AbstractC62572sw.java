package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC62572sw {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = NetInfoModule.CONNECTION_TYPE_NONE;
            } else {
                str2 = "logo";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
