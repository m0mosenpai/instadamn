package X;

import android.location.Location;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class IME {
    public C154796xU A00;
    public final UserSession A01;
    public final Keyword A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public IME(UserSession userSession, C154796xU c154796xU, Keyword keyword, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c154796xU;
        this.A02 = keyword;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    public final void A00(AbstractC154286wd abstractC154286wd, String str, java.util.Set set, boolean z) {
        Location location;
        String str2;
        String str3;
        if (z) {
            C154806xV c154806xV = this.A00.A03;
            c154806xV.A07 = null;
            c154806xV.A02 = null;
        }
        C154796xU c154796xU = this.A00;
        UserSession userSession = this.A01;
        String str4 = this.A02.A04;
        String str5 = c154796xU.A03.A07;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            location = c1vw.getLastLocation(userSession, "KeywordSerpRequestController");
        } else {
            location = null;
        }
        String str6 = this.A05;
        String str7 = this.A04;
        String str8 = this.A03;
        C14360o3.A0B(str4, 1);
        String str9 = null;
        try {
            str2 = String.format(null, str4, Arrays.copyOf(new Object[]{URLEncoder.encode(str4, ReactWebViewManager.HTML_ENCODING)}, 1));
            C14360o3.A07(str2);
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        if (str5 != null) {
            str8 = null;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("fbsearch/search_engine_result_page/");
        A0M.A9s("query", str2);
        AbstractC37303Gc4.A15(A0M);
        if (location != null) {
            str3 = Double.valueOf(location.getLatitude()).toString();
        } else {
            str3 = null;
        }
        A0M.A0H("lat", str3);
        if (location != null) {
            str9 = Double.valueOf(location.getLongitude()).toString();
        }
        A0M.A0H("lng", str9);
        A0M.A0H("next_max_id", str5);
        A0M.A0H("rank_token", str);
        A0M.A0H("seen_categories", AbstractC31175DnJ.A0b(set));
        A0M.A0H("prior_serp_keyword_id", str6);
        A0M.A0H("prior_module", str7);
        C14360o3.A0B("topic_id", 0);
        A0M.A0H("pinned_media_id", str8);
        c154796xU.A03(AbstractC31172DnG.A0R(null, A0M, HBB.class, IS6.class, false), abstractC154286wd);
    }
}
