package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;

/* renamed from: X.Nt0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53927Nt0 {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass841 anonymousClass841, Map map, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        MusicBrowseCategory A01 = C50535MSo.A01("feed_browse");
        new C50668MYm(abstractC59962oe, userSession, A01, new P67(userSession, anonymousClass841, A01, map, interfaceC16820sZ, interfaceC16660sJ), false).A00(null, true);
    }
}
