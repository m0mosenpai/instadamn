package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.media3.common.util.Util;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class Q1c extends BroadcastReceiver {
    public final /* synthetic */ C63176Seb A00;

    public Q1c(C63176Seb c63176Seb) {
        this.A00 = c63176Seb;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -2062227565);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                i = 1;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4) {
                                i = 5;
                                if (type != 5) {
                                    if (type != 6) {
                                        i = 7;
                                        if (type != 9) {
                                            i = 8;
                                        }
                                    }
                                }
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case 14:
                        case Process.SIGTERM /* 15 */:
                        case 17:
                            i = 4;
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            i = 5;
                            break;
                        case 16:
                        case Process.SIGSTOP /* 19 */:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            i = 0;
                            if (Util.A01 >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Util.A01 >= 31 && i == 5) {
            AbstractC61640RrB.A00(context, this.A00);
        } else {
            C63176Seb.A01(this.A00, i);
        }
        C0f9.A0E(-1913691459, A04, intent);
    }
}
