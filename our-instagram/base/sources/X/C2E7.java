package X;

import com.instagram.user.model.User;

/* renamed from: X.2E7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2E7 {
    public static final boolean A00(User user) {
        if (user != null && user.A0I() == EnumC222416a.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A01(User user) {
        if (user != null && user.A0I() == EnumC222416a.A06) {
            return true;
        }
        return false;
    }

    public static final boolean A03(User user) {
        if (user != null && user.A2I()) {
            return true;
        }
        return false;
    }

    public static final boolean A02(User user) {
        if (user.A0I() != EnumC222416a.A07) {
            return false;
        }
        return true;
    }
}
