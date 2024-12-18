package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GIc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36755GIc implements InterfaceC1570173f {
    public final /* synthetic */ ENS A00;

    @Override // X.InterfaceC1570173f
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AbstractC167017dG.A1N(reel, gradientSpinnerAvatarView);
        List A1J = AbstractC166987dD.A1J(reel);
        ENS ens = this.A00;
        C38E c38e = (C38E) ens.A06.getValue();
        c38e.A0C = (String) AbstractC166987dD.A17(ens.A05);
        C31559Dtj.A00(ens.getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, ens, 13);
        c38e.A0A(reel, C3G2.A0R, gradientSpinnerAvatarView, A1J, A1J, A1J);
    }

    @Override // X.InterfaceC1570173f
    public final void DHp(User user, int i) {
    }

    @Override // X.InterfaceC1570173f
    public final void DT1(User user) {
    }

    @Override // X.InterfaceC1570173f
    public final void Dy8(User user, int i) {
        C14360o3.A0B(user, 0);
        ENS ens = this.A00;
        AbstractC25233BEq.A14(ens);
        InterfaceC09390do interfaceC09390do = ens.A07;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "comment_likes_user_row", ens.getModuleName());
        C140966Yy A0j = AbstractC25233BEq.A0j(ens, interfaceC09390do);
        A0j.A0F = true;
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    @Override // X.InterfaceC1570173f
    public final void Dy9(View view, User user, int i) {
        throw C00O.createAndThrow();
    }

    public C36755GIc(ENS ens) {
        this.A00 = ens;
    }
}
