package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.N4o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52116N4o extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TieredWarningBottomSheetFragmentImpl";
    public C54591O9s A00;
    public UserSession A01;
    public boolean A02 = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "tiered_warning";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    public static void A00(C52116N4o c52116N4o) {
        C3DN A01 = C3DN.A00.A01(c52116N4o.requireContext());
        C189478aR A00 = F86.A00(A01);
        if (c52116N4o.A02 && A00 != null) {
            A00.A0T();
        } else {
            if (A01 == null) {
                return;
            }
            A01.A0B();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1763495137);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A02 = AbstractC31172DnG.A1X(requireArguments(), "is_launched_from_bottom_sheet");
        C0f9.A09(-1565375685, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-689921749);
        View inflate = layoutInflater.inflate(R.layout.tiered_warning_bottom_sheet, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.consequences_row_0);
        TextView A0e = AbstractC166987dD.A0e(requireViewById, R.id.consequence_text);
        Context requireContext = requireContext();
        String string = requireContext.getString(2131975571);
        String string2 = requireContext.getString(2131975568);
        if (string.contains(string2)) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
            i = R.attr.igds_color_link;
            AnonymousClass773.A05(A0H, new NY0(Integer.valueOf(AbstractC31174DnI.A02(requireContext)), this, 31), string2);
            if (A0e != null) {
                AbstractC31176DnK.A1G(A0e, A0H);
                A0e.setHighlightColor(R.color.fds_transparent);
            }
        } else {
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(string2);
            i = R.attr.igds_color_link;
            A0H2.setSpan(new NY0(Integer.valueOf(AbstractC31174DnI.A02(requireContext)), this, 32), 0, A0H2.length(), 18);
            if (A0e != null) {
                AbstractC25227BEk.A11(A0e);
                A0e.setText(AbstractC31178DnM.A09(getString(2131975572), A0H2).append((CharSequence) "."));
            }
        }
        ImageView A08 = AbstractC31171DnF.A08(requireViewById, R.id.consequence_icon);
        if (A08 != null) {
            A08.setImageResource(R.drawable.instagram_shield_pano_outline_24);
        }
        View requireViewById2 = inflate.requireViewById(R.id.consequences_row_1);
        TextView A0e2 = AbstractC166987dD.A0e(requireViewById2, R.id.consequence_text);
        if (A0e2 != null) {
            A0e2.setText(2131975569);
        }
        ImageView A082 = AbstractC31171DnF.A08(requireViewById2, R.id.consequence_icon);
        if (A082 != null) {
            A082.setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
        }
        View requireViewById3 = inflate.requireViewById(R.id.consequences_row_2);
        TextView A0e3 = AbstractC166987dD.A0e(requireViewById3, R.id.consequence_text);
        if (A0e3 != null) {
            A0e3.setText(2131975570);
        }
        ImageView A083 = AbstractC31171DnF.A08(requireViewById3, R.id.consequence_icon);
        if (A083 != null) {
            A083.setImageResource(R.drawable.instagram_warning_pano_outline_24);
        }
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.let_us_know_footer);
        Context requireContext2 = requireContext();
        SpannableStringBuilder A0H3 = AbstractC25225BEi.A0H(getString(2131975573));
        A0H3.setSpan(new NY0(Integer.valueOf(AbstractC31173DnH.A03(requireContext2, requireContext(), i)), this, 30), 0, A0H3.length(), 18);
        AbstractC25227BEk.A11(A0T);
        A0T.setHighlightColor(MSX.A02(requireContext2));
        A0T.setText(AbstractC31178DnM.A09(getString(2131975574), A0H3).append((CharSequence) "."));
        ((C64P) inflate.requireViewById(R.id.tiered_warning_bottom_button)).setPrimaryActionOnClickListener(new ViewOnClickListenerC55463OkI(this, 25));
        C0f9.A09(702637055, A02);
        return inflate;
    }
}
