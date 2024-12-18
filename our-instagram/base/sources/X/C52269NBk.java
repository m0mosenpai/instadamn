package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52269NBk extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C52269NBk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "archive_stories_recycle_bin";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C51013MgK(this.A00, this.A01);
    }
}
