package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;

/* renamed from: X.NBm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52271NBm extends AbstractC61132qb {
    public final HighlightReelTypeStr A00;
    public final UserSession A01;

    public C52271NBm(HighlightReelTypeStr highlightReelTypeStr, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = highlightReelTypeStr;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44490Jlw(this.A00, this.A01);
    }
}
