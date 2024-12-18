package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWA extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16610sE A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWA(Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i, int i2, int i3, boolean z) {
        super(2);
        this.A04 = str;
        this.A02 = i;
        this.A09 = z;
        this.A05 = interfaceC16820sZ;
        this.A07 = interfaceC16660sJ;
        this.A03 = modifier;
        this.A06 = interfaceC16820sZ2;
        this.A08 = interfaceC16610sE;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A04;
        int i = this.A02;
        boolean z = this.A09;
        AbstractC27571CEq.A00(A0S, this.A03, str, this.A05, this.A06, this.A07, this.A08, i, AbstractC25225BEi.A04(this.A00), this.A01, z);
        return C0eB.A00;
    }
}
