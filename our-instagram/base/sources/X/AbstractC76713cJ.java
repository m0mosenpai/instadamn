package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.3cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76713cJ {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, GradientSpinnerAvatarView gradientSpinnerAvatarView, String str) {
        C14360o3.A0B(interfaceC11380iw, 0);
        C14360o3.A0B(gradientSpinnerAvatarView, 2);
        C14360o3.A0B(str, 3);
        if (context != null) {
            gradientSpinnerAvatarView.A04();
            gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, new SimpleImageUrl(str));
            gradientSpinnerAvatarView.A05();
            gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(R.drawable.avatar_bottom_badge_facebook));
            gradientSpinnerAvatarView.A01 = AbstractC13880nE.A04(context, 3);
        }
    }

    public static final boolean A01(C38321qM c38321qM, boolean z) {
        boolean z2;
        List AtP;
        if (c38321qM.A13() == 19 || ((AtP = c38321qM.A0C.AtP()) != null && AtP.contains("FB"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2;
        }
        if (c38321qM.A5W() || z2) {
            return true;
        }
        return false;
    }
}
