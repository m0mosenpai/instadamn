package X;

import com.instagram.model.shopping.reels.InstagramShopLink;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1K {
    public static InstagramShopLink parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            InstagramShopLink instagramShopLink = new InstagramShopLink();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("is_enabled".equals(AbstractC166997dE.A0s(c16l))) {
                    instagramShopLink.A00 = c16l.A0d();
                }
                c16l.A0z();
            }
            return instagramShopLink;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
