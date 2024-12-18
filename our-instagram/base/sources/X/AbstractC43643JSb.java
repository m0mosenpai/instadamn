package X;

import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.user.model.User;

/* renamed from: X.JSb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43643JSb {
    public static final boolean A00(User user) {
        BirthdayVisibilityForViewer Ag7;
        int ordinal;
        if (user != null && (Ag7 = user.A03.Ag7()) != null && ((ordinal = Ag7.ordinal()) == 3 || ordinal == 2)) {
            return true;
        }
        return false;
    }
}
