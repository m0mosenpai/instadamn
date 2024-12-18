package X;

/* renamed from: X.2lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58372lw extends AbstractC58382lx implements InterfaceC09670ek {
    public final C07X A00;
    public final /* synthetic */ C2GT A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58372lw(C07X c07x, C2GT c2gt, InterfaceC58362lv interfaceC58362lv) {
        super(c2gt, interfaceC58362lv);
        this.A01 = c2gt;
        this.A00 = c07x;
    }

    @Override // X.AbstractC58382lx
    public final void A00() {
        this.A00.getLifecycle().A0A(this);
    }

    @Override // X.AbstractC58382lx
    public final boolean A02() {
        return this.A00.getLifecycle().A07().A00(C07S.STARTED);
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C07X c07x2 = this.A00;
        C07S A07 = c07x2.getLifecycle().A07();
        if (A07 == C07S.DESTROYED) {
            this.A01.A08(this.A02);
            return;
        }
        C07S c07s = null;
        while (c07s != A07) {
            A01(A02());
            c07s = A07;
            A07 = c07x2.getLifecycle().A07();
        }
    }
}
