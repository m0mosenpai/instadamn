package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52279NBu extends AbstractC61132qb {
    public final UserSession A00;
    public final AnonymousClass841 A01;

    public C52279NBu(UserSession userSession, AnonymousClass841 anonymousClass841) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = anonymousClass841;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50930Mez(this.A00, this.A01);
    }
}
