package X;

/* loaded from: classes5.dex */
public final class DT9 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT9(C5yI c5yI, String str, String str2, String str3, String str4, boolean z) {
        super(2);
        this.A00 = c5yI;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = z;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean A1W = AbstractC25231BEo.A1W(obj2, str);
        this.A00.DOy(Boolean.valueOf(this.A05), this.A01, this.A04, this.A02, null, this.A03, null, str, A1W);
        return C0eB.A00;
    }
}
