package X;

import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.api.schemas.GoalsToastType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39944HnZ {
    public static Map A00(GoalsToastInfo goalsToastInfo) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (goalsToastInfo.Aj7() != null) {
            A1I.put("button_text", goalsToastInfo.Aj7());
        }
        if (goalsToastInfo.Aw9() != null) {
            A1I.put("deeplink_url", goalsToastInfo.Aw9());
        }
        if (goalsToastInfo.BAA() != null) {
            A1I.put("goal_id", goalsToastInfo.BAA());
        }
        if (goalsToastInfo.C93() != null) {
            A1I.put("title_text", goalsToastInfo.C93());
        }
        if (goalsToastInfo.C97() != null) {
            GoalsToastType C97 = goalsToastInfo.C97();
            if (C97 != null) {
                str = C97.A00;
            } else {
                str = null;
            }
            A1I.put("toast_type", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
