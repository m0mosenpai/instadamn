package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GO9 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GO9(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC25651Mw.A00(this.A00).E4s(new C36097FwX(null, this.A01));
    }
}
