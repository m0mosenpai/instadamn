package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5QA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QA {
    public static C5QB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5QB c5qb = new C5QB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("overlay_drawable_data".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C203318yo parseFromJson = AbstractC203308yn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c5qb.A02 = arrayList;
                } else if ("overlay_asset_data".equals(A0q)) {
                    c5qb.A01 = C5QC.A00(c16l);
                } else if ("drawables_max_z".equals(A0q)) {
                    c5qb.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c5qb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
