package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M22 implements Runnable {
    public final /* synthetic */ C48182Jh A00;

    public M22(C48182Jh c48182Jh) {
        this.A00 = c48182Jh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48182Jh c48182Jh = this.A00;
        AbstractC48222Jl[] abstractC48222JlArr = C48182Jh.A04;
        UserSession userSession = c48182Jh.A01;
        userSession.getClass();
        C2KW.A02(userSession, c48182Jh.A02);
    }
}
