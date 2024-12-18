package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.ISa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41355ISa {
    public static final C38687GzS A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        HashMap A1G = AbstractC166987dD.A1G();
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        C14360o3.A0A(A07);
        A1G.put("ad_id", A07);
        String A33 = c38321qM.A33();
        C14360o3.A0A(A33);
        A1G.put("tracking_token", A33);
        String id = c38321qM.getId();
        if (id != null) {
            A1G.put("media_id", id);
            return new C38687GzS("com.bloks.www.minishops.ad.collection", A1G, 14);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C38687GzS A01(UserSession userSession, C38321qM c38321qM, AndroidLink androidLink, String str) {
        AbstractC167017dG.A1N(userSession, c38321qM);
        if (androidLink.Aw8() == null) {
            return null;
        }
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null) {
            android.net.Uri A0B = AbstractC25227BEk.A0B(Aw8);
            String queryParameter = A0B.getQueryParameter("product_set_id");
            String queryParameter2 = A0B.getQueryParameter("rich_doc_id");
            String queryParameter3 = A0B.getQueryParameter("shopping_session_id");
            C14360o3.A0A(queryParameter3);
            HashMap A1G = AbstractC166987dD.A1G();
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            C14360o3.A0A(A07);
            A1G.put("ad_id", A07);
            String A33 = c38321qM.A33();
            C14360o3.A0A(A33);
            A1G.put("tracking_token", A33);
            String id = c38321qM.getId();
            if (id != null) {
                A1G.put("media_id", id);
                A1G.put("shopping_session_id", queryParameter3);
                if (str != null) {
                    A1G.put("prior_module", str);
                }
                if (queryParameter != null) {
                    A1G.put("product_set_id", queryParameter);
                }
                if (queryParameter2 != null) {
                    A1G.put("rich_doc_id", queryParameter2);
                }
                return new C38687GzS("com.bloks.www.minishops.ad.dynamic.shop.collection", AbstractC167017dG.A0r("params", AbstractC166987dD.A19(new JSONObject(AbstractC167007dF.A0n(AbstractC111324zv.A00(266), A1G)))), 14);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
