package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HBu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38922HBu extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsRemixOptionsFragment";
    public ConstraintLayout A00;
    public ConstraintLayout A01;
    public C22P A02;
    public ImageUrl A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A0A;
    public boolean A09 = true;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_remix_options";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ConstraintLayout) view.requireViewById(R.id.clips_remix_extend);
        this.A01 = (ConstraintLayout) view.requireViewById(R.id.clips_remix_together);
        C1DX A0Z = AbstractC31176DnK.A0Z(this.A0B);
        String str = this.A0A;
        if (str == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        C38321qM A02 = A0Z.A02(str);
        View A0S = AbstractC166997dE.A0S(view, R.id.clips_separate_remix_option);
        View A0R = AbstractC166997dE.A0R(view, R.id.clips_separate_sequence_option);
        View A0R2 = AbstractC166997dE.A0R(view, R.id.clips_remix_options_header);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.clips_remix_options_description);
        A0R2.setVisibility(8);
        ConstraintLayout constraintLayout = this.A00;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = this.A01;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        A0S.setVisibility(0);
        A0R.setVisibility(0);
        AbstractC166987dD.A1P(requireContext(), A0N, 2131973320);
        C0fQ.A00(new ViewOnClickListenerC41959Iiq(3, A02, this, false), A0S);
        C0fQ.A00(new ViewOnClickListenerC41959Iiq(3, A02, this, true), A0R);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-196368779);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = AbstractC153636vY.A01(requireArguments, "ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_CONTAINER_MODULE_NAME");
        this.A0A = AbstractC153636vY.A01(requireArguments, "ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_ID");
        requireArguments.getInt("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_INDEX", 0);
        requireArguments.getString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_SOURCE_MEDIA_ID");
        Object obj = requireArguments.get("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_ENTRY_POINT");
        if (obj != null) {
            this.A02 = (C22P) obj;
            this.A07 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ID");
            this.A08 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_NAME");
            this.A06 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ATTRIBUTION_USER_ID");
            if (requireArguments.containsKey("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED")) {
                this.A04 = AbstractC31174DnI.A0n(requireArguments, "ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED");
            }
            this.A03 = (ImageUrl) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_THUMBNAIL_URL");
            this.A09 = requireArguments.getBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_USE_TRANSPARENT_MODAL_ACTIVITY", true);
            C0f9.A09(-1221770769, A02);
            return;
        }
        IllegalArgumentException A0n = AbstractC25227BEk.A0n();
        C0f9.A09(1505895702, A02);
        throw A0n;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1968728194);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_remix_options_fragment, viewGroup, false);
        C0f9.A09(1777777460, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1194747848);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C0f9.A09(-314969586, A02);
    }
}
