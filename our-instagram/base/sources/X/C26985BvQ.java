package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BvQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26985BvQ extends AbstractC61132qb {
    public final UserSession A00;

    public C26985BvQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25815BbW(new C27811COa(this.A00));
    }
}
