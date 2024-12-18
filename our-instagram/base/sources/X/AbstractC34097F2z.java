package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F2z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34097F2z {
    public static final boolean A00(UserSession userSession, E70 e70, EnumC31337Dq2 enumC31337Dq2) {
        AbstractC167017dG.A1O(userSession, enumC31337Dq2);
        if (C160857It.A00.A08(userSession, e70) || e70.A07 == 8) {
            return false;
        }
        switch (enumC31337Dq2.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 5:
                return false;
            case 1:
                return C160857It.A01(userSession, e70);
            case 2:
                return AbstractC159887Fa.A01(userSession, e70.A0L);
            default:
                throw B4Z.A00();
        }
    }
}
