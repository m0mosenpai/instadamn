package X;

/* loaded from: classes9.dex */
public final class PIB implements InterfaceC62602sz {
    public final int A00;
    public final Object A01;

    public PIB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C65823Tug c65823Tug;
        switch (this.A00) {
            case 0:
                c65823Tug = ((N73) this.A01).A01();
                return c65823Tug.A0A();
            case 1:
                return !((C45511KDa) this.A01).A0G;
            case 2:
                c65823Tug = ((AbstractC67878V0j) this.A01).A06;
                if (c65823Tug == null) {
                    C14360o3.A0F("grid");
                    throw C00O.createAndThrow();
                }
                return c65823Tug.A0A();
            default:
                c65823Tug = ((AbstractC52113N4l) this.A01).A01();
                return c65823Tug.A0A();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        switch (this.A00) {
            case 0:
                return ((N73) this.A01).A02.A00;
            case 1:
                return ((C45511KDa) this.A01).A0E;
            case 2:
                return C14360o3.A0K(((AbstractC67878V0j) this.A01).A07().A04.A02(), C52717NUf.A00);
            default:
                return ((AbstractC52113N4l) this.A01).A02.A00;
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        switch (this.A00) {
            case 0:
                return ((N73) this.A01).A02.A01;
            case 1:
                return false;
            case 2:
                return C14360o3.A0K(((AbstractC67878V0j) this.A01).A07().A04.A02(), NUd.A00);
            default:
                return ((AbstractC52113N4l) this.A01).A02.A01;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC62602sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CXf() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L3b;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r2.A01
            X.N4l r1 = (X.AbstractC52113N4l) r1
            X.OTp r0 = r1.A02
            boolean r0 = r0.A02
            if (r0 == 0) goto L18
            X.Tug r0 = r1.A01()
        L13:
            boolean r1 = r0.A0A()
        L17:
            return r1
        L18:
            boolean r0 = r1 instanceof X.C53039NdB
            goto L37
        L1b:
            java.lang.Object r1 = r2.A01
            X.KDa r1 = (X.C45511KDa) r1
            boolean r0 = r1.A0E
            if (r0 == 0) goto L48
            boolean r0 = r1.A0D
            goto L45
        L26:
            java.lang.Object r1 = r2.A01
            X.N73 r1 = (X.N73) r1
            X.OTj r0 = r1.A02
            boolean r0 = r0.A02
            if (r0 == 0) goto L35
            X.Tug r0 = r1.A01()
            goto L13
        L35:
            boolean r0 = r1 instanceof X.C52608NPd
        L37:
            if (r0 == 0) goto L48
            r1 = 1
            return r1
        L3b:
            boolean r0 = r2.isLoading()
            if (r0 != 0) goto L48
            boolean r0 = r2.CL7()
        L45:
            r1 = 1
            if (r0 != 0) goto L17
        L48:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIB.CXf():boolean");
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        switch (this.A00) {
            case 0:
                ((N73) this.A01).A04(false);
                return;
            case 1:
                return;
            case 2:
                ((AbstractC67878V0j) this.A01).A07().A04();
                return;
            default:
                ((AbstractC52113N4l) this.A01).A04(false);
                return;
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        switch (this.A00) {
            case 0:
                return ((N73) this.A01).A02.A02;
            case 1:
                return ((C45511KDa) this.A01).A0D;
            case 2:
                return C14360o3.A0K(((AbstractC67878V0j) this.A01).A07().A04.A02(), NUe.A00);
            default:
                return ((AbstractC52113N4l) this.A01).A02.A02;
        }
    }
}
