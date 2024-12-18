package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JXd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43764JXd {
    public static final List A00(ImageUrl imageUrl, ImageUrl imageUrl2, List list) {
        Iterator it = list.iterator();
        User user = null;
        User user2 = null;
        while (it.hasNext()) {
            AnonymousClass172 anonymousClass172 = (AnonymousClass172) it.next();
            if (anonymousClass172 instanceof User) {
                User user3 = (User) anonymousClass172;
                if (C14360o3.A0K(user3.Bhu(), imageUrl)) {
                    user = user3;
                }
                if (C14360o3.A0K(user3.Bhu(), imageUrl2)) {
                    user2 = user3;
                }
            }
            if (user != null && (imageUrl2 == null || user2 != null)) {
                break;
            }
        }
        return AbstractC16960so.A1Q(user, user2);
    }
}
