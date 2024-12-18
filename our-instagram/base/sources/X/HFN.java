package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class HFN extends AbstractC65632xz {
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
        JMA A00 = AbstractC209909Qc.A00((C41181vS) obj);
        A00.getClass();
        String fundraiserId = A00.getFundraiserId();
        fundraiserId.getClass();
        return fundraiserId.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        JMA A00 = AbstractC209909Qc.A00((C41181vS) obj);
        A00.getClass();
        String AbX = A00.AbX();
        AbX.getClass();
        return AbX.hashCode();
    }

    public HFN(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int A03 = C0f9.A03(1480313269);
        C41084IHb c41084IHb = (C41084IHb) AbstractC31172DnG.A0x(view);
        JMA A00 = AbstractC209909Qc.A00((C41181vS) obj);
        A00.getClass();
        InterfaceC43549JLj Ayv = A00.Ayv();
        Ayv.getClass();
        boolean z = !AnonymousClass483.A04(Ayv.Ayw());
        C57012jc c57012jc = c41084IHb.A02;
        if (z) {
            c57012jc.A03(0);
            View A01 = c57012jc.A01();
            AbstractC166997dE.A0T(A01, R.id.fundraiser_results_summary_amount_raised_text).setText(A00.AbX());
            ViewOnClickListenerC37847Gl1.A00(A01.requireViewById(R.id.fundraiser_results_summary_amount_raised_disclaimer_icon), 25, this);
            textView = c41084IHb.A01;
            AbstractC13880nE.A0d(textView, 0);
        } else {
            c57012jc.A02();
            textView = c41084IHb.A01;
            AbstractC13880nE.A0d(textView, AbstractC167017dG.A03(c41084IHb.A00));
        }
        User AnB = A00.AnB();
        AnB.getClass();
        String username = AnB.getUsername();
        Context context = c41084IHb.A00;
        int i2 = 2131971676;
        if (z) {
            i2 = 2131971675;
        }
        AnonymousClass773.A07(new C38301Gsk(2, this, AnB), textView, username, AbstractC167007dF.A0f(context, username, i2));
        C0f9.A0A(1657680979, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1823734092);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_dashboard_fundraiser_results_summary);
        A0A.setTag(new C41084IHb(A0A));
        C0f9.A0A(261788663, A03);
        return A0A;
    }
}
