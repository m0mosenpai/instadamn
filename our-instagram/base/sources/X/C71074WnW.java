package X;

/* renamed from: X.WnW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71074WnW implements InterfaceC62602sz, InterfaceC62612t0 {
    public final /* synthetic */ V1B A00;

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    public C71074WnW(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        V1B.A04(this.A00, false);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C68034V7f c68034V7f = this.A00.A07;
        return !(!(!C68034V7f.A00(c68034V7f.A00, c68034V7f).A02.isEmpty()));
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        V1B v1b = this.A00;
        return v1b.A0D.A02(v1b.A07.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        V1B v1b = this.A00;
        W5E w5e = v1b.A0D;
        if (w5e != null && AbstractC37303Gc4.A1b(W5E.A00(w5e, v1b.A07.A00).A04)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        V1B.A04(this.A00, true);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        V1B v1b = this.A00;
        W5E w5e = v1b.A0D;
        if (w5e != null) {
            if (AbstractC37303Gc4.A1a(W5E.A00(w5e, v1b.A07.A00).A04) || v1b.A0G == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
