package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUW {
    public static E71 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C105824pt c105824pt = null;
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("broadcast".equals(A0s)) {
                    c105824pt = C41655Ibn.parseFromJson(c16l);
                } else if ("video_offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c105824pt == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("broadcast", c16l, "DirectPostLiveReply");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text", c16l, "DirectPostLiveReply");
                } else {
                    return new E71(c105824pt, str, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("video_offset", c16l, "DirectPostLiveReply");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(E71 e71, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        C105824pt c105824pt = (C105824pt) e71.A01;
        if (c105824pt != null) {
            anonymousClass182.A0r("broadcast");
            C41655Ibn.A00(anonymousClass182, c105824pt);
        }
        anonymousClass182.A0Q("video_offset", e71.A00);
        String str = e71.A02;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0a();
    }
}
