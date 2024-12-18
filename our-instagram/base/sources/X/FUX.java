package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUX {
    public static C9CK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CK c9ck = new C9CK(2);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread_fbid".equals(A0s)) {
                    c9ck.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c9ck.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    c9ck.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("group_image_uri".equals(A0s)) {
                    c9ck.A00 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return c9ck;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C9CK c9ck, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c9ck.A02;
        if (str != null) {
            anonymousClass182.A0S("thread_fbid", str);
        }
        String str2 = c9ck.A03;
        if (str2 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str2);
        }
        String str3 = c9ck.A01;
        if (str3 != null) {
            anonymousClass182.A0S("subtitle", str3);
        }
        if (c9ck.A00 != null) {
            anonymousClass182.A0r("group_image_uri");
            AbstractC222616c.A01(anonymousClass182, (ImageUrl) c9ck.A00);
        }
        anonymousClass182.A0a();
    }
}
