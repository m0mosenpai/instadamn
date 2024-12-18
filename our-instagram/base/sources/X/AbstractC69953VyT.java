package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VyT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69953VyT {
    public static C70923WkS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C70923WkS c70923WkS = new C70923WkS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("branch_default_page_index".equals(A0s)) {
                    c70923WkS.A00 = c16l.A1D();
                } else if ("branch_subquestion_index_int".equals(A0s)) {
                    c70923WkS.A01 = c16l.A1D();
                } else if ("direct_next_page_index_int".equals(A0s)) {
                    c70923WkS.A02 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("branch_question_id".equals(A0s)) {
                        c70923WkS.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("node_type".equals(A0s)) {
                        c70923WkS.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("random_next_page_indices".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC65702TsY.A1L(c16l, arrayList);
                            }
                        }
                        c70923WkS.A06 = arrayList;
                    } else if ("branch_response_maps".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69007Vfj parseFromJson = VV1.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c70923WkS.A05 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c70923WkS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C70923WkS c70923WkS) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("branch_default_page_index", c70923WkS.A00);
        anonymousClass182.A0Q("branch_subquestion_index_int", c70923WkS.A01);
        anonymousClass182.A0Q("direct_next_page_index_int", c70923WkS.A02);
        String str = c70923WkS.A03;
        if (str != null) {
            anonymousClass182.A0S("branch_question_id", str);
        }
        String str2 = c70923WkS.A04;
        if (str2 != null) {
            anonymousClass182.A0S("node_type", str2);
        }
        if (c70923WkS.A06 != null) {
            C16V.A03(anonymousClass182, "random_next_page_indices");
            for (Number number : c70923WkS.A06) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        if (c70923WkS.A05 != null) {
            C16V.A03(anonymousClass182, "branch_response_maps");
            for (C69007Vfj c69007Vfj : c70923WkS.A05) {
                if (c69007Vfj != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("page_index", c69007Vfj.A00);
                    anonymousClass182.A0Q("response_option_numeric_value", c69007Vfj.A01);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
