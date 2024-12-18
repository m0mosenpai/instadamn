package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145306gp {
    public final /* synthetic */ C145176gc A00;

    public C145306gp(C145176gc c145176gc) {
        this.A00 = c145176gc;
    }

    public final void A00(boolean z) {
        Context context;
        C145176gc c145176gc = this.A00;
        UserSession userSession = c145176gc.A09;
        if (userSession != null) {
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E77("live_viewer_picture_in_picture_enabled", z);
            ARD.apply();
            UserSession userSession2 = c145176gc.A09;
            if (userSession2 != null) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                A00.A6Q.Egi(A00, false, C23031Ai.A8c[119]);
                ReelViewerFragment.A0I((ReelViewerFragment) c145176gc.A18, false);
                Fragment fragment = (Fragment) c145176gc.A1B.get();
                if (fragment != null && (context = fragment.getContext()) != null) {
                    int i = 2131965620;
                    if (z) {
                        i = 2131965621;
                    }
                    C9GR.A09(context, context.getString(i));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
