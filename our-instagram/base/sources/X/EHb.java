package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EHb extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MediaPickerSortMethodInfoBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_picker_info_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(view, R.id.bottom_sheet_reach_text_overview), this, 2131966128);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(view, R.id.accounts_center_accounts_reached_title), this, 2131966125);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.accounts_center_accounts_reached_body);
        AbstractC25227BEk.A11(A0e);
        String A0v = AbstractC25227BEk.A0v(this, 2131966124);
        String A0v2 = AbstractC25227BEk.A0v(this, 2131966126);
        String A0v3 = AbstractC25227BEk.A0v(this, 2131966133);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0v);
        AnonymousClass773.A05(A0H, new C33265Elz(this, "https://business.facebook.com/business/help/283579896000936", AbstractC25233BEq.A04(this)), A0v2);
        String A00 = MSV.A00(212);
        AnonymousClass773.A05(A0H, new C33265Elz(this, A00, AbstractC25233BEq.A04(this)), A0v3);
        A0e.setText(A0H);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(view, R.id.accounts_reached_title), this, 2131966127);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.accounts_reached_body);
        AbstractC25227BEk.A11(A0e2);
        String A0v4 = AbstractC25227BEk.A0v(this, 2131966124);
        String A0v5 = AbstractC25227BEk.A0v(this, 2131966133);
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(A0v4);
        AnonymousClass773.A05(A0H2, new C33265Elz(this, A00, AbstractC25233BEq.A04(this)), A0v5);
        A0e2.setText(A0H2);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-162944861);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_media_picker_sort_method_header_info_bottom_sheet, viewGroup, false);
        C0f9.A09(213708567, A02);
        return inflate;
    }
}
