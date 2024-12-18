package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EYo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32640EYo extends AbstractC66422zJ {
    public Reel A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final FPO A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31986E3o(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.recommendation_business_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        RingSpec ringSpec;
        C36198FyC c36198FyC = (C36198FyC) interfaceC66482zP;
        C31986E3o c31986E3o = (C31986E3o) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c36198FyC, c31986E3o);
        IgdsPeopleCell igdsPeopleCell = c31986E3o.A03;
        igdsPeopleCell.A01();
        User user = c36198FyC.A00;
        igdsPeopleCell.A08(user.getUsername(), false);
        igdsPeopleCell.A07(user.A03.getCategory());
        UserSession userSession = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        igdsPeopleCell.A03(userSession, new C34556FKq(abstractC59962oe, user), null);
        ViewOnClickListenerC35687FpM.A00(igdsPeopleCell, 18, user, this);
        FollowButton followButton = c31986E3o.A05;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        viewOnAttachStateChangeListenerC110564yT.A08(new C33271EnS(A1R ? 1 : 0, c36198FyC, this));
        viewOnAttachStateChangeListenerC110564yT.A04(abstractC59962oe, userSession, user);
        igdsPeopleCell.A05(followButton, null);
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(userSession, 0);
        Reel A03 = C75653aW.A03(userSession, user);
        this.A00 = A03;
        if (A03 != null) {
            boolean A1W = AbstractC167007dF.A1W(C75653aW.A02(userSession, user));
            Reel A032 = C75653aW.A03(userSession, user);
            if (A032 != null) {
                if (A1W) {
                    ringSpec = C3PP.A00(userSession, A032);
                } else {
                    ringSpec = (RingSpec) C3Oc.A0D.getValue();
                }
                GradientSpinnerAvatarView gradientSpinnerAvatarView = c31986E3o.A04;
                gradientSpinnerAvatarView.setGradientColor(ringSpec);
                C0fQ.A00(new ViewOnClickListenerC35629FoK(A032, this, new C38E(abstractC59962oe, userSession, new C38C(new C34556FKq(abstractC59962oe, user).A01)), gradientSpinnerAvatarView, AbstractC167017dG.A0j(), AbstractC166987dD.A1J(A032)), gradientSpinnerAvatarView);
                gradientSpinnerAvatarView.setGradientSpinnerVisible(A1R);
                gradientSpinnerAvatarView.setGradientSpinnerActivated(A1W);
            }
        }
        List list = c36198FyC.A01;
        if (AbstractC166987dD.A1b(list)) {
            c31986E3o.A00.setUrl(((E81) ((InterfaceC31093Dlb) list.get(0))).A00, abstractC59962oe);
            c31986E3o.A01.setUrl(((E81) ((InterfaceC31093Dlb) list.get(A1R ? 1 : 0))).A00, abstractC59962oe);
            c31986E3o.A02.setUrl(((E81) ((InterfaceC31093Dlb) list.get(2))).A00, abstractC59962oe);
        }
        ViewOnClickListenerC35687FpM.A00(c31986E3o.A00, 19, c36198FyC, this);
        ViewOnClickListenerC35687FpM.A00(c31986E3o.A01, 20, c36198FyC, this);
        ViewOnClickListenerC35687FpM.A00(c31986E3o.A02, 21, c36198FyC, this);
    }

    public C32640EYo(AbstractC59962oe abstractC59962oe, UserSession userSession, FPO fpo) {
        AbstractC167017dG.A1P(userSession, fpo);
        this.A02 = userSession;
        this.A03 = fpo;
        this.A01 = abstractC59962oe;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36198FyC.class;
    }
}
