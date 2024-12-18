package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76333bd {
    public static final SpannableStringBuilder A00(UserSession userSession, C38321qM c38321qM) {
        String username;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c38321qM.CdW() && AbstractC41071vF.A0V(userSession, c38321qM)) {
            username = AbstractC41071vF.A08(userSession, c38321qM);
            if (username == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                username = A2E.getUsername();
            } else {
                AbstractC12120kG.A0J("MediaHeaderProfileNameGenerator Null User", null, AbstractC06930Yk.A0E(), 817890849);
                return spannableStringBuilder;
            }
        }
        spannableStringBuilder.append((CharSequence) username);
        return spannableStringBuilder;
    }
}
