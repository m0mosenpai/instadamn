package X;

/* renamed from: X.CuH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29212CuH implements InterfaceC30991Djq {
    public final /* synthetic */ EnumC85043qs A00;
    public final /* synthetic */ BOP A01;

    public C29212CuH(EnumC85043qs enumC85043qs, BOP bop) {
        this.A00 = enumC85043qs;
        this.A01 = bop;
    }

    @Override // X.InterfaceC30991Djq
    public final void Ctg() {
        EnumC85043qs enumC85043qs = this.A00;
        if (enumC85043qs == EnumC85043qs.A05 || enumC85043qs == EnumC85043qs.A06) {
            BOP bop = this.A01;
            InterfaceC31159Dn3 interfaceC31159Dn3 = bop.A02;
            BLE ble = bop.A05;
            interfaceC31159Dn3.DlM(null, ble.A03, ble.A04, AbstractC111324zv.A00(105), false);
        }
    }

    @Override // X.InterfaceC30991Djq
    public final void Cth() {
        if (this.A00 == EnumC85043qs.A05) {
            BOP bop = this.A01;
            InterfaceC31159Dn3 interfaceC31159Dn3 = bop.A02;
            BLE ble = bop.A05;
            interfaceC31159Dn3.DlM(null, ble.A03, ble.A04, AbstractC111324zv.A00(106), false);
        }
    }
}
