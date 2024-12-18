package X;

/* renamed from: X.DUk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30257DUk extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30257DUk(AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = str;
        this.A02 = abstractC12990ll;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A04 = interfaceC16620sF;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A03;
        C5VW.A03(A0S, this.A02, str, this.A04, AbstractC25225BEi.A04(this.A00), this.A01, this.A05, this.A06, this.A07);
        return C0eB.A00;
    }
}
