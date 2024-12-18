package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes6.dex */
public final class EIE extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectInboxMessageSettingsFragment";
    public RecyclerView A00;
    public UserSession A01;
    public IgLinearLayout A02;
    public boolean A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_INBOX_BUSINESS_TOOLS";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.direct_inbox_message_settings_recycler_view);
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
        recyclerView.setAdapter(new E03(this.A03));
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
            IgLinearLayout igLinearLayout = (IgLinearLayout) view.findViewById(R.id.direct_inbox_message_settings_armadillo_title_container);
            C14360o3.A0B(igLinearLayout, 0);
            this.A02 = igLinearLayout;
            if (this.A03) {
                TextView A0Q = AbstractC25230BEn.A0Q(igLinearLayout, R.id.direct_inbox_message_setting_armadillo_title);
                IgLinearLayout igLinearLayout2 = this.A02;
                if (igLinearLayout2 != null) {
                    TextView A0Q2 = AbstractC25230BEn.A0Q(igLinearLayout2, R.id.direct_inbox_message_setting_armadillo_subtitle);
                    AbstractC166987dD.A1P(requireContext(), A0Q, 2131959923);
                    AbstractC166987dD.A1P(requireContext(), A0Q2, 2131959922);
                    IgLinearLayout igLinearLayout3 = this.A02;
                    if (igLinearLayout3 != null) {
                        igLinearLayout3.setVisibility(0);
                        return;
                    }
                }
                str = "titleContainer";
            } else {
                return;
            }
        } else {
            str = "recyclerView";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0y();
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1844826827);
        super.onCreate(bundle);
        UserSession A0R = AbstractC31177DnL.A0R(this);
        C14360o3.A0B(A0R, 0);
        this.A01 = A0R;
        C0f9.A09(1258873148, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(234145258);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_message_settings_panel, viewGroup, false);
        C0f9.A09(832282754, A02);
        return inflate;
    }
}
