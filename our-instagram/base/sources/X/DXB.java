package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXB extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ Modifier A07;
    public final /* synthetic */ C2DC A08;
    public final /* synthetic */ C2DC A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXB(Modifier modifier, C2DC c2dc, C2DC c2dc2, float f, float f2, float f3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        super(2);
        this.A02 = f;
        this.A08 = c2dc;
        this.A07 = modifier;
        this.A09 = c2dc2;
        this.A01 = f2;
        this.A06 = j;
        this.A05 = j2;
        this.A00 = f3;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        float f = this.A02;
        C2DC c2dc = this.A08;
        Modifier modifier = this.A07;
        C2DC c2dc2 = this.A09;
        float f2 = this.A01;
        long j = this.A06;
        long j2 = this.A05;
        BII.A01(A0S, modifier, c2dc, c2dc2, f, f2, this.A00, AbstractC25225BEi.A04(this.A03), this.A04, j, j2, this.A0B, this.A0A);
        return C0eB.A00;
    }
}
