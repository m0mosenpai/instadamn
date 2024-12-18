package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gni, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37997Gni implements InterfaceC79643hF {
    public C3u8 A00;
    public InterfaceC30930Dik A01;
    public UserSession A02;
    public InterfaceC60442pS A03;
    public C40971v4 A04;
    public final String A05;
    public final java.util.Set A06;

    public C37997Gni(C3u8 c3u8, InterfaceC30930Dik interfaceC30930Dik, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4, String str, java.util.Set set) {
        C14360o3.A0B(set, 7);
        this.A04 = c40971v4;
        this.A02 = userSession;
        this.A00 = c3u8;
        this.A05 = str;
        this.A06 = set;
        this.A03 = AbstractC60952qJ.A00(interfaceC60442pS);
        this.A01 = interfaceC30930Dik;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4Hy, java.lang.Object] */
    @Override // X.InterfaceC79643hF
    public final C93574Hy AWp() {
        C38321qM c38321qM = this.A04.A0K;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        String str = this.A05;
        java.util.Set set = this.A06;
        C3u8 c3u8 = this.A00;
        ?? obj = new Object();
        obj.A01 = c38321qM;
        obj.A02 = interfaceC60442pS;
        obj.A06 = true;
        obj.A04 = str;
        obj.A05 = set;
        obj.A00 = c3u8;
        return obj;
    }

    @Override // X.InterfaceC79643hF
    public final String AWz() {
        return AbstractC123955j9.A00(this.A01, this.A04.A0j, true);
    }

    @Override // X.InterfaceC79643hF
    public final C5H3 AX0() {
        C38321qM c38321qM = this.A04.A0K;
        UserSession userSession = this.A02;
        C14360o3.A0B(c38321qM, 0);
        return new C123965jA(userSession, c38321qM);
    }

    @Override // X.InterfaceC79643hF
    public final C5H2 AX1() {
        return new C42087Iku(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37997Gni(C3u8 c3u8, InterfaceC30930Dik interfaceC30930Dik, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4) {
        this(c3u8, interfaceC30930Dik, userSession, interfaceC60442pS, c40971v4, null, C16910sj.A00);
        C14360o3.A0B(c40971v4, 1);
    }
}
