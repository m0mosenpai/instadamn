package X;

import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;
import java.io.IOException;

/* renamed from: X.HmN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39874HmN {
    public static C38713H2z parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerInsightType creatorViewerInsightType = null;
            String str = null;
            CreatorViewerInsightCTA creatorViewerInsightCTA = null;
            PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cta".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    creatorViewerInsightCTA = (CreatorViewerInsightCTA) CreatorViewerInsightCTA.A01.get(A1P2);
                    if (creatorViewerInsightCTA == null) {
                        creatorViewerInsightCTA = CreatorViewerInsightCTA.A09;
                    }
                } else if ("insight_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorViewerInsightType = (CreatorViewerInsightType) CreatorViewerInsightType.A01.get(A1P);
                    if (creatorViewerInsightType == null) {
                        creatorViewerInsightType = CreatorViewerInsightType.A09;
                    }
                } else if (AbstractC111324zv.A00(253).equals(A0s)) {
                    popularReelWithFollowersInsightMetadataImpl = AbstractC40152HrL.parseFromJson(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creatorViewerInsightType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("insight_type", c16l, "CreatorViewerInsight");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "CreatorViewerInsight");
            } else {
                return new C38713H2z(creatorViewerInsightCTA, creatorViewerInsightType, popularReelWithFollowersInsightMetadataImpl, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
