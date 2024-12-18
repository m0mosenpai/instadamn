package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PRk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57019PRk implements Runnable {
    public final /* synthetic */ AbstractC12990ll A00;
    public final /* synthetic */ String A01;

    public RunnableC57019PRk(AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = str;
        this.A00 = abstractC12990ll;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4M5.A00();
        String str = this.A01;
        UserSession userSession = (UserSession) this.A00;
        C14360o3.A0B(userSession, 1);
        C3KW.A03(userSession, str);
    }
}
