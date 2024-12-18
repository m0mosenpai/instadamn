package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig;

/* renamed from: X.GsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38281GsQ extends AbstractC37439GeJ implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "SerpContextualFeedController";
    public C51017MgP A00;
    public final Fragment A01;
    public final UserSession A02;
    public final JIJ A03;
    public final W58 A04;
    public final C38024GoD A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C38281GsQ(Fragment fragment, UserSession userSession, JIJ jij, SerpContextualFeedConfig serpContextualFeedConfig, C38024GoD c38024GoD) {
        C14360o3.A0B(serpContextualFeedConfig, 5);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A03 = jij;
        this.A05 = c38024GoD;
        this.A09 = serpContextualFeedConfig.A05;
        String str = serpContextualFeedConfig.A01;
        String str2 = serpContextualFeedConfig.A02;
        this.A07 = str2;
        this.A08 = serpContextualFeedConfig.A03;
        String str3 = serpContextualFeedConfig.A04;
        String str4 = serpContextualFeedConfig.A00;
        this.A06 = str4;
        this.A04 = new W58(userSession, str, str2, str4, str3);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_contextual_keyword";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return C18U.A06(C06090Tz.A05, this.A02, 36316980734661367L);
    }
}
