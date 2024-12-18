package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30300DWb extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ EnumC136916Hu A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16610sE A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30300DWb(Modifier modifier, EnumC136916Hu enumC136916Hu, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16610sE interfaceC16610sE, float f, int i, int i2, int i3, boolean z) {
        super(2);
        this.A07 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A06 = str;
        this.A03 = i;
        this.A00 = f;
        this.A05 = enumC136916Hu;
        this.A04 = modifier;
        this.A0A = z;
        this.A09 = interfaceC16610sE;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A08;
        String str = this.A06;
        int i = this.A03;
        float f = this.A00;
        EnumC136916Hu enumC136916Hu = this.A05;
        AbstractC136866Hp.A02(A0S, this.A04, enumC136916Hu, str, interfaceC16820sZ, interfaceC16820sZ2, this.A09, f, i, AbstractC25225BEi.A04(this.A01), this.A02, this.A0A);
        return C0eB.A00;
    }
}
