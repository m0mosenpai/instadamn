package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VTa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68495VTa {
    public static C69390Vma parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69390Vma c69390Vma = new C69390Vma();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    c69390Vma.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("bottom_margin".equals(A0s)) {
                    c69390Vma.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("left_margin".equals(A0s)) {
                    c69390Vma.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("right_margin".equals(A0s)) {
                    c69390Vma.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("top_margin".equals(A0s)) {
                    c69390Vma.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("vertical_constraint".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("alignment".equals(A0s)) {
                    c69390Vma.A01 = (EnumC68176VEu) EnumHelper.A00(c16l.A1Q(), EnumC68176VEu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("text_metrics".equals(A0s)) {
                    c69390Vma.A00 = AbstractC68496VTb.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69390Vma;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
