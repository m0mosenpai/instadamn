package X;

/* renamed from: X.DSj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30204DSj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7U A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30204DSj(C7U c7u, String str, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = str;
        this.A01 = c7u;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A02;
        AbstractC28488Chg.A04(A0S, this.A01, str, AbstractC25225BEi.A04(this.A00), this.A03, this.A04);
        return C0eB.A00;
    }
}
