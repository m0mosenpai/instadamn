package X;

import com.instagram.api.schemas.RankingAlgorithm;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Eva, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33748Eva {
    public static C32049E6b parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Boolean bool = null;
            String str = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            Boolean bool4 = null;
            RankingAlgorithm rankingAlgorithm = null;
            String str3 = null;
            Boolean bool5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("all_suggestion_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("auto_dvance".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("byline".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("enable_search_bar".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("friend_center_holdout".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("groups".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45146Jym parseFromJson = AbstractC33755Evh.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("max_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("more_available".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1203).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rankingAlgorithm = (RankingAlgorithm) RankingAlgorithm.A01.get(A1P);
                    if (rankingAlgorithm == null) {
                        rankingAlgorithm = RankingAlgorithm.A0B;
                    }
                } else if ("read_from_cache_DO_NOT_RETURN_TO_USER".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("use_compact_row".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C32049E6b(rankingAlgorithm, bool, bool2, bool3, bool4, bool5, str, str2, str3, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
