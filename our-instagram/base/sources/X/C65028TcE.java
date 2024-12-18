package X;

/* renamed from: X.TcE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65028TcE extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ EnumC58683Pzw A03;
    public final /* synthetic */ C58675Pzo A04;
    public final /* synthetic */ C63U A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65028TcE(EnumC58683Pzw enumC58683Pzw, C58675Pzo c58675Pzo, C63U c63u, String str, InterfaceC16660sJ interfaceC16660sJ, long j, long j2, long j3) {
        super(1);
        this.A07 = interfaceC16660sJ;
        this.A05 = c63u;
        this.A06 = str;
        this.A02 = j;
        this.A03 = enumC58683Pzw;
        this.A00 = j2;
        this.A01 = j3;
        this.A04 = c58675Pzo;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Q0R q0r;
        C62744SOl c62744SOl = (C62744SOl) obj;
        C14360o3.A0B(c62744SOl, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        C63U c63u = this.A05;
        String str = this.A06;
        long j = this.A02;
        C09530e4 A00 = C63U.A00(this.A03, this.A04, c63u, c62744SOl, str, j, this.A00, this.A01);
        if (A00 != null) {
            q0r = new Q0R(A00);
        } else {
            q0r = null;
        }
        interfaceC16660sJ.invoke(q0r);
        return C0eB.A00;
    }
}
