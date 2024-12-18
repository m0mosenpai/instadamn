package X;

import com.instagram.opal.impl.data.OpalProfileData;

/* loaded from: classes5.dex */
public final class DXP extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OpalProfileData A02;
    public final /* synthetic */ OpalProfileData A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXP(OpalProfileData opalProfileData, OpalProfileData opalProfileData2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A08 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A09 = interfaceC16660sJ;
        this.A07 = interfaceC16820sZ3;
        this.A05 = interfaceC16820sZ4;
        this.A0B = z;
        this.A0A = z2;
        this.A0C = z3;
        this.A04 = str;
        this.A02 = opalProfileData;
        this.A03 = opalProfileData2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A08;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A06;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        InterfaceC16820sZ interfaceC16820sZ3 = this.A07;
        InterfaceC16820sZ interfaceC16820sZ4 = this.A05;
        boolean z = this.A0B;
        boolean z2 = this.A0A;
        boolean z3 = this.A0C;
        AbstractC27682CJb.A00(A0S, this.A02, this.A03, this.A04, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), z, z2, z3);
        return C0eB.A00;
    }
}
