package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.4NU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NU {
    public static C4NV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NV c4nv = new C4NV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    C4NN parseFromJson = C4NS.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c4nv.A00 = parseFromJson;
                } else {
                    String str = null;
                    Integer num = null;
                    if ("limit".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            num = Integer.valueOf(c16l.A1D());
                        }
                        c4nv.A01 = num;
                    } else if ("url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c4nv.A03 = str;
                    } else if ("dismiss_promotion".equals(A0q)) {
                        c4nv.A04 = c16l.A0d();
                    }
                }
                c16l.A0z();
            }
            return c4nv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4NV c4nv) {
        anonymousClass182.A0d();
        anonymousClass182.A0r(DialogModule.KEY_TITLE);
        C4NN c4nn = c4nv.A00;
        anonymousClass182.A0d();
        String str = c4nn.A00;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0a();
        Integer num = c4nv.A01;
        if (num != null) {
            anonymousClass182.A0Q("limit", num.intValue());
        }
        String str2 = c4nv.A03;
        if (str2 != null) {
            anonymousClass182.A0S("url", str2);
        }
        anonymousClass182.A0T("dismiss_promotion", c4nv.A04);
        anonymousClass182.A0a();
    }
}
