package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Shx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63342Shx {
    public final Context A00;
    public final SPG A01;
    public final RVP A02;
    public final TE8 A03;
    public final String A04;
    public static final Object A09 = AbstractC58318PtA.A0b();
    public static final Executor A0B = new Object();
    public static final Map A0A = AbstractC58319PtB.A0A();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final List A05 = new CopyOnWriteArrayList();
    public final List A07 = new CopyOnWriteArrayList();

    public static C63342Shx A00() {
        C63342Shx c63342Shx;
        synchronized (A09) {
            c63342Shx = (C63342Shx) A0A.get("[DEFAULT]");
            if (c63342Shx == null) {
                String str = AbstractC61536RpG.A00;
                if (str == null) {
                    str = Application.getProcessName();
                    AbstractC61536RpG.A00 = str;
                }
                throw AbstractC58319PtB.A0k("Default FirebaseApp is not initialized in this process ", str, ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c63342Shx;
    }

    public static void A01(C63342Shx c63342Shx) {
        C3U5.A09(!c63342Shx.A08.get(), "FirebaseApp was deleted");
    }

    public static void A02(C63342Shx c63342Shx) {
        Context context = c63342Shx.A00;
        if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            A01(c63342Shx);
            AtomicReference atomicReference = Q1t.A01;
            if (atomicReference.get() == null) {
                Q1t q1t = new Q1t(context);
                if (C1EM.A00(null, q1t, atomicReference)) {
                    context.registerReceiver(q1t, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        A01(c63342Shx);
        String str = c63342Shx.A04;
        RVP rvp = c63342Shx.A02;
        A01(c63342Shx);
        rvp.A05("[DEFAULT]".equals(str));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63342Shx)) {
            return false;
        }
        String str = this.A04;
        C63342Shx c63342Shx = (C63342Shx) obj;
        A01(c63342Shx);
        return str.equals(c63342Shx.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        c62715SNe.A00(this.A01, "options");
        return c62715SNe.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7 A[LOOP:0: B:9:0x00a1->B:11:0x00a7, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63342Shx(android.content.Context r9, X.SPG r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            r5 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r5)
            r8.A06 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A08 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.A05 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.A07 = r0
            X.C3U5.A02(r9)
            r8.A00 = r9
            X.C3U5.A04(r11)
            r8.A04 = r11
            X.C3U5.A02(r10)
            r8.A01 = r10
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r4 = com.google.firebase.components.ComponentDiscoveryService.class
            java.lang.String r3 = "ComponentDiscovery"
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            if (r2 != 0) goto L43
            java.lang.String r0 = "Context has no PackageManager."
        L3f:
            android.util.Log.w(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto L94
        L43:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            r1.<init>(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            if (r0 != 0) goto L5b
            java.lang.StringBuilder r1 = X.AbstractC31174DnI.A0y(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r0 = " has no service info."
            java.lang.String r0 = X.AbstractC166997dE.A0x(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto L3f
        L5b:
            android.os.Bundle r4 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            if (r4 == 0) goto L94
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = X.AbstractC58319PtB.A14(r4)
        L67:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9d
            java.lang.String r2 = X.AbstractC166987dD.A1B(r7)
            java.lang.Object r1 = r4.get(r2)
            java.lang.String r0 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L67
            r0 = 31
            java.lang.String r0 = r2.substring(r0)
            r3.add(r0)
            goto L67
        L8f:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r3, r0)
        L94:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r3, r0)
            java.util.List r3 = java.util.Collections.emptyList()
        L9d:
            java.util.Iterator r2 = r3.iterator()
        La1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            X.TE3 r0 = new X.TE3
            r0.<init>(r1)
            r6.add(r0)
            goto La1
        Lb4:
            java.util.concurrent.Executor r4 = X.C63342Shx.A0B
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r3.addAll(r6)
            com.google.firebase.FirebaseCommonRegistrar r1 = new com.google.firebase.FirebaseCommonRegistrar
            r1.<init>()
            X.TE4 r0 = new X.TE4
            r0.<init>(r1, r5)
            r3.add(r0)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            X.C63180Sef.A01(r0, r9, r2)
            java.lang.Class<X.Shx> r0 = X.C63342Shx.class
            X.C63180Sef.A01(r0, r8, r2)
            java.lang.Class<X.SPG> r0 = X.SPG.class
            X.C63180Sef.A01(r0, r10, r2)
            X.RVP r0 = new X.RVP
            r0.<init>(r3, r2, r4)
            r8.A02 = r0
            X.PvF r1 = new X.PvF
            r1.<init>(r5, r9, r8)
            X.TE8 r0 = new X.TE8
            r0.<init>(r1)
            r8.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63342Shx.<init>(android.content.Context, X.SPG, java.lang.String):void");
    }
}
