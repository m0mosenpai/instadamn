package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.EYt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32645EYt extends AbstractC66422zJ {
    public View A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C32343EMp A03;
    public final Context A04;

    public C32645EYt(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C32343EMp c32343EMp) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = context;
        this.A03 = c32343EMp;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32076E8a c32076E8a = (C32076E8a) interfaceC66482zP;
        E2V e2v = (E2V) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32076E8a, e2v);
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C32343EMp c32343EMp = this.A03;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1F(interfaceC11380iw, A1a ? 1 : 0, c32343EMp);
        IgTextView igTextView = e2v.A01;
        User user = c32076E8a.A01;
        AbstractC31173DnH.A1F(igTextView, user);
        C85963sQ.A0B(igTextView, user.isVerified());
        GradientSpinnerAvatarView gradientSpinnerAvatarView = e2v.A02;
        AbstractC31176DnK.A1U(interfaceC11380iw, gradientSpinnerAvatarView, user);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(AbstractC167007dF.A1N((C41661wG.A00(userSession).A02(c32076E8a.A00) > 0L ? 1 : (C41661wG.A00(userSession).A02(c32076E8a.A00) == 0L ? 0 : -1))));
        gradientSpinnerAvatarView.setGradientColor((RingSpec) C3Oc.A0D.getValue());
        ViewOnClickListenerC35684FpJ.A00(e2v.A00, c32343EMp, c32076E8a, e2v, 34);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_participants_grid_item, false);
        this.A00 = A0R;
        return new E2V(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32076E8a.class;
    }
}
