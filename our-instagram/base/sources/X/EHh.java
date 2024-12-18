package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EHh extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectInviteModelThreadNuxFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_INVITE_MODEL_NUX";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.nux_headline);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_profile_share_refresh);
        igdsHeadline.setHeadline(2131959731);
        igdsHeadline.setBody(2131959730);
        C35228FgL A00 = C35228FgL.A00(A0L, AbstractC166997dE.A0b());
        A00.A04(A0L.getString(2131959728), null, R.drawable.instagram_mail_pano_outline_24);
        C35228FgL.A02(A00, igdsHeadline, A0L.getString(2131959729), null, R.drawable.instagram_direct_pano_outline_24);
        C64P c64p = (C64P) AbstractC166987dD.A0c(view, R.id.nux_bottom_button);
        c64p.setPrimaryActionText(A0L.getString(2131968948));
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC35666Fp0(this, 62));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1893216913);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.invite_model_nux_headline, viewGroup, false);
        C0f9.A09(-1372114237, A02);
        return inflate;
    }
}
