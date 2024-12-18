package X;

import java.io.IOException;

/* renamed from: X.7nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173017nF {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.7nG, java.lang.Object] */
    public static C173027nG parseFromJson(C16L c16l) {
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
                if ("token".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A01 = str;
                } else if ("image".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A00 = str;
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

    public static void A00(AnonymousClass182 anonymousClass182, C173027nG c173027nG) {
        anonymousClass182.A0d();
        String str = c173027nG.A02;
        if (str != null) {
            anonymousClass182.A0S("token", str);
        }
        String str2 = c173027nG.A01;
        if (str2 != null) {
            anonymousClass182.A0S("text", str2);
        }
        String str3 = c173027nG.A00;
        if (str3 != null) {
            anonymousClass182.A0S("image", str3);
        }
        anonymousClass182.A0a();
    }
}
