package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26141Ov implements InterfaceC13000lm {
    public static InterfaceC08830cm A0Q;
    public static InterfaceC08830cm A0R;
    public ConnectivityManager A00;
    public boolean A01;
    public final Context A03;
    public final Handler A05;
    public final UserSession A08;
    public final C119885bm A09;
    public final C120185cH A0A;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final InterfaceC08830cm A0I;
    public final InterfaceC08830cm A0J;
    public final InterfaceC08830cm A0K;
    public final InterfaceC08830cm A0L;
    public final C13920nI A0M;
    public volatile boolean A0N;
    public volatile C1OW A0P;
    public static final IntentFilter A0W = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public static final List A0X = new ArrayList();
    public static final List A0S = new ArrayList();
    public static final List A0T = new ArrayList();
    public static final List A0V = new ArrayList();
    public static final List A0U = new ArrayList();
    public final Runnable A0C = new Runnable() { // from class: X.5cL
        @Override // java.lang.Runnable
        public final void run() {
            C26141Ov.A07(C26141Ov.this, "dispatch", 0L);
        }
    };
    public final Runnable A0B = new Runnable() { // from class: X.5cM
        @Override // java.lang.Runnable
        public final void run() {
            C26141Ov c26141Ov = C26141Ov.this;
            IntentFilter intentFilter = C26141Ov.A0W;
            Iterator it = c26141Ov.A0D.iterator();
            while (it.hasNext()) {
                C452726k.A00((C452726k) it.next(), new AnonymousClass270(null, null, null, null, null, null, "stop", null, null));
            }
        }
    };
    public final BroadcastReceiver A02 = new BroadcastReceiver() { // from class: X.5cN
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int A01 = C0f9.A01(-675831796);
            C0fM.A01(this, context, intent);
            C26141Ov c26141Ov = C26141Ov.this;
            IntentFilter intentFilter = C26141Ov.A0W;
            if (((Boolean) c26141Ov.A0I.get()).booleanValue() && !((Boolean) c26141Ov.A0J.get()).booleanValue()) {
                c26141Ov.A0C("onConnectivityChanged");
            } else {
                c26141Ov.A05.obtainMessage(2).sendToTarget();
                C26141Ov.A07(c26141Ov, "onConnectivityChanged", 0L);
            }
            C0f9.A0E(5153498, A01, intent);
        }
    };
    public final ConnectivityManager.NetworkCallback A04 = new ConnectivityManager.NetworkCallback() { // from class: X.5cO
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            C26141Ov c26141Ov = C26141Ov.this;
            IntentFilter intentFilter = C26141Ov.A0W;
            c26141Ov.A05.obtainMessage(2).sendToTarget();
            C26141Ov.A07(c26141Ov, "onConnectivityChanged", 0L);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            C26141Ov.this.A0C("onConnectivityChanged");
        }
    };
    public final MessageQueue.IdleHandler A06 = new C1KC() { // from class: X.5cP
        {
            super("DirectStartListeningForConnectivity");
        }

        @Override // X.C1KC
        public final boolean onQueueIdle() {
            C26141Ov.A04(C26141Ov.this);
            return false;
        }
    };
    public final AtomicInteger A0G = new AtomicInteger();
    public volatile boolean A0O = false;
    public final AtomicReference A0H = new AtomicReference();
    public final C0f6 A07 = C18950wb.A01;

    public static void A03(InterfaceC37116GXb interfaceC37116GXb, C26141Ov c26141Ov, String str, String str2) {
        ArrayList arrayList;
        Pair A01;
        synchronized (c26141Ov) {
            boolean z = false;
            if (str != null) {
                C120185cH c120185cH = c26141Ov.A0A;
                synchronized (c120185cH) {
                    try {
                        A01 = c120185cH.A01(str);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (A01 != null) {
                    A05(c26141Ov, (C1OW) A01.first, (MNP) A01.second);
                    z = true;
                }
            } else {
                C120185cH c120185cH2 = c26141Ov.A0A;
                synchronized (c120185cH2) {
                    try {
                        arrayList = new ArrayList();
                        Iterator it = c120185cH2.A02.values().iterator();
                        while (it.hasNext()) {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) it.next();
                            Iterator it2 = linkedHashMap.values().iterator();
                            while (it2.hasNext()) {
                                C1OW c1ow = (C1OW) it2.next();
                                java.util.Set unmodifiableSet = Collections.unmodifiableSet(c1ow.A08);
                                C14360o3.A07(unmodifiableSet);
                                if (unmodifiableSet.contains(str2)) {
                                    InterfaceC28041Xi interfaceC28041Xi = C120185cH.A08;
                                    Pair pair = new Pair(c1ow, new JTV(JTU.A00(c1ow)));
                                    if (interfaceC28041Xi.apply(pair.second)) {
                                        arrayList.add(pair);
                                        String str3 = c1ow.A05;
                                        c120185cH2.A03.remove(str3);
                                        c120185cH2.A04.remove(str3);
                                        it2.remove();
                                    }
                                }
                            }
                            if (linkedHashMap.isEmpty()) {
                                it.remove();
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C120185cH.A00(c120185cH2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Pair pair2 = (Pair) it3.next();
                    A05(c26141Ov, (C1OW) pair2.first, (MNP) pair2.second);
                    z = true;
                }
            }
            if (interfaceC37116GXb != null) {
                interfaceC37116GXb.D6Y(z);
            }
        }
    }

    public final synchronized void A09(InterfaceC37116GXb interfaceC37116GXb, String str) {
        A03(interfaceC37116GXb, this, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (((X.C2DU) ((X.C2DS) r10.A0L.get())).A0H.A0F != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0A(X.InterfaceC37116GXb r11, java.lang.String r12) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            X.5cH r8 = r10.A0A     // Catch: java.lang.Throwable -> Lc2
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lc2
            android.util.Pair r0 = r8.A01(r12)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto La3
            java.lang.Object r4 = r0.first     // Catch: java.lang.Throwable -> Lc2
            X.1OW r4 = (X.C1OW) r4     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r7 = r0.second     // Catch: java.lang.Throwable -> Lc2
            X.MNP r7 = (X.MNP) r7     // Catch: java.lang.Throwable -> Lc2
            X.JTU r1 = X.JTU.A01(r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "queued"
            r1.A04(r0)     // Catch: java.lang.Throwable -> Lc2
            X.JTV r3 = new X.JTV     // Catch: java.lang.Throwable -> Lc2
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            r1 = 0
            if (r7 == 0) goto L27
            r1 = 1
        L27:
            X.5bm r2 = r10.A09     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = r4.A02()     // Catch: java.lang.Throwable -> Lc2
            X.JTt r0 = r2.A01(r0)     // Catch: java.lang.Throwable -> Lc2
            X.0do r0 = r0.A04     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lc2
            X.1b7 r0 = (X.InterfaceC29301b7) r0     // Catch: java.lang.Throwable -> Lc2
            boolean r5 = r0.CfR(r4, r3)     // Catch: java.lang.Throwable -> Lc2
            if (r5 == 0) goto L49
            monitor-enter(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = r8.A02(r4, r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            goto Lc1
        L49:
            r6 = 0
        L4a:
            if (r1 != 0) goto L6a
            java.util.List r0 = r10.A0E     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
        L52:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lc2
            X.26l r0 = (X.InterfaceC452826l) r0     // Catch: java.lang.Throwable -> Lc2
            r0.DB8(r4, r6, r5)     // Catch: java.lang.Throwable -> Lc2
            goto L52
        L62:
            if (r5 == 0) goto L8a
            java.util.List r0 = r10.A0F     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC43668JTc.A01(r2, r4, r3, r0)     // Catch: java.lang.Throwable -> Lc2
            goto L8a
        L6a:
            java.util.List r0 = r10.A0E     // Catch: java.lang.Throwable -> Lc2
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
        L70:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lc2
            X.26l r0 = (X.InterfaceC452826l) r0     // Catch: java.lang.Throwable -> Lc2
            r0.DhF(r4, r6, r5)     // Catch: java.lang.Throwable -> Lc2
            goto L70
        L80:
            if (r5 == 0) goto L8a
            java.util.List r0 = r10.A0F     // Catch: java.lang.Throwable -> Lc2
            r7.getClass()     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC43668JTc.A00(r2, r4, r7, r3, r0)     // Catch: java.lang.Throwable -> Lc2
        L8a:
            com.instagram.common.session.UserSession r3 = r10.A08     // Catch: java.lang.Throwable -> Lc2
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Lc2
            r0 = 36603991925003268(0x820b23000d1404, double:3.211850113592452E-306)
            long r3 = X.C18U.A01(r2, r3, r0)     // Catch: java.lang.Throwable -> Lc2
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La0
            if (r5 == 0) goto Lba
            goto La5
        La0:
            if (r5 == 0) goto Lba
            goto Lb5
        La3:
            r5 = 0
            goto Lba
        La5:
            X.0cm r0 = r10.A0L     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lc2
            X.2DS r0 = (X.C2DS) r0     // Catch: java.lang.Throwable -> Lc2
            X.2DU r0 = (X.C2DU) r0     // Catch: java.lang.Throwable -> Lc2
            X.1aC r0 = r0.A0H     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r0.A0F     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lba
        Lb5:
            java.lang.Runnable r0 = r10.A0C     // Catch: java.lang.Throwable -> Lc2
            X.C11T.A02(r0)     // Catch: java.lang.Throwable -> Lc2
        Lba:
            r11.D6Y(r5)     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r9)
            return
        Lbf:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbf
        Lc1:
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ov.A0A(X.GXb, java.lang.String):void");
    }

    public final synchronized void A0B(C1OW c1ow) {
        this.A0P = c1ow;
        A06(this, c1ow, new JTV(JTU.A00(c1ow)), false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair A00(X.C26141Ov r9) {
        /*
            X.5cH r5 = r9.A0A
            monitor-enter(r5)
            java.util.Map r0 = r5.A02     // Catch: java.lang.Throwable -> Lb2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> Lb2
            r6 = 0
        Le:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> Lb2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> Lb2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lb2
        L22:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb2
            r7 = 0
            if (r0 == 0) goto L99
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> Lb2
            X.1OW r3 = (X.C1OW) r3     // Catch: java.lang.Throwable -> Lb2
            X.JTU r1 = X.JTU.A00(r3)     // Catch: java.lang.Throwable -> Lb2
            X.JTV r0 = new X.JTV     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb2
            android.util.Pair r8 = new android.util.Pair     // Catch: java.lang.Throwable -> Lb2
            r8.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r8.second     // Catch: java.lang.Throwable -> Lb2
            X.MNP r0 = (X.MNP) r0     // Catch: java.lang.Throwable -> Lb2
            X.JTV r0 = (X.JTV) r0     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = r0.A02     // Catch: java.lang.Throwable -> Lb2
            int r0 = r1.hashCode()     // Catch: java.lang.Throwable -> Lb2
            r2 = 1
            switch(r0) {
                case -1090974990: goto L59;
                case -948696717: goto L63;
                case 1501196714: goto L86;
                case 1563991648: goto L8a;
                case 1885454214: goto L8e;
                default: goto L4d;
            }     // Catch: java.lang.Throwable -> Lb2
        L4d:
            java.lang.String r0 = "Unsupported lifecycle state: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "DirectMutationStore_getNextPendingMutationFromQueue"
            X.C0w9.A04(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb2
            goto L22
        L59:
            java.lang.String r0 = "executing"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L99
            goto L4d
        L63:
            java.lang.String r0 = "queued"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L4d
            java.util.Map r1 = r5.A03     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r3.A05     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lb2
            X.L2q r0 = (X.C47657L2q) r0     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L83
            long r3 = r0.A00     // Catch: java.lang.Throwable -> Lb2
        L7a:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lb2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L98
        L83:
            r3 = 0
            goto L7a
        L86:
            java.lang.String r0 = "upload_failed_permanent"
            goto L91
        L8a:
            java.lang.String r0 = "uploaded"
            goto L91
        L8e:
            java.lang.String r0 = "upload_failed_transient"
        L91:
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L22
            goto L4d
        L98:
            r7 = r8
        L99:
            if (r6 == 0) goto Lad
            if (r7 == 0) goto Le
            java.lang.Object r0 = r7.first     // Catch: java.lang.Throwable -> Lb2
            X.1OW r0 = (X.C1OW) r0     // Catch: java.lang.Throwable -> Lb2
            long r3 = r0.A01     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r6.first     // Catch: java.lang.Throwable -> Lb2
            X.1OW r0 = (X.C1OW) r0     // Catch: java.lang.Throwable -> Lb2
            long r1 = r0.A01     // Catch: java.lang.Throwable -> Lb2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le
        Lad:
            r6 = r7
            goto Le
        Lb0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb2
            return r6
        Lb2:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Ov.A00(X.1Ov):android.util.Pair");
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, X.5cG] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, X.5cF] */
    public static synchronized C26141Ov A01(final UserSession userSession) {
        final C26141Ov c26141Ov;
        synchronized (C26141Ov.class) {
            c26141Ov = (C26141Ov) userSession.A00(C26141Ov.class);
            if (c26141Ov == null) {
                final Context context = AbstractC12290kX.A00;
                final C119885bm c119885bm = new C119885bm(userSession, A0X);
                ArrayList arrayList = new ArrayList();
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    arrayList.add((C452726k) ((C0KV) it.next()).AXR(userSession));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new InterfaceC452826l(c119885bm) { // from class: X.5bn
                    public final C119885bm A00;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null && c114675Fx != null) {
                            A00.EHu(c19260xA, c1ow, c114675Fx, z, c1ow.A02.A09);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    private InterfaceC29451bM A00(C1OW c1ow) {
                        InterfaceC09390do interfaceC09390do = this.A00.A01(c1ow.A02()).A02;
                        if (interfaceC09390do != null) {
                            return (InterfaceC29451bM) interfaceC09390do.getValue();
                        }
                        return null;
                    }

                    {
                        this.A00 = c119885bm;
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null) {
                            A00.EHt(c1ow, c1ow.A02.A09);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null) {
                            A00.EHw(c1ow, false);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null) {
                            A00.EHv(c19260xA, c1ow, z, c1ow.A02.A09);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null) {
                            A00.EHx(c19260xA, c1ow, c1ow.A02.A09);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                        InterfaceC29451bM A00 = A00(c1ow);
                        if (A00 != null) {
                            A00.EHw(c1ow, true);
                        }
                    }
                });
                Iterator it2 = A0T.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((InterfaceC452826l) ((C0KV) it2.next()).AXR(userSession));
                }
                for (final C0KV c0kv : A0V) {
                    RealtimeClientManager.getInstance(userSession).addAdditionalObserverWithProvider(new RealtimeClientManager.ObserverProvider() { // from class: X.5c6
                        @Override // com.instagram.realtimeclient.RealtimeClientManager.ObserverProvider
                        public final RealtimeClientManager.Observer get(UserSession userSession2) {
                            C0KV c0kv2 = c0kv;
                            UserSession userSession3 = userSession;
                            IntentFilter intentFilter = C26141Ov.A0W;
                            return (RealtimeClientManager.Observer) c0kv2.AXR(userSession3);
                        }
                    });
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = A0U.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((InterfaceC29421bJ) ((C0KV) it3.next()).AXR(userSession));
                }
                Looper A02 = ((C4HD) userSession.A01(C4HC.class, C4HE.A00)).A02();
                C13920nI c13920nI = C13920nI.A00;
                c26141Ov = new C26141Ov(context, A02, userSession, c13920nI, c119885bm, new C120185cH(c13920nI, c119885bm, new Object(), new Object(), AbstractC28761aE.A00(userSession)), arrayList, arrayList2, arrayList3, new InterfaceC08830cm() { // from class: X.5cJ
                    @Override // X.InterfaceC08830cm
                    public final /* bridge */ /* synthetic */ Object get() {
                        return AbstractC28761aE.A00(UserSession.this);
                    }
                }, A0Q, A0R, new InterfaceC08830cm() { // from class: X.5cK
                    @Override // X.InterfaceC08830cm
                    public final /* bridge */ /* synthetic */ Object get() {
                        return Boolean.valueOf(AbstractC15820qc.A0E(context));
                    }
                });
                userSession.A04(C26141Ov.class, c26141Ov);
                C11T.A02(new Runnable() { // from class: X.5cR
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageQueue myQueue = Looper.myQueue();
                        C26141Ov c26141Ov2 = C26141Ov.this;
                        IntentFilter intentFilter = C26141Ov.A0W;
                        myQueue.addIdleHandler(c26141Ov2.A06);
                    }
                });
            }
        }
        return c26141Ov;
    }

    public static synchronized void A02(C25991Og c25991Og) {
        synchronized (C26141Ov.class) {
            AbstractC26151Ow.A00.A03(c25991Og.A00, c25991Og.A02);
            A0X.add(c25991Og);
        }
    }

    public static void A04(C26141Ov c26141Ov) {
        Intent A00;
        if (C18U.A06(C06090Tz.A05, c26141Ov.A08, 36328993758592950L)) {
            if (!c26141Ov.A0O) {
                C14120nc.A00().ATO(new C44123Jen(c26141Ov));
            }
        } else {
            if (c26141Ov.A01) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            Context context = c26141Ov.A03;
            BroadcastReceiver broadcastReceiver = c26141Ov.A02;
            IntentFilter intentFilter = A0W;
            if (i >= 33) {
                A00 = context.registerReceiver(broadcastReceiver, intentFilter, 2);
            } else {
                A00 = C0DJ.A00(broadcastReceiver, context, intentFilter);
            }
            if (A00 == null) {
                z = false;
            }
            c26141Ov.A01 = z;
        }
    }

    public static void A05(C26141Ov c26141Ov, C1OW c1ow, MNP mnp) {
        InterfaceC29421bJ interfaceC29421bJ;
        Iterator it = c26141Ov.A0E.iterator();
        while (it.hasNext()) {
            ((InterfaceC452826l) it.next()).D1t(c1ow);
        }
        List list = c26141Ov.A0F;
        C119885bm c119885bm = c26141Ov.A09;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC29421bJ) it2.next()).DUr(c1ow, mnp);
        }
        InterfaceC09390do interfaceC09390do = c119885bm.A01(c1ow.A02()).A06;
        if (interfaceC09390do != null && (interfaceC29421bJ = (InterfaceC29421bJ) interfaceC09390do.getValue()) != null) {
            interfaceC29421bJ.DUr(c1ow, mnp);
        }
    }

    public static void A06(C26141Ov c26141Ov, C1OW c1ow, MNP mnp, boolean z) {
        String str;
        C119885bm c119885bm = c26141Ov.A09;
        boolean CfR = ((InterfaceC29301b7) c119885bm.A01(c1ow.A02()).A04.getValue()).CfR(c1ow, mnp);
        if (CfR) {
            C120185cH c120185cH = c26141Ov.A0A;
            synchronized (c120185cH) {
                str = c120185cH.A02(c1ow, mnp);
            }
        } else {
            str = null;
        }
        for (InterfaceC452826l interfaceC452826l : c26141Ov.A0E) {
            if (z) {
                interfaceC452826l.DB9(c1ow, CfR);
            }
            interfaceC452826l.DB8(c1ow, str, CfR);
        }
        if (CfR) {
            AbstractC43668JTc.A01(c119885bm, c1ow, mnp, c26141Ov.A0F);
        }
        if (C18U.A01(C06090Tz.A05, c26141Ov.A08, 36603991925003268L) > 0) {
            if (!CfR || !((C2DU) ((C2DS) c26141Ov.A0L.get())).A0H.A0F) {
                return;
            }
        } else if (!CfR || z) {
            return;
        }
        C11T.A02(c26141Ov.A0C);
    }

    public static void A07(C26141Ov c26141Ov, String str, long j) {
        C1OW c1ow;
        if (!((Boolean) c26141Ov.A0I.get()).booleanValue() || ((Boolean) c26141Ov.A0J.get()).booleanValue()) {
            c26141Ov.A0N = true;
            Iterator it = c26141Ov.A0D.iterator();
            while (it.hasNext()) {
                C452726k.A00((C452726k) it.next(), new AnonymousClass270(null, null, null, null, null, Long.valueOf(j), "schedule", str, null));
            }
            if ("dispatch".equals(str) && (c1ow = c26141Ov.A0P) != null) {
                IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(c26141Ov.A08, c1ow.A05.hashCode());
                if (A00 != null) {
                    C1EM.A00(null, c1ow, c26141Ov.A0H);
                    A00.onLogFirstMutationSystemDispatchStart();
                }
            }
            Handler handler = c26141Ov.A05;
            handler.sendMessageDelayed(handler.obtainMessage(1), j);
        }
    }

    public final C1OW A08(String str, String str2, String str3) {
        Pair A01;
        if (str == null) {
            return null;
        }
        List list = this.A0E;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC452826l) it.next()).Da4(str, str2, str3);
        }
        C120185cH c120185cH = this.A0A;
        synchronized (c120185cH) {
            A01 = c120185cH.A01(str);
        }
        if (A01 == null) {
            return null;
        }
        C1OW c1ow = (C1OW) A01.first;
        MNP mnp = (MNP) A01.second;
        if (((JTV) mnp).A02.equals("uploaded")) {
            return null;
        }
        JTU A012 = JTU.A01(mnp);
        A012.A04("uploaded");
        JTV jtv = new JTV(A012);
        JTY.A00(c1ow, jtv);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC452826l) it2.next()).D6x(c1ow);
        }
        AbstractC43668JTc.A00(this.A09, c1ow, mnp, jtv, this.A0F);
        C11T.A02(new RunnableC43682JTr(this));
        return (C1OW) A01.first;
    }

    public final void A0C(String str) {
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            C452726k.A00((C452726k) it.next(), new AnonymousClass270(null, null, null, null, null, null, "cancel", str, null));
        }
        C1OW c1ow = (C1OW) this.A0H.get();
        if (c1ow != null) {
            IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A08, c1ow.A05.hashCode());
            if (A00 != null) {
                A00.onLogCancelSendMutations(str);
            }
        }
        this.A0N = false;
        this.A05.removeMessages(1);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C11T.A02(new M1N(this));
    }

    public C26141Ov(Context context, Looper looper, UserSession userSession, C13920nI c13920nI, C119885bm c119885bm, C120185cH c120185cH, List list, List list2, List list3, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4) {
        this.A03 = context;
        this.A08 = userSession;
        this.A0M = c13920nI;
        this.A09 = c119885bm;
        this.A0A = c120185cH;
        this.A0L = interfaceC08830cm;
        this.A0D = list;
        this.A0E = list2;
        this.A0F = list3;
        this.A0I = interfaceC08830cm2;
        this.A0K = interfaceC08830cm3;
        this.A0J = interfaceC08830cm4;
        this.A05 = new HandlerC25861Nt(looper, new Handler.Callback() { // from class: X.5cQ
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                String A02;
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        C26141Ov c26141Ov = C26141Ov.this;
                        IntentFilter intentFilter = C26141Ov.A0W;
                        C120185cH c120185cH2 = c26141Ov.A0A;
                        synchronized (c120185cH2) {
                            c120185cH2.A03.clear();
                        }
                        return true;
                    }
                    throw new IllegalStateException(AnonymousClass001.A0c("Message with what = ", AbstractC43591JPw.A00(55), i));
                }
                C26141Ov c26141Ov2 = C26141Ov.this;
                IntentFilter intentFilter2 = C26141Ov.A0W;
                C1OW c1ow = (C1OW) c26141Ov2.A0H.getAndSet(null);
                if (c1ow != null) {
                    IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(c26141Ov2.A08, c1ow.A05.hashCode());
                    if (A00 != null) {
                        A00.onLogFirstMutationSystemDispatchEnd(c26141Ov2.A0N);
                    }
                }
                while (c26141Ov2.A0N) {
                    c26141Ov2.A0N = false;
                    Pair A002 = C26141Ov.A00(c26141Ov2);
                    C2DS c2ds = (C2DS) c26141Ov2.A0L.get();
                    if (A002 == null) {
                        A02 = "null";
                    } else {
                        A02 = ((C1OW) A002.first).A02();
                    }
                    c2ds.CoS(AnonymousClass001.A0R("HandleSendNextMutation-", A02));
                    while (A002 != null) {
                        C1OW c1ow2 = (C1OW) A002.first;
                        int hashCode = c1ow2.A05.hashCode();
                        UserSession userSession2 = c26141Ov2.A08;
                        IGFOAMessagingSendToSentLogger A003 = C163307Sp.A00(userSession2, hashCode);
                        if (A003 != null) {
                            A003.onLogSendMutationStart();
                        }
                        AbstractC09800fd.A01(AnonymousClass001.A0R("SendMutation-", c1ow2.A02()), -379606193);
                        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                        AbstractC46491Khp.A00 = awakeTimeSinceBootClock.now();
                        AbstractC46491Khp.A03 = c1ow2.A02();
                        JTU A01 = JTU.A01((MNP) A002.second);
                        A01.A04("executing");
                        JTV jtv = new JTV(A01);
                        C120185cH c120185cH3 = c26141Ov2.A0A;
                        synchronized (c120185cH3) {
                            c120185cH3.A03(c1ow2, jtv);
                            c26141Ov2.A0G.incrementAndGet();
                        }
                        C19260xA c19260xA = new C19260xA();
                        ((InterfaceC29301b7) c26141Ov2.A09.A01(c1ow2.A02()).A04.getValue()).ENr(c19260xA, new C43670JTe(userSession2, c26141Ov2, c1ow2, jtv), c1ow2);
                        long now = awakeTimeSinceBootClock.now();
                        AbstractC46491Khp.A02 = AbstractC46491Khp.A00;
                        AbstractC46491Khp.A01 = now;
                        AbstractC46491Khp.A04 = AbstractC46491Khp.A03;
                        AbstractC46491Khp.A00 = 0L;
                        AbstractC46491Khp.A03 = null;
                        if (A003 != null) {
                            A003.onLogSendMutationEnd();
                            A003.onLogExecuteMutationStart();
                        }
                        for (InterfaceC452826l interfaceC452826l : c26141Ov2.A0E) {
                            boolean z = false;
                            if (jtv.A00 > 0) {
                                z = true;
                            }
                            interfaceC452826l.DUo(c19260xA, c1ow2, z);
                        }
                        if (A003 != null) {
                            A003.onLogExecuteMutationEnd();
                        }
                        A002 = C26141Ov.A00(c26141Ov2);
                        AbstractC09800fd.A00(-1339394569);
                    }
                    if (c26141Ov2.A0G.get() == 0) {
                        C11T.A02(c26141Ov2.A0B);
                    }
                }
                return true;
            }
        });
    }
}
