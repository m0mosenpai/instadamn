package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.3Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC73003Pb {
    public static final void A00(Context context, CircularImageView circularImageView) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(circularImageView, 1);
        if (circularImageView.getDrawable() == null || !(circularImageView.getDrawable() instanceof AnonymousClass693)) {
            circularImageView.setImageDrawable(C68U.A00(context, R.raw.confetti_square_gradient_dogfooding));
        }
    }

    public static final boolean A02(UserSession userSession, User user) {
        C14360o3.A0B(user, 0);
        C14360o3.A0B(userSession, 1);
        BirthdayVisibilityForViewer Ag7 = user.A03.Ag7();
        if (Ag7 != null && Ag7.ordinal() == 3) {
            return C18U.A06(C06090Tz.A05, userSession, 36319480405564882L);
        }
        return false;
    }

    public static final void A01(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof AnonymousClass693) {
                AnonymousClass693 anonymousClass693 = (AnonymousClass693) drawable;
                if (!anonymousClass693.isPlaying()) {
                    anonymousClass693.E4S();
                }
            }
            if (drawable instanceof C58652mO) {
                AbstractC58662mP abstractC58662mP = (AbstractC58662mP) drawable;
                if (!abstractC58662mP.isPlaying()) {
                    abstractC58662mP.E4S();
                }
            }
        }
    }
}
