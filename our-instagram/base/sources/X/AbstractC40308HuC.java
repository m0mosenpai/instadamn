package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HuC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40308HuC {
    public static Map A00(StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyPromptParticipationFrictionInfoDict.Ags() != null) {
            A1I.put("body_1", storyPromptParticipationFrictionInfoDict.Ags());
        }
        if (storyPromptParticipationFrictionInfoDict.Agt() != null) {
            A1I.put("body_2", storyPromptParticipationFrictionInfoDict.Agt());
        }
        String str = null;
        if (storyPromptParticipationFrictionInfoDict.Agu() != null) {
            StoryLinkInfoDictIntf Agu = storyPromptParticipationFrictionInfoDict.Agu();
            if (Agu != null) {
                treeUpdaterJNI = Agu.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(763), treeUpdaterJNI);
        }
        if (storyPromptParticipationFrictionInfoDict.B8h() != null) {
            StoryPromptParticipationFrictionType B8h = storyPromptParticipationFrictionInfoDict.B8h();
            if (B8h != null) {
                str = B8h.A00;
            }
            A1I.put(AbstractC111324zv.A00(948), str);
        }
        if (storyPromptParticipationFrictionInfoDict.getTitle() != null) {
            AbstractC37300Gc1.A17(storyPromptParticipationFrictionInfoDict.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
