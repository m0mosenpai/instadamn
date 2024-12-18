package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.93u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2046093u {
    public static C2045893s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C2045893s c2045893s = new C2045893s();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bd".equals(A0q)) {
                    c2045893s.A02 = C9x4.parseFromJson(c16l);
                } else if ("recs_from_friends".equals(A0q)) {
                    c2045893s.A03 = C9xK.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c2045893s.A05 = AbstractC38851rI.A00(c16l, true);
                } else {
                    C55702hA.A01(c16l, c2045893s, A0q);
                }
                c16l.A0z();
            }
            c2045893s.A04 = new C128125qg(c2045893s.A02, c2045893s.A03, c2045893s.A05);
            return c2045893s;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
