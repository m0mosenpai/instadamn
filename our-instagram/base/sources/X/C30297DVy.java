package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30297DVy extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C118125Vw A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30297DVy(Modifier modifier, C118125Vw c118125Vw, String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.A07 = str;
        this.A05 = modifier;
        this.A06 = c118125Vw;
        this.A08 = interfaceC16660sJ;
        this.A04 = i;
        this.A09 = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A07;
        AbstractC122425gd.A03(A0S, this.A05, this.A06, str, this.A08, this.A04, this.A02, this.A03, AbstractC25225BEi.A04(this.A00), this.A01, this.A09);
        return C0eB.A00;
    }
}
