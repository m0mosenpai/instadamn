package X;

/* renamed from: X.5Zn, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zn extends C5AY implements C58L, C5DY, InterfaceC114155Db, InterfaceC114165Dd {
    public InterfaceC118945aB A00;
    public final C5Zo A01;
    public final C5Zp A02;
    public final C5Zq A03;

    public final void A0H(C5XO c5xo) {
        C28732CmQ c28732CmQ;
        C5Zo c5Zo = this.A01;
        if (!C14360o3.A0K(c5Zo.A01, c5xo)) {
            C5XO c5xo2 = c5Zo.A01;
            if (c5xo2 != null && (c28732CmQ = c5Zo.A00) != null) {
                ((C5XN) c5xo2).A00.F8m(new C28735CmT(c28732CmQ));
            }
            c5Zo.A00 = null;
            c5Zo.A01 = c5xo;
        }
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        InterfaceC118945aB interfaceC118945aB = this.A00;
        boolean z = false;
        if (interfaceC118945aB != null && interfaceC118945aB.CV1()) {
            z = true;
        }
        interfaceC113515Ao.EOx(AbstractC113545Ar.A06, Boolean.valueOf(z));
        interfaceC113515Ao.EOx(AbstractC120875de.A0I, new C120895dg(null, new C9EV(this, 3)));
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.Dg2, java.lang.Object] */
    @Override // X.C5DY
    public final void DHg(InterfaceC118945aB interfaceC118945aB) {
        C6Ng c6Ng;
        if (!C14360o3.A0K(this.A00, interfaceC118945aB)) {
            boolean CV1 = interfaceC118945aB.CV1();
            if (CV1) {
                C19L A05 = A05();
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(this, null, 0), A05);
            }
            if (this.A08) {
                AbstractC114335Dx.A02(this).A0M();
            }
            C5Zo c5Zo = this.A01;
            C5XO c5xo = c5Zo.A01;
            if (c5xo != null) {
                C28732CmQ c28732CmQ = null;
                C28732CmQ c28732CmQ2 = c5Zo.A00;
                if (CV1) {
                    if (c28732CmQ2 != null) {
                        C5Zo.A00(c5Zo, new C28735CmT(c28732CmQ2), c5xo);
                        c5Zo.A00 = null;
                    }
                    ?? obj = new Object();
                    C5Zo.A00(c5Zo, obj, c5xo);
                    c28732CmQ = obj;
                } else if (c28732CmQ2 != null) {
                    C5Zo.A00(c5Zo, new C28735CmT(c28732CmQ2), c5xo);
                }
                c5Zo.A00 = c28732CmQ;
            }
            C5Zq c5Zq = this.A03;
            if (CV1 != c5Zq.A00) {
                if (!CV1) {
                    if (c5Zq.A08) {
                        InterfaceC1130758u A00 = BFZ.A00(c5Zq, C6Ng.A02);
                        if ((A00 instanceof C6Ng) && (c6Ng = (C6Ng) A00) != null) {
                            c6Ng.A0F(null);
                        }
                    }
                } else {
                    C5Zq.A00(c5Zq);
                }
                c5Zq.A00 = CV1;
            }
            C5Zp c5Zp = this.A02;
            C6OD c6od = null;
            if (CV1) {
                ?? obj2 = new Object();
                AbstractC137676Lo.A00(c5Zp, new C9F8(0, obj2, c5Zp));
                C6OF c6of = (C6OF) obj2.A00;
                if (c6of != null) {
                    c6od = c6of.E4L();
                }
            } else {
                C6OE c6oe = c5Zp.A00;
                if (c6oe != null) {
                    c6oe.release();
                }
            }
            c5Zp.A00 = c6od;
            c5Zp.A01 = CV1;
            this.A00 = interfaceC118945aB;
        }
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        this.A03.DJc(interfaceC1131459c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Zo, X.58J, X.58K] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.5Zp, X.58J, X.58K] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.5Zq, X.58J, X.58K] */
    public C5Zn(C5XO c5xo) {
        ?? c58j = new C58J();
        c58j.A01 = c5xo;
        A0F(c58j);
        this.A01 = c58j;
        ?? c58j2 = new C58J();
        A0F(c58j2);
        this.A02 = c58j2;
        ?? c58j3 = new C58J();
        A0F(c58j3);
        this.A03 = c58j3;
        A0F(new C58J());
    }
}
