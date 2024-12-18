package X;

/* loaded from: classes6.dex */
public final class G70 implements InterfaceC71950XCc {
    public final /* synthetic */ EK9 A00;

    @Override // X.InterfaceC71950XCc
    public final void onSuccess() {
    }

    public G70(EK9 ek9) {
        this.A00 = ek9;
    }

    @Override // X.InterfaceC71950XCc
    public final void onFailure() {
        C9GR.A07(this.A00.requireContext(), 2131972429);
    }
}
