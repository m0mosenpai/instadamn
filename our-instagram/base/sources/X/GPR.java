package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GPR implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public GPR(UserSession userSession, String str, String str2) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC25651Mw.A00(this.A00).E4s(new C36097FwX(this.A02, this.A01));
    }
}
