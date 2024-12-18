package X;

import android.os.SystemClock;
import android.view.Surface;

/* renamed from: X.8p0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197898p0 implements InterfaceC179087xK, InterfaceC179437xt, InterfaceC178827wu {
    public int A00;
    public int A01;
    public int A02;
    public C178907x2 A03;
    public C22981ABg A04;
    public final InterfaceC185788Ly A05;
    public final int A06;
    public final InterfaceC197918p2 A07;
    public final InterfaceC197958p6 A08;
    public final InterfaceC197978p8 A09;
    public final C197908p1 A0A;
    public final C197938p4 A0B;
    public final C178747wm A0C;
    public final AbstractC179397xp A0D;
    public volatile InterfaceC180227zC A0E;
    public volatile boolean A0F;

    public C197898p0(InterfaceC185788Ly interfaceC185788Ly, C178747wm c178747wm) {
        AbstractC179397xp anonymousClass814;
        C197908p1 c197908p1;
        C197938p4 c197938p4;
        C14360o3.A0B(c178747wm, 2);
        this.A05 = interfaceC185788Ly;
        this.A0C = c178747wm;
        EnumC197888oz BI3 = interfaceC185788Ly.BI3();
        if ((BI3 == null ? EnumC197888oz.A04 : BI3).ordinal() != 1) {
            anonymousClass814 = new C179417xr();
        } else {
            anonymousClass814 = new AnonymousClass814(false);
        }
        this.A0D = anonymousClass814;
        EnumC185798Lz CFJ = interfaceC185788Ly.CFJ();
        C14360o3.A07(CFJ);
        int ordinal = CFJ.ordinal();
        int i = 4;
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        this.A06 = i;
        if (interfaceC185788Ly instanceof C197908p1) {
            c197908p1 = (C197908p1) interfaceC185788Ly;
        } else {
            c197908p1 = null;
        }
        this.A0A = c197908p1;
        if (interfaceC185788Ly instanceof C197938p4) {
            c197938p4 = (C197938p4) interfaceC185788Ly;
        } else {
            c197938p4 = null;
        }
        this.A0B = c197938p4;
        this.A07 = interfaceC185788Ly instanceof InterfaceC197918p2 ? (InterfaceC197918p2) interfaceC185788Ly : null;
        this.A08 = new InterfaceC197958p6() { // from class: X.8p5
            @Override // X.InterfaceC197958p6
            public final void AWg(InterfaceC185788Ly interfaceC185788Ly2) {
            }

            @Override // X.InterfaceC197958p6
            public final void EpX(Surface surface, InterfaceC185788Ly interfaceC185788Ly2) {
                C14360o3.A0B(surface, 1);
                C197898p0 c197898p0 = C197898p0.this;
                InterfaceC185788Ly interfaceC185788Ly3 = c197898p0.A05;
                synchronized (interfaceC185788Ly3) {
                    InterfaceC180227zC interfaceC180227zC = c197898p0.A0E;
                    if (interfaceC180227zC != null) {
                        interfaceC185788Ly3.CNx(surface, interfaceC180227zC.B09());
                        c197898p0.A0F = true;
                    }
                }
            }

            @Override // X.InterfaceC197958p6
            public final void EpZ(InterfaceC185788Ly interfaceC185788Ly2) {
                C197898p0 c197898p0 = C197898p0.this;
                synchronized (c197898p0.A05) {
                    c197898p0.A0F = false;
                }
            }
        };
        this.A09 = new InterfaceC197978p8() { // from class: X.8p7
            @Override // X.InterfaceC197978p8
            public final void Ehr(InterfaceC178897x1 interfaceC178897x1, int i2) {
                C197898p0 c197898p0 = C197898p0.this;
                synchronized (c197898p0.A05) {
                    InterfaceC180227zC interfaceC180227zC = c197898p0.A0E;
                    if (interfaceC180227zC != null) {
                        interfaceC178897x1.EhZ(interfaceC180227zC.B09(), 1);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C14360o3.A0B(interfaceC180227zC, 0);
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            this.A0E = interfaceC180227zC;
            interfaceC185788Ly.CNg(this.A08, this.A09);
        }
    }

    @Override // X.InterfaceC178827wu
    public final String B0u() {
        return "GlSurfaceOutput";
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A03 = c178907x2;
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBd(InterfaceC179467xw interfaceC179467xw, AbstractC179397xp abstractC179397xp) {
        C179407xq c179407xq;
        boolean z;
        boolean z2;
        long elapsedRealtimeNanos;
        int i;
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            C179407xq CGV = interfaceC179467xw.CGV();
            if (CGV != null && CGV.A00()) {
                this.A02 = interfaceC185788Ly.getWidth();
                this.A01 = interfaceC185788Ly.getHeight();
                int i2 = this.A00;
                InterfaceC197918p2 interfaceC197918p2 = this.A07;
                if (interfaceC197918p2 != null) {
                    int BqV = interfaceC197918p2.BqV();
                    z = false;
                    if ((BqV & 2) == 2) {
                        z = true;
                    }
                    z2 = false;
                    if ((BqV & 1) == 1) {
                        z2 = true;
                    }
                    if ((BqV & 4) == 4) {
                        i = 90;
                    } else if ((BqV & 8) == 8) {
                        i = 180;
                    } else {
                        int i3 = BqV & 16;
                        i = 0;
                        if (i3 == 16) {
                            i = 270;
                        }
                    }
                    i2 += i;
                } else {
                    z = false;
                    z2 = false;
                }
                if (interfaceC179467xw.CdG()) {
                    elapsedRealtimeNanos = interfaceC179467xw.C8d();
                } else {
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                }
                C197908p1 c197908p1 = this.A0A;
                if (c197908p1 != null) {
                    c197908p1.A02 = elapsedRealtimeNanos;
                }
                C197938p4 c197938p4 = this.A0B;
                if (c197938p4 != null) {
                    c197938p4.A00(elapsedRealtimeNanos);
                }
                abstractC179397xp.A09(CGV.A01, CGV.A00, this.A02, this.A01, i2, z, z2);
                c179407xq = abstractC179397xp.A08();
            } else {
                c179407xq = null;
            }
        }
        return c179407xq;
    }

    @Override // X.InterfaceC179437xt
    public final boolean contains(Object obj) {
        C14360o3.A0B(obj, 0);
        return this.A05 == obj;
    }

    @Override // X.InterfaceC179437xt
    public final Object BOS() {
        return this.A05;
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ int BaF() {
        return 0;
    }

    @Override // X.InterfaceC179437xt
    public final int BaJ() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r2.AFZ() == false) goto L8;
     */
    @Override // X.InterfaceC179437xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CTm(X.InterfaceC179467xw r4) {
        /*
            r3 = this;
            X.8Ly r2 = r3.A05
            monitor-enter(r2)
            boolean r0 = r3.A0F     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            boolean r1 = r2.AFZ()     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197898p0.CTm(X.7xw):boolean");
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ boolean CZh() {
        return false;
    }

    @Override // X.InterfaceC179437xt
    public final boolean Cem() {
        return this.A05.Cem();
    }

    @Override // X.InterfaceC179437xt
    public final Exception Cmh() {
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            try {
                interfaceC185788Ly.Cmi();
                e = null;
            } catch (C80D e) {
                e = e;
                this.A0C.A00(EnumC200658u8.A0M);
            }
        }
        return e;
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBc(InterfaceC179467xw interfaceC179467xw) {
        return FBd(interfaceC179467xw, this.A0D);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            interfaceC185788Ly.destroy();
            this.A0E = null;
        }
        C178907x2 c178907x2 = this.A03;
        if (c178907x2 != null) {
            c178907x2.A06.A00(this);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            interfaceC185788Ly.release();
        }
        C178907x2 c178907x2 = this.A03;
        if (c178907x2 != null) {
            c178907x2.A06.A00(this);
        }
    }

    @Override // X.InterfaceC179437xt
    public final void swapBuffers() {
        InterfaceC185788Ly interfaceC185788Ly = this.A05;
        synchronized (interfaceC185788Ly) {
            C22981ABg c22981ABg = this.A04;
            if (c22981ABg != null) {
                c22981ABg.A00(interfaceC185788Ly.getWidth(), interfaceC185788Ly.getHeight());
            }
            interfaceC185788Ly.DrC();
            interfaceC185788Ly.swapBuffers();
        }
        C178907x2 c178907x2 = this.A03;
        if (c178907x2 != null) {
            c178907x2.A06.A01(this);
        }
    }

    @Override // X.InterfaceC179437xt
    public final void EZs(C22981ABg c22981ABg) {
        this.A04 = c22981ABg;
    }
}
