package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.nux.cal.model.ContentText;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F9c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34256F9c {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.nux.cal.model.ContentText, java.lang.Object] */
    public static ContentText parseFromJson(C16L c16l) {
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
                    obj.A01 = AbstractC34257F9d.A00(c16l.A1Q());
                } else if ("content".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("split_point".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
