package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DYT extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Alignment A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C5YL A07;
    public final /* synthetic */ SQ2 A08;
    public final /* synthetic */ EnumC61098RfC A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DYT(Alignment alignment, Modifier modifier, C5YL c5yl, SQ2 sq2, EnumC61098RfC enumC61098RfC, Map map, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(2);
        this.A08 = sq2;
        this.A06 = modifier;
        this.A0E = z;
        this.A0H = z2;
        this.A00 = f;
        this.A04 = i;
        this.A0G = z3;
        this.A0B = z4;
        this.A0D = z5;
        this.A09 = enumC61098RfC;
        this.A0I = z6;
        this.A0F = z7;
        this.A05 = alignment;
        this.A07 = c5yl;
        this.A0C = z8;
        this.A0A = map;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        SQ2 sq2 = this.A08;
        Modifier modifier = this.A06;
        boolean z = this.A0E;
        boolean z2 = this.A0H;
        float f = this.A00;
        int i = this.A04;
        boolean z3 = this.A0G;
        boolean z4 = this.A0B;
        boolean z5 = this.A0D;
        EnumC61098RfC enumC61098RfC = this.A09;
        boolean z6 = this.A0I;
        boolean z7 = this.A0F;
        AbstractC28020CWs.A00(A0S, this.A05, modifier, this.A07, sq2, enumC61098RfC, this.A0A, f, i, this.A01 | 1, this.A02, this.A03, z, z2, z3, z4, z5, z6, z7, this.A0C);
        return C0eB.A00;
    }
}
