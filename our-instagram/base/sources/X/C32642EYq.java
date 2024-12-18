package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.EYq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32642EYq extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final N5B A02;
    public final Class A03;

    public C32642EYq(InterfaceC11380iw interfaceC11380iw, UserSession userSession, N5B n5b) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = n5b;
        this.A03 = C36191Fy5.class;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String fullName;
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT;
        C36191Fy5 c36191Fy5 = (C36191Fy5) interfaceC66482zP;
        C31982E3k c31982E3k = (C31982E3k) c3oo;
        AbstractC167017dG.A1N(c36191Fy5, c31982E3k);
        UserSession userSession = this.A01;
        User user = c36191Fy5.A00;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C43208J8f c43208J8f = new C43208J8f(49, c36191Fy5, this);
        AbstractC167007dF.A1E(userSession, 0, interfaceC11380iw);
        c31982E3k.A04.A0F(null, interfaceC11380iw, user.Bhu());
        TextView textView = c31982E3k.A03;
        AbstractC31173DnH.A1F(textView, user);
        AbstractC31177DnL.A0q(textView.getContext(), textView, R.attr.igds_color_primary_text);
        String B3r = user.A03.B3r();
        if (B3r != null && B3r.length() != 0) {
            fullName = user.A03.B3r();
        } else {
            fullName = user.getFullName();
        }
        if (fullName != null && fullName.length() != 0) {
            TextView textView2 = c31982E3k.A02;
            textView2.setVisibility(0);
            textView2.setText(fullName);
        } else {
            c31982E3k.A02.setVisibility(8);
        }
        FollowButton followButton = c31982E3k.A00;
        if (followButton != null && (viewOnAttachStateChangeListenerC110564yT = followButton.A0J) != null) {
            viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
        }
        ViewOnClickListenerC35682FpH.A01(c31982E3k.A01, 33, c43208J8f);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31982E3k(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.follow_list_row));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A03;
    }
}
