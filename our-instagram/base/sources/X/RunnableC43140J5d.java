package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J5d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43140J5d implements Runnable {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C145176gc A01;
    public final /* synthetic */ boolean A02;

    public RunnableC43140J5d(C38321qM c38321qM, C145176gc c145176gc, boolean z) {
        this.A01 = c145176gc;
        this.A00 = c38321qM;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01.A09;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        AbstractC25651Mw.A00(userSession).E4s(new C3HX(this.A00, this.A02));
    }
}
