package X;

import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.Cru, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29067Cru implements InterfaceC139386St {
    public final /* synthetic */ InterfaceC139386St A00;
    public final /* synthetic */ IgShowreelCompositionView A01;

    public C29067Cru(InterfaceC139386St interfaceC139386St, IgShowreelCompositionView igShowreelCompositionView) {
        this.A01 = igShowreelCompositionView;
        this.A00 = interfaceC139386St;
    }

    @Override // X.InterfaceC139386St
    public final void onFailure(Throwable th) {
        this.A01.A05();
        InterfaceC139386St interfaceC139386St = this.A00;
        if (interfaceC139386St != null) {
            interfaceC139386St.onFailure(th);
        }
    }

    @Override // X.InterfaceC139386St
    public final void onSuccess() {
        this.A01.A04();
        InterfaceC139386St interfaceC139386St = this.A00;
        if (interfaceC139386St != null) {
            interfaceC139386St.onSuccess();
        }
    }
}
