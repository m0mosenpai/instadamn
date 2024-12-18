package X;

import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.Crt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29066Crt implements InterfaceC139386St {
    public final int A00;
    public final Object A01;

    public C29066Crt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC139386St
    public final void onFailure(Throwable th) {
        if (this.A00 == 0) {
            ((IgShowreelCompositionView) this.A01).A05();
        }
    }

    @Override // X.InterfaceC139386St
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                ((IgShowreelCompositionView) this.A01).A04();
                return;
            case 1:
                InterfaceC31041Dkf interfaceC31041Dkf = (InterfaceC31041Dkf) this.A01;
                if (interfaceC31041Dkf == null) {
                    return;
                }
                interfaceC31041Dkf.DPV();
                return;
            default:
                return;
        }
    }
}
