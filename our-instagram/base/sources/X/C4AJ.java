package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4AJ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4AJ {
    public static final boolean A00(UserSession userSession, Integer num, boolean z, boolean z2) {
        int i;
        if (AbstractC24321Hb.A00(userSession).A01 != null) {
            Boolean bool = AbstractC24321Hb.A00(userSession).A01;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = AbstractC41221vX.A00().A01;
        }
        if (!z2) {
            if ((!z && AbstractC41221vX.A00().A0D != 2) || i <= 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
