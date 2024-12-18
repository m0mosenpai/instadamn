package X;

import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Huf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40335Huf {
    public static Map A00(StoryTemplateReshareMediaDict storyTemplateReshareMediaDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateReshareMediaDict.Am9() != null) {
            A1I.put("carousel_index", storyTemplateReshareMediaDict.Am9());
        }
        if (storyTemplateReshareMediaDict.getMediaId() != null) {
            AbstractC37300Gc1.A18(storyTemplateReshareMediaDict.getMediaId(), A1I);
        }
        if (storyTemplateReshareMediaDict.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, storyTemplateReshareMediaDict.getUserId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
