package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Js5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44784Js5 extends C3OO implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC56392iX A02;
    public final List A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final ImageView A06;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A06;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C44784Js5(Activity activity, View view, UserSession userSession) {
        super(view);
        this.A06 = AbstractC31176DnK.A0D(view, R.id.doubletap_heart);
        this.A02 = AbstractC56372iV.A01(view.requireViewById(R.id.prompt_xma_stub), false, false);
        this.A03 = AbstractC16960so.A1Q(new C47650L2j(activity, AbstractC166997dE.A0S(view, R.id.first_image), userSession), new C47650L2j(activity, AbstractC166997dE.A0S(view, R.id.second_image), userSession), new C47650L2j(activity, AbstractC166997dE.A0S(view, R.id.third_image), userSession), new C47650L2j(activity, AbstractC166997dE.A0S(view, R.id.fourth_image), userSession));
        this.A01 = AbstractC37301Gc2.A0D(view, R.id.footer_container_stub);
        this.A04 = MHU.A00(view, this, 4);
        this.A05 = MHU.A00(view, this, 5);
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
