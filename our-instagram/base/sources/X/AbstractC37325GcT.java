package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.GcT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37325GcT {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IJc, java.lang.Object] */
    public static C41137IJc parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("simple_user_story_target".equals(A0q)) {
                    obj.A04 = AbstractC37323GcP.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A05 = A1P;
                } else if ("all_user_story_target".equals(A0q)) {
                    obj.A00 = AbstractC40762I4q.parseFromJson(c16l);
                } else if ("close_friends_user_story_target".equals(A0q)) {
                    obj.A01 = AbstractC40763I4r.parseFromJson(c16l);
                } else if ("group_user_story_target".equals(A0q)) {
                    obj.A03 = AbstractC40765I4t.parseFromJson(c16l);
                } else if ("community_user_story_target".equals(A0q)) {
                    obj.A02 = AbstractC40764I4s.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (obj.A04 == null && obj.A00 == null && obj.A01 == null && obj.A03 == null && obj.A02 == null) {
                throw AbstractC166987dD.A12("Failed requirement.");
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
