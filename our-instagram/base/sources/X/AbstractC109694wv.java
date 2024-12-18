package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4wv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109694wv {
    public static C109804x7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            Long l3 = null;
            C109784x5 c109784x5 = null;
            C109754x2 c109754x2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("consumption_sheet_config".equals(A0q)) {
                    c109784x5 = AbstractC109774x4.parseFromJson(c16l);
                } else if ("digital_non_consumable_product_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("digital_product_id".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("payee_id".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("pinned_row_config".equals(A0q)) {
                    c109754x2 = AbstractC109744x1.parseFromJson(c16l);
                } else if ("tier_infos".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C109724wz parseFromJson = AbstractC109704ww.parseFromJson(c16l);
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
            if (c109784x5 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("consumption_sheet_config", "LiveUserPayViewerPayConfig");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (l2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("digital_product_id", "LiveUserPayViewerPayConfig");
                } else if (l3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("payee_id", "LiveUserPayViewerPayConfig");
                } else if (c109754x2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("pinned_row_config", "LiveUserPayViewerPayConfig");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("tier_infos", "LiveUserPayViewerPayConfig");
                } else {
                    return new C109804x7(c109784x5, c109754x2, arrayList, l.longValue(), l2.longValue(), l3.longValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("digital_non_consumable_product_id", "LiveUserPayViewerPayConfig");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
