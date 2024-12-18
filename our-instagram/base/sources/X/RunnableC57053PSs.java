package X;

import com.instagram.user.model.User;

/* renamed from: X.PSs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57053PSs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52174N7f A01;
    public final /* synthetic */ User A02;

    public RunnableC57053PSs(C52174N7f c52174N7f, User user, int i) {
        this.A01 = c52174N7f;
        this.A02 = user;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52174N7f c52174N7f = this.A01;
        User user = this.A02;
        int i = this.A00;
        if (c52174N7f.A0D) {
            C52174N7f.A01(c52174N7f, user, i);
            return;
        }
        C52174N7f.A00(c52174N7f, user, i);
        InterfaceC58082Pp7 interfaceC58082Pp7 = c52174N7f.A05;
        if (interfaceC58082Pp7 == null) {
            return;
        }
        interfaceC58082Pp7.AAT(user, false);
    }
}
