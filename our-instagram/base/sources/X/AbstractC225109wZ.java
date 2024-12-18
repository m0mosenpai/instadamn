package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.9wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225109wZ {
    public static final String A00(int i) {
        switch (i) {
            case -2:
                return "test";
            case -1:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            case 0:
                return "setRootSync";
            case 1:
                return "setRootAsync";
            case 2:
                return "setSizeSpecSync";
            case 3:
                return "setSizeSpecAsync";
            case 4:
                return "updateStateSync";
            case 5:
                return "updateStateAsync";
            case 6:
                return "measure_setSizeSpecSync";
            case 7:
                return "measure_setSizeSpecAsync";
            default:
                throw AbstractC166987dD.A18(AnonymousClass001.A0O("Unknown calculate layout source: ", i));
        }
    }
}
