package X;

/* loaded from: classes9.dex */
public final class P3C implements InterfaceC58151PqG {
    public final /* synthetic */ InterfaceC58151PqG A00;
    public final /* synthetic */ C52691NTc A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public P3C(InterfaceC58151PqG interfaceC58151PqG, C52691NTc c52691NTc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = interfaceC58151PqG;
        this.A01 = c52691NTc;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC58151PqG
    public final void Dar() {
        InterfaceC58151PqG interfaceC58151PqG = this.A00;
        if (interfaceC58151PqG != null) {
            interfaceC58151PqG.Dar();
        }
        this.A02.invoke();
    }

    @Override // X.InterfaceC58151PqG
    public final void Dja() {
        InterfaceC58151PqG interfaceC58151PqG = this.A00;
        if (interfaceC58151PqG != null) {
            interfaceC58151PqG.Dja();
        }
        this.A03.invoke();
    }

    @Override // X.InterfaceC58151PqG
    public final void onDismiss() {
        Integer num;
        InterfaceC58151PqG interfaceC58151PqG = this.A00;
        if (interfaceC58151PqG != null) {
            interfaceC58151PqG.onDismiss();
        }
        C52691NTc c52691NTc = this.A01;
        C55177Odh c55177Odh = c52691NTc.A0E;
        C51874MwI c51874MwI = c52691NTc.A04;
        if (c51874MwI == null || (num = c51874MwI.A02) == null) {
            num = C05F.A00;
        }
        c55177Odh.A03(new PFW(num, false));
    }

    @Override // X.InterfaceC58151PqG
    public final void onShow() {
        Integer num;
        InterfaceC58151PqG interfaceC58151PqG = this.A00;
        if (interfaceC58151PqG != null) {
            interfaceC58151PqG.onShow();
        }
        C52691NTc c52691NTc = this.A01;
        C55177Odh c55177Odh = c52691NTc.A0E;
        C51874MwI c51874MwI = c52691NTc.A04;
        if (c51874MwI == null || (num = c51874MwI.A02) == null) {
            num = C05F.A00;
        }
        c55177Odh.A03(new PFW(num, true));
    }
}
