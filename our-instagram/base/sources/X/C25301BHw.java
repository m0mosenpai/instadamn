package X;

import androidx.compose.ui.Modifier;
import java.util.Map;

/* renamed from: X.BHw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25301BHw extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C5C8 A06;
    public final /* synthetic */ C118125Vw A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25301BHw(Modifier modifier, C5C8 c5c8, C118125Vw c118125Vw, Map map, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.A06 = c5c8;
        this.A05 = modifier;
        this.A07 = c118125Vw;
        this.A09 = interfaceC16660sJ;
        this.A04 = i;
        this.A0A = z;
        this.A02 = i2;
        this.A03 = i3;
        this.A08 = map;
        this.A00 = i4;
        this.A01 = i5;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5C8 c5c8 = this.A06;
        Modifier modifier = this.A05;
        C118125Vw c118125Vw = this.A07;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        int i = this.A04;
        boolean z = this.A0A;
        AbstractC122425gd.A02(A0S, modifier, c5c8, c118125Vw, this.A08, interfaceC16660sJ, i, this.A02, this.A03, AbstractC25225BEi.A04(this.A00), this.A01, z);
        return C0eB.A00;
    }
}
