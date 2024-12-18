package X;

/* loaded from: classes7.dex */
public final class J1I implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ C38934HCh A00;

    public J1I(C38934HCh c38934HCh) {
        this.A00 = c38934HCh;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        IME ime = this.A00.A0A;
        if (ime == null) {
            C14360o3.A0F("requestController");
            throw C00O.createAndThrow();
        }
        if (ime.A00.A06()) {
            Chd();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C65823Tug c65823Tug = this.A00.A03;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        return c65823Tug.A0A();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        IME ime = this.A00.A0A;
        if (ime == null) {
            C14360o3.A0F("requestController");
            throw C00O.createAndThrow();
        }
        return ime.A00.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        IME ime = this.A00.A0A;
        if (ime == null) {
            C14360o3.A0F("requestController");
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1b(ime.A00);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C38934HCh.A05(this.A00, false);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        IME ime = this.A00.A0A;
        if (ime == null) {
            C14360o3.A0F("requestController");
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1a(ime.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            return CL7();
        }
        return true;
    }
}
