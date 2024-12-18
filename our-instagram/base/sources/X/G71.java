package X;

/* loaded from: classes6.dex */
public final class G71 implements InterfaceC71950XCc {
    public final /* synthetic */ C32272EJh A00;

    public G71(C32272EJh c32272EJh) {
        this.A00 = c32272EJh;
    }

    @Override // X.InterfaceC71950XCc
    public final void onFailure() {
        C9GR.A0E(this.A00.requireContext(), "request_error");
    }

    @Override // X.InterfaceC71950XCc
    public final void onSuccess() {
        C32272EJh c32272EJh = this.A00;
        c32272EJh.A06 = true;
        C32272EJh.A01(c32272EJh);
    }
}
