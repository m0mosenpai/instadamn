package X;

/* renamed from: X.6HK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HK extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6HK(C5yI c5yI, String str, String str2, String str3, String str4, boolean z) {
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.A00.DOy(Boolean.valueOf(this.A05), this.A01, this.A04, this.A02, null, this.A03, null, null, booleanValue);
        return C0eB.A00;
    }
}
