package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167387ds extends AbstractC61132qb {
    public final UserSession A00;

    public C167387ds(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C167377dr(this.A00);
    }
}