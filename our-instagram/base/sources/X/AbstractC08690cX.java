package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0cX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08690cX {
    public static final User A00(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (abstractC12990ll instanceof UserSession) {
            return C17060sy.A01.A01((UserSession) abstractC12990ll);
        }
        return null;
    }

    public static final EnumC222416a A01(AbstractC12990ll abstractC12990ll) {
        EnumC222416a A0I;
        User A00 = A00(abstractC12990ll);
        if (A00 == null || (A0I = A00.A0I()) == null) {
            return EnumC222416a.A08;
        }
        return A0I;
    }
}
