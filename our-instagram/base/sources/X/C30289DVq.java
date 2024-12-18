package X;

import java.util.List;

/* renamed from: X.DVq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30289DVq extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30289DVq(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(2);
        this.A00 = i2;
        this.A08 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A07 = obj6;
        this.A06 = obj7;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((C5TR) this.A08).A06(AbstractC25226BEj.A0S(obj, obj2), this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                List list = (List) this.A03;
                List list2 = (List) this.A02;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A07;
                CXK.A01(A0S, list, list2, interfaceC16820sZ, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A08, interfaceC16620sF, (InterfaceC16620sF) this.A06, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C26022BfB c26022BfB = (C26022BfB) this.A02;
                AbstractC28391Cfu.A01(A0S2, (MUD) this.A03, c26022BfB, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A07, (InterfaceC16660sJ) this.A05, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A08, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                C132335yC c132335yC = (C132335yC) this.A08;
                AbstractC27676CIv.A00(A0S3, (C5yI) this.A02, (InterfaceC132365yF) this.A07, c132335yC, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 4:
            case 5:
            default:
                AbstractC25259BFx.A0A(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A08, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A06, (InterfaceC16820sZ) this.A03, (C5Hc) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 6:
                AbstractC28468ChK.A04(AbstractC25226BEj.A0S(obj, obj2), (C26060Bfn) this.A08, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, (InterfaceC16660sJ) this.A06, AbstractC25225BEi.A04(this.A01));
                break;
            case 7:
                CLU.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC74953Yl) this.A08, (InterfaceC74953Yl) this.A02, (InterfaceC74953Yl) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A06, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
