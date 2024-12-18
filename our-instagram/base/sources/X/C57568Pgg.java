package X;

/* renamed from: X.Pgg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57568Pgg extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57568Pgg(String str, String str2, String str3, boolean z, boolean z2) {
        super(1);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C0f5 c0f5 = (C0f5) obj;
        C14360o3.A0B(c0f5, 0);
        c0f5.ABX("isPrefetch", this.A04);
        c0f5.ABX("isAd", this.A03);
        c0f5.ABW("origin", this.A01);
        c0f5.ABW("bad_url_type", this.A02);
        String str = this.A00;
        if (str == null) {
            str = "nullable";
        }
        c0f5.ABW("cdn_content_type", str);
        return c0f5;
    }
}
