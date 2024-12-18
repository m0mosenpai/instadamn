package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1S {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.ICN, java.lang.Object] */
    public static ICN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if (AbstractC37300Gc1.A1Q(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("icon_url".equals(A0q)) {
                        obj.A00 = AbstractC222616c.A00(c16l);
                    } else if ("primary_button_text".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if (MSV.A00(63).equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("can_dismiss".equals(A0q)) {
                        c16l.A0d();
                    } else if ("upsell_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    }
                    c16l.A0z();
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
