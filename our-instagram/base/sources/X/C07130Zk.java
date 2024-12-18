package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Arrays;

/* renamed from: X.0Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07130Zk extends AbstractC208410g {
    public static final C07130Zk A00 = new Object();
    public static final int[] A01 = {15335435, 34420479, 23592980, 61680819};
    public static final String[] A02 = {"APP_START", "NAVIGATION_EVENT", "SCROLL", "VIDEO_RENDER"};
    public static final boolean[] A03 = {true, false, false, false};

    @Override // X.C0Xc
    public final String getName() {
        return "ig_executor_app_start_listener";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        boolean[] zArr;
        char c;
        C14360o3.A0B(c0xx, 0);
        int markerId = c0xx.getMarkerId();
        if (markerId != 23592980) {
            if (markerId != 34420479) {
                if (markerId == 61680819) {
                    zArr = A03;
                    c = 3;
                } else {
                    return;
                }
            } else {
                zArr = A03;
                c = 2;
            }
            zArr[c] = true;
            return;
        }
        A03[1] = true;
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        boolean[] zArr;
        char c;
        C14360o3.A0B(c0xx, 0);
        switch (c0xx.getMarkerId()) {
            case 15335435:
                A03[0] = false;
                return;
            case 23592980:
                zArr = A03;
                c = 1;
                break;
            case 34420479:
                zArr = A03;
                c = 2;
                break;
            case 61680819:
                zArr = A03;
                c = 3;
                break;
            default:
                return;
        }
        zArr[c] = false;
    }

    public static final String A00() {
        boolean[] zArr = A03;
        int i = 0;
        while (!zArr[i]) {
            i++;
            if (i >= 4) {
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            }
        }
        return A02[i];
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        return new C06650Xb(Arrays.copyOf(A01, 4), null);
    }
}
