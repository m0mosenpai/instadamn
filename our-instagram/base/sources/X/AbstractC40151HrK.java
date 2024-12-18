package X;

import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HrK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40151HrK {
    public static Map A00(PopularReelWithFollowersInsightMetadata popularReelWithFollowersInsightMetadata) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        popularReelWithFollowersInsightMetadata.getLikeCount();
        A1I.put("like_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getLikeCount()));
        if (popularReelWithFollowersInsightMetadata.BR1() != null) {
            A1I.put("media_ids", popularReelWithFollowersInsightMetadata.BR1());
        }
        popularReelWithFollowersInsightMetadata.getPlayCount();
        A1I.put("play_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getPlayCount()));
        popularReelWithFollowersInsightMetadata.getReshareCount();
        return AbstractC37301Gc2.A0r("reshare_count", Integer.valueOf(popularReelWithFollowersInsightMetadata.getReshareCount()), A1I);
    }
}
