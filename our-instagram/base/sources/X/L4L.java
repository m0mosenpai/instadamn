package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L4L {
    public ViewGroup A00;
    public final int A01;
    public final Resources A02;
    public final LIW A03;
    public final C47439KxU A04;
    public final UserSession A05;

    public L4L(FragmentActivity fragmentActivity, UserSession userSession, C47439KxU c47439KxU) {
        C14360o3.A0B(c47439KxU, 3);
        this.A05 = userSession;
        this.A04 = c47439KxU;
        this.A02 = AbstractC166997dE.A0M(fragmentActivity);
        Context applicationContext = fragmentActivity.getApplicationContext();
        this.A03 = AbstractC47008KqR.A00(applicationContext);
        this.A01 = applicationContext.getColor(AbstractC53242c7.A03(applicationContext));
    }
}
