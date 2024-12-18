package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class N53 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "OverflowBottomSheetFragment";
    public SpannableStringBuilder A00;
    public View A01;
    public Boolean A02;
    public boolean A03;
    public RecyclerView A04;
    public AbstractC18680vv A05;
    public UserSession A06;
    public final C03L A09 = new C65799TuH(this, 3);
    public final List A08 = AbstractC166987dD.A1E();
    public final C51145Mio A07 = new C51145Mio();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "action_sheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        return EnumC60772q1.A04;
    }

    public static void A00(N53 n53) {
        if (n53.isAdded() && !n53.mRemoving) {
            List<OFM> list = n53.A08;
            if (!list.isEmpty() || n53.A00 != null) {
                ViewGroup viewGroup = (ViewGroup) n53.getLayoutInflater().inflate(R.layout.feed_action_sheet_header, (ViewGroup) null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
                for (OFM ofm : list) {
                    View inflate = n53.getLayoutInflater().inflate(R.layout.bottomsheet_action_button, (ViewGroup) null);
                    inflate.setLayoutParams(layoutParams);
                    viewGroup.addView(inflate);
                    NXU nxu = new NXU(inflate);
                    AbstractC54239NyK.A00(nxu, ofm);
                    n53.requireActivity();
                    nxu.A00.setVisibility(0);
                }
                if (n53.A03) {
                    ViewGroup A0F = AbstractC31173DnH.A0F(n53.A01, R.id.custom_header_view);
                    A0F.addView(viewGroup);
                    A0F.setVisibility(0);
                    ViewStub A0G = AbstractC31173DnH.A0G(n53.A01, R.id.action_sheet_nav_bar_divider);
                    A0G.inflate();
                    if (n53.A00 != null) {
                        MSY.A0y(n53.A01, R.id.action_sheet_simple_header);
                        TextView A0T = AbstractC166997dE.A0T(n53.A01, R.id.action_sheet_subheader_text_view);
                        A0T.setText(n53.A00);
                        A0T.setVisibility(0);
                        A0G.setVisibility(8);
                        AbstractC31172DnG.A1J(n53.A01, R.id.action_sheet_header_divider, 8);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-862439467);
        super.onCreate(bundle);
        this.A05 = AbstractC166987dD.A0n(AbstractC60492pY.A01(this));
        this.A06 = AbstractC31176DnK.A0S(this);
        this.A03 = true;
        C0f9.A09(-102739591, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1364455264);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.action_sheet_fragment);
        C0f9.A09(-956975763, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(637398760);
        super.onPause();
        this.A03 = false;
        C0f9.A09(1254530472, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1939472676);
        super.onResume();
        if (!this.A03) {
            AbstractC56932jR.A06(this.A04, 500L);
        }
        C0f9.A09(-44898454, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = view;
        Boolean bool = this.A02;
        if (bool != null) {
            view.setFitsSystemWindows(bool.booleanValue());
        }
        Boolean bool2 = this.A02;
        if (bool2 != null && bool2.booleanValue()) {
            AbstractC008903d.A00(this.A01, this.A09);
        }
        C51145Mio c51145Mio = this.A07;
        c51145Mio.A01 = BO8.A01(this.A01.getContext(), this.A06);
        this.A04 = AbstractC31176DnK.A0F(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        this.A04.setAdapter(c51145Mio);
        this.A04.setLayoutManager(linearLayoutManager);
        A00(this);
    }
}
