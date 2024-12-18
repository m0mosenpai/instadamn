package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVU extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVU(Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, long j, boolean z, boolean z2) {
        super(2);
        this.A06 = interfaceC16820sZ;
        this.A02 = i;
        this.A05 = str;
        this.A04 = modifier;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = j;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        int i = this.A02;
        String str = this.A05;
        Modifier modifier = this.A04;
        boolean z = this.A07;
        boolean z2 = this.A08;
        C6H1.A00(A0S, modifier, str, interfaceC16820sZ, i, AbstractC25225BEi.A04(this.A00), this.A01, this.A03, z, z2);
        return C0eB.A00;
    }
}
