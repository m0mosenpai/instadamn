package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.7z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180177z7 extends AbstractC178657wd implements InterfaceC178737wl, InterfaceC178677wf, InterfaceC180187z8 {
    public static final Object A0N = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public InterfaceC176297sm A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public final Handler A0B;
    public final C23404AZd A0C;
    public final C1814082s A0D;
    public final C1814082s A0E;
    public final Object A0F;
    public final boolean A0G;
    public final C23463Aaa A0H;
    public final boolean A0I;
    public volatile InterfaceC175597rZ A0J;
    public volatile WIL A0K;
    public volatile C176507t8 A0L;
    public volatile C176507t8 A0M;

    @Override // X.InterfaceC178737wl
    public final void AQb(Runnable runnable) {
    }

    @Override // X.InterfaceC178737wl
    public final boolean CLt() {
        return false;
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        WIL wil = this.A0K;
        C176507t8 c176507t82 = this.A0M;
        if (c176507t82 != null) {
            A03(wil, c176507t82);
            c176507t82.A01();
        }
        this.A0M = null;
    }

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
    }

    @Override // X.InterfaceC178737wl
    public final boolean ECL() {
        return false;
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EaB(C176377su c176377su, Object obj) {
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EbX(C176307sn c176307sn) {
    }

    public static void A00(C180177z7 c180177z7) {
        WIL wil = c180177z7.A0K;
        A04(wil, c180177z7.A0M);
        List list = c180177z7.A0E.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A04(wil, (C176507t8) list.get(i));
        }
    }

    public static void A01(C180177z7 c180177z7) {
        int i;
        int i2;
        int i3;
        WIL wil = c180177z7.A0K;
        C176507t8 c176507t8 = c180177z7.A0L;
        C176507t8 c176507t82 = c180177z7.A0M;
        int i4 = c180177z7.A03;
        if (i4 != 0 && (i = c180177z7.A01) != 0 && (i2 = c180177z7.A08) != 0 && (i3 = c180177z7.A07) != 0 && wil != null && c176507t8 != null && c176507t82 != null) {
            int i5 = c180177z7.A02 - c180177z7.A04;
            int i6 = i4;
            int i7 = i;
            if (i5 % 180 == 0) {
                i7 = i4;
                i6 = i;
            }
            boolean z = c180177z7.A0I;
            if (!z || (i7 >= i2 && i6 >= i3)) {
                c180177z7.A0A = i2;
                c180177z7.A09 = i3;
            } else {
                float f = i7;
                float f2 = i6;
                float f3 = i2 / i3;
                if (f3 < f / f2) {
                    c180177z7.A0A = (int) (f2 * f3);
                } else {
                    c180177z7.A0A = i7;
                    i6 = (int) (f / f3);
                }
                c180177z7.A09 = i6;
            }
            c176507t8.A02(i4, i, i5, c180177z7.A06);
            c176507t8.A02 = c180177z7.A02;
            if (z) {
                int i8 = c180177z7.A0A;
                int i9 = c180177z7.A09;
                synchronized (c176507t82) {
                    c176507t82.A02(i8, i9, 0, false);
                }
            }
            int i10 = c180177z7.A0A;
            int i11 = c180177z7.A09;
            int i12 = c180177z7.A02;
            int i13 = c180177z7.A00;
            boolean z2 = c180177z7.A06;
            List list = c180177z7.A0D.A00;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((InterfaceC175477rN) list.get(i14)).DX9(i10, i11, i12, i13, z2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r5.A02(r1);
        r1.A03();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.WIL r6, X.C176507t8 r7) {
        /*
            if (r7 == 0) goto L31
            if (r6 == 0) goto L31
            monitor-enter(r6)
            X.W68 r0 = r6.A02     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.A03()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            X.82s r5 = r6.A00     // Catch: java.lang.Throwable -> L2e
            java.util.List r4 = r5.A00     // Catch: java.lang.Throwable -> L2e
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L16:
            if (r2 >= r3) goto L2c
            java.lang.Object r1 = r4.get(r2)     // Catch: java.lang.Throwable -> L2e
            X.Vvg r1 = (X.C69796Vvg) r1     // Catch: java.lang.Throwable -> L2e
            X.7t8 r0 = r1.A00     // Catch: java.lang.Throwable -> L2e
            if (r0 != r7) goto L29
            r5.A02(r1)     // Catch: java.lang.Throwable -> L2e
            r1.A03()     // Catch: java.lang.Throwable -> L2e
            goto L2c
        L29:
            int r2 = r2 + 1
            goto L16
        L2c:
            monitor-exit(r6)
            return
        L2e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180177z7.A03(X.WIL, X.7t8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r0 = r5.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r4.A01(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.WIL r6, X.C176507t8 r7) {
        /*
            if (r7 == 0) goto L33
            if (r6 == 0) goto L33
            monitor-enter(r6)
            X.W68 r5 = r6.A02     // Catch: java.lang.Throwable -> L30
            boolean r0 = r5.A03()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L2e
            X.82s r4 = r6.A00     // Catch: java.lang.Throwable -> L30
            java.util.List r3 = r4.A00     // Catch: java.lang.Throwable -> L30
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L30
            r1 = 0
        L16:
            if (r1 >= r2) goto L25
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Throwable -> L30
            X.Vvg r0 = (X.C69796Vvg) r0     // Catch: java.lang.Throwable -> L30
            X.7t8 r0 = r0.A00     // Catch: java.lang.Throwable -> L30
            if (r0 == r7) goto L2e
            int r1 = r1 + 1
            goto L16
        L25:
            X.Vvg r0 = r5.A00(r7)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L2e
            r4.A01(r0)     // Catch: java.lang.Throwable -> L30
        L2e:
            monitor-exit(r6)
            return
        L30:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180177z7.A04(X.WIL, X.7t8):void");
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178087vh c178087vh = InterfaceC178787wq.A00;
        if (((AbstractC178657wd) this).A00.CRY(c178087vh)) {
            this.A0J = ((InterfaceC178787wq) A0A(c178087vh)).Bma();
        }
    }

    @Override // X.InterfaceC178737wl
    public final void A9p(C176507t8 c176507t8) {
        this.A0E.A01(c176507t8);
        A04(this.A0K, c176507t8);
    }

    @Override // X.InterfaceC178737wl
    public final void AAS(InterfaceC175477rN interfaceC175477rN) {
        if (this.A0D.A01(interfaceC175477rN)) {
            int i = this.A0A;
            int i2 = this.A09;
            int i3 = this.A02;
            int i4 = this.A00;
            boolean z = this.A06;
            if (i > 0 && i2 > 0) {
                interfaceC175477rN.DX9(i, i2, i3, i4, z);
            }
        }
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178737wl.A00;
    }

    @Override // X.InterfaceC178737wl
    public final InterfaceC175497rP C4Q() {
        return this.A0H;
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        WIL wil = this.A0K;
        C176507t8 c176507t82 = this.A0M;
        if (c176507t82 != null && c176507t82 != c176507t8) {
            A03(wil, c176507t82);
            c176507t82.A01();
        }
        this.A0M = c176507t8;
        if (c176507t8 != null) {
            A04(wil, c176507t8);
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        this.A08 = i;
        this.A07 = i2;
        this.A0B.post(new RunnableC24276Aph(this));
    }

    @Override // X.InterfaceC178737wl
    public final void EG3(C176507t8 c176507t8) {
        this.A0E.A02(c176507t8);
        A03(this.A0K, c176507t8);
    }

    @Override // X.InterfaceC178737wl
    public final void EGM(InterfaceC175477rN interfaceC175477rN) {
        this.A0D.A02(interfaceC175477rN);
    }

    @Override // X.InterfaceC178737wl
    public final void EbN(boolean z) {
        C176507t8 c176507t8 = this.A0M;
        if (c176507t8 != null) {
            c176507t8.A0D = z;
        }
    }

    public C180177z7(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        C178037vc c178037vc = InterfaceC180187z8.A00;
        Object obj = A0N;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        Object AqG = interfaceC178207vu2.AqG(c178037vc);
        this.A0F = AqG != null ? AqG : obj;
        Object obj2 = r2;
        Object AqG2 = interfaceC178207vu2.AqG(InterfaceC180187z8.A02);
        this.A0I = ((Boolean) (AqG2 != null ? AqG2 : obj2)).booleanValue();
        Object AqG3 = interfaceC178207vu2.AqG(InterfaceC180187z8.A01);
        this.A0G = ((Boolean) (AqG3 != null ? AqG3 : true)).booleanValue();
        this.A0E = new C1814082s();
        this.A0D = new C1814082s();
        this.A0B = ((InterfaceC178297w3) interfaceC178207vu2.Aq1(InterfaceC178297w3.A00)).BAu("Lite-SurfacePipe-Thread");
        this.A0H = new C23463Aaa(this);
        this.A0C = new C23404AZd(this);
    }

    @Override // X.InterfaceC178737wl
    public final void Egy(InterfaceC176297sm interfaceC176297sm) {
        this.A05 = interfaceC176297sm;
    }
}
