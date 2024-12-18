package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Skg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63461Skg implements Handler.Callback, ServiceConnection {
    public final Context A01;
    public final Handler A02;
    public final HandlerThread A04;
    public final Map A03 = AbstractC166987dD.A1G();
    public java.util.Set A00 = AbstractC166987dD.A1H();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r12.A03 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(X.SI2 r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC63461Skg.A00(X.SI2):void");
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [android.support.v4.app.INotificationSideChannel$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        java.util.Set set;
        SI2 si2;
        INotificationSideChannel iNotificationSideChannel;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    si2 = (SI2) this.A03.get(message.obj);
                    if (si2 == null) {
                        return true;
                    }
                } else {
                    SI2 si22 = (SI2) this.A03.get(message.obj);
                    if (si22 == null) {
                        return true;
                    }
                    if (si22.A03) {
                        this.A01.unbindService(this);
                        si22.A03 = false;
                    }
                    si22.A01 = null;
                    return true;
                }
            } else {
                C62469SCw c62469SCw = (C62469SCw) message.obj;
                ComponentName componentName = c62469SCw.A00;
                IBinder iBinder = c62469SCw.A01;
                si2 = (SI2) this.A03.get(componentName);
                if (si2 == null) {
                    return true;
                }
                if (iBinder == null) {
                    iNotificationSideChannel = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.A00);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof INotificationSideChannel)) {
                        iNotificationSideChannel = (INotificationSideChannel) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        int A03 = C0f9.A03(219225009);
                        obj.A00 = iBinder;
                        C0f9.A0A(-1334049216, A03);
                        iNotificationSideChannel = obj;
                    }
                }
                si2.A01 = iNotificationSideChannel;
                si2.A00 = 0;
            }
            A00(si2);
            return true;
        }
        Object obj2 = message.obj;
        Context context = this.A01;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (C23821Ep.A05) {
            if (string != null) {
                if (!string.equals(C23821Ep.A03)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    C23821Ep.A04 = hashSet;
                    C23821Ep.A03 = string;
                }
            }
            set = C23821Ep.A04;
        }
        if (!set.equals(this.A00)) {
            this.A00 = set;
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(AbstractC31171DnF.A04().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet A1H = AbstractC166987dD.A1H();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (set.contains(((PackageItemInfo) resolveInfo.serviceInfo).packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Permission present on component ");
                        A1C.append(componentName2);
                        AbstractC58320PtC.A1O(", not adding listener record.", "NotifManCompat", A1C);
                    } else {
                        A1H.add(componentName2);
                    }
                }
            }
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                Map map = this.A03;
                if (!map.containsKey(componentName3)) {
                    android.util.Log.isLoggable("NotifManCompat", 3);
                    map.put(componentName3, new SI2(componentName3));
                }
            }
            Iterator A15 = AbstractC166997dE.A15(this.A03);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (!A1H.contains(A1K.getKey())) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        A1K.getKey();
                    }
                    SI2 si23 = (SI2) A1K.getValue();
                    if (si23.A03) {
                        context.unbindService(this);
                        si23.A03 = false;
                    }
                    si23.A01 = null;
                    A15.remove();
                }
            }
        }
        Iterator A16 = AbstractC166997dE.A16(this.A03);
        while (A16.hasNext()) {
            SI2 si24 = (SI2) A16.next();
            si24.A02.add(obj2);
            A00(si24);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        android.util.Log.isLoggable("NotifManCompat", 3);
        AbstractC58318PtA.A1F(this.A02, new C62469SCw(componentName, iBinder), 1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        android.util.Log.isLoggable("NotifManCompat", 3);
        AbstractC58318PtA.A1F(this.A02, componentName, 2);
    }

    public ServiceConnectionC63461Skg(Context context) {
        this.A01 = context;
        HandlerThread A0A = MSY.A0A("NotificationManagerCompat");
        this.A04 = A0A;
        A0A.start();
        this.A02 = new Handler(A0A.getLooper(), this);
    }
}
