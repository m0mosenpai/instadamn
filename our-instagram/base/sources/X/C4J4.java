package X;

/* renamed from: X.4J4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4J4 implements C4J5 {
    public final /* synthetic */ C26581Qn A00;
    public final /* synthetic */ C23311Bt A01;
    public final /* synthetic */ InterfaceC27191Tt A02;
    public final /* synthetic */ boolean A03;

    public C4J4(C26581Qn c26581Qn, C23311Bt c23311Bt, InterfaceC27191Tt interfaceC27191Tt, boolean z) {
        this.A01 = c23311Bt;
        this.A02 = interfaceC27191Tt;
        this.A03 = z;
        this.A00 = c26581Qn;
    }

    @Override // X.InterfaceC27201Tu
    public final void FAL(C1Ef c1Ef) {
        this.A02.FAL(c1Ef);
    }

    @Override // X.InterfaceC27201Tu
    public final void cancel() {
        this.A02.cancel();
    }

    @Override // X.InterfaceC27201Tu
    public final int getRequestId() {
        throw C00O.createAndThrow();
    }
}
