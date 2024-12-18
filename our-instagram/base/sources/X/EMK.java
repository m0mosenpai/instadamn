package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EMK extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "GalleryGridFormatAttributionSheetFragment";
    public String A00;
    public String A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Resources resources = requireContext.getResources();
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.action_sheet_header_picture);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.action_sheet_header_text_view);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.action_sheet_subheader_text_view);
        View A0S = AbstractC166997dE.A0S(view, R.id.action_sheet_row_text_view);
        AbstractC166997dE.A19(requireContext, A0D, R.drawable.ig_illustrations_illo_supersync_attribution);
        A0N.setText(new SpannableString(resources.getString(2131963076)));
        A0N.setTypeface(null, 1);
        A0N2.setText(AbstractC13670mt.A06(AbstractC166997dE.A0q(resources, 2131953236), resources.getString(R.string.res_0x7f130072_name_removed)));
        AbstractC56952jT.A01(A0S);
        ViewOnClickListenerC31723DwS.A01(A0S, 63, this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return I58.A00(this, str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A1I;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(623313842);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC153636vY.A01(requireArguments, "args_previous_module_name");
        this.A00 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(134));
        C0f9.A09(-1074644332, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-992491445);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.capture_format_attribution_sheet_fragment, false);
        C0f9.A09(146872188, A02);
        return A0R;
    }
}
