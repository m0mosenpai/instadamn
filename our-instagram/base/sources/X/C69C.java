package X;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.69C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69C implements C69D, C69E, C69G {
    public boolean A02;
    public final int A03;
    public final InterfaceC1340663q A04;
    public final C61c A05;
    public final AnonymousClass643 A06;
    public final zact A0A;
    public final /* synthetic */ C1335961f A0C;
    public final Queue A09 = new LinkedList();
    public final java.util.Set A0B = new HashSet();
    public final Map A08 = new HashMap();
    public final List A07 = new ArrayList();
    public ConnectionResult A01 = null;
    public int A00 = 0;

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        A0C(connectionResult, null);
    }

    @Override // X.C69D
    public final void FEx(ConnectionResult connectionResult, C61W c61w, boolean z) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C69C(C61Q c61q, C1335961f c1335961f) {
        this.A0C = c1335961f;
        Handler handler = c1335961f.A06;
        Looper looper = handler.getLooper();
        C69I c69i = C69I.A00;
        java.util.Set emptySet = Collections.emptySet();
        C012504o c012504o = new C012504o(0);
        c012504o.addAll(emptySet);
        Context context = c61q.A01;
        String name = context.getClass().getName();
        C1340363l c1340363l = new C1340363l(c69i, context.getPackageName(), name, null, c012504o);
        C61U c61u = c61q.A04.A00;
        C3U5.A02(c61u);
        InterfaceC1340663q A00 = c61u.A00(context, looper, this, this, c1340363l, c61q.A03);
        String str = c61q.A08;
        if (str != null && (A00 instanceof BaseGmsClient)) {
            ((BaseGmsClient) A00).A0R = str;
        }
        this.A04 = A00;
        this.A05 = c61q.A06;
        this.A06 = new AnonymousClass643();
        this.A03 = c61q.A00;
        if (A00.requiresSignIn()) {
            Context context2 = c1335961f.A05;
            java.util.Set emptySet2 = Collections.emptySet();
            C012504o c012504o2 = new C012504o(0);
            c012504o2.addAll(emptySet2);
            this.A0A = new zact(context2, handler, new C1340363l(c69i, context.getPackageName(), name, null, c012504o2));
            return;
        }
        this.A0A = null;
    }

    private final void A00(ConnectionResult connectionResult) {
        java.util.Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (SSI.A01(connectionResult, ConnectionResult.A04)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) this.A04;
                if (!baseGmsClient.isConnected() || baseGmsClient.A09 == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw new NullPointerException("zac");
        }
        set.clear();
    }

    public static final void A01(Status status, C69C c69c) {
        C3U5.A01(c69c.A0C.A06);
        c69c.A02(status, null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        C3U5.A01(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                SPV spv = (SPV) it.next();
                if (!z || spv.A00 == 2) {
                    if (status != null) {
                        spv.A00(status);
                    } else {
                        spv.A03(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public static final void A03(C69C c69c) {
        Queue queue = c69c.A09;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SPV spv = (SPV) arrayList.get(i);
            if (c69c.A04.isConnected()) {
                if (c69c.A08(spv)) {
                    queue.remove(spv);
                }
            } else {
                return;
            }
        }
    }

    public static final void A04(C69C c69c) {
        Handler handler = c69c.A0C.A06;
        C3U5.A01(handler);
        c69c.A01 = null;
        c69c.A00(ConnectionResult.A04);
        if (c69c.A02) {
            C61c c61c = c69c.A05;
            handler.removeMessages(11, c61c);
            handler.removeMessages(9, c61c);
            c69c.A02 = false;
        }
        Iterator it = c69c.A08.values().iterator();
        while (it.hasNext()) {
            SGN sgn = ((SGM) it.next()).A00;
            try {
                sgn.A02.A01.accept(c69c.A04, new C58411Pup());
            } catch (DeadObjectException unused) {
                c69c.D7H(3);
                c69c.A04.APc("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        A03(c69c);
        A05(c69c);
    }

    public static final void A05(C69C c69c) {
        C61c c61c = c69c.A05;
        C1335961f c1335961f = c69c.A0C;
        Handler handler = c1335961f.A06;
        handler.removeMessages(12, c61c);
        handler.sendMessageDelayed(handler.obtainMessage(12, c61c), c1335961f.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b A[LOOP:0: B:8:0x0065->B:10:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C69C r7, int r8) {
        /*
            X.61f r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.C3U5.A01(r4)
            r0 = 0
            r7.A01 = r0
            r6 = 1
            r7.A02 = r6
            X.63q r0 = r7.A04
            com.google.android.gms.common.internal.BaseGmsClient r0 = (com.google.android.gms.common.internal.BaseGmsClient) r0
            java.lang.String r2 = r0.A0S
            X.643 r3 = r7.A06
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r8 != r6) goto L77
            java.lang.String r0 = " due to service disconnection."
        L20:
            r1.append(r0)
        L23:
            if (r2 == 0) goto L2d
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L2d:
            java.lang.String r2 = r1.toString()
            r1 = 20
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r1, r2)
            X.AnonymousClass643.A00(r0, r3, r6)
            X.61c r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.61r r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L65:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r1.next()
            X.SGM r0 = (X.SGM) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L65
        L77:
            r0 = 3
            if (r8 != r0) goto L23
            java.lang.String r0 = " due to dead object exception."
            goto L20
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69C.A06(X.69C, int):void");
    }

    private final boolean A07(ConnectionResult connectionResult) {
        synchronized (C1335961f.A0I) {
            C1335961f c1335961f = this.A0C;
            if (c1335961f.A01 != null && c1335961f.A0A.contains(this.A05)) {
                c1335961f.A01.A0B(connectionResult, this.A03);
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.01p, java.util.Map] */
    private final boolean A08(SPV spv) {
        AbstractC60671RGz abstractC60671RGz;
        Feature[] A05;
        int length;
        Feature[] featureArr;
        if ((spv instanceof AbstractC60671RGz) && (A05 = (abstractC60671RGz = (AbstractC60671RGz) spv).A05(this)) != null && (length = A05.length) != 0) {
            Object obj = this.A04;
            zzk zzkVar = ((BaseGmsClient) obj).A0Q;
            if (zzkVar == null) {
                featureArr = null;
            } else {
                featureArr = zzkVar.A03;
            }
            int i = 0;
            if (featureArr == null) {
                featureArr = new Feature[0];
            }
            ?? c005001p = new C005001p(featureArr.length);
            for (Feature feature : featureArr) {
                c005001p.put(feature.A00, Long.valueOf(feature.A00()));
            }
            do {
                Feature feature2 = A05[i];
                Number number = (Number) c005001p.get(feature2.A00);
                if (number != null && number.longValue() >= feature2.A00()) {
                    i++;
                } else {
                    String name = obj.getClass().getName();
                    String str = feature2.A00;
                    long A00 = feature2.A00();
                    StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append(" could not execute call because it requires feature (");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(A00);
                    sb.append(").");
                    android.util.Log.w("GoogleApiManager", sb.toString());
                    C1335961f c1335961f = this.A0C;
                    if (c1335961f.A0E && abstractC60671RGz.A04(this)) {
                        SOh sOh = new SOh(feature2, this.A05);
                        List list = this.A07;
                        int indexOf = list.indexOf(sOh);
                        if (indexOf >= 0) {
                            Object obj2 = list.get(indexOf);
                            Handler handler = c1335961f.A06;
                            handler.removeMessages(15, obj2);
                            handler.sendMessageDelayed(Message.obtain(handler, 15, obj2), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            return false;
                        }
                        list.add(sOh);
                        Handler handler2 = c1335961f.A06;
                        handler2.sendMessageDelayed(Message.obtain(handler2, 15, sOh), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        handler2.sendMessageDelayed(Message.obtain(handler2, 16, sOh), 120000L);
                        ConnectionResult connectionResult = new ConnectionResult(2, null);
                        if (A07(connectionResult)) {
                            return false;
                        }
                        c1335961f.A09(connectionResult, this.A03);
                        return false;
                    }
                    abstractC60671RGz.A03(new C64878TYe(feature2));
                    return true;
                }
            } while (i < length);
        }
        AnonymousClass643 anonymousClass643 = this.A06;
        InterfaceC1340663q interfaceC1340663q = this.A04;
        spv.A01(anonymousClass643, interfaceC1340663q.requiresSignIn());
        try {
            spv.A02(this);
            return true;
        } catch (DeadObjectException unused) {
            D7H(1);
            interfaceC1340663q.APc("DeadObjectException thrown while running ApiCallRunner.");
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.Tqr, X.63q] */
    public final void A09() {
        int i;
        C1335961f c1335961f = this.A0C;
        C3U5.A01(c1335961f.A06);
        InterfaceC1340663q interfaceC1340663q = this.A04;
        if (!interfaceC1340663q.isConnected() && !interfaceC1340663q.CRe()) {
            try {
                int A00 = c1335961f.A08.A00(c1335961f.A05, interfaceC1340663q);
                if (A00 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(A00, null);
                    android.util.Log.w("GoogleApiManager", AnonymousClass001.A0u("The service for ", interfaceC1340663q.getClass().getName(), " is not available: ", connectionResult.toString()));
                    A0C(connectionResult, null);
                    return;
                }
                AnonymousClass649 anonymousClass649 = new AnonymousClass649(interfaceC1340663q, this.A05, c1335961f);
                if (interfaceC1340663q.requiresSignIn()) {
                    zact zactVar = this.A0A;
                    C3U5.A02(zactVar);
                    int A03 = C0f9.A03(-32086994);
                    InterfaceC65661Tqr interfaceC65661Tqr = zactVar.A01;
                    if (interfaceC65661Tqr != null) {
                        interfaceC65661Tqr.disconnect();
                    }
                    C1340363l c1340363l = zactVar.A05;
                    c1340363l.A00 = Integer.valueOf(System.identityHashCode(zactVar));
                    C61U c61u = zactVar.A04;
                    Context context = zactVar.A02;
                    Handler handler = zactVar.A03;
                    zactVar.A01 = c61u.A00(context, handler.getLooper(), zactVar, zactVar, c1340363l, c1340363l.A01);
                    zactVar.A00 = anonymousClass649;
                    java.util.Set set = zactVar.A06;
                    if (set != null && !set.isEmpty()) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) zactVar.A01;
                        baseGmsClient.AJQ(new C64226T5b(baseGmsClient));
                        i = -1918310273;
                    } else {
                        handler.post(new TLM(zactVar));
                        i = 741814066;
                    }
                    C0f9.A0A(i, A03);
                }
                try {
                    interfaceC1340663q.AJQ(anonymousClass649);
                } catch (SecurityException e) {
                    A0C(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                A0C(new ConnectionResult(10), e2);
            }
        }
    }

    public final void A0A() {
        C3U5.A01(this.A0C.A06);
        Status status = C1335961f.A0G;
        A01(status, this);
        AnonymousClass643.A00(status, this.A06, false);
        for (SNO sno : (SNO[]) this.A08.keySet().toArray(new SNO[0])) {
            A0D(new C60668RGw(sno, new C58411Pup()));
        }
        A00(new ConnectionResult(4));
        if (this.A04.isConnected()) {
            C62439SBs c62439SBs = new C62439SBs(this);
            c62439SBs.A00.A0C.A06.post(new TLL(c62439SBs));
        }
    }

    public final void A0B(ConnectionResult connectionResult) {
        C3U5.A01(this.A0C.A06);
        InterfaceC1340663q interfaceC1340663q = this.A04;
        interfaceC1340663q.APc(AnonymousClass001.A0u("onSignInFailed for ", interfaceC1340663q.getClass().getName(), " with ", String.valueOf(connectionResult)));
        A0C(connectionResult, null);
    }

    public final void A0C(ConnectionResult connectionResult, Exception exc) {
        Status A00;
        int i;
        C1335961f c1335961f = this.A0C;
        Handler handler = c1335961f.A06;
        C3U5.A01(handler);
        zact zactVar = this.A0A;
        if (zactVar != null) {
            int A03 = C0f9.A03(1292349397);
            InterfaceC65661Tqr interfaceC65661Tqr = zactVar.A01;
            if (interfaceC65661Tqr != null) {
                interfaceC65661Tqr.disconnect();
                i = -762160796;
            } else {
                i = 1129041158;
            }
            C0f9.A0A(i, A03);
        }
        C3U5.A01(handler);
        this.A01 = null;
        c1335961f.A08.A01.clear();
        A00(connectionResult);
        if ((this.A04 instanceof RHE) && connectionResult.A01 != 24) {
            c1335961f.A03 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i2 = connectionResult.A01;
        if (i2 == 4) {
            A00 = C1335961f.A0H;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = connectionResult;
                return;
            }
            if (exc != null) {
                C3U5.A01(handler);
                A02(null, exc, false);
                return;
            }
            boolean z = c1335961f.A0E;
            C61c c61c = this.A05;
            if (z) {
                A02(C1335961f.A00(connectionResult, c61c), null, true);
                if (queue.isEmpty() || A07(connectionResult) || c1335961f.A09(connectionResult, this.A03)) {
                    return;
                }
                if (i2 == 18) {
                    this.A02 = true;
                }
                if (this.A02) {
                    handler.sendMessageDelayed(Message.obtain(handler, 9, c61c), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    return;
                }
            }
            A00 = C1335961f.A00(connectionResult, c61c);
        }
        A01(A00, this);
    }

    public final void A0D(SPV spv) {
        C3U5.A01(this.A0C.A06);
        if (this.A04.isConnected()) {
            if (A08(spv)) {
                A05(this);
                return;
            } else {
                this.A09.add(spv);
                return;
            }
        }
        this.A09.add(spv);
        ConnectionResult connectionResult = this.A01;
        if (connectionResult != null && connectionResult.A01 != 0 && connectionResult.A02 != null) {
            A0C(connectionResult, null);
        } else {
            A09();
        }
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        C1335961f c1335961f = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = c1335961f.A06;
        if (myLooper == handler.getLooper()) {
            A04(this);
        } else {
            handler.post(new TLK(this));
        }
    }

    @Override // X.C69F
    public final void D7H(int i) {
        C1335961f c1335961f = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = c1335961f.A06;
        if (myLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new TOW(this, i));
        }
    }
}
