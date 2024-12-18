package X;

import java.io.IOException;

/* renamed from: X.4k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102684k5 {
    public static C102724k9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C102704k7 c102704k7 = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C102704k7 c102704k72 = null;
            C102704k7 c102704k73 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bottom".equals(A0q)) {
                    c102704k7 = AbstractC102694k6.parseFromJson(c16l);
                } else if ("text".equals(A0q)) {
                    c102704k72 = AbstractC102694k6.parseFromJson(c16l);
                } else if ("top".equals(A0q)) {
                    c102704k73 = AbstractC102694k6.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C102724k9(c102704k7, c102704k72, c102704k73);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C102724k9 c102724k9) {
        anonymousClass182.A0d();
        C102704k7 c102704k7 = c102724k9.A00;
        if (c102704k7 != null) {
            anonymousClass182.A0r("bottom");
            anonymousClass182.A0d();
            String str = c102704k7.A00;
            if (str != null) {
                anonymousClass182.A0S("background_color", str);
            }
            anonymousClass182.A0a();
        }
        C102704k7 c102704k72 = c102724k9.A01;
        if (c102704k72 != null) {
            anonymousClass182.A0r("text");
            anonymousClass182.A0d();
            String str2 = c102704k72.A00;
            if (str2 != null) {
                anonymousClass182.A0S("background_color", str2);
            }
            anonymousClass182.A0a();
        }
        C102704k7 c102704k73 = c102724k9.A02;
        if (c102704k73 != null) {
            anonymousClass182.A0r("top");
            anonymousClass182.A0d();
            String str3 = c102704k73.A00;
            if (str3 != null) {
                anonymousClass182.A0S("background_color", str3);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
