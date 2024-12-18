package X;

import com.instagram.wonderwall.model.WallText;

/* loaded from: classes5.dex */
public final class DXS extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5C3 A02;
    public final /* synthetic */ WallText A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXS(C5C3 c5c3, WallText wallText, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A02 = c5c3;
        this.A0B = z;
        this.A0C = z2;
        this.A0A = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A03 = wallText;
        this.A07 = interfaceC16660sJ;
        this.A06 = interfaceC16660sJ2;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5C3 c5c3 = this.A02;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0A;
        boolean z4 = this.A08;
        boolean z5 = this.A09;
        AbstractC28405CgB.A00(A0S, c5c3, this.A03, this.A04, this.A05, this.A07, this.A06, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), z, z2, z3, z4, z5);
        return C0eB.A00;
    }
}
