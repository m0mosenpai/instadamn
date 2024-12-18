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

/* loaded from: classes6.dex */
public final class EKS extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ChannelJoinFlowNuxFragment";
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final View.OnClickListener A0B;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_public_chat_joinflow_nux";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C23031Ai A0l;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        EnumC33512Erl enumC33512Erl;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        View A0R = AbstractC166997dE.A0R(view, R.id.public_chat_joinflow_dismiss_button);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_cta_button);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_cta_button_subtext);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_header_image);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_header_title);
        ImageView A0D2 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_1_icon);
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_1_subtitle);
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_1_description);
        ImageView A0D3 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_2_icon);
        TextView A0N5 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_2_subtitle);
        IgTextView A0d2 = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_2_description);
        ImageView A0D4 = AbstractC31176DnK.A0D(view, R.id.public_chat_joinflow_info_3_icon);
        TextView A0N6 = AbstractC167007dF.A0N(view, R.id.public_chat_joinflow_info_3_subtitle);
        IgTextView A0d3 = AbstractC25231BEo.A0d(view, R.id.public_chat_joinflow_info_3_description);
        ViewOnClickListenerC35680FpF.A00(A0R, 4, this);
        C0fQ.A00(this.A0B, A0N);
        C32052E6e A01 = ((C31840Dyz) this.A0A.getValue()).A01();
        AbstractC166997dE.A19(requireContext, A0D, A01.A03);
        AbstractC31172DnG.A1K(A0N3, this, A01.A06);
        AbstractC166997dE.A19(requireContext, A0D2, A01.A00);
        AbstractC31172DnG.A1K(A0N4, this, A01.A07);
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d, A01.A0A);
        AbstractC166997dE.A19(requireContext, A0D3, A01.A01);
        AbstractC31172DnG.A1K(A0N5, this, A01.A08);
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d2, A01.A0B);
        AbstractC166997dE.A19(requireContext, A0D4, A01.A02);
        AbstractC31172DnG.A1K(A0N6, this, A01.A09);
        AbstractC34084F2m.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0d3, A01.A0C);
        AbstractC31172DnG.A1K(A0N, this, A01.A05);
        C5QE c5qe = A01.A04;
        if (c5qe == null) {
            A0N2.setVisibility(8);
        } else {
            AbstractC31172DnG.A1K(A0N2, this, c5qe);
            A0N2.setVisibility(0);
        }
        AbstractC31178DnM.A0B(this).setBackgroundColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background));
        InterfaceC09390do interfaceC09390do2 = this.A06;
        switch (((EnumC33357Eoq) interfaceC09390do2.getValue()).ordinal()) {
            case 0:
                A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                z = true;
                interfaceC16530ry = A0l.A38;
                c0yrArr = C23031Ai.A8c;
                i = 393;
                break;
            case 1:
                InterfaceC19610xo ARD = AbstractC149676oK.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01.ARD();
                ARD.E77(AbstractC111324zv.A00(4550), true);
                ARD.apply();
                C36296Fzq A00 = F1E.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String A15 = AbstractC25225BEi.A15(this.A04);
                if (A15 != null) {
                    int hashCode = A15.hashCode();
                    if (hashCode != -1811290548) {
                        if (hashCode != 100344454) {
                            if (hashCode == 468776282 && A15.equals("ssc_list")) {
                                enumC33512Erl = EnumC33512Erl.SSC_LIST_IN_SUBSCRIPTION_SETTINGS;
                            } else {
                                return;
                            }
                        } else if (A15.equals("inbox")) {
                            enumC33512Erl = EnumC33512Erl.INBOX;
                        } else {
                            return;
                        }
                    } else if (A15.equals("pinned_ssc_on_profile")) {
                        enumC33512Erl = EnumC33512Erl.PROFILE_PINNED_CHANNELS;
                    } else {
                        return;
                    }
                    A00.A00 = AbstractC166997dE.A0n();
                    C36296Fzq.A02(EnumC33514Ern.A05, enumC33512Erl, A00, AbstractC111324zv.A00(3280), "tap", null);
                    return;
                }
                return;
            case 2:
            case 3:
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do));
                A0w.E77("broadcast_chat_joinflow_nux", true);
                A0w.apply();
                AbstractC31172DnG.A0d(this.A01).A0Y(AbstractC25225BEi.A15(this.A04), AbstractC25225BEi.A15(this.A08), AbstractC25225BEi.A15(this.A09), AbstractC167007dF.A1X(interfaceC09390do2.getValue(), EnumC33357Eoq.A05), requireArguments().getBoolean("is_followed_by_user"));
                ((C25671My) this.A05.getValue()).E4s(new C7LZ(C05F.A00));
                return;
            case 4:
                A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                z = true;
                interfaceC16530ry = A0l.A3W;
                c0yrArr = C23031Ai.A8c;
                i = 394;
                break;
            case 5:
                A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                z = true;
                interfaceC16530ry = A0l.A3X;
                c0yrArr = C23031Ai.A8c;
                i = 395;
                break;
            default:
                throw B4Z.A00();
        }
        AbstractC167007dF.A1L(A0l, interfaceC16530ry, c0yrArr, i, z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A00) {
            InterfaceC09390do interfaceC09390do = this.A06;
            int ordinal = ((EnumC33357Eoq) interfaceC09390do.getValue()).ordinal();
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 0) {
                    C36283Fza c36283Fza = (C36283Fza) this.A03.getValue();
                    String A15 = AbstractC25225BEi.A15(this.A08);
                    String A152 = AbstractC25225BEi.A15(this.A09);
                    AbstractC167007dF.A1K(A15, A152);
                    C25531Mh A0F = C25531Mh.A0F(c36283Fza.A00);
                    if (AbstractC25226BEj.A1Z(A0F)) {
                        AbstractC31178DnM.A1F(A0F, c36283Fza.A01);
                        AbstractC31174DnI.A1I(A0F, AbstractC111324zv.A00(4829));
                        A0F.A0o(AbstractC111324zv.A00(4395));
                        AbstractC31175DnJ.A1D(A0F, "public_chat_nux");
                        A0F.A0r(A15);
                        A0F.A0h(AbstractC166997dE.A0j(A152));
                        A0F.Cht();
                    }
                }
            } else {
                AbstractC31172DnG.A0d(this.A01).A0a(AbstractC25225BEi.A15(this.A08), AbstractC25225BEi.A15(this.A09), AbstractC167007dF.A1X(interfaceC09390do.getValue(), EnumC33357Eoq.A05));
            }
            ((C25671My) this.A05.getValue()).E4s(new C7LZ(C05F.A01));
            return false;
        }
        return false;
    }

    public EKS() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = DH5.A01(this, "nux_type", enumC09460dv, 20);
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, 2));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, "thread_v2_id", 3));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, "creator_id", 4));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk("", this, "entrypoint", 5));
        this.A01 = AbstractC09440dt.A01(C37060GUu.A01(this, 41));
        this.A03 = AbstractC09440dt.A01(C37060GUu.A01(this, 42));
        C37060GUu A01 = C37060GUu.A01(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, C37060GUu.A01(C37060GUu.A01(this, 44), 45));
        this.A0A = AbstractC25225BEi.A0a(C37060GUu.A01(A00, 46), A01, new C37018GSz(30, A00, null), AbstractC25225BEi.A1D(C31840Dyz.class));
        this.A05 = AbstractC09440dt.A01(C37060GUu.A01(this, 43));
        this.A0B = new ViewOnClickListenerC35680FpF(this, 3);
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-811090119);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_public_chat_join_flow_nux, false);
        C0f9.A09(1889962624, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(2140133194);
        super.onDetach();
        if (!this.A00) {
            ((C25671My) this.A05.getValue()).E4s(new C7LZ(C05F.A01));
        }
        C0f9.A09(-1424947192, A02);
    }
}
