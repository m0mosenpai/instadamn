package X;

/* renamed from: X.6Ev, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ev implements InterfaceC13000lm {
    public C6Ey A00 = new C6Ey(new C6Ex());
    public final AbstractC12990ll A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(getClass());
        this.A00 = null;
    }

    public C6Ev(AbstractC12990ll abstractC12990ll) {
        this.A01 = abstractC12990ll;
    }
}
