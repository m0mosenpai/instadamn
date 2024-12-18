package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTX extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTX(Object obj, Object obj2, Object obj3, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A00 = f;
        this.A05 = obj3;
        this.A02 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28301Cdn.A00(A0S, (C148336m3) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A05, this.A00, AbstractC25225BEi.A04(this.A02));
                break;
            case 1:
                C148336m3 c148336m3 = (C148336m3) this.A03;
                float f = this.A00;
                AbstractC28301Cdn.A01(A0S, c148336m3, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A05, f, AbstractC25225BEi.A04(this.A02));
                break;
            default:
                AbstractC27656CIb.A00(A0S, (Modifier) this.A04, (C7T7) this.A03, (InterfaceC16660sJ) this.A05, this.A00, AbstractC25225BEi.A04(this.A02));
                break;
        }
        return C0eB.A00;
    }
}
