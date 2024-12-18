package X;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bqg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26699Bqg extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AltTextInfoBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "alt_text_info_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-493532842);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.alt_text_info_bottomsheet, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2));
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.alt_text_bottom_sheet_text_view);
        TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.alt_text_bottom_sheet_learn_more_text);
        StringBuilder sb = new StringBuilder(AbstractC166997dE.A0N(this).getString(2131952948));
        sb.append("\n\n");
        sb.append(requireContext().getString(2131952952));
        sb.append("\n\n");
        sb.append(requireContext().getString(2131952949));
        sb.append("\n");
        sb.append(requireContext().getString(2131952950));
        sb.append("\n");
        sb.append(requireContext().getString(2131952951));
        sb.append("\n\n");
        sb.append(requireContext().getString(2131952947));
        sb.append(" ");
        sb.append((CharSequence) Html.fromHtml(AbstractC166997dE.A0N(this).getString(2131952957)));
        String A0v = AbstractC25227BEk.A0v(this, 2131952958);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0v);
        AnonymousClass773.A05(A0H, new C27280C2f(this, AbstractC25233BEq.A04(this)), A0v);
        A0e2.setMovementMethod(C6R6.A00);
        A0e2.setText(A0H);
        ViewOnClickListenerC28667ClF.A01(A0e2, 38, this);
        A0e.setText(sb);
        C0f9.A09(732354658, A02);
        return inflate;
    }
}
