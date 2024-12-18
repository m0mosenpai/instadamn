package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.JZb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43814JZb {
    public static final ImageUrl A00(User user) {
        ImageUrl C67 = user.A03.C67();
        if (C67 == null) {
            C67 = User.A08;
        }
        if (AbstractC43592JPx.A0w(C67).length() <= 0) {
            return user.Bhu();
        }
        return C67;
    }
}
