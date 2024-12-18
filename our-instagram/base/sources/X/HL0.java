package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;

/* loaded from: classes7.dex */
public final class HL0 extends AbstractC37439GeJ {
    public final UserSession A00;
    public final JIJ A01;
    public final C155376yQ A02;
    public final IME A03;
    public final KeywordSerpContextualFeedConfig A04;
    public final C38024GoD A05;

    public HL0(Fragment fragment, UserSession userSession, JIJ jij, KeywordSerpContextualFeedConfig keywordSerpContextualFeedConfig, C38024GoD c38024GoD) {
        String str;
        this.A00 = userSession;
        this.A01 = jij;
        this.A05 = c38024GoD;
        this.A04 = keywordSerpContextualFeedConfig;
        Context context = fragment.getContext();
        if (context != null) {
            C08790ch A00 = AbstractC018607g.A00(fragment);
            SectionPagination sectionPagination = keywordSerpContextualFeedConfig.A00;
            if (sectionPagination != null) {
                str = sectionPagination.A00;
            } else {
                str = null;
            }
            C154796xU c154796xU = new C154796xU(context, A00, userSession, str, true);
            Keyword keyword = keywordSerpContextualFeedConfig.A01;
            if (keyword != null) {
                this.A03 = new IME(userSession, c154796xU, keyword, null, keywordSerpContextualFeedConfig.A02, null);
                this.A02 = new C155376yQ(userSession);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }
}
