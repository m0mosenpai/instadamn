package X;

import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40128Hqv {
    public static Map A00(OriginalityFollowButtonInfo originalityFollowButtonInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (originalityFollowButtonInfo.CZs() != null) {
            A1I.put("is_original_author_in_author_exp", originalityFollowButtonInfo.CZs());
        }
        if (originalityFollowButtonInfo.BwL() != null) {
            A1I.put("show_follow_bottom_sheet_button", originalityFollowButtonInfo.BwL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
