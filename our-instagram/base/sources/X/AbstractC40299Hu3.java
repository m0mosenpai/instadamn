package X;

import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hu3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40299Hu3 {
    public static C51798Mv2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            StoryMusicPickAggregationVisibility storyMusicPickAggregationVisibility = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("aggregation_visibility".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyMusicPickAggregationVisibility = (StoryMusicPickAggregationVisibility) StoryMusicPickAggregationVisibility.A01.get(A1P);
                    if (storyMusicPickAggregationVisibility == null) {
                        storyMusicPickAggregationVisibility = StoryMusicPickAggregationVisibility.A05;
                    }
                } else if ("songs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51799Mv3 parseFromJson = AbstractC40300Hu4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (storyMusicPickAggregationVisibility == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("aggregation_visibility", c16l, "StoryMusicPickAggregationInfoImpl");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("songs", c16l, "StoryMusicPickAggregationInfoImpl");
            } else {
                return new C51798Mv2(storyMusicPickAggregationVisibility, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
