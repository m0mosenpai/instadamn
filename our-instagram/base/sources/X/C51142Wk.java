package X;

/* renamed from: X.2Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51142Wk extends AbstractC50792Va {
    public AbstractC50812Vc A00;

    @Override // X.AbstractC50792Va, X.AbstractC50812Vc
    public final C78063eY A0F(BB3 bb3, C76133bI c76133bI, C2Y5 c2y5, int i, int i2) {
        C2W1 A02;
        C14360o3.A0B(c76133bI, 0);
        C14360o3.A0B(c2y5, 1);
        C2XE c2xe = c2y5.A04;
        AbstractC50812Vc abstractC50812Vc = this.A00;
        if (abstractC50812Vc == null) {
            A02 = null;
        } else {
            A02 = C76163bL.A02(abstractC50812Vc, c2xe, c76133bI);
        }
        return new C78063eY(((AbstractC50792Va) this).A00, A02);
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this == abstractC50812Vc) {
            return true;
        }
        if (!(abstractC50812Vc instanceof C51142Wk)) {
            return false;
        }
        C51142Wk c51142Wk = (C51142Wk) abstractC50812Vc;
        if (((AbstractC50812Vc) this).A00 != ((AbstractC50812Vc) c51142Wk).A00) {
            return C51372Xk.A04(this.A00, c51142Wk.A00, z);
        }
        return true;
    }

    public C51142Wk() {
        super("Wrapper");
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0b() {
        return this.A00;
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0c(C2XE c2xe) {
        return this;
    }
}
