package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.LBv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47852LBv {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.L9v] */
    public static C47813L9v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reply_text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A05 = A0m;
                } else if ("note_id".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A07 = A0m2;
                } else if ("subtitle".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    obj.A06 = A0m3;
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A02 = C17Y.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    obj.A03 = AbstractC38851rI.A00(c16l, false);
                } else if ("media_code".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("preview_url".equals(A0s)) {
                    obj.A01 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C47813L9v c47813L9v) {
        anonymousClass182.A0d();
        c47813L9v.A00();
        anonymousClass182.A0S("reply_text", c47813L9v.A00());
        anonymousClass182.A0R("note_id", c47813L9v.A00);
        c47813L9v.A02();
        anonymousClass182.A0S(DialogModule.KEY_TITLE, c47813L9v.A02());
        c47813L9v.A01();
        anonymousClass182.A0S("subtitle", c47813L9v.A01());
        if (c47813L9v.A02 != null) {
            anonymousClass182.A0r("profile_pic_url");
            C17Y.A00(anonymousClass182, c47813L9v.A02);
        }
        if (c47813L9v.A03 != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = c47813L9v.A03;
            SimpleImageUrl simpleImageUrl = User.A08;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str = c47813L9v.A04;
        if (str != null) {
            anonymousClass182.A0S("media_code", str);
        }
        if (c47813L9v.A01 != null) {
            anonymousClass182.A0r("preview_url");
            AbstractC222616c.A01(anonymousClass182, c47813L9v.A01);
        }
        anonymousClass182.A0a();
    }
}
