package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class T5Z implements InterfaceC65587TnR {
    public Bundle A01;
    public final Context A05;
    public final InterfaceC1340663q A06;
    public final C60650RGb A07;
    public final C64225T5a A08;
    public final C64225T5a A09;
    public final Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final java.util.Set A0D = Collections.newSetFromMap(new WeakHashMap());
    public ConnectionResult A02 = null;
    public ConnectionResult A03 = null;
    public boolean A04 = false;
    public int A00 = 0;

    @Override // X.InterfaceC65587TnR
    public final void FFC() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.FFC();
        this.A09.FFC();
    }

    @Override // X.InterfaceC65587TnR
    public final void FFD() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.FFD();
        this.A09.FFD();
        A00();
    }

    private final void A00() {
        java.util.Set set = this.A0D;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C58777Q8k) ((InterfaceC65249Tgf) it.next())).A00.release();
        }
        set.clear();
    }

    private final void A01(ConnectionResult connectionResult) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                android.util.Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.FEw(connectionResult);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(T5Z t5z) {
        ConnectionResult connectionResult = t5z.A02;
        if (connectionResult != null) {
            int i = connectionResult.A01;
            ConnectionResult connectionResult2 = t5z.A03;
            if (i == 0) {
                if (connectionResult2 != null) {
                    int i2 = connectionResult2.A01;
                    if (!AbstractC167007dF.A1N(i2) && i2 != 4) {
                        if (t5z.A00 == 1) {
                            t5z.A00();
                            return;
                        } else {
                            t5z.A01(connectionResult2);
                            t5z.A08.FFD();
                            return;
                        }
                    }
                    int i3 = t5z.A00;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            android.util.Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", AbstractC58318PtA.A0V());
                            t5z.A00 = 0;
                            return;
                        } else {
                            C60650RGb c60650RGb = t5z.A07;
                            C3U5.A02(c60650RGb);
                            c60650RGb.FEz(t5z.A01);
                        }
                    }
                    t5z.A00();
                    t5z.A00 = 0;
                    return;
                }
                return;
            }
            if (connectionResult2 == null) {
                return;
            }
            if (connectionResult2.A01 == 0) {
                t5z.A09.FFD();
                connectionResult = t5z.A02;
                C3U5.A02(connectionResult);
            } else {
                if (t5z.A09.A00 < t5z.A08.A00) {
                    connectionResult = connectionResult2;
                }
            }
            t5z.A01(connectionResult);
        }
    }

    @Override // X.InterfaceC65587TnR
    public final AbstractC60658RGk FF4(AbstractC60658RGk abstractC60658RGk) {
        PendingIntent activity;
        Object obj = this.A0A.get(abstractC60658RGk.A00);
        C3U5.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C64225T5a c64225T5a = this.A09;
        if (obj.equals(c64225T5a)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                InterfaceC1340663q interfaceC1340663q = this.A06;
                if (interfaceC1340663q == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), interfaceC1340663q.BxD(), S7E.A00 | 134217728);
                }
                abstractC60658RGk.A0A(new Status(activity, null, null, 4));
                return abstractC60658RGk;
            }
        } else {
            c64225T5a = this.A08;
        }
        c64225T5a.FF4(abstractC60658RGk);
        return abstractC60658RGk;
    }

    @Override // X.InterfaceC65587TnR
    public final AbstractC60658RGk FF7(AbstractC60658RGk abstractC60658RGk) {
        PendingIntent activity;
        Object obj = this.A0A.get(abstractC60658RGk.A00);
        C3U5.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C64225T5a c64225T5a = this.A09;
        if (obj.equals(c64225T5a)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                InterfaceC1340663q interfaceC1340663q = this.A06;
                if (interfaceC1340663q == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), interfaceC1340663q.BxD(), S7E.A00 | 134217728);
                }
                abstractC60658RGk.A0A(new Status(activity, null, null, 4));
                return abstractC60658RGk;
            }
        } else {
            c64225T5a = this.A08;
        }
        return c64225T5a.FF7(abstractC60658RGk);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC65587TnR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FFF() {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r3 = r4.A0B
            r3.lock()
            r3.lock()     // Catch: java.lang.Throwable -> L3d
            int r1 = r4.A00     // Catch: java.lang.Throwable -> L38
            r0 = 2
            boolean r2 = X.AbstractC167007dF.A1P(r1, r0)
            r3.unlock()     // Catch: java.lang.Throwable -> L3d
            X.T5a r0 = r4.A09     // Catch: java.lang.Throwable -> L3d
            r0.FFD()     // Catch: java.lang.Throwable -> L3d
            r1 = 4
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            r4.A03 = r0     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L31
            android.os.Looper r0 = r4.A0C     // Catch: java.lang.Throwable -> L3d
            X.61q r1 = new X.61q     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            X.TLN r0 = new X.TLN     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r1.post(r0)     // Catch: java.lang.Throwable -> L3d
            goto L34
        L31:
            r4.A00()     // Catch: java.lang.Throwable -> L3d
        L34:
            r3.unlock()
            return
        L38:
            r0 = move-exception
            r3.unlock()     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5Z.FFF():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r5.A00 == 1) goto L14;
     */
    @Override // X.InterfaceC65587TnR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FFG() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0B
            r4.lock()
            X.T5a r0 = r5.A08     // Catch: java.lang.Throwable -> L2a
            X.TnQ r0 = r0.A0E     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0 instanceof X.T5U     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L26
            X.T5a r0 = r5.A09     // Catch: java.lang.Throwable -> L2a
            X.TnQ r0 = r0.A0E     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r0 instanceof X.T5U     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L25
            com.google.android.gms.common.ConnectionResult r0 = r5.A03     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L21
            int r1 = r0.A01     // Catch: java.lang.Throwable -> L2a
            r0 = 4
            if (r1 != r0) goto L21
            goto L25
        L21:
            int r0 = r5.A00     // Catch: java.lang.Throwable -> L2a
            if (r0 != r2) goto L26
        L25:
            r3 = 1
        L26:
            r4.unlock()
            return r3
        L2a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5Z.FFG():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC65587TnR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean FFH(X.InterfaceC65249Tgf r5) {
        /*
            r4 = this;
            java.util.concurrent.locks.Lock r3 = r4.A0B
            r3.lock()
            r3.lock()     // Catch: java.lang.Throwable -> L3f
            int r1 = r4.A00     // Catch: java.lang.Throwable -> L3a
            r0 = 2
            boolean r0 = X.AbstractC167007dF.A1P(r1, r0)
            r3.unlock()     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            if (r0 != 0) goto L1b
            boolean r0 = r4.FFG()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L35
        L1b:
            X.T5a r1 = r4.A09     // Catch: java.lang.Throwable -> L3f
            X.TnQ r0 = r1.A0E     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r0 instanceof X.T5U     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L35
            java.util.Set r0 = r4.A0D     // Catch: java.lang.Throwable -> L3f
            r0.add(r5)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L2e
            r4.A00 = r2     // Catch: java.lang.Throwable -> L3f
        L2e:
            r0 = 0
            r4.A03 = r0     // Catch: java.lang.Throwable -> L3f
            r1.FFC()     // Catch: java.lang.Throwable -> L3f
            goto L36
        L35:
            r2 = 0
        L36:
            r3.unlock()
            return r2
        L3a:
            r0 = move-exception
            r3.unlock()     // Catch: java.lang.Throwable -> L3f
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5Z.FFH(X.Tgf):boolean");
    }

    @Override // X.InterfaceC65587TnR
    public final void FFE(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.A09.FFE(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.A08.FFE(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.01p, java.util.Map] */
    public T5Z(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, C61U c61u, InterfaceC1340663q interfaceC1340663q, C60650RGb c60650RGb, C1340363l c1340363l, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        this.A05 = context;
        this.A07 = c60650RGb;
        this.A0B = lock;
        this.A0C = looper;
        this.A06 = interfaceC1340663q;
        this.A08 = new C64225T5a(context, looper, googleApiAvailabilityLight, null, c60650RGb, new T5X(this), null, arrayList2, map2, map4, lock);
        this.A09 = new C64225T5a(context, looper, googleApiAvailabilityLight, c61u, c60650RGb, new T5Y(this), c1340363l, arrayList, map, map3, lock);
        ?? c005001p = new C005001p(0);
        Iterator A12 = AbstractC43593JPy.A12(map2);
        while (A12.hasNext()) {
            c005001p.put(A12.next(), this.A08);
        }
        Iterator A122 = AbstractC43593JPy.A12(map);
        while (A122.hasNext()) {
            c005001p.put(A122.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(c005001p);
    }
}
