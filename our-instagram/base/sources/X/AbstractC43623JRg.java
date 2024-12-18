package X;

import com.instagram.feed.media.EffectActionSheetIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.JRg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC43623JRg {
    public static Map A00(EffectActionSheetIntf effectActionSheetIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (effectActionSheetIntf.BgC() != null) {
            A1I.put("primary_actions", effectActionSheetIntf.BgC());
        }
        if (effectActionSheetIntf.BrM() != null) {
            A1I.put("secondary_actions", effectActionSheetIntf.BrM());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
