package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30311DWm extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C5AH A05;
    public final /* synthetic */ C27964CUk A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ InterfaceC16610sE A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ C117685Ud[] A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30311DWm(Modifier modifier, C5AH c5ah, C27964CUk c27964CUk, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, C117685Ud[] c117685UdArr, int i, int i2, long j, long j2, boolean z) {
        super(2);
        this.A08 = interfaceC16610sE;
        this.A04 = modifier;
        this.A06 = c27964CUk;
        this.A09 = z;
        this.A05 = c5ah;
        this.A03 = j;
        this.A0A = c117685UdArr;
        this.A02 = j2;
        this.A07 = interfaceC16620sF;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16610sE interfaceC16610sE = this.A08;
        Modifier modifier = this.A04;
        C27964CUk c27964CUk = this.A06;
        boolean z = this.A09;
        C5AH c5ah = this.A05;
        long j = this.A03;
        AbstractC28335CeN.A01(A0S, modifier, c5ah, c27964CUk, this.A07, interfaceC16610sE, this.A0A, AbstractC25225BEi.A04(this.A00), this.A01, j, this.A02, z);
        return C0eB.A00;
    }
}
