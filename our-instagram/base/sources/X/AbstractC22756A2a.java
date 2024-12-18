package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.A2a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22756A2a {
    public static Ai3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Ai3 ai3 = new Ai3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("primary_color".equals(A0s)) {
                    ai3.A01 = c16l.A1D();
                } else if ("secondary_color".equals(A0s)) {
                    ai3.A02 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("font_name".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        ai3.A04 = A0m;
                    } else if ("letter_spacing_multiplier".equals(A0s)) {
                        ai3.A00 = (float) c16l.A0U();
                    } else if ("text_emphasis_mode".equals(A0s)) {
                        ai3.A03 = A2Y.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("line_coordinate_x".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(AbstractC167007dF.A0a(c16l));
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        ai3.A05 = arrayList;
                    } else if ("line_coordinate_y".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(AbstractC167007dF.A0a(c16l));
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        ai3.A06 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return ai3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
