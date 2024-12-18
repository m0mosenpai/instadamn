package X;

import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.I5u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40792I5u {
    public static final SearchContext A00(HashMap hashMap) {
        return new SearchContext((String) hashMap.get("search_session_id"), (String) hashMap.get("rank_token"), (String) hashMap.get("query_text"), (String) hashMap.get(AbstractC111324zv.A00(2065)), (String) hashMap.get("serp_session_id"), (String) hashMap.get("click_id"), (String) hashMap.get("reels_page_index"), null);
    }
}
