package X;

import com.instagram.api.schemas.StoryTextAttributionType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Huj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40339Huj {
    public static H6C parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            StoryTextAttributionType storyTextAttributionType = null;
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attribution_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyTextAttributionType = (StoryTextAttributionType) StoryTextAttributionType.A01.get(A1P);
                    if (storyTextAttributionType == null) {
                        storyTextAttributionType = StoryTextAttributionType.A05;
                    }
                } else if ("bold_ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6B parseFromJson = AbstractC40337Huh.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (storyTextAttributionType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("attribution_type", c16l, "StoryTextAttribution");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text", c16l, "StoryTextAttribution");
                } else {
                    return new H6C(storyTextAttributionType, str, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("bold_ranges", c16l, "StoryTextAttribution");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
