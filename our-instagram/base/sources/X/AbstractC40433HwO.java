package X;

import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDictImpl;
import java.io.IOException;

/* renamed from: X.HwO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40433HwO {
    public static UserBannerInlineOtherProfileDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            IgUserRelatedAccountTypeEnum igUserRelatedAccountTypeEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("account_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("account_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    igUserRelatedAccountTypeEnum = (IgUserRelatedAccountTypeEnum) IgUserRelatedAccountTypeEnum.A01.get(A1P);
                    if (igUserRelatedAccountTypeEnum == null) {
                        igUserRelatedAccountTypeEnum = IgUserRelatedAccountTypeEnum.A05;
                    }
                }
                c16l.A0z();
            }
            return new UserBannerInlineOtherProfileDictImpl(igUserRelatedAccountTypeEnum, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
