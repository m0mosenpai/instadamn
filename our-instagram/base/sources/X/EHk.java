package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EHk extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReuseControlsIntroductionBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "REUSE_CONTROLS_INTRODUCTION_BOTTOM_SHEET_FRAGMENT";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.new_remix_introduction_headline);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        Resources resources = A0L.getResources();
        Boolean A0b = AbstractC166997dE.A0b();
        C35228FgL A00 = C35228FgL.A00(A0L, A0b);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_reuse_refresh);
        igdsHeadline.setHeadline(2131961987);
        A00.A04(null, resources.getString(2131961982), R.drawable.instagram_sticker_pano_outline_24);
        A00.A04(null, resources.getString(2131961984), R.drawable.instagram_remix_pano_outline_24);
        C35228FgL.A02(A00, igdsHeadline, null, resources.getString(2131961986), R.drawable.instagram_settings_pano_outline_24);
        InterfaceC09390do interfaceC09390do = this.A00;
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        AbstractC31171DnF.A1S(A0l, A0b, A0l.A4o, C23031Ai.A8c, 330);
        C37855Gl9.A06(AbstractC166987dD.A0r(interfaceC09390do));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(574087702);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        C0f9.A09(-1116891010, A02);
        return inflate;
    }
}
