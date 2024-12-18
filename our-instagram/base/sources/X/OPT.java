package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mapquery.MapQuery;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OPT {
    public static MapQuery parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MapQuery mapQuery = new MapQuery();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    mapQuery.A00 = A0m;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    mapQuery.A01 = A0m2;
                } else if ("style".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    mapQuery.A03 = A0m3;
                } else if ("queryType".equals(A0q)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    mapQuery.A02 = A0m4;
                }
                c16l.A0z();
            }
            return mapQuery;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MapQuery mapQuery) {
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, mapQuery.A00);
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mapQuery.A01);
        anonymousClass182.A0S("style", mapQuery.A03);
        anonymousClass182.A0S("queryType", mapQuery.A02);
        anonymousClass182.A0a();
    }
}
