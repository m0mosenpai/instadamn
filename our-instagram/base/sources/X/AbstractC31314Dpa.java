package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dpa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31314Dpa {
    public static final ImageUrl A00(UserSession userSession, List list) {
        User A10;
        AnonymousClass172 anonymousClass172;
        if (list != null && (anonymousClass172 = (AnonymousClass172) AbstractC001800i.A0O(list, 0)) != null) {
            ImageUrl Bhu = anonymousClass172.Bhu();
            if (Bhu == null) {
                A10 = AnonymousClass189.A00(userSession).A02(anonymousClass172.getId());
                if (A10 == null) {
                    return null;
                }
            } else {
                return Bhu;
            }
        } else {
            A10 = AbstractC166987dD.A10(userSession);
        }
        return A10.Bhu();
    }
}
