package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes7.dex */
public final class HC0 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsTrialBottomSheetFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public SpinnerImageView A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16820sZ A04;
    public final String A05 = __redex_internal_original_name;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07 = C1XM.A00(new C57239PbN(this, 21));
    public final InterfaceC09390do A08;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (SpinnerImageView) view.requireViewById(R.id.loading_indicator);
        this.A01 = (IgdsHeadline) view.requireViewById(R.id.headline);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57166PZk c57166PZk = new C57166PZk(c07s, this, viewLifecycleOwner, null, 33);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c57166PZk, A00);
        AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A08.getValue();
        AbstractC23641Du.A05(anonymousClass191, new PZE(abstractC52922bZ, null, 16), AbstractC141776au.A00(abstractC52922bZ));
    }

    public static final void A01(HC0 hc0) {
        ClipsTrialBottomSheetViewModel clipsTrialBottomSheetViewModel = (ClipsTrialBottomSheetViewModel) hc0.A08.getValue();
        C153936w2.A04(C153936w2.A01(clipsTrialBottomSheetViewModel.A00, Boolean.valueOf(clipsTrialBottomSheetViewModel.A0D), clipsTrialBottomSheetViewModel.A07), clipsTrialBottomSheetViewModel.A03, PublicKeyCredentialControllerUtility.JSON_KEY_USER, MSV.A00(1672), AbstractC111324zv.A00(1323), clipsTrialBottomSheetViewModel.A06, null);
        InterfaceC16820sZ interfaceC16820sZ = hc0.A03;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public HC0() {
        C57239PbN c57239PbN = new C57239PbN(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57239PbN(new C57239PbN(this, 22), 23));
        this.A08 = AbstractC25225BEi.A0a(new C57239PbN(A00, 24), c57239PbN, C43208J8f.A00(null, A00, 45), AbstractC25225BEi.A1D(ClipsTrialBottomSheetViewModel.class));
    }

    public static final void A00(View view, HC0 hc0, int i, int i2) {
        AbstractC31173DnH.A0I(view, R.id.trial_metric_icon).setImageResource(i);
        AbstractC166997dE.A0T(view, R.id.trial_metric_value).setText(C84963qk.A04(AbstractC31177DnL.A09(hc0), Integer.valueOf(i2), 1000, false, false));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1275698970);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_viewer_trial_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-74514689, A02);
        return inflate;
    }
}
