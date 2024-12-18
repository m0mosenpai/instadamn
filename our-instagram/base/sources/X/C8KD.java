package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;

/* renamed from: X.8KD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KD extends AbstractC52922bZ {
    public final C2GT A00;
    public final C05A A01;

    public final void A00(MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, MusicBrowseCategory musicBrowseCategory, String str, Map map) {
        C14360o3.A0B(userSession, 0);
        P66 p66 = new P66(musicProduct, userSession, this, musicBrowseCategory, str, map);
        if (abstractC59962oe.isAdded()) {
            new C50668MYm(abstractC59962oe, userSession, musicBrowseCategory, p66, false).A00(null, true);
        }
    }

    public C8KD() {
        C008002u A00 = C10E.A00(null);
        this.A01 = A00;
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, A00);
    }
}
