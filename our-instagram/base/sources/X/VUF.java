package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUF {
    public static C69454Vnd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69454Vnd c69454Vnd = new C69454Vnd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if (AbstractC111324zv.A00(443).equals(A0s)) {
                        c69454Vnd.A00 = c16l.A1D();
                    } else if ("reach_count".equals(A0s)) {
                        c69454Vnd.A01 = c16l.A1D();
                    } else if ("replies_count".equals(A0s)) {
                        c69454Vnd.A02 = c16l.A1D();
                    } else if ("story_swipe_away_count".equals(A0s)) {
                        c69454Vnd.A03 = c16l.A1D();
                    } else if ("taps_back_count".equals(A0s)) {
                        c69454Vnd.A04 = c16l.A1D();
                    } else if ("taps_forward_count".equals(A0s)) {
                        c69454Vnd.A05 = c16l.A1D();
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        c69454Vnd.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("instagram_media_id".equals(A0s)) {
                        c69454Vnd.A0B = AbstractC167017dG.A0m(c16l);
                    } else if ("instagram_media_owner_id".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("display_url".equals(A0s)) {
                        c69454Vnd.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("instagram_media_type".equals(A0s)) {
                        c69454Vnd.A08 = (EnumC68175VEt) EnumHelper.A00(c16l.A1Q(), EnumC68175VEt.A02);
                    } else if ("inline_insights_node".equals(A0s)) {
                        c69454Vnd.A06 = VUD.parseFromJson(c16l);
                    } else if ("instagram_media_owner_profile_image".equals(A0s)) {
                        c69454Vnd.A07 = VUE.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
            }
            return c69454Vnd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
