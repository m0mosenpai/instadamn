package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes6.dex */
public final class FOJ {
    public C41181vS A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;

    public FOJ(View view, ReelDashboardFragment reelDashboardFragment) {
        this.A02 = view;
        this.A01 = view.requireViewById(R.id.flag_info_button_container);
        this.A08 = AbstractC166997dE.A0T(view, R.id.flag_info_title);
        this.A06 = AbstractC166997dE.A0T(view, R.id.flag_info_reason);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.flag_info_see_all_countries_button);
        this.A07 = A0T;
        this.A04 = AbstractC166997dE.A0T(view, R.id.flag_info_delete_label);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.flag_info_delete_button);
        this.A03 = A0T2;
        TextView A0T3 = AbstractC166997dE.A0T(view, R.id.flag_info_learn_more_button);
        this.A05 = A0T3;
        C3P9 c3p9 = new C3P9(A0T);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A04 = new EZP(3, this, reelDashboardFragment);
        c3p9.A00();
        C3P9 c3p92 = new C3P9(A0T2);
        c3p92.A0D = true;
        c3p92.A07 = true;
        c3p92.A04 = new EZP(4, this, reelDashboardFragment);
        c3p92.A00();
        C3P9 c3p93 = new C3P9(A0T3);
        c3p93.A0D = true;
        c3p93.A07 = true;
        c3p93.A04 = new EZP(5, this, reelDashboardFragment);
        c3p93.A00();
    }
}
