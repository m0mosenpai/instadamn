package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.AsQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24445AsQ implements Runnable {
    public final /* synthetic */ C7X7 A00;

    public RunnableC24445AsQ(C7X7 c7x7) {
        this.A00 = c7x7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7X7 c7x7 = this.A00;
        Fragment fragment = (Fragment) c7x7.A0C.get();
        if (fragment != null && fragment.isResumed()) {
            FragmentActivity requireActivity = fragment.requireActivity();
            UserSession userSession = c7x7.A05;
            if (C1VN.A00 != null) {
                AbstractC31282Dp4.A00().A00(requireActivity, userSession, "506653164691104", null);
            }
        }
    }
}
