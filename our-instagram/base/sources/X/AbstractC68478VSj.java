package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.VSj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68478VSj {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.W4N, java.lang.Object] */
    public static W4N parseFromJson(C16L c16l) {
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A03 = A0m;
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A02 = A0m2;
                }
                c16l.A0z();
            }
            String str2 = obj.A02;
            if (str2 != null) {
                obj.A01 = str2;
                String str3 = obj.A03;
                if (str3 != null) {
                    EnumC68206VFy enumC68206VFy = (EnumC68206VFy) EnumC68206VFy.A01.get(str3);
                    if (enumC68206VFy == null) {
                        enumC68206VFy = EnumC68206VFy.A0A;
                    }
                    obj.A00 = enumC68206VFy;
                    return obj;
                }
                str = "typeStr";
            } else {
                str = DialogModule.KEY_TITLE;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
