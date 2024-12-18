package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.SdX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63127SdX {
    public final Context A00;

    public C63127SdX(Context context) {
        this.A00 = context;
    }

    public static SMD A00(ConnectivityManager connectivityManager) {
        boolean z;
        Integer num;
        int i;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                z = true;
                if (type != 0) {
                    if (type != 1) {
                        if (type == 6) {
                            num = C05F.A0j;
                        } else {
                            num = C05F.A00;
                        }
                    } else {
                        num = C05F.A0C;
                    }
                } else {
                    num = A01(activeNetworkInfo.getSubtype());
                }
                i = activeNetworkInfo.getType();
            } else {
                z = false;
                num = C05F.A00;
                i = -1;
            }
            return new SMD(num, null, i, z);
        } catch (Throwable th) {
            return new SMD(C05F.A00, th, -1, false);
        }
    }

    public static Integer A01(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return C05F.A0N;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 17:
                return C05F.A0Y;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 18:
                return C05F.A0j;
            case Process.SIGSTOP /* 19 */:
            default:
                return C05F.A15;
            case 20:
                return C05F.A0u;
        }
    }
}
