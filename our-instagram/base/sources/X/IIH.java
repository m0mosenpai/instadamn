package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IIH {
    public final C82653mT A00;
    public final C38532Gwt A01;
    public final C38B A02;
    public final C18920wW A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Zx] */
    public IIH(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C5GU c5gu, String str, String str2, String str3, String str4) {
        C82653mT c82653mT;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C38B A04 = AbstractC37303Gc4.A04(str, str2);
        AbstractC37303Gc4.A0z(A04, "shopping_session_id", str3);
        C38532Gwt c38532Gwt = 0;
        if (str4 != null && c5gu != null) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("product_collection_id", str4);
            c0Zx.A06("product_collection_type", c5gu.toString());
            c82653mT = c0Zx;
        } else {
            c82653mT = null;
        }
        if (c38321qM != null) {
            c38532Gwt = new C0Zx();
            c38532Gwt.A06("m_pk", c38321qM.getId());
            c38532Gwt.A06("tracking_token", AbstractC41071vF.A0F(userSession, c38321qM));
        }
        this.A03 = A01;
        this.A02 = A04;
        this.A00 = c82653mT;
        this.A01 = c38532Gwt;
    }
}
