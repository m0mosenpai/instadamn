package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;

/* renamed from: X.HBg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38909HBg extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "HiddenWordsBottomSheetFragment";
    public JG8 A00;
    public boolean A01;
    public boolean A02;
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "hidden_words_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C3DN A0r;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.hidden_words_text_input);
        A0N.requestFocus();
        AbstractC13880nE.A0R(A0N);
        View A0S = AbstractC166997dE.A0S(view, R.id.hidden_words_hide_button);
        ViewOnClickListenerC42034Ik3.A00(A0S, 23, A0N, this);
        A0N.addTextChangedListener(new C35468Fl3(5, this, A0S));
        FragmentActivity activity = getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            ((C3DP) A0r).A0H = new C43024J0p(this, 1);
        }
        C1ON A00 = MutedWordsApiUtil.A00(AbstractC166987dD.A0r(this.A04));
        C39030HGg.A00(A00, this, 7);
        schedule(A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(91860963);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.hidden_words_bottom_sheet, viewGroup, false);
        C0f9.A09(-688173611, A02);
        return inflate;
    }
}
