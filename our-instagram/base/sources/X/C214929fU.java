package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: X.9fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214929fU extends AbstractC59962oe implements C51D, InterfaceC186098Nd {
    public static final String __redex_internal_original_name = "ClipsAssetHubMemeBackgroundSelectionFragment";
    public C48596LeY A01;
    public ClipsAssetHubViewModel A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC11380iw A04 = new C23589Acj(this);
    public int A00 = 15000;

    @Override // X.InterfaceC186098Nd
    public final void D92() {
    }

    @Override // X.InterfaceC186098Nd
    public final void D93(Medium medium, Integer num) {
    }

    @Override // X.InterfaceC186098Nd
    public final void DSY(Medium medium) {
        C14360o3.A0B(medium, 0);
        if (medium.Cff() && medium.A03 < this.A00) {
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A04();
            c146106i8.A02();
            c146106i8.A04 = requireContext().getDrawable(R.drawable.instagram_info_pano_outline_24);
            c146106i8.A0J = true;
            c146106i8.A0D = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), new BigDecimal(this.A00 / 1000.0f).setScale(1, RoundingMode.CEILING).toString(), 2131955259);
            AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
            return;
        }
        ClipsAssetHubViewModel clipsAssetHubViewModel = this.A02;
        if (clipsAssetHubViewModel == null) {
            C14360o3.A0F("clipsAssetHubViewModel");
            throw C00O.createAndThrow();
        }
        clipsAssetHubViewModel.A02 = true;
        AbstractC166987dD.A1Z(new C25023B5e(medium, clipsAssetHubViewModel, null, 6), AbstractC141776au.A00(clipsAssetHubViewModel));
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    @Override // X.C51E
    public final boolean doNotDragWhenDismissLocked() {
        return true;
    }

    @Override // X.C51E
    public final boolean doNotFlingWhenDismissLocked() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_asset_hub_meme_background_selection";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(view, R.id.clips_asset_hub_meme_background_selection_gallery_stub);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        C08790ch A00 = AbstractC018607g.A00(this);
        requireContext().getColor(R.color.grey_9);
        int width = AbstractC58002lE.A01(requireContext()).getWidth();
        C48596LeY c48596LeY = new C48596LeY(requireActivity, requireContext, viewStub, A00, interfaceC11380iw, A0r, this, C05F.A02, Integer.valueOf(this.A00), width, true, false);
        this.A01 = c48596LeY;
        c48596LeY.E2K();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        C48596LeY c48596LeY = this.A01;
        if (c48596LeY == null) {
            C14360o3.A0F("cutoutStickerGalleryController");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A03(c48596LeY.A0G);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1406456485);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("selected_cutout_sticker_duration");
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A0C(requireActivity, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
            Application application = requireActivity().getApplication();
            C14360o3.A07(application);
            this.A02 = (ClipsAssetHubViewModel) new C52942bb(new C86V(application, AbstractC166987dD.A0r(this.A03)), requireActivity).A00(ClipsAssetHubViewModel.class);
            C0f9.A09(550149673, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(310480617, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1203969289);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_asset_hub_meme_background_selection_fragment_layout, viewGroup, false);
        C0f9.A09(1963258581, A02);
        return inflate;
    }
}
