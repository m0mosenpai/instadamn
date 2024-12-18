package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.93p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045593p {
    public static C123645id parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C123645id c123645id = new C123645id();
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
                if ("profile_grid_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38748H4o parseFromJson = Hs6.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c123645id.A03 = arrayList;
                } else if ("profile_grid_items_cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c123645id.A02 = str2;
                } else if ("special_empty_state".equals(A0q)) {
                    c123645id.A00 = AbstractC33692Eug.parseFromJson(c16l);
                } else if ("pinned_profile_grid_items_ids".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c123645id.A01 = str;
                } else {
                    C74313Vm.A00(c16l, c123645id, A0q);
                }
                c16l.A0z();
            }
            return c123645id;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
