package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Kjm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46609Kjm {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "FIRST_TIME_BONUS";
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
