package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTX {
    public static C69232Vk0 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C69232Vk0 c69232Vk0 = new C69232Vk0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    c69232Vk0.A00 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    c69232Vk0.A01 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    c69232Vk0.A02 = c16l.A1D();
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c69232Vk0.A03 = A1P;
                }
                c16l.A0z();
            }
            return c69232Vk0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
