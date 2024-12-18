package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes9.dex */
public final class NEV extends AbstractC66412zI {
    public final UserSession A00;
    public final O3H A01;

    public NEV(UserSession userSession, O3H o3h) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = o3h;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51348Mm9(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.add_event, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        View view2;
        C56083Ov0 c56083Ov0 = (C56083Ov0) interfaceC66482zP;
        C51348Mm9 c51348Mm9 = (C51348Mm9) c3oo;
        AbstractC167007dF.A1K(c56083Ov0, c51348Mm9);
        UpcomingEvent upcomingEvent = c56083Ov0.A00;
        if (upcomingEvent != null) {
            c51348Mm9.A06.setText(upcomingEvent.getTitle());
            c51348Mm9.A05.setText(MX0.A02(AbstractC166997dE.A0L(c51348Mm9.A01), this.A00, AbstractC41774Ieq.A02(upcomingEvent)));
            c51348Mm9.A04.setVisibility(8);
            c51348Mm9.A02.setVisibility(0);
            boolean equals = "video_edit_metadata_fragment".equals("video_edit_metadata_fragment");
            View view3 = c51348Mm9.A00;
            if (equals) {
                view3.setVisibility(0);
                view = c51348Mm9.A03;
                view.setVisibility(8);
                ViewOnClickListenerC55455Ok9.A01(c51348Mm9.A01, 35, this);
                ViewOnClickListenerC55455Ok9.A01(view, 36, this);
            }
            view3.setVisibility(8);
            view2 = c51348Mm9.A03;
            view = view2;
        } else {
            c51348Mm9.A04.setVisibility(0);
            c51348Mm9.A05.setVisibility(8);
            view = c51348Mm9.A03;
            view.setVisibility(8);
            view2 = c51348Mm9.A00;
        }
        view2.setVisibility(0);
        ViewOnClickListenerC55455Ok9.A01(c51348Mm9.A01, 35, this);
        ViewOnClickListenerC55455Ok9.A01(view, 36, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56083Ov0.class;
    }
}
