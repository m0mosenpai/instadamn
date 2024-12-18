package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel;

/* loaded from: classes8.dex */
public final class KI8 extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;
    public final XAq A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        NUQ nuq = (NUQ) interfaceC66482zP;
        C44677JqM c44677JqM = (C44677JqM) c3oo;
        C14360o3.A0B(nuq, 0);
        C14360o3.A0B(c44677JqM, 1);
        C69727VuM c69727VuM = nuq.A00;
        if (c69727VuM.A01().intValue() == 6) {
            Activity activity = this.A00;
            C14360o3.A0C(activity, MSV.A00(0));
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            UserSession userSession = this.A01;
            XAq xAq = this.A02;
            AbstractC25233BEq.A0w(0, fragmentActivity, userSession, xAq);
            String str = c44677JqM.A00;
            if (str != null && str.equals(c69727VuM.A0A.getValue())) {
                return;
            }
            c44677JqM.A00 = AbstractC25225BEi.A15(c69727VuM.A0A);
            ThreadsSearchHcmViewModel threadsSearchHcmViewModel = new ThreadsSearchHcmViewModel(fragmentActivity, C66161U2c.A01, userSession, c69727VuM);
            xAq.ECz(AbstractC31171DnF.A06(c44677JqM), c69727VuM);
            c44677JqM.A01.setContent(C5UA.A04(new DT0(14, threadsSearchHcmViewModel, fragmentActivity, userSession, c69727VuM), -1592092552, true));
            return;
        }
        throw AbstractC166987dD.A14("Unsupported entity type for Compose");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUQ.class;
    }

    public KI8(Activity activity, UserSession userSession, XAq xAq) {
        AbstractC167017dG.A1R(userSession, xAq);
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = xAq;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = AbstractC43592JPx.A1Y(viewGroup);
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AbstractC167007dF.A1D(activity, A1Y ? 1 : 0, userSession);
        ComposeView composeView = new ComposeView(activity, null, A1Y ? 1 : 0);
        viewGroup.addView(composeView);
        composeView.setContent(C5UA.A04(new DSU(userSession, A1Y ? 1 : 0, !C18U.A06(C06090Tz.A06, userSession, 36327078202784040L), true), -2035604561, true));
        composeView.A03();
        viewGroup.removeView(composeView);
        composeView.setTag(new C44677JqM(composeView));
        return new C44677JqM(composeView);
    }
}
