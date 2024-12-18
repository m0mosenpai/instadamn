package X;

import com.instagram.api.schemas.ShoppingOnboardingState;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.GoU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38041GoU {
    @Deprecated(message = "")
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C08730cb.A00(userSession).A00().A03.Bul() != ShoppingOnboardingState.A08) {
            return false;
        }
        return true;
    }
}
