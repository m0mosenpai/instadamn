package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.exoplayer2.util.Util;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4VV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VV {
    public static C4VV A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList A03 = new CopyOnWriteArrayList();
    public final Object A02 = new Object();
    public int A00 = 0;

    public static void A00(C4VV c4vv, int i) {
        synchronized (c4vv.A02) {
            if (c4vv.A00 == i) {
                return;
            }
            c4vv.A00 = i;
            CopyOnWriteArrayList copyOnWriteArrayList = c4vv.A03;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                InterfaceC96584Vt interfaceC96584Vt = (InterfaceC96584Vt) reference.get();
                if (interfaceC96584Vt != null) {
                    interfaceC96584Vt.DVM(i);
                } else {
                    copyOnWriteArrayList.remove(reference);
                }
            }
        }
    }

    public C4VV(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new BroadcastReceiver() { // from class: X.4VW
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int A01 = C0f9.A01(1139372035);
                C0fM.A01(this, context2, intent);
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
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
                                    if (Util.A00 >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Util.A00 >= 31 && i == 5) {
                    AbstractC121675fJ.A00(context2, C4VV.this);
                } else {
                    C4VV.A00(C4VV.this, i);
                }
                C0f9.A0E(-880067739, A01, intent);
            }
        }, intentFilter);
    }
}
