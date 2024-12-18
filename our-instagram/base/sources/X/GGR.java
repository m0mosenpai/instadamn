package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGR implements GYK {
    public final AbstractC59962oe A00;

    public GGR(AbstractC59962oe abstractC59962oe) {
        this.A00 = abstractC59962oe;
    }

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        AbstractC35212Fg5.A00(fragmentActivity, this.A00, userSession, AbstractC166997dE.A0Y(userSession), "insights_icon");
    }
}
