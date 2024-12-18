package X;

/* renamed from: X.JRr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43633JRr implements InterfaceC62602sz {
    public final JR2 A00;

    public C43633JRr(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A00 = jr2;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return AbstractC166987dD.A1b(this.A00.A0q().A0E.A0O);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return JQ0.A1Y(this.A00);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC43593JPy.A0V(this.A00).BOD().CUG();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        JR2 jr2 = this.A00;
        if (!jr2.A19() || !((InterfaceC70513Em) jr2.A10.getValue()).isLoading()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        this.A00.A10();
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return this.A00.A19();
    }
}
