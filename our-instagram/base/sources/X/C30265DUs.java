package X;

/* renamed from: X.DUs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30265DUs extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BJ3 A01;
    public final /* synthetic */ InterfaceC58121Ppk A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30265DUs(BJ3 bj3, InterfaceC58121Ppk interfaceC58121Ppk, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(2);
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A01 = bj3;
        this.A07 = interfaceC16820sZ;
        this.A02 = interfaceC58121Ppk;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        String str4 = this.A03;
        CJI.A00(A0S, this.A01, this.A02, str, str2, str3, str4, this.A07, AbstractC25225BEi.A04(this.A00));
        return C0eB.A00;
    }
}
