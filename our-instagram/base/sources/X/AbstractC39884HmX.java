package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.HmX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39884HmX {
    public static CreatorViewerSignalPlainDetailsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            FormattedStringImpl formattedStringImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    formattedStringImpl = IO9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new CreatorViewerSignalPlainDetailsImpl(formattedStringImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
