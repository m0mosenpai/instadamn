package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public abstract class ADX {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Aez] */
    public static C23726Aez parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("lastUsed".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if ("itemType".equals(A0s)) {
                    Object obj2 = EnumC148326m2.A01.get(c16l.A1D());
                    if (obj2 != null) {
                        obj.A02 = (EnumC148326m2) obj2;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else if ("uri".equals(A0s)) {
                    obj.A01 = AbstractC222616c.A00(c16l);
                } else if ("sticker".equals(A0s)) {
                    obj.A03 = AbstractC201078up.parseFromJson(c16l);
                } else if ("emoji".equals(A0s)) {
                    obj.A04 = A2R.parseFromJson(c16l);
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

    public static String A00(C23726Aez c23726Aez) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        A0S.A0R("lastUsed", c23726Aez.A00);
        EnumC148326m2 enumC148326m2 = c23726Aez.A02;
        if (enumC148326m2 != null) {
            A0S.A0Q("itemType", enumC148326m2.A00);
        }
        if (c23726Aez.A01 != null) {
            A0S.A0r("uri");
            AbstractC222616c.A01(A0S, c23726Aez.A01);
        }
        if (c23726Aez.A03 != null) {
            A0S.A0r("sticker");
            AbstractC201078up.A00(A0S, c23726Aez.A03);
        }
        if (c23726Aez.A04 != null) {
            A0S.A0r("emoji");
            C148336m3 c148336m3 = c23726Aez.A04;
            A0S.A0d();
            String str = c148336m3.A01;
            if (str != null) {
                A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            }
            String str2 = c148336m3.A02;
            if (str2 != null) {
                A0S.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str2);
            }
            A0S.A0Q("supported_emoji_set_index", c148336m3.A00);
            A0S.A0a();
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
