package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes9.dex */
public final class N5O extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteAdNotDeliveringFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public RoundedCornerImageView A03;
    public C38321qM A04;
    public IgdsBottomButtonLayout A05;
    public String A06;
    public View A07;
    public SpinnerImageView A08;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new X55(this, 0));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131952250);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(AbstractC50523MSb.A01(this)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ad_not_delivering_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A07 = view.requireViewById(R.id.not_delivering_container);
        this.A03 = (RoundedCornerImageView) view.requireViewById(R.id.ad_not_delivering_thumbnail);
        this.A01 = AbstractC166997dE.A0T(view, R.id.ad_not_delivering_title);
        this.A00 = AbstractC166997dE.A0T(view, R.id.ad_not_delivering_description);
        this.A05 = AbstractC31172DnG.A0j(view, R.id.ok_button);
        this.A02 = AbstractC166997dE.A0T(view, R.id.view_insights_text);
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        this.A08 = A0V;
        if (A0V != null) {
            AbstractC31171DnF.A1M(A0V);
        }
        A00(this, true);
        String str = this.A06;
        if (str == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        FVK.A01(AbstractC166987dD.A0r(this.A0A), C1GJ.A01(), new P2O(this, 0), str);
    }

    public static final void A00(N5O n5o, boolean z) {
        View view;
        int i;
        if (z) {
            view = n5o.A07;
            i = 8;
        } else {
            SpinnerImageView spinnerImageView = n5o.A08;
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            }
            view = n5o.A07;
            i = 0;
        }
        if (view != null) {
            view.setVisibility(i);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = n5o.A05;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setVisibility(i);
        }
        TextView textView = n5o.A02;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1965214257);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = AbstractC31173DnH.A0k(bundle2, "media_id");
        }
        C0f9.A09(-1620602059, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1989447690);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ad_not_delivering_fragment, viewGroup, false);
        C0f9.A09(-859373461, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(101710721);
        super.onDestroyView();
        this.A07 = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        this.A02 = null;
        this.A08 = null;
        C0f9.A09(197913966, A02);
    }
}
