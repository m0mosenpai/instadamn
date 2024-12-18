package X;

/* renamed from: X.3yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89133yF implements InterfaceC27191Tt {
    public InterfaceC27191Tt A00;
    public final int A01;

    @Override // X.InterfaceC27201Tu
    public final void FAL(C1Ef c1Ef) {
        C18C.A07(this.A00, "setDelegate should get called before this");
        this.A00.FAL(c1Ef);
    }

    @Override // X.InterfaceC27201Tu
    public final void cancel() {
        C18C.A07(this.A00, "setDelegate should get called before this");
        this.A00.cancel();
    }

    @Override // X.InterfaceC27201Tu
    public final int getRequestId() {
        return this.A01;
    }

    public C89133yF(int i) {
        this.A01 = i;
    }
}
