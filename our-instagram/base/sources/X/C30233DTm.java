package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DTm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30233DTm extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ C5Hc A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30233DTm(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i, int i2, int i3, boolean z) {
        super(2);
        this.A04 = interfaceC16820sZ;
        this.A02 = i;
        this.A05 = c5Hc;
        this.A06 = z;
        this.A03 = modifier;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        int i = this.A02;
        CEK.A00(A0S, this.A03, interfaceC16820sZ, this.A05, i, AbstractC25225BEi.A04(this.A00), this.A01, this.A06);
        return C0eB.A00;
    }
}
