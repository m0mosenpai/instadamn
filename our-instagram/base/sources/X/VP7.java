package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP7 {
    public static Map A00(XGH xgh) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgh.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", xgh.getBackgroundColor());
        }
        if (xgh.getEmoji() != null) {
            linkedHashMap.put("emoji", xgh.getEmoji());
        }
        if (xgh.CWr() != null) {
            linkedHashMap.put("is_interactive_music_sticker", xgh.CWr());
        }
        if (xgh.getQuestion() != null) {
            linkedHashMap.put("question", xgh.getQuestion());
        }
        if (xgh.getSliderId() != null) {
            linkedHashMap.put("slider_id", xgh.getSliderId());
        }
        if (xgh.Bxn() != null) {
            linkedHashMap.put("slider_vote_average", AbstractC166997dE.A0f(xgh.Bxn()));
        }
        if (xgh.Bxo() != null) {
            linkedHashMap.put("slider_vote_count", xgh.Bxo());
        }
        if (xgh.getTextColor() != null) {
            linkedHashMap.put("text_color", xgh.getTextColor());
        }
        if (xgh.CG3() != null) {
            linkedHashMap.put("viewer_can_vote", xgh.CG3());
        }
        if (xgh.CGN() != null) {
            linkedHashMap.put("viewer_vote", AbstractC166997dE.A0f(xgh.CGN()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
