package X;

import java.io.IOException;

/* renamed from: X.5JL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5JL {
    public static C5JM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("editing_locked_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_editing_locked".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("max_num_addresses".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("max_num_edits".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("num_edits".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C5JM(bool, num, num2, num3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
