package X;

import com.instagram.api.schemas.CollabFollowButtonInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37386GdS {
    public static Map A00(CollabFollowButtonInfo collabFollowButtonInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (collabFollowButtonInfo.CZy() != null) {
            A1I.put("is_owner_in_author_exp", collabFollowButtonInfo.CZy());
        }
        if (collabFollowButtonInfo.BwM() != null) {
            A1I.put("show_follow_button", collabFollowButtonInfo.BwM());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
