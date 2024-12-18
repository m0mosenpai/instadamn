package X;

/* renamed from: X.12s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C214012s extends C12T {
    public static final C214012s A00 = new C12T();

    @Override // X.C12T
    public final void A04(Runnable runnable, C12W c12w) {
        C12Q c12q = C12Q.A00;
        c12q.A00.A05(runnable, AbstractC212912g.A06, true);
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        C12Q c12q = C12Q.A00;
        c12q.A00.A05(runnable, AbstractC212912g.A06, false);
    }

    @Override // X.C12T
    public final C12T A03(int i) {
        AbstractC214112t.A00(i);
        if (i >= AbstractC212912g.A02) {
            return this;
        }
        AbstractC214112t.A00(i);
        return new C214212u(this, i);
    }
}
