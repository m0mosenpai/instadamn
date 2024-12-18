package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTT extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTT(int i, int i2, int i3, long j, Object obj, Object obj2) {
        super(2);
        this.A00 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28344CeW.A00((InterfaceC30909DiM) this.A05, A0S, (Modifier) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
            case 1:
                AbstractC28028CXc.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C118125Vw) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                CGS.A00(A0S2, (Modifier) this.A04, interfaceC16820sZ, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
            default:
                BIR.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (BIY) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, this.A03);
                break;
        }
        return C0eB.A00;
    }
}
