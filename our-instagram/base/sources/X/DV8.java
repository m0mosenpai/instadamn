package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import java.util.List;

/* loaded from: classes5.dex */
public final class DV8 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A06 = obj;
        this.A07 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                BTO bto = (BTO) this.A06;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A07;
                AbstractC28495Cho.A04((CWS) this.A03, (CWT) this.A04, bto, A0S, (Modifier) this.A05, interfaceC16660sJ, (InterfaceC16610sE) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                ((C5TR) this.A07).A05(AbstractC25226BEj.A0S(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                LazyGridState lazyGridState = (LazyGridState) this.A06;
                Modifier modifier = (Modifier) this.A05;
                InterfaceC30904DiH interfaceC30904DiH = (InterfaceC30904DiH) this.A02;
                AbstractC28499Chs.A02((InterfaceC118275Wp) this.A04, (InterfaceC118305Ws) this.A07, interfaceC30904DiH, lazyGridState, A0S2, modifier, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                AbstractC27639CHk.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C26042BfV) this.A02, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01));
                break;
            case 4:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                List list = (List) this.A07;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A06;
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A04;
                AbstractC28313Cdz.A02(A0S3, (C6R) this.A02, list, (InterfaceC16820sZ) this.A03, interfaceC16660sJ2, interfaceC16660sJ3, (InterfaceC16660sJ) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 5:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                EnumC27380C6j enumC27380C6j = (EnumC27380C6j) this.A06;
                AbstractC28441Cgp.A01(A0S4, (C26064Bfs) this.A07, enumC27380C6j, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A04, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 6:
                CYS.A01(AbstractC25226BEj.A0S(obj, obj2), (C26074Bg3) this.A07, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A02, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 7:
                CYS.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A02, (C26074Bg3) this.A07, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A03, (InterfaceC16620sF) this.A04, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                C45098JxS c45098JxS = (C45098JxS) this.A06;
                AbstractC28394Cg0.A00(A0S5, (C25338BJh) this.A05, c45098JxS, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A07, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
