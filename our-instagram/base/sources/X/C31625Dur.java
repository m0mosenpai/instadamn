package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.Dur, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31625Dur extends AbstractC66422zJ {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2H(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_ads_event_sharing_notice_view_banner, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32622EXw c32622EXw = (C32622EXw) interfaceC66482zP;
        E2H e2h = (E2H) c3oo;
        AbstractC167017dG.A1N(c32622EXw, e2h);
        String str = c32622EXw.A01;
        UserSession userSession = e2h.A01;
        C31305DpR c31305DpR = new C31305DpR(userSession);
        C14360o3.A0B(str, 0);
        if (c31305DpR.A00(str).length() > 0) {
            IgdsBanner igdsBanner = e2h.A02;
            igdsBanner.setVisibility(0);
            AbstractC31172DnG.A1U(igdsBanner, AbstractC31179DnN.A0d(c31305DpR.A01, "ads_event_sharing_notice_content", str), false);
            igdsBanner.setAction(e2h.A00.getContext().getString(2131952514));
            igdsBanner.A00 = new C36500G7y(c31305DpR, e2h, c32622EXw, str);
            AbstractC34058F1l.A00(userSession).A01(userSession.userId, c31305DpR.A00(str));
            return;
        }
        e2h.A02.setVisibility(8);
    }

    public C31625Dur(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32622EXw.class;
    }
}
