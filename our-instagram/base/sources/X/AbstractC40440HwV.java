package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.UserRelatedAccountsInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40440HwV {
    public static Map A00(UserRelatedAccountsInfoDict userRelatedAccountsInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (userRelatedAccountsInfoDict.AfQ() != null) {
            UserBannerInlineOtherProfileDict AfQ = userRelatedAccountsInfoDict.AfQ();
            if (AfQ != null) {
                treeUpdaterJNI = AfQ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("banner_inline_other_profile", treeUpdaterJNI);
        }
        if (userRelatedAccountsInfoDict.AfS() != null) {
            A1I.put("banner_subtitle", userRelatedAccountsInfoDict.AfS());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
