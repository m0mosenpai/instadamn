package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DWG extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C5XO A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C2DC A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWG(C5XO c5xo, Modifier modifier, C2DC c2dc, String str, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, long j, boolean z) {
        super(2);
        this.A05 = modifier;
        this.A06 = c2dc;
        this.A07 = str;
        this.A03 = j;
        this.A00 = f;
        this.A04 = c5xo;
        this.A09 = z;
        this.A08 = interfaceC16820sZ;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A05;
        C2DC c2dc = this.A06;
        String str = this.A07;
        long j = this.A03;
        float f = this.A00;
        AbstractC28395Cg1.A00(this.A04, A0S, modifier, c2dc, str, this.A08, f, AbstractC25225BEi.A04(this.A01), this.A02, j, this.A09);
        return C0eB.A00;
    }
}
