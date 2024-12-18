package X;

import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import java.io.IOException;

/* renamed from: X.HuD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40309HuD {
    public static StoryPromptParticipationFrictionInfoDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            StoryLinkInfoDict storyLinkInfoDict = null;
            StoryPromptParticipationFrictionType storyPromptParticipationFrictionType = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_1".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("body_2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(763).equals(A0s)) {
                    storyLinkInfoDict = AbstractC108134tw.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(948).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyPromptParticipationFrictionType = (StoryPromptParticipationFrictionType) StoryPromptParticipationFrictionType.A01.get(A1P);
                    if (storyPromptParticipationFrictionType == null) {
                        storyPromptParticipationFrictionType = StoryPromptParticipationFrictionType.A04;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new StoryPromptParticipationFrictionInfoDictImpl(storyLinkInfoDict, storyPromptParticipationFrictionType, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
