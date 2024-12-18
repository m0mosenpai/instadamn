package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NC2 extends AbstractC61132qb {
    public final MusicProduct A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50979Mfm(this.A00, this.A01);
    }

    public NC2(MusicProduct musicProduct, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, musicProduct);
        this.A01 = userSession;
        this.A00 = musicProduct;
    }
}
