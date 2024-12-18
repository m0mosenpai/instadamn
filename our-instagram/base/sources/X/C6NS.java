package X;

/* renamed from: X.6NS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NS extends C58J implements C58L {
    public C6M3 A00;
    public InterfaceC137816Mf A01;
    public InterfaceC16820sZ A02;
    public boolean A03;
    public boolean A04;
    public C6OK A05;
    public InterfaceC16660sJ A06;
    public final InterfaceC16660sJ A07 = new C206929Dx(this, 21);

    public static final void A00(C6NS c6ns) {
        C206929Dx c206929Dx;
        c6ns.A05 = new C6OK(new C9EV(c6ns, 6), new C9EV(c6ns, 7), c6ns.A03);
        if (c6ns.A04) {
            c206929Dx = new C206929Dx(c6ns, 22);
        } else {
            c206929Dx = null;
        }
        c6ns.A06 = c206929Dx;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // X.C58L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ACC(X.InterfaceC113515Ao r6) {
        /*
            r5 = this;
            r0 = 1
            X.5At r1 = X.AbstractC113545Ar.A0G
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.EOx(r1, r0)
            X.0sJ r1 = r5.A07
            X.5At r0 = X.AbstractC113545Ar.A0A
            r6.EOx(r0, r1)
            X.6M3 r1 = r5.A00
            X.6M3 r0 = X.C6M3.Vertical
            r2 = 0
            if (r1 != r0) goto L19
            r2 = 1
        L19:
            java.lang.String r0 = "scrollAxisRange"
            r4 = 0
            X.6OK r1 = r5.A05
            if (r2 == 0) goto L58
            if (r1 == 0) goto L5d
            X.5At r0 = X.AbstractC113545Ar.A0W
        L24:
            r6.EOx(r0, r1)
            X.0sJ r2 = r5.A06
            if (r2 == 0) goto L35
            X.5At r1 = X.AbstractC120875de.A0L
            X.5dg r0 = new X.5dg
            r0.<init>(r4, r2)
            r6.EOx(r1, r0)
        L35:
            r0 = 5
            X.9EV r3 = new X.9EV
            r3.<init>(r5, r0)
            X.5At r2 = X.AbstractC120875de.A07
            r0 = 12
            X.9Ee r1 = new X.9Ee
            r1.<init>(r3, r0)
            X.5dg r0 = new X.5dg
            r0.<init>(r4, r1)
            r6.EOx(r2, r0)
            X.6Mf r0 = r5.A01
            X.6OL r1 = r0.AIT()
            X.5At r0 = X.AbstractC113545Ar.A00
            r6.EOx(r0, r1)
            return
        L58:
            if (r1 == 0) goto L5d
            X.5At r0 = X.AbstractC113545Ar.A08
            goto L24
        L5d:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NS.ACC(X.5Ao):void");
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    public C6NS(C6M3 c6m3, InterfaceC137816Mf interfaceC137816Mf, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC137816Mf;
        this.A00 = c6m3;
        this.A04 = z;
        this.A03 = z2;
        A00(this);
    }
}
