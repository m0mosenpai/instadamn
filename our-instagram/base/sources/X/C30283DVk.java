package X;

/* renamed from: X.DVk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30283DVk extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30283DVk(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A02 = i;
        this.A03 = i2;
        this.A08 = z;
        this.A07 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            C5Hc c5Hc = (C5Hc) this.A04;
            int i2 = this.A03;
            CKH.A00(A0S, (UQE) this.A07, (InterfaceC16820sZ) this.A05, (InterfaceC16620sF) this.A06, c5Hc, i2, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
        } else {
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            int i3 = this.A02;
            int i4 = this.A03;
            boolean z = this.A08;
            InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A07;
            CKC.A00(A0S, (EnumC39642HiX) this.A05, (C29138Ct5) this.A04, interfaceC16820sZ, interfaceC16820sZ2, i3, i4, AbstractC25225BEi.A04(this.A01), z);
        }
        return C0eB.A00;
    }
}
