package X;

import java.io.IOException;

/* renamed from: X.9yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226229yf {
    public static Al8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Al8 al8 = new Al8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("medium".equals(A0s)) {
                    al8.A06 = C8IR.parseFromJson(c16l);
                } else if ("product_type".equals(A0s)) {
                    EnumC222999se enumC222999se = (EnumC222999se) EnumC222999se.A01.get(c16l.A1Q());
                    if (enumC222999se == null) {
                        enumC222999se = EnumC222999se.A0D;
                    }
                    al8.A07 = enumC222999se;
                } else if ("max_width".equals(A0s)) {
                    al8.A02 = c16l.A1D();
                } else if ("max_height".equals(A0s)) {
                    al8.A01 = c16l.A1D();
                } else if ("volume".equals(A0s)) {
                    al8.A00 = (float) c16l.A0U();
                } else if ("clips_remix_layout_type".equals(A0s)) {
                    EnumC222939sY enumC222939sY = (EnumC222939sY) EnumC222939sY.A01.get(c16l.A1Q());
                    if (enumC222939sY == null) {
                        enumC222939sY = EnumC222939sY.A06;
                    }
                    al8.A08 = enumC222939sY;
                } else if ("is_mirrored".equals(A0s)) {
                    al8.A09 = c16l.A0d();
                } else if ("should_use_new_transcoding_flow".equals(A0s)) {
                    al8.A0A = c16l.A0d();
                } else if ("corner_radii".equals(A0s)) {
                    al8.A05 = AbstractC226169yZ.parseFromJson(c16l);
                } else if ("time_interval_start_time_ms".equals(A0s)) {
                    al8.A04 = c16l.A1D();
                } else if ("time_interval_end_time_ms".equals(A0s)) {
                    al8.A03 = c16l.A1D();
                }
                c16l.A0z();
            }
            return al8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
