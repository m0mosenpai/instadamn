package X;

/* renamed from: X.0l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12610l6 implements AnonymousClass003, InterfaceC09670ek {
    public AnonymousClass003 A00;
    public final C00H A01;
    public final C07T A02;
    public final /* synthetic */ C00M A03;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07r, 1);
        if (c07r == C07R.ON_START) {
            this.A00 = this.A03.A03(this.A01);
            return;
        }
        if (c07r == C07R.ON_STOP) {
            AnonymousClass003 anonymousClass003 = this.A00;
            if (anonymousClass003 == null) {
                return;
            }
            anonymousClass003.cancel();
            return;
        }
        if (c07r != C07R.ON_DESTROY) {
            return;
        }
        cancel();
    }

    public C12610l6(C00H c00h, C00M c00m, C07T c07t) {
        this.A03 = c00m;
        this.A02 = c07t;
        this.A01 = c00h;
        c07t.A09(this);
    }

    @Override // X.AnonymousClass003
    public final void cancel() {
        this.A02.A0A(this);
        this.A01.A02.remove(this);
        AnonymousClass003 anonymousClass003 = this.A00;
        if (anonymousClass003 != null) {
            anonymousClass003.cancel();
        }
        this.A00 = null;
    }
}
