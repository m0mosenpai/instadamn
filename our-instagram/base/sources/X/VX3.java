package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VX3 {
    public static C70876Wih parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C70876Wih c70876Wih = new C70876Wih();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("primary_color".equals(A0s)) {
                    c70876Wih.A06 = c16l.A1D();
                } else if ("contrast_color".equals(A0s)) {
                    c70876Wih.A05 = c16l.A1D();
                } else if ("corner_radius".equals(A0s)) {
                    c70876Wih.A01 = (float) c16l.A0U();
                } else {
                    ArrayList arrayList = null;
                    if ("serializable_paths".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C139136Ru parseFromJson = AbstractC69984Vz3.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c70876Wih.A08 = arrayList;
                    } else if ("is_frosted".equals(A0s)) {
                        c70876Wih.A09 = c16l.A0d();
                    } else if ("top_padding_ratio".equals(A0s)) {
                        c70876Wih.A04 = (float) c16l.A0U();
                    } else if ("bottom_padding_ratio".equals(A0s)) {
                        c70876Wih.A00 = (float) c16l.A0U();
                    } else if ("horizontal_padding_ratio".equals(A0s)) {
                        c70876Wih.A02 = (float) c16l.A0U();
                    } else if ("line_spacing_multiplier".equals(A0s)) {
                        c70876Wih.A03 = (float) c16l.A0U();
                    } else if ("text_emphasis_mode".equals(A0s)) {
                        c70876Wih.A07 = A2Y.A00(AbstractC167017dG.A0m(c16l));
                    }
                }
                c16l.A0z();
            }
            return c70876Wih;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
