package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.I0g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40648I0g {
    public static final void A00(Activity activity, UserSession userSession) {
        boolean A1a = AbstractC167017dG.A1a(userSession, activity);
        C146106i8 A0H = AbstractC37304Gc5.A0H();
        A0H.A0D = activity.getResources().getString(2131963501);
        A0H.A02();
        Drawable drawable = activity.getDrawable(R.drawable.instagram_text_pano_outline_24);
        if (drawable != null) {
            AbstractC37304Gc5.A0p(activity, drawable, A0H);
            A0H.A0L = A1a;
            A0H.A0G = AbstractC166997dE.A0q(activity.getResources(), 2131963504);
            A0H.A0A = new C42704Iuz(activity, userSession, A1a ? 1 : 0);
            AbstractC25233BEq.A1F(A0H);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
