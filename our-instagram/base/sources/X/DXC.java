package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DXC extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ C6L5 A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXC(Modifier modifier, C6L5 c6l5, String str, String str2, float f, float f2, float f3, int i, int i2, long j, long j2, long j3) {
        super(2);
        this.A00 = f;
        this.A08 = modifier;
        this.A09 = c6l5;
        this.A05 = j;
        this.A0B = str;
        this.A07 = j2;
        this.A0A = str2;
        this.A06 = j3;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        float f = this.A00;
        Modifier modifier = this.A08;
        C6L5 c6l5 = this.A09;
        long j = this.A05;
        String str = this.A0B;
        long j2 = this.A07;
        CGW.A00(A0S, modifier, c6l5, str, this.A0A, f, this.A02, this.A01, AbstractC25225BEi.A04(this.A03), this.A04, j, j2, this.A06);
        return C0eB.A00;
    }
}
