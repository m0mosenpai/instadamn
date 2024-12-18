package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public final class DVI extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVI(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A07;
                String str2 = this.A06;
                C169287h2 c169287h2 = (C169287h2) this.A02;
                InterfaceC16590sC interfaceC16590sC = (InterfaceC16590sC) this.A04;
                AbstractC28043CXv.A01(A0S, c169287h2, (C169297h3) this.A05, str, str2, (InterfaceC16660sJ) this.A03, interfaceC16590sC, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                AbstractC28048CYc.A00(A0S, this.A06, this.A07, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A03;
                AbstractC28331CeJ.A01(A0S, (ImmutableList) this.A05, this.A07, this.A06, (InterfaceC16820sZ) this.A02, interfaceC16660sJ, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
