package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GFx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36702GFx implements InterfaceC03370Gm {
    public final /* synthetic */ EV5 A00;

    @Override // X.InterfaceC03370Gm
    public final void EOw(UserSession userSession) {
        C18A A00 = AnonymousClass189.A00(userSession);
        EV5 ev5 = this.A00;
        U7K u7k = U7H.A04;
        User user = ev5.A00;
        if (user != null) {
            A00.A01(user, false, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C36702GFx(EV5 ev5) {
        this.A00 = ev5;
    }
}
