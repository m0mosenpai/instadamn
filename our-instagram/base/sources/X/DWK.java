package X;

import com.instagram.wonderwall.model.WallText;

/* loaded from: classes5.dex */
public final class DWK extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WallText A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWK(WallText wallText, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A08 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A05 = z4;
        this.A06 = z5;
        this.A01 = wallText;
        this.A04 = interfaceC16620sF;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16820sZ2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A08;
        boolean z2 = this.A09;
        boolean z3 = this.A07;
        boolean z4 = this.A05;
        boolean z5 = this.A06;
        AbstractC28405CgB.A02(A0S, this.A01, this.A02, this.A03, this.A04, AbstractC25225BEi.A04(this.A00), z, z2, z3, z4, z5);
        return C0eB.A00;
    }
}
