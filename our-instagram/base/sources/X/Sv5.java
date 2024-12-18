package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class Sv5 implements InterfaceC65538TmA, ComponentCallbacks2 {
    public static final QBW A0A;
    public static final QBW A0B;
    public static final QBW A0C;
    public QBW A00;
    public final Context A01;
    public final ComponentCallbacks2C63416Sju A02;
    public final InterfaceC65633Tpu A03;
    public final InterfaceC65479Tkw A04;
    public final InterfaceC65196Tfe A05;
    public final SLS A06;
    public final C63871Sv3 A07;
    public final Runnable A08;
    public final CopyOnWriteArrayList A09;

    public final synchronized boolean A01(InterfaceC65634Tpv interfaceC65634Tpv) {
        boolean z;
        InterfaceC65582TnL Bnz = interfaceC65634Tpv.Bnz();
        z = true;
        if (Bnz != null) {
            SLS sls = this.A06;
            boolean remove = sls.A02.remove(Bnz);
            if (!sls.A01.remove(Bnz) && !remove) {
                z = false;
            } else {
                Bnz.clear();
                this.A07.A00.remove(interfaceC65634Tpv);
                interfaceC65634Tpv.Ecl(null);
            }
        }
        return z;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC65538TmA
    public final synchronized void onDestroy() {
        C63871Sv3 c63871Sv3 = this.A07;
        c63871Sv3.onDestroy();
        java.util.Set set = c63871Sv3.A00;
        Iterator A0y = AbstractC58322PtE.A0y(set);
        while (A0y.hasNext()) {
            A00((InterfaceC65634Tpv) A0y.next());
        }
        set.clear();
        SLS sls = this.A06;
        java.util.Set set2 = sls.A02;
        Iterator A0y2 = AbstractC58322PtE.A0y(set2);
        while (A0y2.hasNext()) {
            InterfaceC65582TnL interfaceC65582TnL = (InterfaceC65582TnL) A0y2.next();
            if (interfaceC65582TnL != null) {
                boolean remove = set2.remove(interfaceC65582TnL);
                if (sls.A01.remove(interfaceC65582TnL) || remove) {
                    interfaceC65582TnL.clear();
                }
            }
        }
        sls.A01.clear();
        InterfaceC65479Tkw interfaceC65479Tkw = this.A04;
        interfaceC65479Tkw.EFW(this);
        interfaceC65479Tkw.EFW(this.A03);
        C63375Sim.A02().removeCallbacks(this.A08);
        List list = this.A02.A06;
        synchronized (list) {
            if (list.contains(this)) {
                list.remove(this);
            } else {
                throw AbstractC166987dD.A14("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // X.InterfaceC65538TmA
    public final synchronized void onStart() {
        SLS sls = this.A06;
        sls.A00 = false;
        Iterator A0y = AbstractC58322PtE.A0y(sls.A02);
        while (A0y.hasNext()) {
            InterfaceC65582TnL interfaceC65582TnL = (InterfaceC65582TnL) A0y.next();
            if (!interfaceC65582TnL.isComplete() && !interfaceC65582TnL.isRunning()) {
                interfaceC65582TnL.ADM();
            }
        }
        sls.A01.clear();
        this.A07.onStart();
    }

    @Override // X.InterfaceC65538TmA
    public final synchronized void onStop() {
        SLS sls = this.A06;
        sls.A00 = true;
        Iterator A0y = AbstractC58322PtE.A0y(sls.A02);
        while (A0y.hasNext()) {
            InterfaceC65582TnL interfaceC65582TnL = (InterfaceC65582TnL) A0y.next();
            if (interfaceC65582TnL.isRunning()) {
                interfaceC65582TnL.pause();
                sls.A01.add(interfaceC65582TnL);
            }
        }
        this.A07.onStop();
    }

    public final synchronized String toString() {
        StringBuilder A1C;
        A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append("{tracker=");
        A1C.append(this.A06);
        A1C.append(", treeNode=");
        return JQ0.A0l(this.A05, A1C);
    }

    static {
        QBW qbw = (QBW) new TIW().A0F(Bitmap.class);
        qbw.A0J = true;
        A0A = qbw;
        QBW qbw2 = (QBW) new TIW().A0F(Q2P.class);
        qbw2.A0J = true;
        A0B = qbw2;
        A0C = (QBW) new TIW().A0E(S9K.A01).A07(EnumC61107RfN.LOW).A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.TIW, X.QBW] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TmA, X.Tpu] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Tkw] */
    public Sv5(Context context, ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju, InterfaceC65479Tkw interfaceC65479Tkw, InterfaceC65196Tfe interfaceC65196Tfe) {
        ?? r2;
        QBW qbw;
        SLS sls = new SLS();
        this.A07 = new C63871Sv3();
        TJV tjv = new TJV(this);
        this.A08 = tjv;
        this.A02 = componentCallbacks2C63416Sju;
        this.A04 = interfaceC65479Tkw;
        this.A05 = interfaceC65196Tfe;
        this.A06 = sls;
        this.A01 = context;
        Context applicationContext = context.getApplicationContext();
        C63865Sux c63865Sux = new C63865Sux(this, sls);
        boolean A1N = AbstractC167007dF.A1N(C02G.A00(applicationContext, "android.permission.ACCESS_NETWORK_STATE"));
        android.util.Log.isLoggable("ConnectivityMonitor", 3);
        if (A1N) {
            r2 = new C63867Suz(applicationContext, c63865Sux);
        } else {
            r2 = new Object();
        }
        this.A03 = r2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC65479Tkw.A8y(this);
        } else {
            C63375Sim.A02().post(tjv);
        }
        interfaceC65479Tkw.A8y(r2);
        Q20 q20 = componentCallbacks2C63416Sju.A00;
        this.A09 = new CopyOnWriteArrayList(q20.A06);
        synchronized (q20) {
            QBW qbw2 = q20.A00;
            qbw = qbw2;
            if (qbw2 == null) {
                ?? tiw = new TIW();
                tiw.A0J = true;
                q20.A00 = tiw;
                qbw = tiw;
            }
        }
        synchronized (this) {
            QBW qbw3 = (QBW) qbw.clone();
            if (qbw3.A0J && !qbw3.A0H) {
                throw AbstractC166987dD.A14("You cannot auto lock an already locked options object, try clone() first");
            }
            qbw3.A0H = true;
            qbw3.A0J = true;
            this.A00 = qbw3;
        }
        List list = componentCallbacks2C63416Sju.A06;
        synchronized (list) {
            if (!list.contains(this)) {
                list.add(this);
            } else {
                throw AbstractC166987dD.A14("Cannot register already registered manager");
            }
        }
    }

    public final void A00(InterfaceC65634Tpv interfaceC65634Tpv) {
        if (interfaceC65634Tpv != null) {
            boolean A01 = A01(interfaceC65634Tpv);
            InterfaceC65582TnL Bnz = interfaceC65634Tpv.Bnz();
            if (!A01) {
                List list = this.A02.A06;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Sv5) it.next()).A01(interfaceC65634Tpv)) {
                            return;
                        }
                    }
                    if (Bnz != null) {
                        interfaceC65634Tpv.Ecl(null);
                        Bnz.clear();
                    }
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
