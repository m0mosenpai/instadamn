package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30298DVz extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C5C8 A05;
    public final /* synthetic */ C118125Vw A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30298DVz(Modifier modifier, C5C8 c5c8, C118125Vw c118125Vw, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A05 = c5c8;
        this.A04 = modifier;
        this.A06 = c118125Vw;
        this.A09 = z;
        this.A03 = i;
        this.A02 = i2;
        this.A08 = interfaceC16660sJ;
        this.A07 = interfaceC16660sJ2;
        this.A00 = i3;
        this.A01 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5C8 c5c8 = this.A05;
        Modifier modifier = this.A04;
        C118125Vw c118125Vw = this.A06;
        boolean z = this.A09;
        AbstractC27477CAy.A00(A0S, modifier, c5c8, c118125Vw, this.A08, this.A07, this.A03, this.A02, AbstractC25225BEi.A04(this.A00), this.A01, z);
        return C0eB.A00;
    }
}
