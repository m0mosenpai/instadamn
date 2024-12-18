package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.business.promote.model.PromoteButtonActionType;
import java.io.IOException;

/* renamed from: X.VRe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68448VRe {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.business.promote.model.PromoteButtonAction, java.lang.Object] */
    public static PromoteButtonAction parseFromJson(C16L c16l) {
        PromoteButtonActionType promoteButtonActionType;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if ("link".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A02 = A0m2;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    PromoteButtonActionType[] values = PromoteButtonActionType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            promoteButtonActionType = values[i];
                            if (C14360o3.A0K(promoteButtonActionType.toString(), A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            promoteButtonActionType = null;
                            break;
                        }
                    }
                    C14360o3.A0B(promoteButtonActionType, 0);
                    obj.A00 = promoteButtonActionType;
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
