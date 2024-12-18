package X;

import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2;

/* loaded from: classes9.dex */
public final class PVA implements InterfaceC19390xP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public PVA(InterfaceC19390xP interfaceC19390xP, int i) {
        this.A01 = interfaceC19390xP;
        this.A00 = i;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A01, new PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2(interfaceC19960yQ, this.A00));
    }
}
