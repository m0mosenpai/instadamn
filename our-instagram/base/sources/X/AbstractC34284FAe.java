package X;

import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.FAe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34284FAe {
    public static E9W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            User user = null;
            FriendshipStatusImpl friendshipStatusImpl = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("seen".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("ts".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC31171DnF.A1Z(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("viewer_relationship_info".equals(A0s)) {
                    friendshipStatusImpl = AbstractC38881rL.parseFromJson(c16l);
                } else if ("vote".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return new E9W(friendshipStatusImpl, user, bool, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
