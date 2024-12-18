package X;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.swipenavigation.PositionConfig;

/* loaded from: classes6.dex */
public final class GEJ implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("entrypoint");
        if ("PRODUCT_SWIPE_UP_LINK_NUDGE".equals(queryParameter) || "QP_DEEP_LINK".equals(queryParameter)) {
            Fragment fragment = this.A00;
            UserSession userSession = this.A01;
            InterfaceC53722dB A00 = AbstractC54852fj.A00();
            if (A00 != null) {
                A00.EfI(C1QO.A0C);
            }
            ComponentCallbacks componentCallbacks = fragment.mParentFragment;
            if (!(componentCallbacks instanceof InterfaceC53892dT)) {
                if (fragment instanceof AbstractC59962oe) {
                    AbstractC59962oe abstractC59962oe = (AbstractC59962oe) fragment;
                    if (abstractC59962oe.getRootActivity() instanceof InterfaceC53892dT) {
                        componentCallbacks = abstractC59962oe.getRootActivity();
                        C14360o3.A0C(componentCallbacks, AbstractC43591JPw.A00(22));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            InterfaceC53892dT interfaceC53892dT = (InterfaceC53892dT) componentCallbacks;
            if (interfaceC53892dT != null) {
                AbstractC23021Ah.A00(userSession).A1d(false);
                interfaceC53892dT.FBp(new PositionConfig(null, null, null, AbstractC111324zv.A00(1187), null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
            }
        }
    }

    public GEJ(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
