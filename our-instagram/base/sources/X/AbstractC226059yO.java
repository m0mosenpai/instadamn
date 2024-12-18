package X;

import android.content.Context;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226059yO {
    public static final C194808jg A00(Context context, StoryPromptTappableData storyPromptTappableData, UserSession userSession, String str) {
        List list;
        ElectionAddYoursInfoDict electionAddYoursInfoDict = storyPromptTappableData.A01;
        if (electionAddYoursInfoDict == null || (list = electionAddYoursInfoDict.A02) == null || list.isEmpty()) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            PromptStickerModel promptStickerModel = new PromptStickerModel(new C69669VtA(storyPromptTappableData).A00());
            promptStickerModel.A0B(A1B);
            A1E.add(new C221009pO(context, userSession, promptStickerModel, str));
        }
        int i = 2131971083;
        if (AbstractC166987dD.A10(userSession).A0M() == C05F.A0C) {
            i = 2131971082;
        }
        return new C194808jg(context, userSession, AbstractC166997dE.A0p(context, i), A1E);
    }
}
