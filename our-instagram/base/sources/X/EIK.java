package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class EIK extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AISummaryFragment";
    public AnonymousClass693 A00;
    public IgTextView A01;
    public IgImageView A02;
    public final String A04 = "ai_summary_bottom_sheet_fragment";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.summary);
        this.A02 = AbstractC31172DnG.A0Z(view, R.id.loading_animation);
        AnonymousClass693 A00 = C68U.A00(requireContext(), R.raw.gen_ai_loader_write_with_ai_signals_3s_igd);
        this.A00 = A00;
        IgImageView igImageView = this.A02;
        if (igImageView != null) {
            igImageView.setImageDrawable(A00);
        }
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        IgImageView igImageView2 = this.A02;
        if (igImageView2 != null) {
            igImageView2.setVisibility(0);
        }
        AnonymousClass693 anonymousClass693 = this.A00;
        if (anonymousClass693 != null) {
            anonymousClass693.EH1();
            anonymousClass693.E4S();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1194496679);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_ai_summary, false);
        C0f9.A09(-537362064, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(606596446);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(-2050378859, A02);
    }
}
