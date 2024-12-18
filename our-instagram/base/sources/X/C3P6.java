package X;

import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3P6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3P6 {
    public static final void A00(UserSession userSession, C3G4 c3g4, C72983Oz c72983Oz) {
        LinearLayout linearLayout;
        float f;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c72983Oz, 1);
        Reel reel = c3g4.A03;
        String str = reel.A1o;
        C14360o3.A07(str);
        c72983Oz.A01 = str;
        if (reel.A1Y && !C3P8.A00(userSession, c3g4)) {
            linearLayout = c72983Oz.A05;
            f = 0.3f;
        } else {
            linearLayout = c72983Oz.A05;
            f = 1.0f;
        }
        linearLayout.setAlpha(f);
        C140626Xq c140626Xq = c72983Oz.A00;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A01);
            c72983Oz.A00 = null;
        }
    }
}
