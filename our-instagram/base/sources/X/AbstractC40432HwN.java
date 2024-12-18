package X;

import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40432HwN {
    public static Map A00(UserBannerInlineOtherProfileDict userBannerInlineOtherProfileDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (userBannerInlineOtherProfileDict.AY2() != null) {
            A1I.put("account_id", userBannerInlineOtherProfileDict.AY2());
        }
        if (userBannerInlineOtherProfileDict.AY6() != null) {
            A1I.put("account_title", userBannerInlineOtherProfileDict.AY6());
        }
        if (userBannerInlineOtherProfileDict.AY7() != null) {
            IgUserRelatedAccountTypeEnum AY7 = userBannerInlineOtherProfileDict.AY7();
            if (AY7 != null) {
                str = AY7.A00;
            } else {
                str = null;
            }
            A1I.put("account_type", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
