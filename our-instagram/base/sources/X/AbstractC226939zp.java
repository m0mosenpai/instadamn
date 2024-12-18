package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226939zp {
    public static final boolean A00(Drawable drawable, UserSession userSession) {
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C5RM) {
            drawable = ((C5RM) drawable).A0A;
        }
        if (drawable instanceof C194808jg) {
            drawable = ((C194808jg) drawable).A04();
        }
        if (!(drawable instanceof C6RB) && !(drawable instanceof C202588xc) && !(drawable instanceof C74T) && !(drawable instanceof C5RU) && !(drawable instanceof C210449Sj) && !(drawable instanceof C9SK) && !(drawable instanceof C209659Pb) && !(drawable instanceof C9SU) && !(drawable instanceof C9ST) && !(drawable instanceof C202728xq) && !(drawable instanceof C202308xA) && !(drawable instanceof C220969pK) && !(drawable instanceof C220959pJ)) {
            if ((drawable instanceof C210399Se) && ((C210399Se) drawable).A0C == EnumC222999se.A06) {
                return true;
            }
            if ((drawable instanceof AbstractC210529Sr) && AbstractC226329yp.A00(userSession)) {
                return true;
            }
            if ((drawable instanceof C210459Sk) && ((C210459Sk) drawable).A04 == EnumC222859sQ.A04) {
                return true;
            }
            return false;
        }
        return true;
    }
}
