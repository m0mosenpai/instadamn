package X;

import java.io.IOException;

/* renamed from: X.3jS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80983jS {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3jU, java.lang.Object, X.3jT] */
    public static C80993jT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("created_at".equals(A0q)) {
                    obj.A00 = c16l.A0y();
                } else if ("shh_seen_state".equals(A0q)) {
                    obj.A02 = AbstractC81693ke.parseFromJson(c16l);
                } else if ("disappearing_messages_seen_state".equals(A0q)) {
                    obj.A01 = AbstractC81013jV.parseFromJson(c16l);
                } else {
                    AbstractC81023jW.A01(c16l, obj, A0q);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C80993jT c80993jT) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("created_at", c80993jT.A00);
        if (c80993jT.A02 != null) {
            anonymousClass182.A0r("shh_seen_state");
            C81703kf c81703kf = c80993jT.A02;
            anonymousClass182.A0d();
            String str = c81703kf.A01;
            if (str != null) {
                anonymousClass182.A0S("item_id", str);
            }
            anonymousClass182.A0R("created_at", c81703kf.A00);
            anonymousClass182.A0a();
        }
        if (c80993jT.A01 != null) {
            anonymousClass182.A0r("disappearing_messages_seen_state");
            C9CG c9cg = c80993jT.A01;
            anonymousClass182.A0d();
            String str2 = c9cg.A02;
            if (str2 != null) {
                anonymousClass182.A0S("item_id", str2);
            }
            Number number = (Number) c9cg.A01;
            if (number != null) {
                anonymousClass182.A0R("created_at", number.longValue());
            }
            String str3 = c9cg.A03;
            if (str3 != null) {
                anonymousClass182.A0S("item_otid", str3);
            }
            Boolean bool = (Boolean) c9cg.A00;
            if (bool != null) {
                anonymousClass182.A0T("is_different_than_cached_marker", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        AbstractC81023jW.A00(anonymousClass182, c80993jT);
        anonymousClass182.A0a();
    }
}
