package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30304DWf extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C5AH A06;
    public final /* synthetic */ C27964CUk A07;
    public final /* synthetic */ InterfaceC16620sF A08;
    public final /* synthetic */ InterfaceC16610sE A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30304DWf(Modifier modifier, C5AH c5ah, C27964CUk c27964CUk, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, int i, int i2, long j, long j2, long j3, boolean z) {
        super(2);
        this.A09 = interfaceC16610sE;
        this.A05 = modifier;
        this.A07 = c27964CUk;
        this.A0A = z;
        this.A06 = c5ah;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = j3;
        this.A08 = interfaceC16620sF;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16610sE interfaceC16610sE = this.A09;
        Modifier modifier = this.A05;
        C27964CUk c27964CUk = this.A07;
        boolean z = this.A0A;
        CGD.A00(A0S, modifier, this.A06, c27964CUk, this.A08, interfaceC16610sE, AbstractC25225BEi.A04(this.A00), this.A01, this.A03, this.A04, this.A02, z);
        return C0eB.A00;
    }
}
