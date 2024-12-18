package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139226Sd {
    public static final User A00(InterfaceC139206Sb interfaceC139206Sb) {
        C14360o3.A0B(interfaceC139206Sb, 0);
        C139196Sa c139196Sa = (C139196Sa) interfaceC139206Sb;
        User user = c139196Sa.A02;
        if (user.B7L() == FollowStatus.A08 || user.B7L() == FollowStatus.A04) {
            user.A0k(FollowStatus.A06);
        }
        user.A10(C14360o3.A0K(c139196Sa.A03, true));
        return user;
    }
}
