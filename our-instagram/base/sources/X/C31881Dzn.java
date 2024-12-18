package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dzn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31881Dzn extends C2UU {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C41181vS A02;
    public final ReelDashboardFragment A03;
    public final List A04;

    public C31881Dzn(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, ReelDashboardFragment reelDashboardFragment) {
        AbstractC167027dH.A0a(1, interfaceC11380iw, userSession, c41181vS, reelDashboardFragment);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = c41181vS;
        this.A03 = reelDashboardFragment;
        ImmutableList A0L = AbstractC31173DnH.A0L(c41181vS.A0m);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator<E> it = A0L.iterator();
        while (it.hasNext()) {
            C51802Mv6 c51802Mv6 = (C51802Mv6) it.next();
            String str = c51802Mv6.A01;
            User user = c51802Mv6.A00;
            Reel reel = new Reel(new C1N9(user), str, AbstractC31174DnI.A1Y(user, this.A01.userId));
            ReelStore.A03(this.A01).A0X(reel);
            A0q.add(reel);
        }
        this.A04 = A0q;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        UserSession userSession = this.A01;
        E2Y e2y = (E2Y) c3oo;
        ReelDashboardFragment reelDashboardFragment = this.A03;
        Reel reel = (Reel) this.A04.get(i);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC167017dG.A1Q(e2y, reel);
        User A0D = reel.A0D();
        if (A0D != null) {
            AbstractC31173DnH.A1F(e2y.A01, A0D);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = e2y.A02;
            AbstractC31176DnK.A1U(interfaceC11380iw, gradientSpinnerAvatarView, A0D);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(AbstractC167007dF.A1N((C41661wG.A00(userSession).A02(reel) > 0L ? 1 : (C41661wG.A00(userSession).A02(reel) == 0L ? 0 : -1))));
            ViewOnClickListenerC35684FpJ.A00(e2y.A00, reelDashboardFragment, e2y, reel, 49);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new E2Y(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.prompt_reply, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-377493833);
        int size = this.A04.size();
        C0f9.A0A(308620118, A03);
        return size;
    }
}
