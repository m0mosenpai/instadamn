package X;

/* loaded from: classes12.dex */
public final class YLU extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLU(C5yI c5yI, String str, String str2) {
        super(2);
        this.A00 = c5yI;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        C14360o3.A0B(str, 0);
        this.A00.DSg(str, this.A02, A1a, this.A01);
        return C0eB.A00;
    }
}
