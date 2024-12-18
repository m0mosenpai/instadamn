package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.ESd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32477ESd extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C77U A01;
    public final /* synthetic */ User A02;

    public C32477ESd(UserSession userSession, C77U c77u, User user) {
        this.A00 = userSession;
        this.A02 = user;
        this.A01 = c77u;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1947828624);
        C151516rx c151516rx = (C151516rx) obj;
        int A032 = C0f9.A03(-22111384);
        C14360o3.A0B(c151516rx, 0);
        UserSession userSession = this.A00;
        C129885ts A00 = AbstractC129875tr.A00(userSession);
        User user = this.A02;
        A00.A0C(c151516rx, user, null);
        Boolean bool = c151516rx.A02;
        if (bool == null || !bool.booleanValue()) {
            C77V.A00(userSession, this.A01, user, "", false);
        }
        C0f9.A0A(1936947605, A032);
        C0f9.A0A(1969723991, A03);
    }
}
