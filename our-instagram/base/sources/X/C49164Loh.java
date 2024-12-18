package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Loh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49164Loh implements C7QD, C7QE, InterfaceC1581778c {
    public C7QH A00;
    public final IgFrameLayout A01;
    public final InterfaceC56392iX A02;
    public final C47718L4z A03;
    public final C47718L4z A04;
    public final C47718L4z A05;
    public final InterfaceC09390do A06;
    public final IgLinearLayout A07;
    public final InterfaceC09390do A08;

    public C49164Loh(View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        this.A08 = C37059GUt.A01(view, 34);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.message_content_multi_media_container);
        this.A07 = igLinearLayout;
        this.A01 = (IgFrameLayout) AbstractC166997dE.A0R(igLinearLayout, R.id.stacks_root);
        this.A03 = new C47718L4z(view, userSession, R.id.first_image);
        this.A04 = new C47718L4z(view, userSession, R.id.second_image);
        this.A05 = new C47718L4z(view, userSession, R.id.third_image);
        this.A02 = AbstractC166997dE.A0X(view, R.id.message_action_log_stub);
        this.A06 = C37059GUt.A01(this, 33);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return (ImageView) this.A08.getValue();
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A07;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }
}
