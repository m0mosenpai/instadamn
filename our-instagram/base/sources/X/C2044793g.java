package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.93g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044793g {
    public static C2044693f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C2044693f c2044693f = new C2044693f();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("more_available".equals(A0q)) {
                    c2044693f.A05 = c16l.A0d();
                } else if ("auto_load_more_enabled".equals(A0q)) {
                    c2044693f.A06 = c16l.A0d();
                } else {
                    String str = null;
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    String str2 = null;
                    if ("clusters".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                ExploreTopicCluster parseFromJson = AbstractC127865qF.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c2044693f.A04 = arrayList;
                    } else if ("sectional_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C130455uq parseFromJson2 = AbstractC130445up.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList2.add(parseFromJson2);
                                }
                            }
                        }
                        c2044693f.A03 = arrayList2;
                    } else if ("next_max_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c2044693f.A01 = str2;
                    } else if ("session_paging_token".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c2044693f.A02 = str;
                    } else if ("demonstrate_push_block_irl".equals(A0q)) {
                        c16l.A0d();
                    } else {
                        C55702hA.A01(c16l, c2044693f, A0q);
                    }
                }
                c16l.A0z();
            }
            return c2044693f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
