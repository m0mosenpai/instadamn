package X;

/* renamed from: X.DTp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30236DTp extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30236DTp(String str, InterfaceC16820sZ interfaceC16820sZ, int i, long j, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A05 = z;
        this.A06 = z2;
        this.A01 = j;
        this.A02 = str;
        this.A04 = z3;
        this.A03 = interfaceC16820sZ;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A05;
        boolean z2 = this.A06;
        long j = this.A01;
        CGK.A00(A0S, this.A02, this.A03, AbstractC25225BEi.A04(this.A00), j, z, z2, this.A04);
        return C0eB.A00;
    }
}
