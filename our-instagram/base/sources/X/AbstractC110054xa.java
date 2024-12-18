package X;

import java.io.IOException;

/* renamed from: X.4xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110054xa {
    public static C110064xb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("duration_in_ms".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("reusable_template_media_asset_end_time_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("reusable_template_media_asset_start_time_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("duration_in_ms", "ClipsTemplateSegmentInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C110064xb(num, num2, l.longValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
