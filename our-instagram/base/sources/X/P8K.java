package X;

/* loaded from: classes9.dex */
public final class P8K implements InterfaceC81993lL {
    public final /* synthetic */ C55173Odc A00;
    public final /* synthetic */ EnumC53243Ngg A01;

    public P8K(C55173Odc c55173Odc, EnumC53243Ngg enumC53243Ngg) {
        this.A00 = c55173Odc;
        this.A01 = enumC53243Ngg;
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        C55173Odc c55173Odc = this.A00;
        C6WQ c6wq = c55173Odc.A00;
        if (c6wq != null) {
            c6wq.hide();
            c55173Odc.A00 = null;
            C9GR.A0F(c55173Odc.A01, "failed_to_load_highlight_message", 2131962083);
        }
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        C55173Odc c55173Odc = this.A00;
        C6WQ c6wq = c55173Odc.A00;
        if (c6wq != null) {
            EnumC53243Ngg enumC53243Ngg = this.A01;
            c6wq.hide();
            c55173Odc.A00 = null;
            C55173Odc.A00(c55173Odc, enumC53243Ngg);
        }
    }
}
