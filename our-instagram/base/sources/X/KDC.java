package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes8.dex */
public final class KDC extends AbstractC59962oe implements InterfaceC189488aT, C51D, JHC {
    public static final String __redex_internal_original_name = "WallMusicTrackEditorFragment";
    public C47466Kxv A00;
    public C189988bH A01;
    public final InterfaceC09390do A03 = C1XM.A00(new DGU(this, 37));
    public final InterfaceC09390do A04 = C1XM.A00(new DGU(this, 38));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

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
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(new ViewOnClickListenerC48073LPy(this, 68), AbstractC31176DnK.A0C(requireView(), R.id.music_editor_action_bar_container)).A0X(new C48227LWc(this, 5));
        InterfaceC09390do interfaceC09390do = this.A03;
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) interfaceC09390do.getValue();
        this.A04.getValue();
        MusicAssetModel musicAssetModel = ((AudioOverlayTrack) interfaceC09390do.getValue()).A08;
        if (musicAssetModel != null) {
            int i = musicAssetModel.A00;
            int i2 = 30000;
            if (30000 > i) {
                i2 = i;
            }
            audioOverlayTrack.A02 = i2;
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do2 = this.A02;
            AnonymousClass878 anonymousClass878 = new AnonymousClass878(requireContext, AbstractC166987dD.A0r(interfaceC09390do2), null, AbstractC43594JPz.A0h(requireContext(), interfaceC09390do2), new C49522Lub(this, 7));
            C189988bH c189988bH = new C189988bH((ViewStub) AbstractC166997dE.A0S(view, R.id.music_editor_stub), new C9B8(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), this, AbstractC166987dD.A0r(interfaceC09390do2), null, new C49520LuZ(this, 5), C8BO.A09, 0, false, false, false, true, false, false);
            this.A01 = c189988bH;
            c189988bH.A0b = anonymousClass878;
            MusicAssetModel musicAssetModel2 = ((AudioOverlayTrack) interfaceC09390do.getValue()).A08;
            if (musicAssetModel2 != null) {
                c189988bH.A0L(musicAssetModel2, false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(AudioOverlayTrack audioOverlayTrack, KDC kdc) {
        String str;
        C189988bH c189988bH = kdc.A01;
        AudioOverlayTrack audioOverlayTrack2 = null;
        if (c189988bH == null) {
            str = "musicOverlayEditController";
        } else {
            c189988bH.A0G();
            C47466Kxv c47466Kxv = kdc.A00;
            if (c47466Kxv == null) {
                str = "delegate";
            } else {
                if (audioOverlayTrack != null) {
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    if (musicAssetModel != null) {
                        audioOverlayTrack2 = new AudioOverlayTrack(musicAssetModel, audioOverlayTrack.A03, audioOverlayTrack.A02);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                c47466Kxv.A00.invoke(audioOverlayTrack2);
                AbstractC25226BEj.A1Q(kdc);
                return;
            }
        }
        C14360o3.A0F(str);
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
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.JHC
    public final void DUd() {
        C189988bH c189988bH = this.A01;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0H();
    }

    @Override // X.JHC
    public final void DUe() {
        C189988bH c189988bH = this.A01;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0G();
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
        return AbstractC166987dD.A0n(this.A02);
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
    public final void onBottomSheetClosed() {
        C189988bH c189988bH = this.A01;
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-224582252);
        C14360o3.A0B(layoutInflater, 0);
        if (!C1H6.A03()) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.fragment_profile_music_editor, false);
        C0f9.A09(1806223958, A02);
        return A0C;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1434744202);
        super.onPause();
        C189988bH c189988bH = this.A01;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0I();
        C0f9.A09(-857461027, A02);
    }
}
