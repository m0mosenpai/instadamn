package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;

/* loaded from: classes9.dex */
public final class PJT implements InterfaceC58160PqP {
    public final /* synthetic */ InterfaceC16820sZ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public PJT(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3) {
        this.A00 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A01 = interfaceC16820sZ2;
        this.A03 = interfaceC16660sJ3;
    }

    @Override // X.InterfaceC58160PqP
    public final void CvQ() {
        this.A00.invoke();
    }

    @Override // X.InterfaceC58160PqP
    public final void D3G() {
        this.A01.invoke();
    }

    @Override // X.InterfaceC58160PqP
    public final void DCm(NewFundraiserInfo newFundraiserInfo) {
        this.A02.invoke(newFundraiserInfo);
    }

    @Override // X.InterfaceC58160PqP
    public final void E5H(NewFundraiserInfo newFundraiserInfo) {
        this.A04.invoke(newFundraiserInfo);
    }
}
