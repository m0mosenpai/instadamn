package X;

import com.instagram.api.schemas.StoryPromptTappableData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hup, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40345Hup {
    public static H6F parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            StoryPromptTappableData storyPromptTappableData = null;
            ArrayList arrayList2 = null;
            H6G h6g = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(504);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("logging_info".equals(A0s)) {
                    h6g = AbstractC40347Hur.parseFromJson(c16l);
                } else if ("media_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (A00.equals(A0s)) {
                    storyPromptTappableData = AbstractC109294vv.parseFromJson(c16l);
                } else if ("reel_pks".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_infos", c16l, "StoryTrendingPromptInfo");
            } else if (storyPromptTappableData != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reel_pks", c16l, "StoryTrendingPromptInfo");
                } else {
                    return new H6F(storyPromptTappableData, h6g, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "StoryTrendingPromptInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
