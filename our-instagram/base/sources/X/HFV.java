package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class HFV extends AbstractC65632xz {
    public final ReelDashboardFragment A00;

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
        Wm1 A01 = AbstractC97594Zu.A01((C41181vS) obj);
        A01.getClass();
        String str = A01.A02.A08;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        Wm1 A01 = AbstractC97594Zu.A01((C41181vS) obj);
        A01.getClass();
        return A01.hashCode();
    }

    public HFV(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1089805671);
        ((IM3) AbstractC31172DnG.A0x(view)).A00((C41181vS) obj);
        C0f9.A0A(-502339546, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1284307932);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_dashboard_quiz_results_summary);
        A0A.setTag(new IM3(A0A, this.A00));
        C0f9.A0A(100694750, A03);
        return A0A;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(88124997);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C0f9.A0A(-1567090973, A03);
        return view;
    }
}
