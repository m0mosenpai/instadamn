package X;

/* loaded from: classes4.dex */
public final class B8X extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ EnumC166167bk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8X(EnumC166167bk enumC166167bk, String str, String str2, String str3) {
        super(1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = enumC166167bk;
        this.A03 = str3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C166137bh c166137bh = (C166137bh) obj;
        C14360o3.A0B(c166137bh, 0);
        return AbstractC166327c1.A06(c166137bh, this.A02, this.A01, new C50269MHy(this.A03, this.A00, 24));
    }
}
