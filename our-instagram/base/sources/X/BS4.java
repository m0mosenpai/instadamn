package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes5.dex */
public abstract class BS4 {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static String A00(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 576;
                return AbstractC43591JPw.A00(i);
            case 2:
                i = 709;
                return AbstractC43591JPw.A00(i);
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
