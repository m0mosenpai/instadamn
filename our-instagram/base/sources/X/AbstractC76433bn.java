package X;

import com.instagram.user.model.User;

/* renamed from: X.3bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76433bn {
    public static final String A00(User user) {
        if (user != null) {
            String id = user.getId();
            if (id.length() != 0) {
                return id;
            }
        }
        return null;
    }
}
