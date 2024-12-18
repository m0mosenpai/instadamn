package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.discovery.related.model.RelatedItem;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VT7 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.discovery.related.model.RelatedItem, java.lang.Object] */
    public static RelatedItem parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0q)) {
                    obj.A01 = AbstractC222616c.A00(c16l);
                } else if ("media_count".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
