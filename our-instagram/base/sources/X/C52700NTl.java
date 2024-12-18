package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NTl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52700NTl extends AbstractC54988OTw {
    public final UserSession A00;
    public final C56126Ovm A01;
    public final C54700OEc A02;
    public final C18A A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52700NTl(UserSession userSession, C54446O4a c54446O4a) {
        super(c54446O4a);
        C18A A00 = AnonymousClass189.A00(userSession);
        C56126Ovm c56126Ovm = (C56126Ovm) userSession.A01(C56126Ovm.class, C57419PeH.A00);
        C54700OEc c54700OEc = new C54700OEc(userSession);
        AbstractC37302Gc3.A1U(A00, c56126Ovm);
        this.A00 = userSession;
        this.A03 = A00;
        this.A01 = c56126Ovm;
        this.A02 = c54700OEc;
    }
}
