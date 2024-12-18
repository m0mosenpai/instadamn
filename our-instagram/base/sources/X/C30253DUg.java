package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DUg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30253DUg extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30253DUg(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A07 = z;
        this.A03 = modifier;
        this.A05 = z2;
        this.A02 = j;
        this.A04 = interfaceC16820sZ;
        this.A06 = z3;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A07;
        Modifier modifier = this.A03;
        boolean z2 = this.A05;
        long j = this.A02;
        AbstractC27559CEe.A00(A0S, modifier, this.A04, AbstractC25225BEi.A04(this.A00), this.A01, j, z, z2, this.A06);
        return C0eB.A00;
    }
}
