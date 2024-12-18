package X;

/* renamed from: X.7IV, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7IV implements InterfaceC62602sz {
    public C7VB A00;

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return true;
    }

    public final void A00(C7VB c7vb) {
        if (this instanceof C7Mr) {
            ((C7Mr) this).A00.A00.A00(c7vb);
        } else {
            ((C7IU) this).A00.Chf();
        }
    }

    public final boolean A01(C7VB c7vb) {
        if (this instanceof C7Mr) {
            return ((C7Mr) this).A00.A00.A01(c7vb);
        }
        return c7vb.A00;
    }

    public final boolean A02(C7VB c7vb) {
        if (this instanceof C7Mr) {
            return ((C7Mr) this).A00.A00.A02(c7vb);
        }
        return c7vb.A01;
    }

    public final boolean A03(C7VB c7vb) {
        if (this instanceof C7Mr) {
            return ((C7Mr) this).A00.A00.A03(c7vb);
        }
        if (((C7IU) this).A01.CCa() == null) {
            return false;
        }
        return true;
    }

    public final boolean A04(C7VB c7vb) {
        if (this instanceof C7Mr) {
            return ((C7Mr) this).A00.A00.A04(c7vb);
        }
        if (!c7vb.A02 && !c7vb.A03) {
            if (c7vb.A00 && !c7vb.A01) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C7VB c7vb = this.A00;
        if (c7vb != null) {
            return A01(c7vb);
        }
        C0w9.A03("ModelBasedLoadMoreDelegate", "calling hasMoreItems() when model is null");
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C7VB c7vb = this.A00;
        if (c7vb != null) {
            return A02(c7vb);
        }
        C0w9.A03("ModelBasedLoadMoreDelegate", "calling isFailed() when model is null");
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        C7VB c7vb = this.A00;
        if (c7vb != null) {
            return A03(c7vb);
        }
        C0w9.A03("ModelBasedLoadMoreDelegate", "calling isLoadMoreVisible() when model is null");
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C7VB c7vb = this.A00;
        if (c7vb != null) {
            A00(c7vb);
        } else {
            C0w9.A03("ModelBasedLoadMoreDelegate", "calling loadMore() when model is null");
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C7VB c7vb = this.A00;
        if (c7vb != null) {
            return A04(c7vb);
        }
        C0w9.A03("ModelBasedLoadMoreDelegate", "calling isLoading() when model is null");
        return false;
    }
}
