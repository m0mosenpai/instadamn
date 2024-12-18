package X;

import java.util.List;

/* renamed from: X.DWj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30308DWj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C74 A02;
    public final /* synthetic */ C74 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30308DWj(C74 c74, C74 c742, String str, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i, int i2, boolean z) {
        super(2);
        this.A07 = interfaceC16660sJ;
        this.A08 = interfaceC16660sJ2;
        this.A09 = interfaceC16660sJ3;
        this.A06 = interfaceC16820sZ;
        this.A02 = c74;
        this.A03 = c742;
        this.A04 = str;
        this.A01 = i;
        this.A0A = z;
        this.A05 = list;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A08;
        InterfaceC16660sJ interfaceC16660sJ3 = this.A09;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        AbstractC28060CYo.A01(A0S, this.A02, this.A03, this.A04, this.A05, interfaceC16820sZ, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, this.A01, AbstractC25225BEi.A04(this.A00), this.A0A);
        return C0eB.A00;
    }
}
