package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.0WL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WL {
    public int A00;
    public int A01;
    public final C0WK A05;
    public final Object A09 = new Object();
    public final Object A0A = new Object();
    public boolean A02 = false;
    public boolean A03 = false;
    public final C20250yy A08 = new C20250yy(this);
    public final InterfaceC05910Tb A07 = new InterfaceC05910Tb() { // from class: X.0yz
        @Override // X.InterfaceC05910Tb
        public final void DSd(MemoryTimeline memoryTimeline) {
            C0WL.A00(memoryTimeline, C0WL.this);
        }
    };
    public final InterfaceC10270gj A06 = new InterfaceC10270gj() { // from class: X.0RA
        private void A00() {
            C0TX c0tx;
            C0WL.this.A05.onTrigger();
            synchronized (C05900Ta.class) {
                c0tx = C05900Ta.A00;
            }
            if (c0tx != null) {
                c0tx.EFY(this);
            }
        }

        @Override // X.InterfaceC18130ux
        public final void Cvs(C0TY c0ty) {
            if ((C0WL.this.A00 & 4) != 0 && c0ty == C0TY.RED) {
                A00();
            }
        }

        @Override // X.InterfaceC18490vb
        public final void DO4(C0TY c0ty) {
            if ((C0WL.this.A00 & 1) != 0 && c0ty == C0TY.RED) {
                A00();
            }
        }

        @Override // X.InterfaceC18530vf
        public final void Drh(C0TY c0ty) {
            if ((C0WL.this.A00 & 2) != 0 && c0ty == C0TY.RED) {
                A00();
            }
        }
    };
    public final C0TT A04 = new C0TT() { // from class: X.0z0
        @Override // X.C0TT
        public final int BoH() {
            return 2;
        }

        @Override // X.C0TT
        public final void DES(C0TM c0tm) {
        }

        @Override // X.C0TT
        public final boolean FDw() {
            return true;
        }

        @Override // X.C0TT
        public final void DVg(MemoryTimeline memoryTimeline, C0TS c0ts) {
            C0TJ c0tj;
            C0TP c0tp = C0TP.A11;
            Map map = c0ts.A02;
            if (map != null && (c0tj = (C0TJ) map.get(c0tp)) != null) {
                double d = (c0tj.A00 * 100.0d) / c0tj.A01;
                C0WL c0wl = C0WL.this;
                if (d >= c0wl.A01) {
                    c0wl.A05.onTrigger();
                    C0TT c0tt = c0wl.A04;
                    C2RK c2rk = (C2RK) memoryTimeline;
                    java.util.Set set = c2rk.A0E;
                    synchronized (set) {
                        set.remove(c0tt);
                    }
                    C2RK.A01(c2rk);
                }
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(com.facebook.memorytimeline.MemoryTimeline r2, X.C0WL r3) {
        /*
            int r0 = r3.A01
            if (r0 == 0) goto L20
            java.lang.Object r1 = r3.A0A
            monitor-enter(r1)
            if (r2 != 0) goto La
            goto L13
        La:
            r0 = 1
            r3.A03 = r0     // Catch: java.lang.Throwable -> L1d
            X.0TT r0 = r3.A04     // Catch: java.lang.Throwable -> L1d
            r2.AAR(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1b
        L13:
            X.0Tb r0 = r3.A07     // Catch: java.lang.Throwable -> L1d
            com.facebook.memorytimeline.MemoryTimeline r2 = X.C05920Tc.A00(r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto La
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WL.A00(com.facebook.memorytimeline.MemoryTimeline, X.0WL):void");
    }

    public static void A01(C0TX c0tx, C0WL c0wl) {
        if (c0wl.A00 != 0) {
            synchronized (c0wl.A09) {
                if (c0tx == null) {
                    C20250yy c20250yy = c0wl.A08;
                    synchronized (C05900Ta.class) {
                        if (C05900Ta.A00 == null && c20250yy != null) {
                            C05900Ta.A01.add(new WeakReference(c20250yy));
                        }
                        c0tx = C05900Ta.A00;
                    }
                    if (c0tx == null) {
                    }
                }
                if (((C1TU) c0tx).A09.A09) {
                    c0wl.A02 = true;
                    c0tx.A93(c0wl.A06);
                }
            }
        }
    }

    public final void A02() {
        MemoryTimeline A00;
        C0TX c0tx;
        synchronized (this.A09) {
            if (this.A02) {
                synchronized (C05900Ta.class) {
                    c0tx = C05900Ta.A00;
                }
                if (c0tx != null) {
                    c0tx.EFY(this.A06);
                    this.A02 = false;
                }
            }
        }
        synchronized (this.A0A) {
            if (this.A03 && (A00 = C05920Tc.A00(null)) != null) {
                C0TT c0tt = this.A04;
                C2RK c2rk = (C2RK) A00;
                java.util.Set set = c2rk.A0E;
                synchronized (set) {
                    set.remove(c0tt);
                }
                C2RK.A01(c2rk);
                this.A03 = false;
            }
        }
    }

    public C0WL(C0WK c0wk, int i) {
        this.A00 = 0;
        this.A01 = 0;
        this.A05 = c0wk;
        if ((i & 1) != 0) {
            this.A00 = (i & (-256)) >> 8;
            A01(null, this);
        }
        if ((i & 2) != 0) {
            this.A01 = (i & (-256)) >> 8;
            A00(null, this);
        }
    }
}
