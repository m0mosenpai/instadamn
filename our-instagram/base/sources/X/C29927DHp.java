package X;

/* renamed from: X.DHp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29927DHp extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29927DHp(InterfaceC74953Yl interfaceC74953Yl, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = str;
        this.A05 = z;
        this.A04 = interfaceC16620sF;
        this.A01 = i2;
        this.A02 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        String A0Q = AbstractC167027dH.A0Q(obj);
        InterfaceC74953Yl interfaceC74953Yl = this.A02;
        if (A0Q.length() > this.A00) {
            obj2 = new C26179Bi4(this.A03);
        } else if (AbstractC25225BEi.A1Y(A0Q) && this.A05) {
            obj2 = C29181Ctm.A00;
        } else {
            obj2 = C29183Cto.A00;
        }
        interfaceC74953Yl.Egh(obj2);
        this.A04.invoke(Integer.valueOf(this.A01), A0Q);
        return C0eB.A00;
    }
}
