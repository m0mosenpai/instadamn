package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public abstract class OY4 {
    public static final String A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(str, 0);
        File A11 = AbstractC166987dD.A11(str2);
        A02(A11);
        try {
            String A00 = AbstractC54106Nw4.A00(str2, str, 0);
            C54993OUc A01 = OY5.A01(userSession, EnumC40111tc.A0Q, null, null);
            WVG A002 = OVd.A00(userSession);
            return A002.FDr(A002.En2(A01, new C55191Odx(A11, "image/jpeg", A00), null)).A05;
        } catch (VIA e) {
            C0K8.A0G("FbUploadImageHelper", "fbuploader upload error", e);
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    public static final void A01(UserSession userSession, String str, String str2, int i) {
        int A06 = AbstractC167007dF.A06(0, str, userSession);
        File A11 = AbstractC166987dD.A11(str2);
        A02(A11);
        try {
            String A00 = AbstractC54106Nw4.A00(str2, str, 0);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            int A07 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609287619745663L);
            if (A07 == 0) {
                A07 = C55187Ods.A00(i);
            }
            EnumC40111tc enumC40111tc = EnumC40111tc.A0Q;
            A1I2.put("image_compression", C55230Of1.A07(userSession, null, null, AbstractC13570mj.A00(str2), 0, 0, A07));
            A1I2.put("upload_id", str);
            A1I2.put("media_type", String.valueOf(enumC40111tc.A00));
            A1I.put("X-Instagram-Rupload-Params", AbstractC31175DnJ.A0d(A1I2));
            A1I.put("X_FB_PHOTO_WATERFALL_ID", C6WI.A02());
            C55086Oai c55086Oai = new C55086Oai(EnumC53327Ni6.A0h);
            c55086Oai.A07 = A1I;
            c55086Oai.A02(new W2I(A06));
            c55086Oai.A01(new W2H(1024, false));
            c55086Oai.A06 = "i.instagram.com";
            c55086Oai.A09 = true;
            C54993OUc c54993OUc = new C54993OUc(c55086Oai);
            WVG A002 = OVd.A00(userSession);
            A002.FDr(A002.En2(c54993OUc, new C55191Odx(A11, "image/jpeg", A00), null));
        } catch (VIA e) {
            C0K8.A0G("FbUploadImageHelper", "fbuploader upload error", e);
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    public static final void A02(File file) {
        if (file.exists() && file.isFile() && file.length() > 0) {
            return;
        }
        C0K8.A0O("FbUploadImageHelper", "content file does not exist: %s", file.getCanonicalPath());
        throw new FileNotFoundException(AnonymousClass001.A0R("content file does not exist: ", file.getPath()));
    }
}
