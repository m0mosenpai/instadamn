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
public final class EHe extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SeparateSequenceIntroductionNuxBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "SEPARATE_SEQUENCE_INTRODUCTION_NUX_BOTTOM_SHEET_FRAGMENT";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.new_remix_introduction_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_sequence_refresh);
        igdsHeadline.setHeadline(2131964630);
        igdsHeadline.setBody(2131964629);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        Resources resources = A0L.getResources();
        C35228FgL A01 = C35228FgL.A01(A0L, true);
        A01.A04(resources.getString(2131964626), resources.getString(2131964625), R.drawable.instagram_remix_sequential_pano_outline_24);
        A01.A04(resources.getString(2131964624), resources.getString(2131964623), R.drawable.instagram_camera_pano_outline_24);
        C35228FgL.A02(A01, igdsHeadline, resources.getString(2131964628), resources.getString(2131964627), R.drawable.instagram_remix_pano_outline_24);
        C64P c64p = (C64P) AbstractC166987dD.A0c(view, R.id.new_remix_introduction_bottom_buttons);
        c64p.setDividerVisible(true);
        c64p.setPrimaryActionText(requireContext().getString(2131964631));
        c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35679FpE.A00(this, 48));
        c64p.setSecondaryButtonEnabled(false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1828162663);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        C0f9.A09(144287494, A02);
        return inflate;
    }
}
