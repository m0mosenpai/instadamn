package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class EKK extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "BroadcastBottomSheetNuxFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final View.OnClickListener A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC31176DnK.A0V(this.A00).A0a(AbstractC25225BEi.A15(this.A01), AbstractC25225BEi.A15(this.A02), false);
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(view, R.id.public_chat_joinflow_cta_button);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_cta_button_subtext);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_header_image);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_header_title);
        ImageView A0D2 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_1_icon);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_1_subtitle);
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_1_description);
        ImageView A0D3 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_2_icon);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_2_subtitle);
        IgTextView A0d2 = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_2_description);
        ImageView A0D4 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_3_icon);
        TextView A0N5 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_3_subtitle);
        IgTextView A0d3 = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_3_description);
        C0fQ.A00(this.A04, igdsButton);
        C32052E6e A01 = ((C31840Dyz) this.A03.getValue()).A01();
        AbstractC166997dE.A19(requireContext, A0D, A01.A03);
        AbstractC31172DnG.A1K(A0N2, this, A01.A06);
        AbstractC166997dE.A19(requireContext, A0D2, A01.A00);
        AbstractC31172DnG.A1K(A0N3, this, A01.A07);
        InterfaceC09390do interfaceC09390do = this.A00;
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d, A01.A0A);
        AbstractC166997dE.A19(requireContext, A0D3, A01.A01);
        AbstractC31172DnG.A1K(A0N4, this, A01.A08);
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d2, A01.A0B);
        AbstractC166997dE.A19(requireContext, A0D4, A01.A02);
        AbstractC31172DnG.A1K(A0N5, this, A01.A09);
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d3, A01.A0C);
        igdsButton.setText(BHX.A02(this, A01.A05).toString());
        AbstractC25227BEk.A12(A0N, this, 2131954230);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do));
        A0w.E77("broadcast_chat_joinflow_nux", true);
        A0w.apply();
        AbstractC31176DnK.A0V(interfaceC09390do).A0Y(AbstractC111324zv.A00(1219), AbstractC25225BEi.A15(this.A01), AbstractC25225BEi.A15(this.A02), false, false);
    }

    public EKK() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, 0));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, "thread_v2_id", 1));
        this.A04 = new ViewOnClickListenerC35680FpF(this, 0);
        C37060GUu A01 = C37060GUu.A01(this, 35);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, C37060GUu.A01(C37060GUu.A01(this, 32), 33));
        this.A03 = AbstractC25225BEi.A0a(C37060GUu.A01(A00, 34), A01, new C37018GSz(29, A00, null), AbstractC25225BEi.A1D(C31840Dyz.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1256902876);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_broadcast_bottom_sheet_nux, false);
        C0f9.A09(1442321299, A02);
        return A0R;
    }
}
