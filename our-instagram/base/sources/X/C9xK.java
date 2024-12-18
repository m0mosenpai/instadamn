package X;

import java.io.IOException;

/* renamed from: X.9xK, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9xK {
    public static C38756H4w parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("enable_recs_from_friends".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("recs_from_friends_entry_point_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38756H4w(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
