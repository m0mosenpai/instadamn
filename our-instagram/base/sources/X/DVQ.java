package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVQ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVQ(Modifier modifier, Modifier modifier2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, long j, boolean z, boolean z2) {
        super(2);
        this.A04 = str;
        this.A08 = z;
        this.A05 = str2;
        this.A01 = j;
        this.A07 = z2;
        this.A03 = modifier;
        this.A02 = modifier2;
        this.A06 = interfaceC16820sZ;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A04;
        boolean z = this.A08;
        CXX.A00(A0S, this.A03, this.A02, str, this.A05, this.A06, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A07);
        return C0eB.A00;
    }
}
