package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EI6 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FeaturedChannelsDisclaimerFragment";
    public int A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.disclaimer_subtitle);
        Context context = A0N.getContext();
        int i = 2131959402;
        if (this.A00 == 1) {
            i = 2131960153;
        }
        AbstractC31173DnH.A12(context, A0N, i);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(390164810);
        super.onCreate(bundle);
        this.A00 = requireArguments().getInt("FeaturedChannelsDisclaimerFragment.ARGUMENT_SUBTITLE_VARIANT", 0);
        C0f9.A09(-970080384, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1924945072);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_featured_channels_disclaimer, viewGroup, false);
        C0f9.A09(-1924655865, A02);
        return inflate;
    }
}
