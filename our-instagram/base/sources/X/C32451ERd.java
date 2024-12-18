package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.ERd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32451ERd extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final FIC A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        int A0G = AbstractC25231BEo.A0G(view, 1853790702);
        C14360o3.A0B(obj, 2);
        UserSession userSession = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type instagram.features.stories.dashboard.JoinChatRequestsViewHolder");
        C33615EtR c33615EtR = (C33615EtR) tag;
        C51758Mth c51758Mth = (C51758Mth) obj;
        FIC fic = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC167007dF.A1K(userSession, c33615EtR);
        AbstractC25233BEq.A0w(2, c51758Mth, fic, interfaceC11380iw);
        User user = (User) c51758Mth.A00;
        IgTextView igTextView = c33615EtR.A02;
        Context context = igTextView.getContext();
        if (AbstractC31174DnI.A0j(userSession, user) == FollowStatus.A05) {
            str = context.getString(2131962780);
        } else {
            str = null;
        }
        FNF fnf = c33615EtR.A03;
        FCO.A00(interfaceC11380iw, user.Bhu(), fnf, user.getUsername(), user.getFullName(), str, user.isVerified());
        ViewOnClickListenerC35670Fp5.A00(fnf.A00, 36, fic, user);
        IgSimpleImageView igSimpleImageView = c33615EtR.A01;
        igSimpleImageView.setVisibility(0);
        ViewOnClickListenerC35670Fp5.A00(igSimpleImageView, 37, fic, user);
        ViewOnClickListenerC35670Fp5.A00(igTextView, 38, fic, user);
        if (c51758Mth.A01) {
            AbstractC31171DnF.A14(igTextView);
            c33615EtR.A00.setVisibility(0);
        } else {
            AbstractC166987dD.A1P(context, igTextView, 2131952265);
            c33615EtR.A00.setVisibility(8);
        }
        C0f9.A0A(-1302488098, A0G);
    }

    public C32451ERd(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FIC fic) {
        AbstractC167017dG.A1Q(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A02 = fic;
        this.A00 = interfaceC11380iw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.EtR, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1246285747);
        C14360o3.A0B(viewGroup, 1);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.chat_requests_row, false);
        C14360o3.A0B(A0C, 1);
        ?? obj = new Object();
        obj.A03 = new FNF(A0C);
        obj.A01 = (IgSimpleImageView) AbstractC166987dD.A0c(A0C, R.id.menu_button);
        obj.A02 = AbstractC31175DnJ.A0L(A0C, R.id.main_button);
        obj.A00 = (IgProgressBar) AbstractC166987dD.A0c(A0C, R.id.loading_indicator);
        A0C.setTag(obj);
        C0f9.A0A(-1764208302, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
