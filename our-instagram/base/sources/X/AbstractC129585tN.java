package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129585tN {
    public static C38091pt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C130565v1 c130565v1 = null;
            C130565v1 c130565v12 = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("crop_rect".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(new Float(c16l.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cropped_image_version".equals(A0q)) {
                    c130565v1 = AbstractC129595tO.parseFromJson(c16l);
                } else if ("full_image_version".equals(A0q)) {
                    c130565v12 = AbstractC129595tO.parseFromJson(c16l);
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("upload_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c130565v1 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("cropped_image_version", "ReelCoverMedia");
                throw C00O.createAndThrow();
            }
            return new C38091pt(c130565v1, c130565v12, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
