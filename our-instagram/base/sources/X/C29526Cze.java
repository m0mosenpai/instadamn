package X;

/* renamed from: X.Cze, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29526Cze implements InterfaceC30962DjJ {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29526Cze) && this.A00 == ((C29526Cze) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // X.InterfaceC30962DjJ
    public final AbstractC50812Vc EqC(C2Z1 c2z1) {
        return new C26334Bkf(this.A00, C05F.A00);
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("Glimmer(id=", this.A00);
    }

    public C29526Cze(int i) {
        this.A00 = i;
    }
}
