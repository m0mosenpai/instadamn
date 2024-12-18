package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.VWt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68592VWt {
    public static C70866WiW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C70866WiW c70866WiW = new C70866WiW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bounds_padding_for_underline".equals(A0s)) {
                    c70866WiW.A00 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c70866WiW.A01 = AbstractC38851rI.A00(c16l, false);
                }
                c16l.A0z();
            }
            return c70866WiW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
