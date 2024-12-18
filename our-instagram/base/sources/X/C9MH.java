package X;

/* renamed from: X.9MH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MH implements InterfaceC57292k4 {
    public final int A00;
    public final Object A01;

    public C9MH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57292k4
    public final void DVZ(final C4PX c4px) {
        C81Y c81y;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c4px, 0);
                c81y = ((KCD) this.A01).A00;
                break;
            case 1:
                C14360o3.A0B(c4px, 0);
                C57992lC c57992lC = C57982lB.A0B;
                final C9LP c9lp = (C9LP) this.A01;
                c57992lC.A05(c9lp.requireActivity(), new Runnable() { // from class: X.9LY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C81Y c81y2 = c9lp.A02;
                        if (c81y2 != null) {
                            c81y2.A03(c4px);
                        }
                    }
                });
                return;
            default:
                C14360o3.A0B(c4px, 0);
                c81y = ((AbstractC67881V0m) this.A01).A01;
                break;
        }
        if (c81y != null) {
            c81y.A03(c4px);
        }
    }
}
