package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hli, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39834Hli {
    public static E6X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            Integer num = null;
            Integer num2 = null;
            E6P e6p = null;
            User user = null;
            String str2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("is_dash_eligible".equals(A0q)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1O(A0q)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("preview_url_info".equals(A0q)) {
                    e6p = AbstractC39835Hlj.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("video_dash_manifest".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("video_duration".equals(A0q)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("video_versions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E6Q parseFromJson = AbstractC39836Hlk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new E6X(e6p, imageInfoImpl, user, num, num2, num3, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
