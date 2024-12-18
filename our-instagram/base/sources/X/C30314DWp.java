package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30314DWp extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30314DWp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A08 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = i;
        this.A06 = obj4;
        this.A09 = z;
        this.A05 = obj5;
        this.A0A = z2;
        this.A07 = obj6;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            C5C3 c5c3 = (C5C3) this.A08;
            EnumC193878i8 enumC193878i8 = (EnumC193878i8) this.A04;
            C25338BJh c25338BJh = (C25338BJh) this.A03;
            int i = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
            boolean z = this.A09;
            CHG.A00(A0S, c25338BJh, c5c3, enumC193878i8, (InterfaceC16820sZ) this.A05, (InterfaceC16820sZ) this.A07, interfaceC16660sJ, i, AbstractC25225BEi.A04(this.A01), z, this.A0A);
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            Modifier modifier = (Modifier) this.A05;
            C5XO c5xo = (C5XO) this.A04;
            boolean z2 = this.A09;
            C25995Bej c25995Bej = (C25995Bej) this.A08;
            AbstractC27542CDm.A00(c5xo, A0S2, modifier, (C7W) this.A07, c25995Bej, interfaceC16820sZ, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z2, this.A0A);
        }
        return C0eB.A00;
    }
}
