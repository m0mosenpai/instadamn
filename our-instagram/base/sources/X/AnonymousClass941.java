package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.941, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass941 {
    public static AnonymousClass940 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AnonymousClass940 anonymousClass940 = new AnonymousClass940();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    anonymousClass940.A00 = AbstractC38851rI.A00(c16l, true);
                } else {
                    C55702hA.A01(c16l, anonymousClass940, A0q);
                }
                c16l.A0z();
            }
            return anonymousClass940;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
