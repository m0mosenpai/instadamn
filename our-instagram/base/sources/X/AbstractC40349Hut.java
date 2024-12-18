package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import java.io.IOException;

/* renamed from: X.Hut, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40349Hut {
    public static H6H parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_subtype".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyTrendingPromptMediaSubType = (StoryTrendingPromptMediaSubType) StoryTrendingPromptMediaSubType.A01.get(A1P);
                    if (storyTrendingPromptMediaSubType == null) {
                        storyTrendingPromptMediaSubType = StoryTrendingPromptMediaSubType.A07;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_id", c16l, "StoryTrendingPromptMediaLoggingInfoImpl");
            } else if (storyTrendingPromptMediaSubType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_subtype", c16l, "StoryTrendingPromptMediaLoggingInfoImpl");
            } else {
                return new H6H(storyTrendingPromptMediaSubType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
