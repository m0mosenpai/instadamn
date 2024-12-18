package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GOB implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public GOB(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2DG.A00(this.A00).A09(this.A01);
    }
}
