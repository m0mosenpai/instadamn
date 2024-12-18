package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30320DWv extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30320DWv(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A09 = z;
        this.A05 = obj2;
        this.A08 = z2;
        this.A07 = str;
        this.A0A = z3;
        this.A04 = obj3;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            C38321qM c38321qM = (C38321qM) this.A05;
            Modifier modifier = (Modifier) this.A06;
            boolean z = this.A0A;
            AbstractC28333CeL.A00(A0S, (InterfaceC74953Yl) this.A04, modifier, c38321qM, this.A07, this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A08, this.A09);
        } else {
            InterfaceC30795DgW interfaceC30795DgW = (InterfaceC30795DgW) this.A06;
            boolean z2 = this.A09;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
            boolean z3 = this.A08;
            AbstractC27516CCm.A00(A0S, interfaceC30795DgW, this.A07, interfaceC16820sZ, (InterfaceC16820sZ) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z2, z3, this.A0A);
        }
        return C0eB.A00;
    }
}
