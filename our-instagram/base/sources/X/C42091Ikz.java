package X;

/* renamed from: X.Ikz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42091Ikz implements InterfaceC48212Jk {
    public final /* synthetic */ C1P1 A00;

    public C42091Ikz(C1P1 c1p1) {
        this.A00 = c1p1;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C0K8.A0F("CommerceCartAddProductToCartController", "Failed to request CommerceCartGlobalCartQuery", th);
        C1P1 c1p1 = this.A00;
        C14360o3.A0A(th);
        c1p1.onFail(new C115095Ie(th));
    }
}
