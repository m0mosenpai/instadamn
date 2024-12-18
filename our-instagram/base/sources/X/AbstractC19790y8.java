package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.0y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19790y8 {
    public static C1ON A00(UserSession userSession, File file) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("loom/fetch_config/");
        C52073N1y c52073N1y = C52073N1y.A00;
        C222015v c222015v = AbstractC221915u.A00;
        C14360o3.A08(c222015v);
        c25621Ms.A02 = new C25591Mp(c222015v, file);
        return c25621Ms.A0N();
    }

    public static C1ON A01(UserSession userSession, File file, String str) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("loom/upload_trace/");
        c25621Ms.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "loom");
        c25621Ms.A07(file, "file");
        c25621Ms.A9s(AbstractC006902j.A00(0, 9, 64), str);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0M("file");
        return c25621Ms.A0N();
    }
}
