package X;

import android.graphics.RectF;

/* renamed from: X.8op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197788op implements InterfaceC179087xK, InterfaceC179447xu, InterfaceC1809180t {
    public int A00;
    public int A01;
    public int A02;
    public RectF A03;
    public InterfaceC180227zC A04;
    public InterfaceC1809280u A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC199678sJ A09;
    public final C179457xv A0A;
    public final C197818os A0B;
    public final AbstractC179397xp A0C;
    public final boolean A0D;
    public final float[] A0E = new float[16];
    public final InterfaceC197808or A08 = new InterfaceC197808or() { // from class: X.8oq
        @Override // X.InterfaceC197808or
        public final void EUo(EnumC197748ol enumC197748ol, InterfaceC199678sJ interfaceC199678sJ) {
        }

        @Override // X.InterfaceC197808or
        public final InterfaceC178897x1 B09() {
            InterfaceC180227zC interfaceC180227zC = C197788op.this.A04;
            if (interfaceC180227zC != null) {
                return interfaceC180227zC.B09();
            }
            return null;
        }

        @Override // X.InterfaceC197808or
        public final void CtB(InterfaceC199678sJ interfaceC199678sJ) {
            InterfaceC1809280u interfaceC1809280u = C197788op.this.A05;
            if (interfaceC1809280u != null) {
                interfaceC1809280u.DIE();
            }
        }
    };

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    public final C179407xq A00() {
        int i;
        boolean z;
        boolean z2;
        AbstractC179397xp abstractC179397xp;
        boolean z3 = false;
        if (this.A02 % 180 != 0) {
            z3 = true;
        }
        InterfaceC199678sJ interfaceC199678sJ = this.A09;
        int BIB = interfaceC199678sJ.BIB();
        int BI0 = interfaceC199678sJ.BI0();
        int i2 = this.A01;
        if (i2 <= 0 || (i = this.A00) <= 0) {
            i2 = BIB;
            i = BI0;
            if (z3) {
                i2 = BI0;
                i = BIB;
            }
        }
        if (this.A0D) {
            float[] fArr = this.A0E;
            interfaceC199678sJ.CAY(fArr);
            abstractC179397xp = this.A0C;
            abstractC179397xp.A0A(fArr);
            int i3 = BI0;
            if (!z3) {
                i3 = BIB;
                BIB = BI0;
            }
            abstractC179397xp.A09(i3, BIB, i2, i, 0, false, false);
        } else {
            if (z3) {
                z = this.A07;
                z2 = this.A06;
            } else {
                z = this.A06;
                z2 = this.A07;
            }
            abstractC179397xp = this.A0C;
            abstractC179397xp.A09(BIB, BI0, i2, i, this.A02, z, z2);
        }
        C179407xq A08 = abstractC179397xp.A08();
        this.A0A.A05 = A08;
        RectF rectF = this.A03;
        if (rectF != null) {
            float f = A08.A01;
            int round = Math.round(rectF.left * f);
            int round2 = Math.round(A08.A00 * rectF.top);
            int round3 = Math.round(f * rectF.width());
            int round4 = Math.round(A08.A00 * this.A03.height());
            C197818os c197818os = this.A0B;
            c197818os.A00(1.0f, 1.0f, 0.0f, round, round2, round3, round4);
            return c197818os.CGV();
        }
        return A08;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A04 = interfaceC180227zC;
        this.A09.CNf(this.A08);
    }

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        long ANc;
        C179457xv c179457xv = this.A0A;
        c179457xv.A06 = false;
        InterfaceC199678sJ interfaceC199678sJ = this.A09;
        c179457xv.A04 = interfaceC199678sJ.B8Y().A00();
        if (interfaceC199678sJ.CLp()) {
            ANc = ((C201278vB) interfaceC199678sJ.B8Y()).A00;
        } else {
            ANc = interfaceC199678sJ.Aoh().ANc();
        }
        c179457xv.A03 = ANc;
        c179457xv.A00 = interfaceC199678sJ.ApO();
        A00();
        if (this.A03 != null) {
            return this.A0B;
        }
        return c179457xv;
    }

    @Override // X.InterfaceC179447xu
    public final int BHw() {
        return this.A09.ApO();
    }

    @Override // X.InterfaceC1809180t
    public final C179407xq FBE(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i3;
        this.A00 = i4;
        C179407xq A00 = A00();
        A00.getClass();
        return A00;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        this.A09.destroy();
        this.A04 = null;
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        this.A09.release();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7xv, java.lang.Object, X.7xw] */
    @Deprecated
    public C197788op(InterfaceC199678sJ interfaceC199678sJ, boolean z) {
        this.A09 = interfaceC199678sJ;
        ?? obj = new Object();
        this.A0A = obj;
        C197818os c197818os = new C197818os();
        this.A0B = c197818os;
        c197818os.A00 = obj;
        this.A0C = new C179387xo();
        this.A0D = z;
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A05 = interfaceC1809280u;
    }
}
