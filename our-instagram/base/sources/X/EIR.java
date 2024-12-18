package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EIR extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelDashboardActionsFragment";
    public UserSession A00;
    public C38266GsB A01;
    public User A02;
    public C31883Dzp A03;
    public FK3 A04;
    public boolean A05;
    public boolean A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_dashboard_actions_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIR.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(339511068);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_reel_dashboard_actions);
        C0f9.A09(475722516, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC56392iX A0X = AbstractC166997dE.A0X(view, R.id.title_text_view);
        AbstractC56372iV.A01(view.requireViewById(R.id.bottom_sheet_nav_bar_divider), false, false).setVisibility(0);
        AbstractC31173DnH.A1F((TextView) A0X.getView(), this.A02);
        A0X.setVisibility(0);
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36324312243843168L)) {
            AbstractC31173DnH.A1T(this, (IgImageView) AbstractC31178DnM.A0A(view, R.id.title_image_view), this.A02);
            ((TextView) A0X.getView()).setTextAppearance(A0X.getView().getContext(), R.style.igds_emphasized_body_1);
            AbstractC166987dD.A1O(A0X.getView().getContext(), (TextView) A0X.getView(), AbstractC53242c7.A07(A0X.getView().getContext()));
        }
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        AbstractC31177DnL.A17(this, A0F);
        A0F.setAdapter(this.A03);
    }
}
