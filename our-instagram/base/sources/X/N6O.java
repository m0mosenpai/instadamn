package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* loaded from: classes9.dex */
public final class N6O extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "ClipsPreviewFragment";
    public O2Q A00;
    public InterfaceC58310Pt2 A01;
    public TextureViewSurfaceTextureListenerC55357OiJ A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A03 = "clips_share_sheet_preview_page";
    public final boolean A05 = true;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Integer num = C05F.A00;
        int A02 = MSX.A02(requireContext());
        int color = requireContext().getColor(AbstractC53242c7.A0A(getContext()));
        Drawable drawable = requireContext().getDrawable(R.drawable.clips_viewer_action_bar_gradient_background);
        interfaceC56362iU.Efu(2131956896);
        interfaceC56362iU.EkT(new ViewOnClickListenerC55462OkH(this, 47), true);
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, drawable, null, null, num, color, A02, -2, -2, -2, -2, -2, false));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String A01 = AbstractC153636vY.A01(requireArguments, "ClipsConstants.ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID");
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_CAPTION_PREVIEW");
        C47Z A03 = C25A.A00(AbstractC166987dD.A0r(this.A04)).A03(AbstractC31173DnH.A0k(requireArguments, "ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"));
        ViewOnClickListenerC55462OkH.A01(AbstractC166997dE.A0S(view, R.id.save_draft_button), 48, this);
        ViewOnClickListenerC55462OkH.A01(view.requireViewById(R.id.share_button), 49, this);
        C60842q8 A0a = AbstractC25225BEi.A0a(C57522Pfw.A00(this, 6), new ME3(A01, this, 29), MSW.A1G(this, null, 7), AbstractC25225BEi.A1D(ClipsSharingDraftViewModel.class));
        C0YZ A1D = AbstractC25225BEi.A1D(C44466JlY.class);
        C60842q8 A0a2 = AbstractC25225BEi.A0a(C57522Pfw.A00(this, 7), C57522Pfw.A00(this, 8), MSW.A1G(this, null, 8), A1D);
        View A0S = AbstractC166997dE.A0S(view, R.id.clips_viewer_media_info);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((ClipsSharingDraftViewModel) A0a.getValue()).A00, new MIV(this, A0S, A03, view, A0a2, string, 0), 22);
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A05;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C22C A0T = AbstractC43593JPy.A0T(this.A04);
        String str = this.A03;
        C448124l c448124l = A0T.A09;
        C14360o3.A0B(str, 0);
        C25531Mh A0G = MSW.A0G(c448124l);
        if (AbstractC25226BEj.A1Z(A0G)) {
            MSW.A1W(A0G);
            MSZ.A1I(A0G, c448124l, "PREVIEW_BACK_TO_SHARE_SHEET_BUTTON");
            C22M c22m = c448124l.A04;
            AbstractC167007dF.A14(A0G, c22m);
            MSW.A1P(EnumC50631MWs.A0L, A0G);
            A0G.A0m(str);
            JQ0.A1C(A0G, c22m);
            AbstractC167017dG.A1D(A0G);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1250953920);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_preview_fragment, viewGroup, false);
        C0f9.A09(2053339048, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C55208OeM c55208OeM;
        int A02 = C0f9.A02(-658843191);
        super.onPause();
        TextureViewSurfaceTextureListenerC55357OiJ textureViewSurfaceTextureListenerC55357OiJ = this.A02;
        if (textureViewSurfaceTextureListenerC55357OiJ != null && (c55208OeM = textureViewSurfaceTextureListenerC55357OiJ.A00) != null) {
            c55208OeM.A05();
        }
        C0f9.A09(-1799036661, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C55208OeM c55208OeM;
        int A02 = C0f9.A02(-1572808784);
        super.onResume();
        TextureViewSurfaceTextureListenerC55357OiJ textureViewSurfaceTextureListenerC55357OiJ = this.A02;
        if (textureViewSurfaceTextureListenerC55357OiJ != null && (c55208OeM = textureViewSurfaceTextureListenerC55357OiJ.A00) != null) {
            c55208OeM.A06();
        }
        AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A04), false, false);
        C0f9.A09(1999684667, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1183768467);
        super.onStop();
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A04), false, false);
        C0f9.A09(124086339, A02);
    }
}
