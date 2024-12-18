package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45583KFx extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;

    public C45583KFx(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44529JmZ(this.A00, this.A01);
    }
}
