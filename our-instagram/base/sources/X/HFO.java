package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HFO extends AbstractC65632xz {
    public final UserSession A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        Wm2 A00 = AbstractC140316Wj.A00(((C41181vS) obj).A0b);
        A00.getClass();
        String str = A00.A00.A08;
        if (str == null) {
            str = "";
        }
        str.getClass();
        return str.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        Wm2 A00 = AbstractC140316Wj.A00(((C41181vS) obj).A0b);
        A00.getClass();
        return A00.A01();
    }

    public HFO(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1424700033);
        C69596Vrz c69596Vrz = (C69596Vrz) view.getTag();
        if (c69596Vrz != null) {
            UserSession userSession = this.A00;
            C38321qM c38321qM = ((C41181vS) obj).A0b;
            c38321qM.getClass();
            c69596Vrz.A00(userSession, c38321qM);
        }
        C0f9.A0A(181494411, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2139443634);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_dashboard_slider_results_summary);
        A0A.setTag(new C69596Vrz(A0A));
        C0f9.A0A(-914688114, A03);
        return A0A;
    }
}
