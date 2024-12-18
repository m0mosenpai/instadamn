package X;

/* renamed from: X.U1m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66145U1m implements InterfaceC71919XAd {
    public final /* synthetic */ InterfaceC72022XFk A00;
    public final /* synthetic */ XB8 A01;
    public final /* synthetic */ String A02;

    public C66145U1m(InterfaceC72022XFk interfaceC72022XFk, XB8 xb8, String str) {
        this.A01 = xb8;
        this.A02 = str;
        this.A00 = interfaceC72022XFk;
    }

    @Override // X.InterfaceC71919XAd
    public final void ACz(C25531Mh c25531Mh) {
        c25531Mh.A0R("query_text", this.A01.E6U());
        c25531Mh.A0R("search_session_id", this.A02);
        c25531Mh.A0R("rank_token", this.A00.E6d());
    }
}
