package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.Bse, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26816Bse extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "XarDisclosureFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C43205J8c(this, 13));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131977141);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
        interfaceC56362iU.EkF(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "xar_disclosure_screen";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.disclosure_text_view_1);
        AbstractC25227BEk.A11(A0N);
        Context requireContext = requireContext();
        C2D c2d = new C2D(this);
        String A0q = AbstractC166997dE.A0q(requireContext.getResources(), 2131965052);
        Spanned A00 = AbstractC07900bA.A00(requireContext.getResources(), new Object[]{A0q}, 2131977138);
        C14360o3.A07(A00);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A00);
        AnonymousClass773.A05(A0H, c2d, A0q);
        A0N.setText(A0H);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.disclosure_text_view_2);
        AbstractC25227BEk.A11(A0N2);
        Context requireContext2 = requireContext();
        C2E c2e = new C2E(this);
        String A0q2 = AbstractC166997dE.A0q(requireContext2.getResources(), 2131977140);
        Spanned A002 = AbstractC07900bA.A00(requireContext2.getResources(), new Object[]{A0q2}, 2131977139);
        C14360o3.A07(A002);
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(A002);
        AnonymousClass773.A05(A0H2, c2e, A0q2);
        A0N2.setText(A0H2);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C3DN A0m = AbstractC25230BEn.A0m(this);
        if ((A0m != null && ((C3DP) A0m).A0h) || getParentFragmentManager().A0L() <= 0) {
            return false;
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1906600042);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_xar_disclosure, false);
        C0f9.A09(-2130950466, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3DN A00;
        Fragment A09;
        int A02 = C0f9.A02(-259739334);
        super.onResume();
        C3DO c3do = C3DN.A00;
        C3DN A002 = c3do.A00(requireActivity());
        if (A002 != null && ((C3DP) A002).A0h && (A00 = c3do.A00(requireActivity())) != null && (A09 = A00.A09()) != null) {
            ((BottomSheetFragment) A09).A0T(0);
        }
        C0f9.A09(-165188275, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1084157578);
        super.onStart();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00.getValue(), AbstractC111324zv.A00(2504));
        if (A0f.isSampled()) {
            A0f.Cht();
        }
        C0f9.A09(-1110605107, A02);
    }
}
