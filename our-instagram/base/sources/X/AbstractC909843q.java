package X;

import java.io.IOException;

/* renamed from: X.43q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC909843q {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.43r, java.lang.Object] */
    public static C909943r parseFromJson(C16L c16l) {
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
                if ("start".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("end".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("bold".equals(A0q)) {
                    obj.A05 = c16l.A0d();
                } else {
                    String str = null;
                    if ("color".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A04 = str;
                    } else if ("intent".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A03 = str;
                    } else if ("semantic_color".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A02 = C55O.A00(str);
                    }
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

    public static void A00(AnonymousClass182 anonymousClass182, C909943r c909943r) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("start", c909943r.A01);
        anonymousClass182.A0Q("end", c909943r.A00);
        anonymousClass182.A0T("bold", c909943r.A05);
        String str = c909943r.A04;
        if (str != null) {
            anonymousClass182.A0S("color", str);
        }
        String str2 = c909943r.A03;
        if (str2 != null) {
            anonymousClass182.A0S("intent", str2);
        }
        if (c909943r.A02 != null) {
            anonymousClass182.A0S("semantic_color", "emphasized");
        }
        anonymousClass182.A0a();
    }
}
