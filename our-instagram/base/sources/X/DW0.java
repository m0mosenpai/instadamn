package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DW0 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C1132359l A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW0(Modifier modifier, C1132359l c1132359l, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3) {
        super(2);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = i;
        this.A07 = str3;
        this.A04 = c1132359l;
        this.A03 = modifier;
        this.A08 = interfaceC16820sZ;
        this.A09 = interfaceC16660sJ;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        String str2 = this.A06;
        int i = this.A02;
        String str3 = this.A07;
        CXG.A00(A0S, this.A03, this.A04, str, str2, str3, this.A08, this.A09, i, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
