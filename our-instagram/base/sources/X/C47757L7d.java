package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.L7d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47757L7d {
    public Context A00;
    public View.OnClickListener A01;
    public Fragment A02;
    public C148676mc A03;
    public UserSession A04;

    public final void A00() {
        String str;
        C148676mc c148676mc = this.A03;
        if (c148676mc == null) {
            str = "audLogging";
        } else {
            c148676mc.A00();
            C3DO c3do = C3DN.A00;
            Fragment fragment = this.A02;
            if (fragment == null) {
                str = "fragment";
            } else {
                AbstractC167017dG.A0y(fragment.getActivity(), c3do);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
