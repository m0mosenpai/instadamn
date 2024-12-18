package X;

/* loaded from: classes7.dex */
public final class J1F implements InterfaceC62602sz {
    public final int A00;
    public final Object A01;

    public J1F(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C155946zO c155946zO;
        if (this.A00 != 0) {
            c155946zO = ((HEM) ((AbstractC60672pq) this.A01).getAdapter()).A01;
        } else {
            HEO heo = ((HD7) this.A01).A01;
            if (heo == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            c155946zO = heo.A04;
        }
        return AbstractC166987dD.A1b(((AbstractC65332xV) c155946zO).A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        if (this.A00 != 0) {
            InterfaceC09390do interfaceC09390do = ((HDL) this.A01).A0D;
            if (((C38333GtS) interfaceC09390do.getValue()).A08() && C38333GtS.A00(interfaceC09390do) != C05F.A01) {
                return false;
            }
            return true;
        }
        C154786xT c154786xT = ((HD7) this.A01).A03;
        if (c154786xT == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return c154786xT.A03.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        if (this.A00 != 0) {
            return false;
        }
        C154786xT c154786xT = ((HD7) this.A01).A03;
        if (c154786xT == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return c154786xT.A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC62602sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CXf() {
        /*
            r2 = this;
            int r0 = r2.A00
            if (r0 == 0) goto L21
            boolean r0 = r2.isLoading()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = r2.A01
            X.HDL r0 = (X.HDL) r0
            X.0do r0 = r0.A0D
            java.lang.Object r1 = X.C38333GtS.A00(r0)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L1f
            boolean r0 = r2.CLJ()
        L1c:
            r1 = 0
            if (r0 == 0) goto L20
        L1f:
            r1 = 1
        L20:
            return r1
        L21:
            boolean r0 = r2.isLoading()
            if (r0 == 0) goto L1f
            boolean r0 = r2.CL7()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J1F.CXf():boolean");
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        if (this.A00 != 0) {
            HDL.A06((HDL) this.A01, false, false);
        } else {
            HD7.A02((HD7) this.A01, false, true);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        if (this.A00 != 0) {
            return AbstractC167007dF.A1X(C38333GtS.A00(((HDL) this.A01).A0D), C05F.A01);
        }
        C154786xT c154786xT = ((HD7) this.A01).A03;
        if (c154786xT == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return c154786xT.A02();
    }
}
