package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes8.dex */
public final class KKs extends AnonymousClass803 {
    public final /* synthetic */ C148336m3 A00;
    public final /* synthetic */ L0U A01;

    @Override // X.AnonymousClass803, X.C3PE
    public final void DQY(View view) {
        C14360o3.A0B(view, 0);
        L0U l0u = this.A01;
        C148336m3 c148336m3 = this.A00;
        if (C168157fA.A03(c148336m3.A02) && AbstractC170297ii.A00(c148336m3)) {
            C47767L7o c47767L7o = l0u.A01;
            UserSession userSession = c47767L7o.A02;
            InterfaceC11380iw interfaceC11380iw = l0u.A00;
            if (interfaceC11380iw != null) {
                ConstrainedImageView constrainedImageView = (ConstrainedImageView) view;
                new ViewOnTouchListenerC48079LQe(interfaceC11380iw, userSession, constrainedImageView, c148336m3, new C49649Lwg(1, c47767L7o, c148336m3), AbstractC167017dG.A0C(constrainedImageView.getContext()), true);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        this.A01.A01.A04.A0G(this.A00.A02, "quick_emoji_tray");
        return true;
    }

    public KKs(C148336m3 c148336m3, L0U l0u) {
        this.A01 = l0u;
        this.A00 = c148336m3;
    }
}
