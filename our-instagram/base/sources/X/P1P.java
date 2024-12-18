package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* loaded from: classes9.dex */
public final class P1P implements InterfaceC196338mP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P1P(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController.A0A((DirectPrivateStoryRecipientController) ((C56034Ou6) this.A01).A01, (C211849aB) this.A02);
                return;
            case 2:
                ODL odl = (ODL) this.A01;
                OGZ ogz = NVm.A02;
                C82G c82g = odl.A02;
                ogz.A00(odl.A01.getContext(), c82g, odl.A03, true);
                AbstractC197848ov.A00(c82g);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        switch (this.A00) {
            case 0:
                N6J.A0K((N6J) this.A02, (C211849aB) this.A01);
                return;
            case 1:
                AbstractC132005xa.A00(((DirectPrivateStoryRecipientController) ((C56034Ou6) this.A01).A01).A0B).A01(new C124765kh(this));
                return;
            case 2:
                CallerContext callerContext = NVk.A02;
                Object obj = this.A02;
                Object obj2 = this.A01;
                C57158PZc.A02(obj2, obj, NVk.A04, AbstractC25229BEm.A1Y(obj2) ? 1 : 0);
                return;
            default:
                UserSession userSession = (UserSession) this.A02;
                Fragment fragment = (Fragment) this.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    AbstractC54211Nxp.A00(activity, fragment.requireContext(), fragment, C82G.A0c, userSession, null);
                    return;
                }
                return;
        }
    }
}
