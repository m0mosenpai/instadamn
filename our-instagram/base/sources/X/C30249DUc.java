package X;

/* renamed from: X.DUc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30249DUc extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ InterfaceC74953Yl A05;
    public final /* synthetic */ InterfaceC74953Yl A06;
    public final /* synthetic */ C6KN A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30249DUc(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74953Yl interfaceC74953Yl3, C6KN c6kn, float f, float f2, float f3, float f4) {
        super(2);
        this.A07 = c6kn;
        this.A03 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A05 = interfaceC74953Yl;
        this.A04 = interfaceC74953Yl2;
        this.A06 = interfaceC74953Yl3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BFo bFo = (BFo) obj;
        long j = ((C119365at) obj2).A00;
        C14360o3.A0B(bFo, 0);
        bFo.A01();
        InterfaceC74953Yl interfaceC74953Yl = this.A05;
        AbstractC25227BEk.A18(interfaceC74953Yl, AbstractC25231BEo.A03(interfaceC74953Yl) + C119365at.A02(j));
        float A03 = AbstractC25231BEo.A03(interfaceC74953Yl);
        C6KN c6kn = this.A07;
        AbstractC25227BEk.A18(interfaceC74953Yl, C17s.A02(A03, c6kn.EqT(this.A03), this.A01));
        InterfaceC74953Yl interfaceC74953Yl2 = this.A04;
        float A032 = AbstractC25231BEo.A03(interfaceC74953Yl);
        float f = this.A00;
        AbstractC25227BEk.A18(interfaceC74953Yl2, A032 - c6kn.EqT(f));
        AbstractC25227BEk.A18(this.A06, AbstractC25226BEj.A00(c6kn, this.A02 + f, AbstractC25231BEo.A03(interfaceC74953Yl)));
        return C0eB.A00;
    }
}
