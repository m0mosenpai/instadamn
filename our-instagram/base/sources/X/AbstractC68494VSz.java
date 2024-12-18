package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.VSz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68494VSz {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Vba, java.lang.Object] */
    public static C68757Vba parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            User user = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                user = AbstractC31180DnO.A0W(c16l, user, AbstractC166997dE.A0s(c16l), "profile");
                c16l.A0z();
            }
            ?? obj = new Object();
            if (user != null) {
                obj.A00 = user;
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
