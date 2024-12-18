package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.KCv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45506KCv extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC189488aT, C51D {
    public static final String __redex_internal_original_name = "ClipsMusicMiniEditorFragment";
    public C8BU A00;
    public AudioOverlayTrack A01;
    public C189988bH A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final boolean A06 = true;
    public final int A05 = -2;

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_music_mini_editor";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        AnonymousClass878 anonymousClass878 = new AnonymousClass878(requireContext, AbstractC166987dD.A0r(interfaceC09390do), this, AbstractC43594JPz.A0h(requireContext(), interfaceC09390do), new C49522Lub(this, 1));
        C49520LuZ c49520LuZ = new C49520LuZ(this, 0);
        C189988bH c189988bH = new C189988bH(AbstractC167007dF.A0M(view, R.id.clips_music_editor_stub), new C9B8(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 3, 1, false), this, AbstractC166987dD.A0r(interfaceC09390do), null, c49520LuZ, C8BO.A06, 0, false, false, false, true, false, false);
        this.A02 = c189988bH;
        c189988bH.A0b = anonymousClass878;
        if (this.A03) {
            AudioOverlayTrack audioOverlayTrack = this.A01;
            if (audioOverlayTrack != null) {
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    c189988bH.A0K(musicAssetModel, audioOverlayTrack.A03, false);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    AbstractC31172DnG.A1F(AbstractC166997dE.A0N(this), layoutParams, R.dimen.album_preview_view_width);
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C14360o3.A0F("currentAudioOverlayTrack");
            throw C00O.createAndThrow();
        }
        AudioOverlayTrack audioOverlayTrack2 = this.A01;
        if (audioOverlayTrack2 != null) {
            MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
            if (musicAssetModel2 != null) {
                c189988bH.A0L(musicAssetModel2, false);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                AbstractC31172DnG.A1F(AbstractC166997dE.A0N(this), layoutParams2, R.dimen.album_preview_view_width);
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        C14360o3.A0F("currentAudioOverlayTrack");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return this.A05;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
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
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
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

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return this.A06;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C189988bH c189988bH = this.A02;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        return c189988bH.A0M();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C189988bH c189988bH = this.A02;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0G();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
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
        boolean z;
        AudioOverlayTrack audioOverlayTrack;
        int A02 = C0f9.A02(1939575303);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_existing_track");
        } else {
            z = false;
        }
        this.A03 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (audioOverlayTrack = (AudioOverlayTrack) bundle3.getParcelable("selected_audio_track")) != null) {
            this.A01 = audioOverlayTrack;
            C0f9.A09(386308483, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(823140698, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1118940333);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_clips_music_editor, false);
        C0f9.A09(1348974704, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1638953267);
        super.onPause();
        C189988bH c189988bH = this.A02;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0I();
        C0f9.A09(1051460641, A02);
    }
}
