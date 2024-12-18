package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37651p2 {
    public static C37661p3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37661p3 c37661p3 = new C37661p3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if ("stories_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C37731pA parseFromJson = AbstractC37711p8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c37661p3.A05 = arrayList;
                } else if ("next_ad_request_index".equals(A0q)) {
                    c37661p3.A02 = c16l.A1D();
                } else if ("ads_pool_threshold_for_next_request".equals(A0q)) {
                    c37661p3.A00 = c16l.A1D();
                } else if ("earliest_request_position".equals(A0q)) {
                    c37661p3.A01 = c16l.A1D();
                } else if ("index_calculation_strategy".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    c37661p3.A03 = str2;
                } else if ("delivery_source".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c37661p3.A04 = str;
                }
                c16l.A0z();
            }
            return c37661p3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
