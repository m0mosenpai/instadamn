package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DXY extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ InterfaceC31032DkW A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Map A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXY(InterfaceC31032DkW interfaceC31032DkW, Integer num, String str, List list, Map map, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A08 = map;
        this.A06 = str;
        this.A05 = num;
        this.A02 = i;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A03 = i2;
        this.A07 = list;
        this.A04 = interfaceC31032DkW;
        this.A09 = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A00 = i3;
        this.A01 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Map map = this.A08;
        String str = this.A06;
        Integer num = this.A05;
        int i = this.A02;
        boolean z = this.A0C;
        boolean z2 = this.A0B;
        boolean z3 = this.A0D;
        int i2 = this.A03;
        CXG.A01(A0S, this.A04, num, str, this.A07, map, this.A09, this.A0A, i, i2, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), z, z2, z3);
        return C0eB.A00;
    }
}
