package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGI extends AbstractC61132qb {
    public final UserSession A00;
    public final AnonymousClass840 A01;
    public final boolean A02;

    public KGI(UserSession userSession, AnonymousClass840 anonymousClass840, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = anonymousClass840;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        AnonymousClass840 anonymousClass840 = this.A01;
        AnonymousClass841 A00 = anonymousClass840.A00();
        boolean z = this.A02;
        return new C50723MaO(userSession, AnonymousClass229.A01(userSession), anonymousClass840, A00, C6WI.A01(), z);
    }
}
