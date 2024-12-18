package X;

import androidx.compose.ui.window.PopupLayout;

/* loaded from: classes5.dex */
public final class D8S extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C28268CdD A02;
    public final /* synthetic */ PopupLayout A03;
    public final /* synthetic */ C15130pT A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8S(C28268CdD c28268CdD, PopupLayout popupLayout, C15130pT c15130pT, long j, long j2) {
        super(0);
        this.A04 = c15130pT;
        this.A03 = popupLayout;
        this.A02 = c28268CdD;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C15130pT c15130pT = this.A04;
        PopupLayout popupLayout = this.A03;
        c15130pT.A00 = popupLayout.A01.AFF(this.A02, popupLayout.A00, this.A01, this.A00);
        return C0eB.A00;
    }
}
