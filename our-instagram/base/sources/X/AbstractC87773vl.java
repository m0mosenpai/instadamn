package X;

import java.io.IOException;

/* renamed from: X.3vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87773vl {
    public static C87793vn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C107104sG c107104sG = null;
            C107104sG c107104sG2 = null;
            C107104sG c107104sG3 = null;
            C107104sG c107104sG4 = null;
            C107104sG c107104sG5 = null;
            C107104sG c107104sG6 = null;
            C107104sG c107104sG7 = null;
            C107104sG c107104sG8 = null;
            C107104sG c107104sG9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cta".equals(A0q)) {
                    c107104sG = AbstractC87783vm.parseFromJson(c16l);
                } else if ("end_scene".equals(A0q)) {
                    c107104sG2 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("footer".equals(A0q)) {
                    c107104sG3 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("glados".equals(A0q)) {
                    c107104sG4 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("header".equals(A0q)) {
                    c107104sG5 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("iab".equals(A0q)) {
                    c107104sG6 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("mid_card".equals(A0q)) {
                    c107104sG7 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("profile_card".equals(A0q)) {
                    c107104sG8 = AbstractC87783vm.parseFromJson(c16l);
                } else if ("tool_tip".equals(A0q)) {
                    c107104sG9 = AbstractC87783vm.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C87793vn(c107104sG, c107104sG2, c107104sG3, c107104sG4, c107104sG5, c107104sG6, c107104sG7, c107104sG8, c107104sG9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
