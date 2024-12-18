package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.5hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123065hh {
    public static C206289Bl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            C51755Mte c51755Mte = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("user_info".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("following".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("outgoing_request".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("incoming_request".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("follow_back_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("friending_config".equals(A0q)) {
                    c51755Mte = F9L.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("user_info", "NewsfeedFollow");
                throw C00O.createAndThrow();
            }
            return new C206289Bl(c51755Mte, user, bool, bool2, bool3, bool4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
