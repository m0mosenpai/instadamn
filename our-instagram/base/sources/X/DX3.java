package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* loaded from: classes5.dex */
public final class DX3 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ LineType A03;
    public final /* synthetic */ EnumC132165xt A04;
    public final /* synthetic */ C7A A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX3(Modifier modifier, LineType lineType, EnumC132165xt enumC132165xt, C7A c7a, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A06 = interfaceC16660sJ;
        this.A05 = c7a;
        this.A04 = enumC132165xt;
        this.A03 = lineType;
        this.A0B = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A02 = modifier;
        this.A0A = z4;
        this.A08 = z5;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        C7A c7a = this.A05;
        EnumC132165xt enumC132165xt = this.A04;
        LineType lineType = this.A03;
        boolean z = this.A0B;
        boolean z2 = this.A07;
        boolean z3 = this.A09;
        AbstractC28432Cgg.A00(A0S, this.A02, lineType, enumC132165xt, c7a, interfaceC16660sJ, AbstractC25225BEi.A04(this.A00), this.A01, z, z2, z3, this.A0A, this.A08);
        return C0eB.A00;
    }
}
