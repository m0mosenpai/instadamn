package X;

/* renamed from: X.WnV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71073WnV implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ V1R A00;

    public C71073WnV(V1R v1r) {
        this.A00 = v1r;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        V1R v1r = this.A00;
        W4b w4b = v1r.A0I;
        if (w4b == null) {
            C14360o3.A0F("feedRequestController");
            throw C00O.createAndThrow();
        }
        if (W4b.A00(w4b.A00, w4b).A02.A06()) {
            V1R.A04(v1r);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C65823Tug c65823Tug = this.A00.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1O(c65823Tug.A0E.getCount());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        W4b w4b = this.A00.A0I;
        if (w4b == null) {
            C14360o3.A0F("feedRequestController");
            throw C00O.createAndThrow();
        }
        return W4b.A00(w4b.A00, w4b).A02.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        W4b w4b = this.A00.A0I;
        if (w4b == null) {
            C14360o3.A0F("feedRequestController");
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1b(W4b.A00(w4b.A00, w4b).A02);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        W4b w4b = this.A00.A0I;
        if (w4b == null) {
            C14360o3.A0F("feedRequestController");
            throw C00O.createAndThrow();
        }
        if (AbstractC37303Gc4.A1a(W4b.A00(w4b.A00, w4b).A02)) {
            return CL7();
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        V1R.A04(this.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        W4b w4b = this.A00.A0I;
        if (w4b == null) {
            C14360o3.A0F("feedRequestController");
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1a(W4b.A00(w4b.A00, w4b).A02);
    }
}
