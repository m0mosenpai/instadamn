package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.VVp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68562VVp {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.VJH, java.lang.Object] */
    public static VJH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            HashtagImpl hashtagImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("hashtag".equals(A0s)) {
                    hashtagImpl = AbstractC109614wn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A01 = user;
            obj.A00 = hashtagImpl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
