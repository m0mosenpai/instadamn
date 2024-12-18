package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J2B implements InterfaceC64122vX {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C28091Xn A02;

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) obj;
        C14360o3.A0B(interfaceC38371qR, 0);
        C38321qM BQN = interfaceC38371qR.BQN();
        C28091Xn c28091Xn = this.A02;
        UserSession userSession = this.A00;
        c28091Xn.A02(BQN.A3E(userSession, true));
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = this.A01;
        c12210kP.A01(C12180kM.A03);
        c12210kP.A00();
        return null;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public J2B(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C28091Xn c28091Xn) {
        this.A01 = interfaceC60442pS;
        this.A02 = c28091Xn;
        this.A00 = userSession;
    }
}
