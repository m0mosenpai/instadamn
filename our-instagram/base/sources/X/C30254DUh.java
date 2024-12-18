package X;

/* renamed from: X.DUh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30254DUh extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30254DUh(Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, boolean z) {
        super(2);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A05 = interfaceC16820sZ;
        this.A07 = z;
        this.A06 = interfaceC16820sZ2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A04;
        String str2 = this.A03;
        CGB.A00(A0S, this.A02, str, str2, this.A05, this.A06, AbstractC25225BEi.A04(this.A00), this.A01, this.A07);
        return C0eB.A00;
    }
}
