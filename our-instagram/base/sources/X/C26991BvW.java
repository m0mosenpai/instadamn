package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BvW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26991BvW extends AbstractC61132qb {
    public final UserSession A00;

    public C26991BvW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25822Bbd(C7MQ.A00(this.A00));
    }
}
