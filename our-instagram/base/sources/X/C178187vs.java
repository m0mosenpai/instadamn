package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178187vs implements InterfaceC178197vt {
    public C177267uM A00;
    public final C178247vy A02;
    public final C178257vz A03;
    public final boolean A04;
    public final Context A05;
    public final C178027vb A06;
    public volatile int A07 = 0;
    public final C178217vv A01 = new C178217vv();

    private synchronized void A00() {
        A02();
        if (this.A07 == 1) {
            C178217vv c178217vv = this.A01;
            c178217vv.CNZ();
            c178217vv.CNu();
            this.A07 = 2;
        }
    }

    public static synchronized void A01(C178187vs c178187vs) {
        synchronized (c178187vs) {
            if (c178187vs.A07 == 0) {
                if (c178187vs.A04) {
                    c178187vs.A00();
                } else {
                    c178187vs.A02();
                }
            }
        }
    }

    public final synchronized void A02() {
        if (this.A07 == 0) {
            C178247vy c178247vy = this.A02;
            C178217vv c178217vv = this.A01;
            if (!c178247vy.A00) {
                c178247vy.A00 = true;
                InterfaceC178157vo[] interfaceC178157voArr = c178247vy.A02;
                for (InterfaceC178157vo interfaceC178157vo : interfaceC178157voArr) {
                    interfaceC178157vo.ChI(this, new C178637wb(c178217vv, c178247vy));
                }
                for (InterfaceC178157vo interfaceC178157vo2 : interfaceC178157voArr) {
                    interfaceC178157vo2.ChJ(this, new C179677yH(c178217vv, c178247vy));
                }
                for (InterfaceC178157vo interfaceC178157vo3 : interfaceC178157voArr) {
                    interfaceC178157vo3.ChK(this, new C179757yP(c178217vv, c178247vy));
                }
                for (InterfaceC178157vo interfaceC178157vo4 : interfaceC178157voArr) {
                    interfaceC178157vo4.ChL(this, new C179787yS(c178217vv, c178247vy));
                }
            }
            this.A07 = 1;
        }
    }

    @Override // X.InterfaceC178197vt
    public final synchronized void AJP(C177267uM c177267uM) {
        C178257vz c178257vz = this.A03;
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        ((InterfaceC178407wE) c178257vz.A00(c178307w4)).DEb(28);
        ((InterfaceC178407wE) c178257vz.A00(c178307w4)).Cwo(28, "action", "connect");
        A00();
        if (this.A07 == 2) {
            this.A00 = c177267uM;
            if (c177267uM != null) {
                C177257uL c177257uL = C177267uM.A03;
                Map map = c177267uM.A00;
                c178257vz.A01((String) map.remove(c177257uL), (String) map.remove(C177267uM.A04), (String) map.remove(C177267uM.A01));
            }
            C178217vv c178217vv = this.A01;
            c178217vv.E50();
            c178217vv.connect();
            this.A07 = 3;
        }
        ((InterfaceC178407wE) c178257vz.A00(c178307w4)).DEW(28);
    }

    @Override // X.InterfaceC178197vt
    public final synchronized void disconnect() {
        if (this.A07 == 3 || this.A07 == 4) {
            this.A07 = 2;
            this.A01.disconnect();
        }
        if (!this.A04) {
            release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r3.A07 == 4) goto L7;
     */
    @Override // X.InterfaceC178197vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A07     // Catch: java.lang.Throwable -> L45
            r0 = 3
            if (r1 == r0) goto Lc
            int r2 = r3.A07     // Catch: java.lang.Throwable -> L45
            r1 = 4
            r0 = 0
            if (r2 != r1) goto Ld
        Lc:
            r0 = 1
        Ld:
            r1 = 2
            if (r0 == 0) goto L17
            r3.A07 = r1     // Catch: java.lang.Throwable -> L45
            X.7vv r0 = r3.A01     // Catch: java.lang.Throwable -> L45
            r0.disconnect()     // Catch: java.lang.Throwable -> L45
        L17:
            int r0 = r3.A07     // Catch: java.lang.Throwable -> L45
            if (r0 != r1) goto L23
            r0 = 1
            r3.A07 = r0     // Catch: java.lang.Throwable -> L45
            X.7vv r0 = r3.A01     // Catch: java.lang.Throwable -> L45
            r0.release()     // Catch: java.lang.Throwable -> L45
        L23:
            boolean r0 = r3.A04     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L43
            int r1 = r3.A07     // Catch: java.lang.Throwable -> L45
            r0 = 1
            if (r1 != r0) goto L43
            r2 = 0
            r3.A07 = r2     // Catch: java.lang.Throwable -> L45
            X.7vy r1 = r3.A02     // Catch: java.lang.Throwable -> L45
            boolean r0 = r1.A00     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L3c
            r1.A00 = r2     // Catch: java.lang.Throwable -> L45
            java.util.Map r0 = r1.A01     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
        L3c:
            X.7vv r0 = r3.A01     // Catch: java.lang.Throwable -> L45
            java.util.List r0 = r0.A00     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r3)
            return
        L45:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178187vs.release():void");
    }

    @Override // X.InterfaceC178207vu
    public final InterfaceC178287w2 Aq1(C178307w4 c178307w4) {
        return this.A03.A00(c178307w4);
    }

    @Override // X.InterfaceC178207vu
    public final Object AqF(C177257uL c177257uL) {
        C177267uM c177267uM = this.A00;
        if (c177267uM == null) {
            return null;
        }
        return c177267uM.A00.get(c177257uL);
    }

    @Override // X.InterfaceC178207vu
    public final Object AqG(C178037vc c178037vc) {
        return this.A06.A00.get(c178037vc);
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRY(C178087vh c178087vh) {
        return this.A02.A01.containsKey(c178087vh);
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRZ(C178307w4 c178307w4) {
        return this.A03.A02.containsKey(c178307w4);
    }

    @Override // X.InterfaceC178207vu
    public final Context getContext() {
        return this.A05;
    }

    public C178187vs(Context context, C178027vb c178027vb, InterfaceC178157vo[] interfaceC178157voArr) {
        this.A05 = context.getApplicationContext();
        this.A06 = c178027vb;
        Boolean bool = (Boolean) c178027vb.A00.get(InterfaceC178197vt.A00);
        this.A04 = bool != null ? bool.booleanValue() : false;
        this.A02 = new C178247vy(interfaceC178157voArr);
        C178257vz c178257vz = new C178257vz(interfaceC178157voArr);
        this.A03 = c178257vz;
        if (!c178257vz.A00) {
            c178257vz.A00 = true;
            for (InterfaceC178157vo interfaceC178157vo : c178257vz.A04) {
                interfaceC178157vo.ChM(this, c178257vz);
            }
            Iterator it = c178257vz.A01.iterator();
            while (it.hasNext()) {
                AbstractC178277w1 abstractC178277w1 = (AbstractC178277w1) ((InterfaceC178287w2) it.next());
                if (!abstractC178277w1.A01) {
                    abstractC178277w1.A01 = true;
                }
            }
            ((InterfaceC178407wE) c178257vz.A00(InterfaceC178407wE.A00)).EQy(4);
        }
    }

    @Override // X.InterfaceC178207vu
    public final InterfaceC178067vf Aq0(C178087vh c178087vh) {
        A01(this);
        return (InterfaceC178067vf) this.A02.A00(c178087vh);
    }
}
