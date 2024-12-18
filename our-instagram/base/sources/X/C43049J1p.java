package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J1p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43049J1p implements InterfaceC37219GaU {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C37061o4 A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
    }

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
    }

    public C43049J1p(UserSession userSession, C37061o4 c37061o4, String str) {
        this.A01 = c37061o4;
        this.A00 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        C37061o4.A01(this.A00, C05F.A00, this.A02);
    }
}
