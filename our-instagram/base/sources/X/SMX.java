package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SMX {
    public SC5 A00;
    public Boolean A01;
    public final C64437TDv A02;
    public final boolean A03;
    public final /* synthetic */ FirebaseInstanceId A04;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r0 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A00() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.A01     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto La
            boolean r1 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2b
            goto L29
        La:
            boolean r0 = r2.A03     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L28
            com.google.firebase.iid.FirebaseInstanceId r0 = r2.A04     // Catch: java.lang.Throwable -> L2b
            X.Shx r0 = r0.A02     // Catch: java.lang.Throwable -> L2b
            X.C63342Shx.A01(r0)     // Catch: java.lang.Throwable -> L2b
            X.TE8 r0 = r0.A03     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L2b
            X.SHn r1 = (X.SHn) r1     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r1.A00     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            goto L25
        L22:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L25:
            r1 = 1
            if (r0 != 0) goto L29
        L28:
            r1 = 0
        L29:
            monitor-exit(r2)
            return r1
        L2b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMX.A00():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.SC5, java.lang.Object] */
    public SMX(C64437TDv c64437TDv, FirebaseInstanceId firebaseInstanceId) {
        boolean z;
        Boolean bool;
        ApplicationInfo A0C;
        Bundle bundle;
        this.A04 = firebaseInstanceId;
        this.A02 = c64437TDv;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C63342Shx c63342Shx = firebaseInstanceId.A02;
            C63342Shx.A01(c63342Shx);
            Context context = c63342Shx.A00;
            ResolveInfo resolveService = context.getPackageManager().resolveService(AbstractC58320PtC.A0B(context, "com.google.firebase.MESSAGING_EVENT"), 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : true;
        }
        this.A03 = z;
        C63342Shx c63342Shx2 = this.A04.A02;
        C63342Shx.A01(c63342Shx2);
        Context context2 = c63342Shx2.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null && (A0C = AbstractC58320PtC.A0C(context2, packageManager)) != null && (bundle = ((PackageItemInfo) A0C).metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    bool = Boolean.valueOf(((PackageItemInfo) A0C).metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && z) {
            ?? r4 = new Object(this) { // from class: X.SC5
                public final SMX A00;

                {
                    this.A00 = this;
                }
            };
            this.A00 = r4;
            Executor executor = c64437TDv.A02;
            synchronized (c64437TDv) {
                Map map = c64437TDv.A01;
                if (!map.containsKey(AbstractC61523Roy.class)) {
                    map.put(AbstractC61523Roy.class, AbstractC58318PtA.A14());
                }
                ((ConcurrentHashMap) map.get(AbstractC61523Roy.class)).put(r4, executor);
            }
        }
    }
}
