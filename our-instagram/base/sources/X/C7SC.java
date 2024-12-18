package X;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7SC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SC implements C7QD {
    public boolean A00;
    public final Activity A01;
    public final UserSession A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC165507ad A04;

    public final void A01(C9C0 c9c0) {
        InterfaceC56392iX interfaceC56392iX = this.A03;
        interfaceC56392iX.setVisibility(0);
        interfaceC56392iX.getView().setBackgroundColor(c9c0.A01);
        ((ImageView) interfaceC56392iX.getView()).setImageTintList(ColorStateList.valueOf(c9c0.A02));
        C0fQ.A00(new ViewOnClickListenerC43739JVy(c9c0, this), interfaceC56392iX.getView());
        String str = c9c0.A04;
        if (str != null && !this.A00) {
            this.A00 = true;
            interfaceC56392iX.getView().postDelayed(new RunnableC24689AwV(this, str), 500L);
        }
    }

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A03;
        interfaceC56392iX.setVisibility(8);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnClickListener(null);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03.getView();
    }

    public C7SC(Activity activity, UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC165507ad interfaceC165507ad) {
        this.A03 = interfaceC56392iX;
        this.A04 = interfaceC165507ad;
        this.A01 = activity;
        this.A02 = userSession;
    }
}
