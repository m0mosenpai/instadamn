package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Nya, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54255Nya {
    public static C56801PIs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C56801PIs c56801PIs = new C56801PIs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c56801PIs.A01 = AbstractC38851rI.A00(c16l, false);
                } else if ("support_tier".equals(A0s)) {
                    c56801PIs.A00 = AbstractC109714wx.A00(AbstractC167017dG.A0m(c16l));
                } else if ("ts_secs".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c56801PIs.A02 = A0m;
                } else if ("is_repeat_supporter".equals(A0s)) {
                    c56801PIs.A03 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c56801PIs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
