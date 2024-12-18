package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public final class TGZ implements InterfaceC65457TkT {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        if (this.A00 != 0) {
            InterfaceC37129GXq interfaceC37129GXq = (InterfaceC37129GXq) obj;
            AbstractC31710DwF.A00 = interfaceC37129GXq;
            InterfaceC65576TnA interfaceC65576TnA = (InterfaceC65576TnA) this.A01;
            Fragment fragment = (Fragment) this.A02;
            EnumC31713DwI enumC31713DwI = (EnumC31713DwI) this.A05;
            interfaceC65576TnA.CK3(fragment, (InterfaceC60602pj) this.A03, (C07270a1) this.A04, interfaceC37129GXq, enumC31713DwI);
            return;
        }
        InterfaceC37129GXq interfaceC37129GXq2 = (InterfaceC37129GXq) obj;
        AbstractC31710DwF.A00 = interfaceC37129GXq2;
        InterfaceC65576TnA interfaceC65576TnA2 = (InterfaceC65576TnA) this.A01;
        Fragment fragment2 = (Fragment) this.A02;
        EnumC31713DwI enumC31713DwI2 = (EnumC31713DwI) this.A05;
        interfaceC65576TnA2.CKN(fragment2, (InterfaceC60602pj) this.A03, (C07270a1) this.A04, interfaceC37129GXq2, enumC31713DwI2);
    }

    public TGZ(Fragment fragment, InterfaceC60602pj interfaceC60602pj, C07270a1 c07270a1, InterfaceC65576TnA interfaceC65576TnA, EnumC31713DwI enumC31713DwI, int i) {
        this.A00 = i;
        this.A01 = interfaceC65576TnA;
        this.A02 = fragment;
        this.A05 = enumC31713DwI;
        this.A04 = c07270a1;
        this.A03 = interfaceC60602pj;
    }
}
