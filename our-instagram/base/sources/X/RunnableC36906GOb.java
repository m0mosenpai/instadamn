package X;

import com.instagram.user.model.User;

/* renamed from: X.GOb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36906GOb implements Runnable {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ User A01;

    public RunnableC36906GOb(C72q c72q, User user) {
        this.A00 = c72q;
        this.A01 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72q c72q = this.A00;
        if (c72q != null) {
            User user = this.A01;
            EnumC33371Ep4 enumC33371Ep4 = EnumC33371Ep4.A0D;
            c72q.ClM(user, enumC33371Ep4, "click", "unrestrict_profile_header");
            c72q.F9m(user, enumC33371Ep4);
        }
    }
}
