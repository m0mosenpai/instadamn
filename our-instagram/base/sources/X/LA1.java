package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LA1 {
    public final Class A00;

    public int A00() {
        if (this instanceof C45831KQm) {
            return 0;
        }
        return 1;
    }

    public Object A01(C16L c16l) {
        Object parseFromJson;
        if (this instanceof C45831KQm) {
            parseFromJson = AbstractC37936GmZ.parseFromJson(c16l);
        } else {
            parseFromJson = AbstractC46773KmU.parseFromJson(c16l);
        }
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    public String A02(Object obj) {
        if (this instanceof C45831KQm) {
            C6C9 c6c9 = (C6C9) obj;
            C14360o3.A0B(c6c9, 0);
            return c6c9.A0H;
        }
        C45052Jwh c45052Jwh = (C45052Jwh) obj;
        C14360o3.A0B(c45052Jwh, 0);
        return c45052Jwh.A03;
    }

    public void A03(AnonymousClass182 anonymousClass182, Object obj) {
        if (this instanceof C45831KQm) {
            C6C9 c6c9 = (C6C9) obj;
            C14360o3.A0B(c6c9, 0);
            AbstractC37936GmZ.A00(anonymousClass182, c6c9);
            return;
        }
        C45052Jwh c45052Jwh = (C45052Jwh) obj;
        C14360o3.A0B(c45052Jwh, 0);
        anonymousClass182.A0d();
        String str = c45052Jwh.A03;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str2 = c45052Jwh.A04;
        if (str2 != null) {
            anonymousClass182.A0S("promptText", str2);
        }
        User user = c45052Jwh.A00;
        if (user != null) {
            anonymousClass182.A0r("creator");
            SimpleImageUrl simpleImageUrl = User.A08;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str3 = c45052Jwh.A02;
        if (str3 != null) {
            anonymousClass182.A0S("eduTest", str3);
        }
        String str4 = c45052Jwh.A01;
        if (str4 != null) {
            anonymousClass182.A0S("attributionText", str4);
        }
        List<C6C9> list = c45052Jwh.A05;
        if (list != null) {
            C16V.A03(anonymousClass182, "notes");
            for (C6C9 c6c92 : list) {
                if (c6c92 != null) {
                    AbstractC37936GmZ.A00(anonymousClass182, c6c92);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }

    public LA1(Class cls) {
        this.A00 = cls;
    }
}
