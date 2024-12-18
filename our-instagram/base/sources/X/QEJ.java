package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes10.dex */
public final class QEJ extends QE5 {
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        C5G6 c5g6;
        C5G6 c5g62;
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_autofill_save_payment, (ViewGroup) null);
        long j = requireArguments().getLong("disable_autofill_dismiss_option", 0L);
        if (j != 2) {
            ViewOnTouchListenerC63511Soe.A00(inflate, 5, this);
        } else {
            AbstractC167007dF.A0x(inflate.findViewById(R.id.autofill_bottomsheet_drag_handle));
        }
        AlertDialog create = new AlertDialog.Builder(getActivity()).setView(inflate).create();
        if (j != 0) {
            create.setCanceledOnTouchOutside(false);
        }
        ((QE5) this).A01.getClass();
        SZO A00 = ((QE5) this).A01.A08("CLICKED_LEARN_MORE").A00();
        inflate.requireViewById(R.id.icon_image_view).setVisibility(8);
        AbstractC31172DnG.A1J(inflate, R.id.title_text_view, 8);
        ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.autofill_optimization_illustration_image_view);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.autofill_optimization_title_text_view);
        AbstractC166997dE.A19(requireContext(), A0I, R.drawable.ig_illustrations_illo_payments_add);
        TextView A0T2 = AbstractC166997dE.A0T(inflate, R.id.autofill_optimization_value_prop);
        AbstractC25227BEk.A11(A0T2);
        ((QE5) this).A01.getClass();
        if (requireArguments().getBoolean("autofill_show_unified_wallet_disclaimer_enabled", false)) {
            C5G6 c5g63 = ((QE5) this).A00;
            if (c5g63 != null) {
                Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A05, c5g63.A04.A00, 36322800422103697L);
                C14360o3.A0A(A0c);
                if (A0c.booleanValue()) {
                    A0T2 = AbstractC166997dE.A0T(inflate, R.id.autofill_optimization_value_prop_updated);
                    AbstractC25227BEk.A11(A0T2);
                }
            }
            FragmentActivity requireActivity = requireActivity();
            Bundle A03 = ((QE5) this).A01.A03.A03();
            C5G6 c5g64 = ((QE5) this).A00;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C33263Elx c33263Elx = new C33263Elx(requireActivity, A03, c5g64, A00, AbstractC31174DnI.A0q(inflate.getContext(), R.color.igds_link));
            String string = requireActivity.getString(2131953420);
            AnonymousClass773.A07(c33263Elx, A0T2, string, spannableStringBuilder.append((CharSequence) requireActivity.getString(2131969230)).append(' ').append((CharSequence) string).append(' ').toString());
        } else {
            AbstractC63046SbQ.A00(requireActivity(), ((QE5) this).A01.A03.A03(), inflate, A0T2, ((QE5) this).A00, A00, 2131969229, -1, 2131964504, true);
        }
        if (A0G() && AbstractC58323PtF.A0k(this) != null) {
            AbstractC166987dD.A1P(requireContext(), A0T, 2131972756);
            inflate.requireViewById(R.id.autofill_optimization_illustration_image_view).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
            }
            inflate.requireViewById(R.id.autofill_optimization_title_text_view).setLayoutParams(layoutParams);
            int dimensionPixelSize2 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize2 != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = dimensionPixelSize2;
            }
            inflate.requireViewById(R.id.autofill_optimization_value_prop).setLayoutParams(layoutParams2);
        }
        A0T2.setVisibility(0);
        A0I.setVisibility(0);
        A0T.setVisibility(0);
        Parcelable parcelable = requireArguments().getParcelable("contact_info");
        Parcelable.Creator creator = AutofillData.CREATOR;
        AutofillData autofillData = (AutofillData) C0B1.A01(creator, parcelable, AutofillData.class);
        if (autofillData != null && ((c5g62 = ((QE5) this).A00) == null || !c5g62.A04.A0C(false))) {
            C50813Mcj A002 = OR0.A00(getActivity(), autofillData, true);
            A002.requireViewById(R.id.extra_btn).setVisibility(8);
            AbstractC31172DnG.A1J(A002, R.id.radio_icon, 8);
            View requireViewById = inflate.requireViewById(R.id.autofill_contact_info_stub);
            ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.scrollable_content);
            viewGroup.addView(A002, viewGroup.indexOfChild(requireViewById));
            viewGroup.removeViewInLayout(requireViewById);
            if (AbstractC58323PtF.A0k(this) != null) {
                AbstractC31172DnG.A1J(inflate, R.id.autofill_contact_info_title, 0);
            }
        }
        CardDetails cardDetails = (CardDetails) AbstractC58323PtF.A0k(this);
        if (cardDetails != null) {
            Q5H q5h = new Q5H(inflate.getContext());
            q5h.A00(cardDetails);
            AbstractC50522MSa.A0z(q5h);
            AbstractC31176DnK.A1D(q5h, R.id.radio_icon);
            View requireViewById2 = inflate.requireViewById(R.id.autofill_payment_info_stub);
            ViewGroup viewGroup2 = (ViewGroup) inflate.requireViewById(R.id.scrollable_content);
            viewGroup2.addView(q5h, viewGroup2.indexOfChild(requireViewById2));
            viewGroup2.removeViewInLayout(requireViewById2);
            if (A0G()) {
                View requireViewById3 = inflate.requireViewById(R.id.contact_and_payment_entry_divider);
                View requireViewById4 = inflate.requireViewById(R.id.autofill_payment_info_title);
                requireViewById3.setVisibility(0);
                requireViewById4.setVisibility(0);
                AutofillData autofillData2 = (AutofillData) C0B1.A01(creator, requireArguments().getParcelable("contact_info"), AutofillData.class);
                if (autofillData2 != null && autofillData2.A02()) {
                    int dimensionPixelSize3 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    q5h.setPadding(dimensionPixelSize3, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), dimensionPixelSize3, 0);
                    IgdsListCell igdsListCell = (IgdsListCell) inflate.requireViewById(R.id.autofill_save_shipping_as_billing_option);
                    igdsListCell.A0G(EnumC53237Nga.A08, true);
                    igdsListCell.A0D(new C63533Sp0(this, 2));
                    ((QE5) this).A02 = true;
                    igdsListCell.setVisibility(0);
                }
            }
        }
        C5G6 c5g65 = ((QE5) this).A00;
        if (c5g65 != null && c5g65.A04.A0C(false)) {
            inflate.requireViewById(R.id.contact_and_payment_entry_divider).setVisibility(8);
            AbstractC31172DnG.A1J(inflate, R.id.autofill_payment_info_title, 8);
        }
        boolean z = requireArguments().getBoolean("is_consent_accepted", false);
        if (requireArguments().getBoolean("should_always_show_ads_disclosure", false) || !z) {
            if (autofillData != null) {
                if (cardDetails != null) {
                    ViewStub A0G = AbstractC31173DnH.A0G(inflate, R.id.autofill_payment_bottom_disclaimer_stub);
                    SpannableStringBuilder append = new SpannableStringBuilder(getString(2131972706)).append((CharSequence) " ").append((CharSequence) A01(inflate));
                    int dimensionPixelSize4 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (dimensionPixelSize4 != -1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = dimensionPixelSize4;
                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = dimensionPixelSize4;
                    }
                    inflate.requireViewById(R.id.autofill_payment_bottom_disclaimer_stub).setLayoutParams(layoutParams3);
                    TextView textView = (TextView) A0G.inflate();
                    AbstractC31176DnK.A1G(textView, append);
                    textView.setHighlightColor(0);
                    textView.setTextSize(0, AbstractC166997dE.A0N(this).getDimension(R.dimen.auth_edit_field_text_size));
                    int dimensionPixelSize5 = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    if (dimensionPixelSize5 != -1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = dimensionPixelSize5;
                        ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = dimensionPixelSize5;
                    }
                    inflate.requireViewById(R.id.not_now_button).setLayoutParams(layoutParams4);
                }
            } else if (cardDetails != null) {
                TextView A0T3 = AbstractC166997dE.A0T(inflate, R.id.ads_and_saved_info_management_text);
                A0T3.setText(new SpannableStringBuilder(getString(2131972706)).append((CharSequence) " ").append((CharSequence) getString(2131953422)));
                A0T3.setVisibility(0);
            }
            AbstractC31176DnK.A1D(inflate, R.id.divider_view);
            ViewOnClickListenerC63508Sob.A01(inflate.requireViewById(R.id.save_button), 12, this);
            ViewOnClickListenerC63508Sob.A01(inflate.requireViewById(R.id.not_now_button), 13, this);
            c5g6 = ((QE5) this).A00;
            if (c5g6 != null && c5g6.A04.A00()) {
                ViewStub A0G2 = AbstractC31173DnH.A0G(inflate, R.id.autofill_payment_save_passkey_view_stub);
                A0G2.setLayoutResource(R.layout.layout_iab_autofill_payment_save_passkey_view);
                A0G2.inflate();
                ((QE5) this).A00.A00.A0B.A01 = true;
                CompoundButton compoundButton = (CompoundButton) inflate.requireViewById(R.id.autofill_passkey_opt_in_checkbox);
                C5G6 c5g66 = ((QE5) this).A00;
                C14360o3.A0B(c5g66, 0);
                compoundButton.setChecked(AbstractC166987dD.A0x(c5g66.A03.A00).getBoolean("autofill_passkey_opt_in_cache_key", true));
                compoundButton.setOnCheckedChangeListener(new C63533Sp0(this, 3));
            }
            return create;
        }
        if (getActivity() != null) {
            SpannableStringBuilder A01 = A01(inflate);
            TextView textView2 = (TextView) AbstractC167017dG.A0U(inflate, R.id.autofill_payment_bottom_disclaimer_stub);
            AbstractC31176DnK.A1G(textView2, A01);
            textView2.setHighlightColor(0);
        }
        AbstractC31176DnK.A1D(inflate, R.id.divider_view);
        ViewOnClickListenerC63508Sob.A01(inflate.requireViewById(R.id.save_button), 12, this);
        ViewOnClickListenerC63508Sob.A01(inflate.requireViewById(R.id.not_now_button), 13, this);
        c5g6 = ((QE5) this).A00;
        if (c5g6 != null) {
            ViewStub A0G22 = AbstractC31173DnH.A0G(inflate, R.id.autofill_payment_save_passkey_view_stub);
            A0G22.setLayoutResource(R.layout.layout_iab_autofill_payment_save_passkey_view);
            A0G22.inflate();
            ((QE5) this).A00.A00.A0B.A01 = true;
            CompoundButton compoundButton2 = (CompoundButton) inflate.requireViewById(R.id.autofill_passkey_opt_in_checkbox);
            C5G6 c5g662 = ((QE5) this).A00;
            C14360o3.A0B(c5g662, 0);
            compoundButton2.setChecked(AbstractC166987dD.A0x(c5g662.A03.A00).getBoolean("autofill_passkey_opt_in_cache_key", true));
            compoundButton2.setOnCheckedChangeListener(new C63533Sp0(this, 3));
        }
        return create;
    }

    private SpannableStringBuilder A01(View view) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return new SpannableStringBuilder("");
        }
        String string = getString(2131969408);
        String string2 = getString(2131969715);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(2131972707, string, string2));
        Context context = view.getContext();
        Em0 em0 = new Em0(AbstractC31174DnI.A0q(context, R.color.igds_link), activity, this, 0);
        Em0 em02 = new Em0(AbstractC31174DnI.A0q(context, R.color.igds_link), activity, this, 1);
        AnonymousClass773.A04(spannableStringBuilder, em0, string);
        AnonymousClass773.A04(spannableStringBuilder, em02, string2);
        return spannableStringBuilder;
    }
}
