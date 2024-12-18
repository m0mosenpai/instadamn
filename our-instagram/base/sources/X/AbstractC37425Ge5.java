package X;

import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ge5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37425Ge5 {
    public static Map A00(ClipsMashupFollowButtonInfo clipsMashupFollowButtonInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (clipsMashupFollowButtonInfo.CZs() != null) {
            A1I.put("is_original_author_in_author_exp", clipsMashupFollowButtonInfo.CZs());
        }
        if (clipsMashupFollowButtonInfo.BwL() != null) {
            A1I.put("show_follow_bottom_sheet_button", clipsMashupFollowButtonInfo.BwL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
