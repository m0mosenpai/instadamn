package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hur, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40347Hur {
    public static H6G parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryTrendingPromptSubType storyTrendingPromptSubType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_logging_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6H parseFromJson = AbstractC40349Hut.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prompt_subtype".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyTrendingPromptSubType = (StoryTrendingPromptSubType) StoryTrendingPromptSubType.A01.get(A1P);
                    if (storyTrendingPromptSubType == null) {
                        storyTrendingPromptSubType = StoryTrendingPromptSubType.A05;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_logging_infos", c16l, "StoryTrendingPromptLoggingInfo");
                throw C00O.createAndThrow();
            }
            return new H6G(storyTrendingPromptSubType, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
