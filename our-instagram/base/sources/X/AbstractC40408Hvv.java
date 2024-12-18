package X;

import com.instagram.api.schemas.TextPostAppUserFediverseInfoImpl;
import java.io.IOException;

/* renamed from: X.Hvv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40408Hvv {
    public static TextPostAppUserFediverseInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text_post_app_fediverse_followers_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "text_post_app_fediverse_followers_instance_count");
                }
                c16l.A0z();
            }
            return new TextPostAppUserFediverseInfoImpl(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
