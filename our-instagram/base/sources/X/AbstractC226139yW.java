package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9yW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226139yW {
    public static C217889kL parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C217889kL c217889kL = new C217889kL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c217889kL.A04 = A1P;
                } else if ("text_size".equals(A0s)) {
                    c217889kL.A00 = (float) c16l.A0U();
                } else if ("max_width".equals(A0s)) {
                    c217889kL.A01 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c217889kL.A03 = AbstractC38851rI.A00(c16l, false);
                } else if (AbstractC111324zv.A00(2873).equals(A0s)) {
                    c217889kL.A02 = AbstractC226149yX.parseFromJson(c16l);
                } else {
                    ADU.A01(c16l, c217889kL, A0s);
                }
                c16l.A0z();
            }
            return c217889kL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
