package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.facepile.IgdsFacepile;

/* renamed from: X.NNx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52577NNx extends AbstractC52561NNh implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "LeadAdsThankYouScreenWithMultiSubmitFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgView A04;
    public CircularImageView A05;
    public IgdsFacepile A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC52561NNh, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = AbstractC31172DnG.A0X(view, R.id.multi_submit_title);
        this.A02 = AbstractC31172DnG.A0X(view, R.id.multi_submit_subtitle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.multi_submit_recycler_view);
        this.A01 = AbstractC31172DnG.A0G(view, R.id.multi_submit_thank_you_recycler_view);
        this.A04 = (IgView) view.requireViewById(R.id.horizontal_divider);
        this.A05 = AbstractC31173DnH.A0T(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A06 = (IgdsFacepile) view.requireViewById(R.id.multi_submit_facepile);
        int A02 = MSY.A02(this.A03);
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setVisibility(A02);
        }
        IgView igView = this.A04;
        if (igView != null) {
            igView.setVisibility(A02);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(A02);
        }
        IgTextView igTextView2 = this.A03;
        if (igTextView2 != null) {
            AbstractC25227BEk.A12(igTextView2, this, 2131964864);
        }
        IgTextView igTextView3 = this.A02;
        if (igTextView3 != null) {
            AbstractC25227BEk.A12(igTextView3, this, 2131964863);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 17), C07Y.A00(viewLifecycleOwner));
        InterfaceC09390do interfaceC09390do = this.A09;
        UserSession A00 = AbstractC51040Mgq.A00(interfaceC09390do);
        C57112jm c57112jm = super.A03;
        if (c57112jm != null) {
            ILM ilm = new ILM(A00, c57112jm, this);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("thank_you_page_index");
            } else {
                i = 0;
            }
            ilm.A00(view, OUA.A05.A00(this.mArguments, EnumC53273NhB.A0D, AbstractC51040Mgq.A00(interfaceC09390do).token, i + AbstractC50523MSb.A01(this)));
            IgTextView igTextView4 = super.A01;
            if (igTextView4 != null) {
                AbstractC77703du.A05(igTextView4, EnumC77673dr.A0T);
            }
            IgTextView igTextView5 = ((AbstractC52561NNh) this).A00;
            if (igTextView5 != null) {
                AbstractC77703du.A05(igTextView5, EnumC77673dr.A02);
            }
            CircularImageView circularImageView = this.A05;
            if (circularImageView != null) {
                AbstractC77703du.A05(circularImageView, EnumC77673dr.A0Q);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = super.A04;
            if (igdsBottomButtonLayout != null) {
                AbstractC77703du.A05(igdsBottomButtonLayout, EnumC77673dr.A09);
            }
            IgTextView igTextView6 = this.A02;
            if (igTextView6 != null) {
                AbstractC77703du.A05(igTextView6, EnumC77673dr.A0S);
                return;
            }
            return;
        }
        C14360o3.A0F("viewpointManager");
        throw C00O.createAndThrow();
    }

    public static final void A01(MWT mwt, C52577NNx c52577NNx, String str) {
        String A0i = JQ0.A0i(c52577NNx, (C5QE) mwt.A01);
        String string = c52577NNx.getString(2131964860, str, A0i);
        C14360o3.A07(string);
        SpannableStringBuilder A0B = MSY.A0B(new C52790NXz(c52577NNx, NOX.A03((NOX) c52577NNx.A09.getValue()), AbstractC153636vY.A01(c52577NNx.requireArguments(), "mediaID"), MSZ.A04(c52577NNx.requireActivity(), c52577NNx)), string, A0i);
        IgTextView igTextView = ((AbstractC52561NNh) c52577NNx).A00;
        if (igTextView != null) {
            AbstractC25227BEk.A11(igTextView);
        }
        IgTextView igTextView2 = ((AbstractC52561NNh) c52577NNx).A00;
        if (igTextView2 != null) {
            igTextView2.setText(A0B);
        }
    }

    public C52577NNx() {
        C57554PgS A01 = C57554PgS.A01(this, 30);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 27), EnumC09460dv.A02, 28);
        this.A09 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 29), A01, C57534Pg8.A00(A00, null, 12), AbstractC25225BEi.A1D(NOX.class));
        this.A08 = AbstractC60492pY.A02(this);
        C0YZ A1D = AbstractC25225BEi.A1D(C50902MeX.class);
        this.A07 = AbstractC25225BEi.A0a(C57554PgS.A01(this, 25), C57554PgS.A01(this, 26), C57534Pg8.A00(this, null, 11), A1D);
    }

    @Override // X.AbstractC52561NNh, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-182100232);
        C14360o3.A0B(layoutInflater, 0);
        super.A03 = AbstractC31180DnO.A0N();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_thank_you_screen_with_multi_submit, viewGroup, false);
        C0f9.A09(-968846309, A02);
        return inflate;
    }

    @Override // X.AbstractC52561NNh, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-204922799);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        C0f9.A09(2090065371, A02);
    }
}
