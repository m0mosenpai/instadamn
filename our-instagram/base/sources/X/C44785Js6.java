package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Js6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44785Js6 extends C3OO implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final View A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final List A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return (ImageView) this.A08.getValue();
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C44785Js6(View view, UserSession userSession) {
        super(view);
        this.A08 = MHU.A00(view, userSession, 19);
        this.A02 = AbstractC56372iV.A01(view.requireViewById(R.id.message_action_log_stub), !LC3.A01(userSession), LC3.A00(userSession));
        this.A05 = C37059GUt.A01(this, 47);
        this.A03 = AbstractC56372iV.A01(view.requireViewById(R.id.prompt_xma_stub), !LC3.A01(userSession), LC3.A00(userSession));
        this.A01 = AbstractC166997dE.A0S(view, R.id.stacks_root);
        this.A04 = AbstractC16960so.A1Q(new LGr(AbstractC166997dE.A0S(view, R.id.first_image), userSession), new LGr(AbstractC166997dE.A0S(view, R.id.second_image), userSession), new LGr(AbstractC166997dE.A0S(view, R.id.third_image), userSession), new LGr(AbstractC166997dE.A0S(view, R.id.fourth_image), userSession));
        this.A07 = AbstractC56372iV.A01(view.requireViewById(R.id.footer_container_stub), !LC3.A01(userSession), LC3.A00(userSession));
        this.A06 = C37059GUt.A01(this, 48);
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
