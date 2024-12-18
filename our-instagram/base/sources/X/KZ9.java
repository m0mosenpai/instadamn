package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KZ9 extends C4A7 {
    public C1Df A00;
    public InterfaceC24731Iq A01;
    public final UserSession A02;
    public final C23031Ai A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KZ9(C23031Ai c23031Ai, UserSession userSession) {
        super("Pokes", C4A8.A00(1844795110));
        AbstractC167017dG.A1P(userSession, c23031Ai);
        this.A02 = userSession;
        this.A03 = c23031Ai;
        this.A01 = new C24721Ip(100);
    }
}
