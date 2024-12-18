package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVY extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5XO A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ EnumC27399C7c A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVY(C5XO c5xo, Modifier modifier, EnumC27399C7c enumC27399C7c, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A03 = modifier;
        this.A05 = str;
        this.A06 = interfaceC16820sZ;
        this.A02 = c5xo;
        this.A07 = z;
        this.A04 = enumC27399C7c;
        this.A08 = z2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A03;
        String str = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        C5XO c5xo = this.A02;
        boolean z = this.A07;
        CGJ.A00(c5xo, A0S, modifier, this.A04, str, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A08);
        return C0eB.A00;
    }
}
