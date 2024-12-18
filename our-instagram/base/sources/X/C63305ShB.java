package X;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.Map;

/* renamed from: X.ShB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63305ShB {
    public static C63305ShB A08;
    public int A00;
    public ServiceConnection A01;
    public Handler A02;
    public HandlerThread A03;
    public C62407SAg A04;
    public SH1 A05;
    public BrowserLiteCallback A06;
    public LK0 A07;

    public final void A03(long j, String str, String str2, Map map) {
        A02(new C58868QDn(this, str, str2, map, 1, j), this, false);
    }

    public final void A04(long j, String str, String str2, Map map) {
        A02(new C58868QDn(this, str, str2, map, 0, j), this, false);
    }

    public final void A06(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        A02(new C58859QDa(bundle, this, iABEvent, zonePolicy), this, false);
    }

    public final void A07(Bundle bundle, Map map) {
        A02(new QDr(bundle, this, map, 1), this, false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.ShB, java.lang.Object] */
    public static synchronized C63305ShB A00() {
        C63305ShB c63305ShB;
        synchronized (C63305ShB.class) {
            C63305ShB c63305ShB2 = A08;
            c63305ShB = c63305ShB2;
            if (c63305ShB2 == null) {
                ?? obj = new Object();
                A08 = obj;
                c63305ShB = obj;
            }
        }
        return c63305ShB;
    }

    public static void A02(SNF snf, C63305ShB c63305ShB, boolean z) {
        if (c63305ShB.A01 == null) {
            AbstractC63254SgB.A01("BrowserLiteCallbacker", "Callback service is not available.", AbstractC58318PtA.A1b());
            C0K8.A0E("BrowserLiteCallbacker", "Callback service is not available.");
        } else {
            c63305ShB.A02.post(new RunnableC64672TPd(snf, c63305ShB, z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002e, code lost:
    
        if (r4.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.content.Context r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            r3 = 1
            int r0 = r0 + 1
            r6.A00 = r0
            android.content.ServiceConnection r0 = r6.A01
            if (r0 == 0) goto L50
            X.SH1 r5 = r6.A05
            if (r5 == 0) goto L50
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r6.A06
            r4 = 0
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = r0.BfY()     // Catch: android.os.RemoteException -> L1f
            if (r0 == 0) goto L27
            java.util.HashSet r4 = X.AbstractC31171DnF.A0k(r0)     // Catch: android.os.RemoteException -> L1f
            goto L27
        L1f:
            r2 = move-exception
            java.lang.String r1 = "BrowserLiteCallbacker"
            java.lang.String r0 = "Error in getPrefetchedInitialUrlKeys"
            X.C0K8.A0J(r1, r0, r2)
        L27:
            monitor-enter(r5)
            if (r4 == 0) goto L30
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L31
        L30:
            r4 = 0
        L31:
            r5.A01 = r4     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            if (r8 == 0) goto L3f
            X.QDW r1 = new X.QDW
            r1.<init>(r6, r3)
            r0 = 0
            A02(r1, r6, r0)
        L3f:
            r5 = r6
            monitor-enter(r5)
            X.SAg r0 = r6.A04     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto Lb2
            X.0hu r1 = X.C0LK.A70     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "alive"
            X.C0L6.A05(r1, r0)     // Catch: java.lang.Throwable -> L4d
            goto Lb2
        L4d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L50:
            java.lang.String r0 = "com.facebook.browser.lite.BrowserLiteCallback"
            android.content.Intent r5 = X.AbstractC58320PtC.A0B(r7, r0)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r4 = 0
            java.util.List r1 = r0.queryIntentServices(r5, r4)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb3
            int r0 = r1.size()
            if (r0 > r3) goto Lb3
            java.lang.String r0 = "BrowserLiteCallbacker"
            android.os.HandlerThread r0 = X.MSY.A0A(r0)
            r6.A03 = r0
            r0.start()
            android.os.HandlerThread r0 = r6.A03
            android.os.Handler r0 = X.MSY.A09(r0)
            r6.A02 = r0
            X.LK0 r0 = new X.LK0
            r0.<init>()
            r6.A07 = r0
            X.SkH r0 = new X.SkH
            r0.<init>(r6, r8)
            r6.A01 = r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5)
            java.lang.Object r0 = r1.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = r0.name
            X.AbstractC58319PtB.A19(r2, r1, r0)
            boolean r0 = X.AbstractC63262SgL.A02(r7)
            if (r0 == 0) goto Laa
            r3 = 9
        Laa:
            android.content.ServiceConnection r1 = r6.A01
            r0 = r3 | 512(0x200, float:7.17E-43)
            r7.bindService(r2, r1, r0)
            return
        Lb2:
            monitor-exit(r5)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63305ShB.A05(android.content.Context, boolean):void");
    }

    public static void A01(Bundle bundle, Map map) {
        A00().A07(bundle, map);
    }
}
