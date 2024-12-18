package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DXj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30334DXj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C2DC A04;
    public final /* synthetic */ C2DC A05;
    public final /* synthetic */ EnumC27361C5q A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30334DXj(Modifier modifier, C2DC c2dc, C2DC c2dc2, EnumC27361C5q enumC27361C5q, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A07 = str;
        this.A06 = enumC27361C5q;
        this.A03 = modifier;
        this.A05 = c2dc;
        this.A04 = c2dc2;
        this.A08 = interfaceC16820sZ;
        this.A0D = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A0B = z5;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A07;
        EnumC27361C5q enumC27361C5q = this.A06;
        CGG.A00(A0S, this.A03, this.A05, this.A04, enumC27361C5q, str, this.A08, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, this.A0D, this.A09, this.A0A, this.A0C, this.A0B);
        return C0eB.A00;
    }
}
