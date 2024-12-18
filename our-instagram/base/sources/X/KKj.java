package X;

import android.view.View;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KKj extends C3PD {
    public final int A00;
    public final Object A01;
    public final String A02;

    public KKj(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        switch (this.A00) {
            case 0:
                NametagController nametagController = (NametagController) this.A01;
                UserSession userSession = nametagController.A0D;
                AbstractC73317Y7a.A0D(nametagController.A0C, userSession, userSession.userId, nametagController.A0F, "copy_link");
                String str = this.A02;
                NametagController.A02(new C44289Jhf(this, 2), nametagController, C05F.A00, str);
                return true;
            case 1:
                final NametagController nametagController2 = (NametagController) this.A01;
                UserSession userSession2 = nametagController2.A0D;
                AbstractC73317Y7a.A0D(nametagController2.A0C, userSession2, userSession2.userId, nametagController2.A0F, "system_share_sheet");
                final String str2 = this.A02;
                ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk = nametagController2.A09.A0J;
                if (viewOnTouchListenerC48085LQk.A05()) {
                    viewOnTouchListenerC48085LQk.A03(false);
                }
                AbstractC63248Sg4.A02(nametagController2.A0B.getParentFragmentManager());
                nametagController2.A08.post(new Runnable() { // from class: X.M32
                    @Override // java.lang.Runnable
                    public final void run() {
                        NametagController nametagController3 = NametagController.this;
                        String str3 = str2;
                        AbstractC59962oe abstractC59962oe = nametagController3.A0B;
                        C121275eQ c121275eQ = new C121275eQ(new M84(nametagController3.A06, nametagController3.mRootView), 448);
                        c121275eQ.A00 = new C45685KJw(nametagController3, str3);
                        abstractC59962oe.schedule(c121275eQ);
                    }
                });
                return true;
            default:
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                return true;
        }
    }
}
