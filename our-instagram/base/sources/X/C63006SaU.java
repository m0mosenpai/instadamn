package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SaU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63006SaU {
    public final Context A01;
    public final Handler A02;
    public final C62670SLh A03;
    public final AbstractC64515THi A08;
    public final C63127SdX A09;
    public final RealtimeSinceBootClock A0A;
    public final java.util.Set A04 = AbstractC166987dD.A1H();
    public final AtomicLong A06 = AbstractC58318PtA.A15(0);
    public final AtomicLong A0B = AbstractC58318PtA.A15(-1);
    public final AtomicLong A07 = AbstractC58318PtA.A15(-1);
    public final AtomicLong A05 = AbstractC58318PtA.A15(0);
    public final BroadcastReceiver A00 = new Q1k(this, 7);

    public static synchronized void A00(NetworkInfo networkInfo, C63006SaU c63006SaU) {
        AtomicLong atomicLong;
        synchronized (c63006SaU) {
            long j = -1;
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    AtomicLong atomicLong2 = c63006SaU.A06;
                    if (atomicLong2.compareAndSet(0L, SystemClock.elapsedRealtime())) {
                        AtomicLong atomicLong3 = c63006SaU.A0B;
                        if (atomicLong3.get() != -1) {
                            atomicLong = c63006SaU.A07;
                            j = atomicLong2.get() - atomicLong3.get();
                            atomicLong.set(j);
                        }
                    }
                }
            }
            AtomicLong atomicLong4 = c63006SaU.A0B;
            atomicLong4.set(SystemClock.elapsedRealtime());
            long andSet = c63006SaU.A06.getAndSet(0L);
            if (andSet != 0) {
                c63006SaU.A05.addAndGet(atomicLong4.get() - andSet);
            }
            atomicLong = c63006SaU.A07;
            atomicLong.set(j);
        }
    }

    public final NetworkInfo A01() {
        boolean z;
        AbstractC64515THi abstractC64515THi = this.A08;
        if (abstractC64515THi instanceof C60546R6j) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ConnectivityManager connectivityManager = (ConnectivityManager) abstractC64515THi.A01();
            NetworkInfo networkInfo = null;
            if (connectivityManager == null) {
                return null;
            }
            try {
                networkInfo = connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
                return networkInfo;
            } catch (Throwable th) {
                C0K8.A0F("NetworkProvider", "Exception in getNetworkInfo", th);
                return networkInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r1 == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SMD A03() {
        /*
            r8 = this;
            X.THi r1 = r8.A08
            boolean r0 = r1 instanceof X.C60546R6j
            if (r0 == 0) goto L16
            r0 = 0
        L7:
            X.SdX r7 = r8.A09
            if (r0 != 0) goto L1d
            java.lang.Integer r4 = X.C05F.A01
            r3 = 0
            r1 = -1
            r0 = 0
            X.SMD r2 = new X.SMD
            r2.<init>(r4, r0, r1, r3)
            return r2
        L16:
            java.lang.Object r0 = r1.A01()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            goto L7
        L1d:
            java.lang.Integer r4 = X.C05F.A00
            r3 = 0
            android.net.Network r6 = r0.getActiveNetwork()     // Catch: java.lang.Throwable -> L75
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r6)     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L2f
            X.SMD r2 = X.C63127SdX.A00(r0)     // Catch: java.lang.Throwable -> L75
            return r2
        L2f:
            r5 = 1
            boolean r1 = r2.hasTransport(r5)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L39
            java.lang.Integer r4 = X.C05F.A0C     // Catch: java.lang.Throwable -> L75
            goto L6e
        L39:
            boolean r1 = r2.hasTransport(r3)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L6e
            android.content.Context r2 = r7.A00     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L75
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L54
            java.lang.Integer r1 = X.C05F.A15     // Catch: java.lang.Throwable -> L75
            r0 = 0
            X.SMD r2 = new X.SMD     // Catch: java.lang.Throwable -> L75
            r2.<init>(r1, r0, r3, r5)     // Catch: java.lang.Throwable -> L75
            return r2
        L54:
            int r1 = r1.getDataNetworkType()     // Catch: java.lang.SecurityException -> L5a java.lang.Throwable -> L75
            if (r1 != 0) goto L69
        L5a:
            android.net.NetworkInfo r1 = r0.getNetworkInfo(r6)     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L65
            X.SMD r2 = X.C63127SdX.A00(r0)     // Catch: java.lang.Throwable -> L75
            return r2
        L65:
            int r1 = r1.getSubtype()     // Catch: java.lang.Throwable -> L75
        L69:
            java.lang.Integer r4 = X.C63127SdX.A01(r1)     // Catch: java.lang.Throwable -> L75
            r3 = r1
        L6e:
            r0 = 0
            X.SMD r2 = new X.SMD
            r2.<init>(r4, r0, r3, r5)
            return r2
        L75:
            r1 = move-exception
            r0 = -1
            X.SMD r2 = new X.SMD
            r2.<init>(r4, r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63006SaU.A03():X.SMD");
    }

    public C63006SaU(Context context, Handler handler, C63127SdX c63127SdX, RealtimeSinceBootClock realtimeSinceBootClock, C62670SLh c62670SLh) {
        this.A03 = c62670SLh;
        this.A08 = c62670SLh.A00(ConnectivityManager.class, "connectivity");
        this.A01 = context;
        this.A0A = realtimeSinceBootClock;
        this.A02 = handler;
        this.A09 = c63127SdX;
        A00(A01(), this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C0DJ.A01(this.A00, this.A01, intentFilter, this.A02);
    }

    public final NetworkInfo A02() {
        NetworkInfo A01 = A01();
        if (A01 == null || !A01.isConnected()) {
            return null;
        }
        return A01;
    }
}
