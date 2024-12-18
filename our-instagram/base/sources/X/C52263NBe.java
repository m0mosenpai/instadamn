package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52263NBe extends AbstractC61132qb {
    public final UserSession A00;

    public C52263NBe(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50897MeS(AbstractC54287Nz7.A00(this.A00));
    }
}
