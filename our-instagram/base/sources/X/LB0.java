package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class LB0 {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.K8N, X.1um, X.1ul] */
    public static K8N parseFromJson(C16L c16l) {
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    c40791um.A02 = AbstractC38851rI.A00(c16l, false);
                } else if ("confidence".equals(A0s)) {
                    c16l.A0U();
                } else if ("failure_code".equals(A0s)) {
                    c40791um.A00 = c16l.A1D();
                } else if (AbstractC50529MSi.A00().equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A04 = A1P;
                } else if ("deeplink".equals(A0s)) {
                    c40791um.A01 = VPU.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            int i = c40791um.A00;
            if (i > 0) {
                A1C.append("[");
                A1C.append(i);
                A1C.append("]");
            }
            if (!TextUtils.isEmpty(c40791um.mErrorMessage)) {
                A1C.append(" ");
                str = c40791um.mErrorMessage;
            } else {
                if (!TextUtils.isEmpty(c40791um.A04)) {
                    A1C.append(" ");
                    str = c40791um.A04;
                }
                c40791um.A03 = A1C.toString();
                return c40791um;
            }
            A1C.append(str);
            c40791um.A03 = A1C.toString();
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
