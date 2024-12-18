package X;

/* renamed from: X.DHq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29928DHq extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29928DHq(C5yI c5yI, String str, String str2, String str3, String str4, boolean z) {
        super(1);
        this.A00 = c5yI;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        this.A00.DOy(Boolean.valueOf(this.A05), this.A01, this.A04, this.A02, null, this.A03, null, null, A1a);
        return C0eB.A00;
    }
}
