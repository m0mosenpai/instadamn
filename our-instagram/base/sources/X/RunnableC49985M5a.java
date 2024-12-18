package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M5a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49985M5a implements Runnable {
    public final /* synthetic */ C6C9 A00;
    public final /* synthetic */ C4F8 A01;
    public final /* synthetic */ C49622LwF A02;

    public RunnableC49985M5a(C6C9 c6c9, C4F8 c4f8, C49622LwF c49622LwF) {
        this.A02 = c49622LwF;
        this.A01 = c4f8;
        this.A00 = c6c9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49622LwF c49622LwF = this.A02;
        c49622LwF.A03 = true;
        C4F8 c4f8 = this.A01;
        C6C9 c6c9 = this.A00;
        UserSession userSession = c49622LwF.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        c4f8.A01(EnumC152696tw.POG, LLE.A00(c6c9, userSession));
    }
}
