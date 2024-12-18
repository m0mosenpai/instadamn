package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TRo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64732TRo implements Runnable, Comparable, InterfaceC65536Tm8, InterfaceC65331TiC {
    public int A00;
    public int A01;
    public int A02;
    public Q20 A03;
    public EnumC61107RfN A04;
    public InterfaceC65617To8 A05;
    public InterfaceC65617To8 A06;
    public C63729Ssj A07;
    public S9K A08;
    public C63891SvP A09;
    public C63728Ssi A0A;
    public Integer A0B;
    public Integer A0C;
    public Object A0D;
    public boolean A0E;
    public long A0F;
    public InterfaceC65617To8 A0G;
    public InterfaceC65570Tn3 A0H;
    public Integer A0I;
    public Object A0J;
    public Thread A0K;
    public boolean A0L;
    public final SL0 A0P;
    public final C02Q A0Q;
    public volatile InterfaceC65474Tkr A0T;
    public volatile boolean A0U;
    public volatile boolean A0V;
    public final C62757SPo A0M = new C62757SPo();
    public final List A0S = AbstractC166987dD.A1E();
    public final SKF A0R = new Object();
    public final SFR A0N = new Object();
    public final SFS A0O = new Object();

    private InterfaceC65474Tkr A00() {
        Integer num = this.A0C;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue == 5) {
                        return null;
                    }
                    throw AbstractC31175DnJ.A0V("Unrecognized stage: ", AbstractC61684Rry.A00(num));
                }
                return new C63784Ste(this, this.A0M);
            }
            C62757SPo c62757SPo = this.A0M;
            return new C63760StG(this, c62757SPo, c62757SPo.A02());
        }
        return new C63761StH(this, this.A0M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x005a, code lost:
    
        if (r8.A0E != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC64732TRo.A02():void");
    }

    private void A05() {
        Throwable th;
        this.A0R.A00();
        if (this.A0V) {
            List list = this.A0S;
            if (list.isEmpty()) {
                th = null;
            } else {
                th = (Throwable) list.get(AbstractC31172DnG.A03(list, 1));
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.A0V = true;
    }

    public static void A06(RunnableC64732TRo runnableC64732TRo) {
        SFS sfs = runnableC64732TRo.A0O;
        synchronized (sfs) {
            sfs.A00 = false;
            sfs.A02 = false;
            sfs.A01 = false;
        }
        SFR sfr = runnableC64732TRo.A0N;
        sfr.A00 = null;
        sfr.A01 = null;
        sfr.A02 = null;
        C62757SPo c62757SPo = runnableC64732TRo.A0M;
        c62757SPo.A02 = null;
        c62757SPo.A0A = null;
        c62757SPo.A04 = null;
        c62757SPo.A08 = null;
        c62757SPo.A09 = null;
        c62757SPo.A05 = null;
        c62757SPo.A03 = null;
        c62757SPo.A0B = null;
        c62757SPo.A06 = null;
        c62757SPo.A0H.clear();
        c62757SPo.A0D = false;
        c62757SPo.A0G.clear();
        c62757SPo.A0C = false;
        runnableC64732TRo.A0V = false;
        runnableC64732TRo.A03 = null;
        runnableC64732TRo.A06 = null;
        runnableC64732TRo.A07 = null;
        runnableC64732TRo.A04 = null;
        runnableC64732TRo.A0A = null;
        runnableC64732TRo.A09 = null;
        runnableC64732TRo.A0C = null;
        runnableC64732TRo.A0T = null;
        runnableC64732TRo.A0K = null;
        runnableC64732TRo.A05 = null;
        runnableC64732TRo.A0J = null;
        runnableC64732TRo.A0I = null;
        runnableC64732TRo.A0H = null;
        runnableC64732TRo.A0F = 0L;
        runnableC64732TRo.A0U = false;
        runnableC64732TRo.A0D = null;
        runnableC64732TRo.A0S.clear();
        runnableC64732TRo.A0Q.EE6(runnableC64732TRo);
    }

    private void A07(Integer num) {
        ExecutorServiceC64807TUv executorServiceC64807TUv;
        this.A0B = num;
        C63891SvP c63891SvP = this.A09;
        if (c63891SvP.A0C) {
            executorServiceC64807TUv = c63891SvP.A0L;
        } else if (c63891SvP.A0B) {
            executorServiceC64807TUv = c63891SvP.A0I;
        } else {
            executorServiceC64807TUv = c63891SvP.A0K;
        }
        executorServiceC64807TUv.execute(this);
    }

    @Override // X.InterfaceC65331TiC
    public final SKF CEo() {
        return this.A0R;
    }

    @Override // X.InterfaceC65536Tm8
    public final void D9F(InterfaceC65617To8 interfaceC65617To8, InterfaceC65617To8 interfaceC65617To82, InterfaceC65570Tn3 interfaceC65570Tn3, Integer num, Object obj) {
        this.A05 = interfaceC65617To8;
        this.A0J = obj;
        this.A0H = interfaceC65570Tn3;
        this.A0I = num;
        this.A0G = interfaceC65617To82;
        boolean z = false;
        if (interfaceC65617To8 != this.A0M.A02().get(0)) {
            z = true;
        }
        this.A0L = z;
        if (Thread.currentThread() != this.A0K) {
            A07(C05F.A0C);
        } else {
            A02();
        }
    }

    @Override // X.InterfaceC65536Tm8
    public final void EJU() {
        A07(C05F.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        RunnableC64732TRo runnableC64732TRo = (RunnableC64732TRo) obj;
        int ordinal = this.A04.ordinal() - runnableC64732TRo.A04.ordinal();
        if (ordinal == 0) {
            return this.A01 - runnableC64732TRo.A01;
        }
        return ordinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC65570Tn3 interfaceC65570Tn3 = this.A0H;
        try {
            try {
                try {
                    if (this.A0U) {
                        A03();
                    } else {
                        int intValue = this.A0B.intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue == 2) {
                                    A02();
                                } else {
                                    throw AbstractC31175DnJ.A0V("Unrecognized run reason: ", "INITIALIZE");
                                }
                            }
                        } else {
                            this.A0C = A01(this, C05F.A00);
                            this.A0T = A00();
                        }
                        A04();
                    }
                    if (interfaceC65570Tn3 != null) {
                        interfaceC65570Tn3.cleanup();
                    }
                } catch (TX9 e) {
                    throw e;
                }
            } catch (Throwable th) {
                android.util.Log.isLoggable("DecodeJob", 3);
                if (this.A0C != C05F.A0Y) {
                    this.A0S.add(th);
                    A03();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (interfaceC65570Tn3 != null) {
                interfaceC65570Tn3.cleanup();
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SKF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.SFR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.SFS, java.lang.Object] */
    public RunnableC64732TRo(C02Q c02q, SL0 sl0) {
        this.A0P = sl0;
        this.A0Q = c02q;
    }

    public static Integer A01(RunnableC64732TRo runnableC64732TRo, Integer num) {
        boolean z;
        Integer num2;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3 && intValue != 5) {
                    if (intValue == 0) {
                        if (runnableC64732TRo.A08 instanceof QBD) {
                            z = true;
                        } else {
                            z = false;
                        }
                        num2 = C05F.A01;
                    } else {
                        throw AbstractC167007dF.A0c("Unrecognized stage: ", AbstractC61684Rry.A00(num));
                    }
                }
            } else if (!runnableC64732TRo.A0E) {
                return C05F.A0N;
            }
            return C05F.A0j;
        }
        S9K s9k = runnableC64732TRo.A08;
        if (!(s9k instanceof QBD) && !(s9k instanceof QBC)) {
            z = false;
        } else {
            z = true;
        }
        num2 = C05F.A0C;
        if (!z) {
            return A01(runnableC64732TRo, num2);
        }
        return num2;
    }

    private void A03() {
        boolean A1M;
        A05();
        RkJ rkJ = new RkJ("Failed to load resource", AbstractC166987dD.A1F(this.A0S));
        C63891SvP c63891SvP = this.A09;
        synchronized (c63891SvP) {
            c63891SvP.A03 = rkJ;
        }
        synchronized (c63891SvP) {
            c63891SvP.A0M.A00();
            if (c63891SvP.A0O) {
                C63891SvP.A00(c63891SvP);
            } else {
                List list = c63891SvP.A0H.A00;
                if (!list.isEmpty()) {
                    if (!c63891SvP.A06) {
                        c63891SvP.A06 = true;
                        InterfaceC65617To8 interfaceC65617To8 = c63891SvP.A00;
                        ArrayList A1F = AbstractC166987dD.A1F(list);
                        c63891SvP.A02(A1F.size() + 1);
                        c63891SvP.A0E.A01(interfaceC65617To8, c63891SvP, null);
                        Iterator it = A1F.iterator();
                        while (it.hasNext()) {
                            SNV snv = (SNV) it.next();
                            snv.A01.execute(new TN0(c63891SvP, snv.A00));
                        }
                        c63891SvP.A01();
                    } else {
                        throw AbstractC166987dD.A14("Already failed once");
                    }
                } else {
                    throw AbstractC166987dD.A14("Received an exception without any callbacks to notify");
                }
            }
        }
        SFS sfs = this.A0O;
        synchronized (sfs) {
            sfs.A01 = true;
            A1M = AbstractC167007dF.A1M(sfs.A02 ? 1 : 0);
        }
        if (A1M) {
            A06(this);
        }
    }

    private void A04() {
        this.A0K = Thread.currentThread();
        this.A0F = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.A0U && this.A0T != null && !(z = this.A0T.Ene())) {
            this.A0C = A01(this, this.A0C);
            this.A0T = A00();
            if (this.A0C == C05F.A0N) {
                A07(C05F.A01);
                return;
            }
        }
        if ((this.A0C != C05F.A0j && !this.A0U) || z) {
            return;
        }
        A03();
    }

    @Override // X.InterfaceC65536Tm8
    public final void D9E(InterfaceC65617To8 interfaceC65617To8, InterfaceC65570Tn3 interfaceC65570Tn3, Exception exc, Integer num) {
        interfaceC65570Tn3.cleanup();
        RkJ rkJ = new RkJ("Fetching data failed", Collections.singletonList(exc));
        Class Avg = interfaceC65570Tn3.Avg();
        rkJ.A00 = interfaceC65617To8;
        rkJ.A03 = num;
        rkJ.A01 = Avg;
        this.A0S.add(rkJ);
        if (Thread.currentThread() != this.A0K) {
            A07(C05F.A01);
        } else {
            A04();
        }
    }
}
