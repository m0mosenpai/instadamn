package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXT {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VmB] */
    public static C69365VmB parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    obj.A01 = IAW.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A03 = IAW.parseFromJson(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A02 = IAW.parseFromJson(c16l);
                } else if ("action_type".equals(A0s)) {
                    EnumC68207VFz enumC68207VFz = (EnumC68207VFz) EnumC68207VFz.A01.get(c16l.A1Q());
                    if (enumC68207VFz == null) {
                        enumC68207VFz = EnumC68207VFz.A0A;
                    }
                    obj.A00 = enumC68207VFz;
                } else if ("beta_redirect_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A04 = A1P;
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
}
