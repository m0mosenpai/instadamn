package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ONO {
    public static C38709H2v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("scheduled_publish_time".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("uuc_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38709H2v(num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38709H2v c38709H2v) {
        anonymousClass182.A0d();
        Integer num = c38709H2v.A00;
        if (num != null) {
            anonymousClass182.A0Q("scheduled_publish_time", num.intValue());
        }
        String str = c38709H2v.A01;
        if (str != null) {
            anonymousClass182.A0S("uuc_id", str);
        }
        anonymousClass182.A0a();
    }
}
