package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.61m, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61m {
    public static HandlerThread A05;
    public static C61m A06;
    public static final Object A07 = new Object();
    public final Context A00;
    public final C1341263x A01;
    public final HashMap A02;
    public final C1341063v A03;
    public volatile Handler A04;

    public C61m() {
    }

    public static C61m A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C61m(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ComponentName componentName, ServiceConnection serviceConnection) {
        A02(serviceConnection, new C64F(componentName));
    }

    public final void A02(ServiceConnection serviceConnection, C64F c64f) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C64G c64g = (C64G) hashMap.get(c64f);
            if (c64g != null) {
                Map map = c64g.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, c64f), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0R("Trying to unbind a GmsServiceConnection  that was not bound before.  config=", c64f.toString()));
                }
            }
        }
    }

    public final boolean A03(ServiceConnection serviceConnection, C64F c64f, String str) {
        boolean z;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C64G c64g = (C64G) hashMap.get(c64f);
            if (c64g == null) {
                c64g = new C64G(c64f, this);
                c64g.A05.put(serviceConnection, serviceConnection);
                c64g.A00(str);
                hashMap.put(c64f, c64g);
            } else {
                this.A04.removeMessages(0, c64f);
                Map map = c64g.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i = c64g.A00;
                    if (i != 1) {
                        if (i == 2) {
                            c64g.A00(str);
                        }
                    } else {
                        serviceConnection.onServiceConnected(c64g.A01, c64g.A02);
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0R("Trying to bind a GmsServiceConnection that was already connected before.  config=", c64f.toString()));
                }
            }
            z = c64g.A03;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Handler$Callback, X.63v] */
    public C61m(Context context, Looper looper) {
        this.A02 = new HashMap();
        ?? r1 = new Handler.Callback() { // from class: X.63v
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    HashMap hashMap = C61m.this.A02;
                    synchronized (hashMap) {
                        C64F c64f = (C64F) message.obj;
                        C64G c64g = (C64G) hashMap.get(c64f);
                        if (c64g != null && c64g.A00 == 3) {
                            android.util.Log.e("GmsClientSupervisor", AnonymousClass001.A0R("Timeout waiting for ServiceConnection callback ", String.valueOf(c64f)), new Exception());
                            ComponentName componentName = c64g.A01;
                            if (componentName == null && (componentName = c64f.A00) == null) {
                                String str = c64f.A02;
                                C3U5.A02(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            c64g.onServiceDisconnected(componentName);
                        }
                    }
                    return true;
                }
                HashMap hashMap2 = C61m.this.A02;
                synchronized (hashMap2) {
                    C64F c64f2 = (C64F) message.obj;
                    C64G c64g2 = (C64G) hashMap2.get(c64f2);
                    if (c64g2 != null && c64g2.A05.isEmpty()) {
                        if (c64g2.A03) {
                            C64F c64f3 = c64g2.A04;
                            C61m c61m = c64g2.A06;
                            c61m.A04.removeMessages(1, c64f3);
                            c61m.A01.A02(c61m.A00, c64g2);
                            c64g2.A03 = false;
                            c64g2.A00 = 2;
                        }
                        hashMap2.remove(c64f2);
                    }
                }
                return true;
            }
        };
        this.A03 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new HandlerC1341163w(looper, r1);
        this.A01 = C1341263x.A00();
    }
}
