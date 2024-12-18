package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7SM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SM implements C7QD {
    public final InterfaceC165617ao A00;
    public final UserSession A01;
    public final InterfaceC56392iX A02;

    public final void A01(K2Z k2z) {
        InterfaceC56392iX interfaceC56392iX = this.A02;
        interfaceC56392iX.setVisibility(0);
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        imageView.setBackgroundColor(k2z.A00);
        imageView.setImageTintList(ColorStateList.valueOf(k2z.A01));
        C0fQ.A00(new ViewOnClickListenerC48037LOj(this, k2z), imageView);
    }

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A02;
        interfaceC56392iX.setVisibility(8);
        if (!C18U.A06(C06090Tz.A05, this.A01, 36324612892340504L) || interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnClickListener(null);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A02.getView();
    }

    public C7SM(UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC165617ao interfaceC165617ao) {
        this.A02 = interfaceC56392iX;
        this.A00 = interfaceC165617ao;
        this.A01 = userSession;
    }
}
