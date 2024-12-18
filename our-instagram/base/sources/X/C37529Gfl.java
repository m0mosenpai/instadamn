package X;

import android.content.Context;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.Gfl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37529Gfl {
    public final InterfaceC43071ya A00;
    public final InterfaceC43071ya A01;
    public final C28091Xn A02;
    public final C64092vU A03;

    public C37529Gfl(Context context, PlaylistContext playlistContext, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, C1M1 c1m1) {
        C64092vU c64092vU = new C64092vU(AbstractC11060iN.A00(userSession), true);
        this.A03 = c64092vU;
        C28091Xn A00 = C28071Xl.A00(context, userSession);
        this.A02 = A00;
        AnonymousClass350 anonymousClass350 = new AnonymousClass350(userSession, interfaceC60442pS, null, c1m1, A00, "instagram_organic_vpvd_imp");
        anonymousClass350.A01 = searchContext;
        anonymousClass350.A00 = playlistContext;
        this.A00 = new C37530Gfm(anonymousClass350, c64092vU);
        this.A01 = new C37530Gfm(new AnonymousClass350(userSession, interfaceC60442pS, null, c1m1, A00, interfaceC60442pS.isSponsoredEligible() ? "instagram_ad_vpvd_imp" : "instagram_organic_vpvd_imp"), c64092vU);
    }
}
