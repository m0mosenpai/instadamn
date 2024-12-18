package X;

import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I38 {
    public static C38816H7g parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            StoryAdKeywordStyleEnum storyAdKeywordStyleEnum = null;
            StoryAdKeywordTypeEnum storyAdKeywordTypeEnum = null;
            Integer num2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("end_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("keyword_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("keyword_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("keyword_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    storyAdKeywordStyleEnum = (StoryAdKeywordStyleEnum) StoryAdKeywordStyleEnum.A01.get(A1P2);
                    if (storyAdKeywordStyleEnum == null) {
                        storyAdKeywordStyleEnum = StoryAdKeywordStyleEnum.A06;
                    }
                } else if ("keyword_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyAdKeywordTypeEnum = (StoryAdKeywordTypeEnum) StoryAdKeywordTypeEnum.A01.get(A1P);
                    if (storyAdKeywordTypeEnum == null) {
                        storyAdKeywordTypeEnum = StoryAdKeywordTypeEnum.A0M;
                    }
                } else if ("start_index".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38816H7g(storyAdKeywordStyleEnum, storyAdKeywordTypeEnum, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
