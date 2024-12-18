package X;

import com.instagram.api.schemas.UserBannerInlineOtherProfileDictImpl;
import com.instagram.api.schemas.UserRelatedAccountsInfoDictImpl;
import java.io.IOException;

/* renamed from: X.HwW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40441HwW {
    public static UserRelatedAccountsInfoDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UserBannerInlineOtherProfileDictImpl userBannerInlineOtherProfileDictImpl = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banner_inline_other_profile".equals(A0s)) {
                    userBannerInlineOtherProfileDictImpl = AbstractC40433HwO.parseFromJson(c16l);
                } else if ("banner_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new UserRelatedAccountsInfoDictImpl(userBannerInlineOtherProfileDictImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
