package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.63x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1341263x {
    public static final Object A01 = new Object();
    public static volatile C1341263x A02;
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final boolean A03(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return A01(context, intent, serviceConnection, this, context.getClass().getName(), i);
    }

    public static C1341263x A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new C1341263x();
                }
            }
        }
        C1341263x c1341263x = A02;
        C3U5.A02(c1341263x);
        return c1341263x;
    }

    public final void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C64H)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, C1341263x c1341263x, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C3U2.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof C64H)) {
            ConcurrentHashMap concurrentHashMap = c1341263x.A00;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                android.util.Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                if (!bindService) {
                    return false;
                }
                return bindService;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
