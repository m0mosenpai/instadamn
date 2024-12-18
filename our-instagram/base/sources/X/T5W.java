package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class T5W implements InterfaceC65586TnQ {
    public IAccountAccessor A00;
    public InterfaceC65661Tqr A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A09;
    public ConnectionResult A0A;
    public final Context A0B;
    public final GoogleApiAvailabilityLight A0C;
    public final C64225T5a A0D;
    public final C1340363l A0E;
    public final Lock A0G;
    public final C61U A0I;
    public final Map A0J;
    public int A08 = 0;
    public final Bundle A0H = AbstractC166987dD.A0b();
    public final java.util.Set A0K = AbstractC166987dD.A1H();
    public final ArrayList A0F = AbstractC166987dD.A1E();

    public static final void A03(T5W t5w) {
        t5w.A03 = false;
        C64225T5a c64225T5a = t5w.A0D;
        c64225T5a.A05.A03 = Collections.emptySet();
        for (Object obj : t5w.A0K) {
            Map map = c64225T5a.A0A;
            if (!map.containsKey(obj)) {
                map.put(obj, new ConnectionResult(17, null));
            }
        }
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF5() {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF8(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF9(ConnectionResult connectionResult, C61W c61w, boolean z) {
        if (A07(this, 1)) {
            A01(connectionResult, c61w, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    private final void A00() {
        IBinder asBinder;
        C64225T5a c64225T5a = this.A0D;
        Lock lock = c64225T5a.A0D;
        lock.lock();
        try {
            c64225T5a.A05.A0H();
            c64225T5a.A0E = new T5U(c64225T5a);
            c64225T5a.A0E.FF2();
            c64225T5a.A0C.signalAll();
            lock.unlock();
            S76.A00.execute(new TLI(this));
            InterfaceC65661Tqr interfaceC65661Tqr = this.A01;
            if (interfaceC65661Tqr != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    C3U5.A02(iAccountAccessor);
                    boolean z = this.A06;
                    RHK rhk = (RHK) interfaceC65661Tqr;
                    try {
                        zaa zaaVar = (zaa) rhk.A03();
                        Integer num = rhk.A00;
                        C3U5.A02(num);
                        int intValue = num.intValue();
                        int A03 = C0f9.A03(-1016209369);
                        Parcel A00 = zaaVar.A00();
                        if (iAccountAccessor == null) {
                            asBinder = null;
                        } else {
                            asBinder = iAccountAccessor.asBinder();
                        }
                        A00.writeStrongBinder(asBinder);
                        A00.writeInt(intValue);
                        A00.writeInt(z ? 1 : 0);
                        zaaVar.A01(A00, 9);
                        C0f9.A0A(-1790750157, A03);
                    } catch (RemoteException unused) {
                        android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A12 = AbstractC43593JPy.A12(c64225T5a.A0A);
            while (A12.hasNext()) {
                Object obj = c64225T5a.A09.get(A12.next());
                C3U5.A02(obj);
                ((InterfaceC1340663q) obj).disconnect();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            c64225T5a.A07.FEz(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r5.A02 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.google.android.gms.common.ConnectionResult r5, X.T5W r6) {
        /*
            java.util.ArrayList r4 = r6.A0F
            int r3 = r4.size()
            r2 = 0
        L7:
            if (r2 >= r3) goto L16
            java.lang.Object r1 = r4.get(r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r0 = 1
            r1.cancel(r0)
            int r2 = r2 + 1
            goto L7
        L16:
            r4.clear()
            int r0 = r5.A01
            if (r0 == 0) goto L22
            android.app.PendingIntent r1 = r5.A02
            r0 = 1
            if (r1 != 0) goto L23
        L22:
            r0 = 0
        L23:
            r0 = r0 ^ 1
            r6.A05(r0)
            X.T5a r0 = r6.A0D
            r0.A00(r5)
            X.TmP r0 = r0.A07
            r0.FEw(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5W.A02(com.google.android.gms.common.ConnectionResult, X.T5W):void");
    }

    public static final void A04(T5W t5w) {
        if (t5w.A09 == 0) {
            if (!t5w.A03 || t5w.A04) {
                ArrayList A1E = AbstractC166987dD.A1E();
                t5w.A08 = 1;
                C64225T5a c64225T5a = t5w.A0D;
                Map map = c64225T5a.A09;
                t5w.A09 = map.size();
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    Object next = A12.next();
                    if (c64225T5a.A0A.containsKey(next)) {
                        if (A06(t5w)) {
                            t5w.A00();
                        }
                    } else {
                        A1E.add(map.get(next));
                    }
                }
                if (!A1E.isEmpty()) {
                    t5w.A0F.add(S76.A00.submit(new C60660RGo(t5w, A1E)));
                }
            }
        }
    }

    private final void A05(boolean z) {
        InterfaceC65661Tqr interfaceC65661Tqr = this.A01;
        if (interfaceC65661Tqr != null) {
            if (interfaceC65661Tqr.isConnected() && z) {
                RHK rhk = (RHK) interfaceC65661Tqr;
                try {
                    zaa zaaVar = (zaa) rhk.A03();
                    Integer num = rhk.A00;
                    C3U5.A02(num);
                    int intValue = num.intValue();
                    int A03 = C0f9.A03(-886822658);
                    Parcel A00 = zaaVar.A00();
                    A00.writeInt(intValue);
                    zaaVar.A01(A00, 7);
                    C0f9.A0A(1596129880, A03);
                } catch (RemoteException unused) {
                    android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            interfaceC65661Tqr.disconnect();
            C3U5.A02(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(T5W t5w) {
        ConnectionResult connectionResult;
        int i = t5w.A09 - 1;
        t5w.A09 = i;
        if (i <= 0) {
            if (i < 0) {
                C60650RGb c60650RGb = t5w.A0D.A05;
                StringWriter stringWriter = new StringWriter();
                c60650RGb.A0E("", null, new PrintWriter(stringWriter), null);
                android.util.Log.w("GACConnecting", stringWriter.toString());
                android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                connectionResult = new ConnectionResult(8, null);
            } else {
                connectionResult = t5w.A0A;
                if (connectionResult != null) {
                    t5w.A0D.A00 = t5w.A07;
                } else {
                    return true;
                }
            }
            A02(connectionResult, t5w);
        }
        return false;
    }

    public static final boolean A07(T5W t5w, int i) {
        String str;
        String str2;
        if (t5w.A08 != i) {
            C60650RGb c60650RGb = t5w.A0D.A05;
            StringWriter stringWriter = new StringWriter();
            c60650RGb.A0E("", null, new PrintWriter(stringWriter), null);
            android.util.Log.w("GACConnecting", stringWriter.toString());
            android.util.Log.w("GACConnecting", "Unexpected callback in ".concat(t5w.toString()));
            android.util.Log.w("GACConnecting", AnonymousClass001.A0O("mRemainingConnections=", t5w.A09));
            if (t5w.A08 != 0) {
                str = "STEP_GETTING_REMOTE_SERVICE";
            } else {
                str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (i != 0) {
                str2 = "STEP_GETTING_REMOTE_SERVICE";
            } else {
                str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            android.util.Log.e("GACConnecting", AnonymousClass001.A0u("GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
            A02(new ConnectionResult(8, null), t5w);
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEv(AbstractC60658RGk abstractC60658RGk) {
        this.A0D.A05.A0F.add(abstractC60658RGk);
        return abstractC60658RGk;
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEy(AbstractC60658RGk abstractC60658RGk) {
        throw AbstractC166987dD.A14("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Tqr, X.63q] */
    @Override // X.InterfaceC65586TnQ
    public final void FF2() {
        C64225T5a c64225T5a = this.A0D;
        c64225T5a.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A1G = AbstractC166987dD.A1G();
        Map map = this.A0J;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            C61W c61w = (C61W) A12.next();
            C61S c61s = c61w.A01;
            Object obj = c64225T5a.A09.get(c61s);
            C3U5.A02(obj);
            InterfaceC1340663q interfaceC1340663q = (InterfaceC1340663q) obj;
            boolean A1a = AbstractC166987dD.A1a(map.get(c61w));
            if (interfaceC1340663q.requiresSignIn()) {
                this.A03 = true;
                if (A1a) {
                    this.A0K.add(c61s);
                } else {
                    this.A02 = false;
                }
            }
            A1G.put(interfaceC1340663q, new C64227T5c(c61w, this, A1a));
        }
        if (this.A03) {
            C1340363l c1340363l = this.A0E;
            C3U5.A02(c1340363l);
            C61U c61u = this.A0I;
            C3U5.A02(c61u);
            C60650RGb c60650RGb = c64225T5a.A05;
            c1340363l.A00 = Integer.valueOf(System.identityHashCode(c60650RGb));
            C64224T4z c64224T4z = new C64224T4z(this);
            this.A01 = c61u.A00(this.A0B, c60650RGb.A06, c64224T4z, c64224T4z, c1340363l, c1340363l.A01);
        }
        this.A09 = c64225T5a.A09.size();
        this.A0F.add(S76.A00.submit(new C60659RGn(this, A1G)));
    }

    @Override // X.InterfaceC65586TnQ
    public final void FFA(int i) {
        A02(new ConnectionResult(8, null), this);
    }

    @Override // X.InterfaceC65586TnQ
    public final boolean FFB() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0D.A00(null);
        return true;
    }

    public T5W(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight, C61U c61u, C64225T5a c64225T5a, C1340363l c1340363l, Map map, Lock lock) {
        this.A0D = c64225T5a;
        this.A0E = c1340363l;
        this.A0J = map;
        this.A0C = googleApiAvailabilityLight;
        this.A0I = c61u;
        this.A0G = lock;
        this.A0B = context;
    }

    public static final void A01(ConnectionResult connectionResult, C61W c61w, T5W t5w, boolean z) {
        int i;
        if ((!z || (((i = connectionResult.A01) != 0 && connectionResult.A02 != null) || t5w.A0C.A04(null, null, i) != null)) && t5w.A0A == null) {
            t5w.A0A = connectionResult;
            t5w.A07 = Integer.MAX_VALUE;
        }
        t5w.A0D.A0A.put(c61w.A01, connectionResult);
    }
}
