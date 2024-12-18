package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AwZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24693AwZ implements Runnable {
    public final /* synthetic */ C4S6 A00;
    public final /* synthetic */ C30E A01;

    public RunnableC24693AwZ(C4S6 c4s6, C30E c30e) {
        this.A00 = c4s6;
        this.A01 = c30e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4S6 c4s6 = this.A00;
        C38321qM c38321qM = (C38321qM) ((C4S7) c4s6).A03;
        UserSession userSession = this.A01.A0K;
        InterfaceC60442pS interfaceC60442pS = c4s6.A0E;
        AbstractC75343a1.A02(userSession, c38321qM, interfaceC60442pS);
        AbstractC37670Gi3.A0X(interfaceC60442pS, userSession, c38321qM);
    }
}
