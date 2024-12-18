package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVI {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Vfr, java.lang.Object] */
    public static C69015Vfr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C130455uq c130455uq = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("profile".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("media_section".equals(A0s)) {
                    c130455uq = AbstractC130445up.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (user != null) {
                obj.A01 = user;
            }
            if (c130455uq != null) {
                obj.A00 = c130455uq;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
