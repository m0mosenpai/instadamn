package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L3P {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final KDM A03;
    public final C6WQ A04;

    public L3P(Context context, Fragment fragment, UserSession userSession, KDM kdm) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = fragment;
        this.A03 = kdm;
        C6WQ c6wq = new C6WQ(context, true);
        this.A04 = c6wq;
        AbstractC31176DnK.A13(context, c6wq);
    }
}
