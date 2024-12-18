package X;

/* renamed from: X.7xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179427xs implements InterfaceC179087xK, InterfaceC179437xt, InterfaceC179447xu {
    public InterfaceC200678uA A00;
    public AbstractC179397xp A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public InterfaceC180227zC A07;
    public C22981ABg A08;
    public final C178747wm A09;
    public final AbstractC179397xp A0B;
    public final boolean A0C;
    public volatile InterfaceC1809280u A0E;
    public final C179457xv A0A = new Object();
    public volatile int A0D = 5;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xv, java.lang.Object] */
    public C179427xs(C178747wm c178747wm, AbstractC179397xp abstractC179397xp, AbstractC179397xp abstractC179397xp2, boolean z) {
        this.A09 = c178747wm;
        this.A0B = abstractC179397xp;
        this.A01 = abstractC179397xp2;
        this.A0C = z;
    }

    public final synchronized void A02(int i) {
        this.A0D = i;
    }

    @Override // X.InterfaceC179437xt
    public final Object BOS() {
        return this;
    }

    @Override // X.InterfaceC179437xt
    public final synchronized int BaJ() {
        return this.A0D;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179437xt
    public final boolean CTm(InterfaceC179467xw interfaceC179467xw) {
        return true;
    }

    @Override // X.InterfaceC179437xt
    public final boolean contains(Object obj) {
        return obj == this;
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    private void A00() {
        if (this.A00 == null) {
            InterfaceC180227zC interfaceC180227zC = this.A07;
            if (interfaceC180227zC == null) {
                this.A09.A00(EnumC200658u8.A0F);
                return;
            }
            int i = this.A06;
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            int i2 = this.A05;
            if (i2 <= 0) {
                z = false;
            }
            if (z2) {
                if (z) {
                    InterfaceC200678uA AMH = interfaceC180227zC.C6t().AMH(null, interfaceC180227zC, i, i2, this.A0C);
                    this.A00 = AMH;
                    C179457xv c179457xv = this.A0A;
                    c179457xv.A04 = AMH.getTexture();
                    int i3 = 3;
                    if (AMH.is10Bit()) {
                        i3 = 7;
                    }
                    c179457xv.A00 = i3;
                    return;
                }
            } else {
                this.A09.A00(EnumC200658u8.A0H);
                if (z) {
                    return;
                }
            }
            this.A09.A00(EnumC200658u8.A0G);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01() {
        InterfaceC200678uA interfaceC200678uA = this.A00;
        if (interfaceC200678uA != null) {
            try {
                interfaceC200678uA.release();
            } finally {
                this.A00 = null;
                this.A0A.A04 = null;
            }
        }
    }

    public final void A03(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (i3 % 180 != 0) {
            i4 = i2;
            i5 = i;
        }
        if (this.A06 == i4 && this.A05 == i5 && this.A04 == i3 && this.A00 != null) {
            return;
        }
        this.A04 = i3;
        this.A06 = i4;
        this.A05 = i5;
        if (this.A07 != null) {
            A01();
            A00();
        }
        AbstractC179397xp abstractC179397xp = this.A0B;
        abstractC179397xp.A09(this.A06, this.A05, i, i2, this.A04, false, false);
        this.A0A.A05 = abstractC179397xp.A08();
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A07 = interfaceC180227zC;
        A00();
    }

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        return this.A0A;
    }

    @Override // X.InterfaceC179447xu
    public final int BHw() {
        return this.A0A.A00;
    }

    @Override // X.InterfaceC179437xt
    public final int BaF() {
        return this.A0A.A00;
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ boolean CZh() {
        return false;
    }

    @Override // X.InterfaceC179437xt
    public final boolean Cem() {
        return this.A03;
    }

    @Override // X.InterfaceC179437xt
    public final Exception Cmh() {
        InterfaceC200678uA interfaceC200678uA = this.A00;
        if (interfaceC200678uA == null || this.A07 == null) {
            if (interfaceC200678uA == null) {
                this.A09.A00(EnumC200658u8.A0J);
                return new IllegalStateException("Frame buffer is null");
            }
            if (this.A07 == null) {
                this.A09.A00(EnumC200658u8.A0K);
                return new IllegalStateException("Gl context is null");
            }
        }
        try {
            interfaceC200678uA.bind();
            AbstractC180237zD.A02("Failure to bind frame buffer", new Object[0]);
            return null;
        } catch (C80D e) {
            this.A09.A00(EnumC200658u8.A0I);
            return e;
        }
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBc(InterfaceC179467xw interfaceC179467xw) {
        return FBd(interfaceC179467xw, this.A01);
    }

    @Override // X.InterfaceC179437xt
    public final void swapBuffers() {
        InterfaceC200678uA interfaceC200678uA = this.A00;
        if (interfaceC200678uA == null) {
            this.A09.A00(EnumC200658u8.A0N);
            return;
        }
        C22981ABg c22981ABg = this.A08;
        if (c22981ABg != null) {
            c22981ABg.A00(interfaceC200678uA.getWidth(), interfaceC200678uA.getHeight());
        }
        this.A00.unbind();
        InterfaceC1809280u interfaceC1809280u = this.A0E;
        if (interfaceC1809280u == null) {
            return;
        }
        interfaceC1809280u.DIE();
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A0E = interfaceC1809280u;
    }

    @Override // X.InterfaceC179437xt
    public final void EZs(C22981ABg c22981ABg) {
        this.A08 = c22981ABg;
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBd(InterfaceC179467xw interfaceC179467xw, AbstractC179397xp abstractC179397xp) {
        C178747wm c178747wm;
        EnumC200658u8 enumC200658u8;
        C179407xq CGV = interfaceC179467xw.CGV();
        if (CGV != null) {
            if (!CGV.A00()) {
                c178747wm = this.A09;
                enumC200658u8 = EnumC200658u8.A0O;
            } else {
                abstractC179397xp.A09(CGV.A01, CGV.A00, this.A06, this.A05, -this.A04, false, this.A02);
                C179457xv c179457xv = this.A0A;
                c179457xv.A02 = interfaceC179467xw.BaI();
                c179457xv.A01 = interfaceC179467xw.AxI();
                c179457xv.A03 = interfaceC179467xw.C8d();
                c179457xv.A06 = interfaceC179467xw.CVE();
                return abstractC179397xp.A08();
            }
        } else {
            c178747wm = this.A09;
            enumC200658u8 = EnumC200658u8.A0P;
        }
        c178747wm.A00(enumC200658u8);
        return null;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        A01();
        this.A07 = null;
    }
}
