package X;

/* renamed from: X.CtY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29167CtY implements InterfaceC13050lr {
    public final C05A A00;
    public final C0UO A01;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.Egh(C16930sl.A00);
        }
    }

    public C29167CtY() {
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A00 = A00;
        this.A01 = AbstractC208910l.A02(A00);
    }
}
