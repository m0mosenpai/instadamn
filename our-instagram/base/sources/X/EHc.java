package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EHc extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelsCarouselEntrypointNuxFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "REEL_CAROUSEL_ENTRYPOINT_NUX";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean(MSV.A00(386))) {
            AbstractC166997dE.A0S(view, R.id.reels_carousel_entrypoint_public_text).setVisibility(0);
        }
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A00, 0), 36328134764739796L)) {
            IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.reels_carousel_entrypoint_headline);
            A0Q.setHeadline(A0Q.getResources().getString(2131971974));
            TextView A0T = AbstractC166997dE.A0T(view, R.id.reels_carousel_entrypoint_text);
            AbstractC31173DnH.A19(A0T.getResources(), A0T, 2131971972);
        }
        C0fQ.A00(new ViewOnClickListenerC28667ClF(this, 35), AbstractC166997dE.A0S(view, R.id.reels_carousel_entrypoint_bottom_button));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(83059558);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.reels_carousel_entrypoint_nux, viewGroup, false);
        C0f9.A09(571149857, A02);
        return inflate;
    }
}
