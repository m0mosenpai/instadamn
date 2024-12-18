package X;

/* renamed from: X.DTt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30240DTt extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L66 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30240DTt(L66 l66, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = interfaceC16820sZ;
        this.A01 = l66;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A05;
        boolean z2 = this.A06;
        AbstractC28488Chg.A03(A0S, this.A01, str, str2, this.A04, AbstractC25225BEi.A04(this.A00), z, z2);
        return C0eB.A00;
    }
}
