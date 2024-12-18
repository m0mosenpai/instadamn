package X;

import java.io.IOException;

/* renamed from: X.440, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass440 {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.441, java.lang.Object] */
    public static AnonymousClass441 parseFromJson(C16L c16l) {
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
                String str = null;
                if ("sender_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    obj.A03 = str;
                } else if ("emoji".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if ("super_react_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A04 = str;
                } else if ("timestamp".equals(A0q)) {
                    obj.A01 = Long.valueOf(c16l.A0y());
                } else if ("avatar_reaction".equals(A0q)) {
                    obj.A00 = C17Y.parseFromJson(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, AnonymousClass441 anonymousClass441) {
        anonymousClass182.A0d();
        anonymousClass441.A00();
        anonymousClass182.A0S("sender_id", anonymousClass441.A00());
        String str = anonymousClass441.A02;
        if (str != null) {
            anonymousClass182.A0S("emoji", str);
        }
        String str2 = anonymousClass441.A04;
        if (str2 != null) {
            anonymousClass182.A0S("super_react_type", str2);
        }
        Long l = anonymousClass441.A01;
        if (l != null) {
            anonymousClass182.A0R("timestamp", l.longValue());
        }
        if (anonymousClass441.A00 != null) {
            anonymousClass182.A0r("avatar_reaction");
            C17Y.A00(anonymousClass182, anonymousClass441.A00);
        }
        anonymousClass182.A0a();
    }
}
