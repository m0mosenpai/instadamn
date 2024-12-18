package X;

import com.instagram.user.model.User;

/* renamed from: X.7go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169157go {
    public static final boolean A00(User user, String str) {
        C14360o3.A0B(user, 0);
        String username = user.getUsername();
        if ((!AbstractC001900j.A0T(username)) && AbstractC13670mt.A0I(username, str, 0)) {
            return true;
        }
        String fullName = user.getFullName();
        return (fullName == null || AbstractC001900j.A0T(fullName) || !AbstractC13670mt.A0H(fullName, str)) ? false : true;
    }
}
