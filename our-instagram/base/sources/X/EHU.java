package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EHU extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CloudMediaMaxVideoLengthBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1360077531);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.cloud_media_max_video_length_bottomsheet, viewGroup, false);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.bottom_text);
        AbstractC010103p.A07(A0e);
        AbstractC25227BEk.A11(A0e);
        Context requireContext = requireContext();
        String A0v = AbstractC25227BEk.A0v(this, 2131956278);
        String A0v2 = AbstractC25227BEk.A0v(this, 2131956280);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0v);
        AnonymousClass773.A05(A0H, new Em0(requireContext, this, AbstractC31174DnI.A02(requireContext)), A0v2);
        A0e.setText(A0H);
        C0f9.A09(709838614, A02);
        return inflate;
    }
}
