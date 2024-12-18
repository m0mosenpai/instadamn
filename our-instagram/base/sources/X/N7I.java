package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;

/* loaded from: classes9.dex */
public final class N7I extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "SavedAudioCreationGalleryFragment";
    public View A00;
    public MYT A01;
    public InterfaceC57964PnA A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public boolean A03 = true;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "saved_audio_creation_gallery";
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
        this.A00 = view.findViewById(R.id.audio_loading_spinner);
        A00(this, C50535MSo.A02("bookmarked", ""));
    }

    public static final void A00(N7I n7i, MusicBrowseCategory musicBrowseCategory) {
        UserSession A0r = AbstractC166987dD.A0r(n7i.A04);
        MusicProduct musicProduct = MusicProduct.A06;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        EnumC1810381f enumC1810381f = EnumC1810381f.A03;
        MYT A00 = AbstractC54062NvM.A00(C8BN.PRE_CAPTURE, EnumC50631MWs.A0J, of, null, musicProduct, A0r, null, musicBrowseCategory, null, enumC1810381f, "", null, "full_list", null, 0, false, false);
        n7i.A01 = A00;
        InterfaceC57964PnA interfaceC57964PnA = n7i.A02;
        if (interfaceC57964PnA != null) {
            A00.A05 = interfaceC57964PnA;
        }
        C14240no A0F = AbstractC43593JPy.A0F(n7i);
        MYT myt = n7i.A01;
        if (myt == null) {
            C14360o3.A0F("musicOverlayBrowseResultsFragment");
            throw C00O.createAndThrow();
        }
        A0F.A0A(myt, R.id.audio_list_fragment_container);
        A0F.A00();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = n7i.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCP(viewLifecycleOwner, musicBrowseCategory, n7i, c07s, null, 42), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
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
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
        MYT myt = this.A01;
        if (myt == null) {
            C14360o3.A0F("musicOverlayBrowseResultsFragment");
            throw C00O.createAndThrow();
        }
        return myt.isScrolledToTop();
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
        int A02 = C0f9.A02(1923875656);
        super.onCreate(bundle);
        setDayNightMode(EnumC60792q3.A03);
        C0f9.A09(-1191135600, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1681949162);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.saved_audio_creation_gallery_fragment_layout, viewGroup, false);
        C0f9.A09(299586766, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1952557115);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(1844949794, A02);
    }
}
