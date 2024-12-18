package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A15 {
    /* JADX WARN: Type inference failed for: r4v1, types: [X.A7Q, java.lang.Object] */
    public static A7Q parseFromJson(C16L c16l) {
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
                if ("is_verified".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC31187DnW.A01().equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (bool != null) {
                obj.A01 = bool.booleanValue();
            }
            if (str != null) {
                obj.A00 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
