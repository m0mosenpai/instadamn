package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.GNw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36901GNw implements Runnable {
    public final /* synthetic */ C7YJ A00;
    public final /* synthetic */ User A01;

    public RunnableC36901GNw(C7YJ c7yj, User user) {
        this.A00 = c7yj;
        this.A01 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A05.Cre(MessagingUser.A00(this.A01), "direct_thread_verified_user_dialog");
    }
}
