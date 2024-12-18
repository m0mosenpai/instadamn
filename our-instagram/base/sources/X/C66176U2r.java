package X;

import android.view.View;

/* renamed from: X.U2r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66176U2r implements InterfaceC59892oW {
    public final /* synthetic */ C56352iT A00;
    public final /* synthetic */ C38P A01;

    public C66176U2r(C56352iT c56352iT, C38P c38p) {
        this.A00 = c56352iT;
        this.A01 = c38p;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        C56352iT c56352iT = this.A00;
        View view = c56352iT.A0N;
        view.setVisibility(0);
        C38P c38p = this.A01;
        C66177U2s c66177U2s = new C66177U2s(c38p.requireActivity(), c38p.getSession(), AbstractC166987dD.A1J(view), c56352iT.AYS(), i);
        c38p.A0S = c66177U2s;
        C65823Tug c65823Tug = c38p.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        c65823Tug.A09(c66177U2s);
        c38p.mLifecycleRegistry.A09(c66177U2s);
    }
}
