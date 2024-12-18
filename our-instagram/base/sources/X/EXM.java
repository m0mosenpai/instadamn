package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXM extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31923E1d(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlights_in_grid_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31923E1d c31923E1d = (C31923E1d) c3oo;
        C14360o3.A0B(c31923E1d, 1);
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        AbstractC167007dF.A1D(activity, 1, userSession);
        ViewOnClickListenerC35687FpM.A00(c31923E1d.A00, 25, activity, userSession);
    }

    public EXM(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32615EXp.class;
    }
}
