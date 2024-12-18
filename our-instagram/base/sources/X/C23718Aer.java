package X;

/* renamed from: X.Aer, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23718Aer implements InterfaceC30992Djr {
    public final /* synthetic */ EnumC85043qs A00;
    public final /* synthetic */ C9IC A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C23718Aer(EnumC85043qs enumC85043qs, C9IC c9ic, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c9ic;
        this.A00 = enumC85043qs;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC30992Djr
    public final void Dap() {
        EnumC85043qs enumC85043qs = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (enumC85043qs == EnumC85043qs.A05 || enumC85043qs == EnumC85043qs.A06) {
            interfaceC16660sJ.invoke(AbstractC111324zv.A00(105));
        }
    }

    @Override // X.InterfaceC30992Djr
    public final void DjX() {
        EnumC85043qs enumC85043qs = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (enumC85043qs == EnumC85043qs.A05) {
            interfaceC16660sJ.invoke(AbstractC111324zv.A00(106));
        }
    }
}
