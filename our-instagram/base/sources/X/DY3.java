package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DY3 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DY3(Alignment alignment, Modifier modifier, C5YL c5yl, SQ2 sq2, EnumC61098RfC enumC61098RfC, Map map, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A04 = sq2;
        this.A08 = interfaceC16820sZ;
        this.A07 = modifier;
        this.A0C = z;
        this.A0D = z2;
        this.A0A = z3;
        this.A09 = enumC61098RfC;
        this.A0B = z4;
        this.A03 = alignment;
        this.A05 = c5yl;
        this.A0E = z5;
        this.A06 = map;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        SQ2 sq2 = (SQ2) this.A04;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A08;
        Modifier modifier = (Modifier) this.A07;
        boolean z = this.A0C;
        boolean z2 = this.A0D;
        boolean z3 = this.A0A;
        EnumC61098RfC enumC61098RfC = (EnumC61098RfC) this.A09;
        boolean z4 = this.A0B;
        AbstractC28020CWs.A01(A0S, (Alignment) this.A03, modifier, (C5YL) this.A05, sq2, enumC61098RfC, (Map) this.A06, interfaceC16820sZ, this.A00 | 1, this.A01, this.A02, z, z2, z3, z4, this.A0E);
        return C0eB.A00;
    }
}
