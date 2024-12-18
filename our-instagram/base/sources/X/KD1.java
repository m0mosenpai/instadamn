package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes8.dex */
public final class KD1 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC189488aT, C51D, JHC {
    public static final String __redex_internal_original_name = "MusicOnProfileMusicEditorFragment";
    public AudioOverlayTrack A00;
    public C189988bH A01;
    public Context A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(new C57528Pg2(this, 4), new C57528Pg2(this, 3), new C57531Pg5(10, null, this), AbstractC25225BEi.A1D(C155476ya.class));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final boolean A07 = true;
    public final String A06 = "music_on_profile_music_editor_sheet";

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
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

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
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
        C56342iS.A01(new ViewOnClickListenerC48073LPy(this, 13), AbstractC31176DnK.A0C(requireView(), R.id.music_editor_action_bar_container)).A0X(new C48227LWc(this, 4));
        AudioOverlayTrack audioOverlayTrack = this.A00;
        if (audioOverlayTrack != null) {
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                int i = musicAssetModel.A00;
                int i2 = 30000;
                if (30000 > i) {
                    i2 = i;
                }
                audioOverlayTrack.A02 = i2;
                Context context = this.A02;
                if (context != null) {
                    InterfaceC09390do interfaceC09390do = this.A05;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    Context context2 = this.A02;
                    if (context2 != null) {
                        AnonymousClass878 anonymousClass878 = new AnonymousClass878(context, A0r, null, AbstractC43594JPz.A0h(context2, interfaceC09390do), new C49522Lub(this, 6));
                        C189988bH c189988bH = new C189988bH((ViewStub) AbstractC166997dE.A0S(view, R.id.music_editor_stub), new C9B8(0, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size, 2, 1, false), this, AbstractC166987dD.A0r(interfaceC09390do), null, new C49520LuZ(this, 4), C8BO.A09, 0, false, false, false, true, false, false);
                        this.A01 = c189988bH;
                        c189988bH.A0b = anonymousClass878;
                        if (this.A03) {
                            AudioOverlayTrack audioOverlayTrack2 = this.A00;
                            if (audioOverlayTrack2 != null) {
                                MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
                                if (musicAssetModel2 != null) {
                                    c189988bH.A0K(musicAssetModel2, audioOverlayTrack2.A03, false);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            AudioOverlayTrack audioOverlayTrack3 = this.A00;
                            if (audioOverlayTrack3 != null) {
                                MusicAssetModel musicAssetModel3 = audioOverlayTrack3.A08;
                                if (musicAssetModel3 != null) {
                                    c189988bH.A0L(musicAssetModel3, false);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                }
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
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
        return this.A07;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C189988bH c189988bH = this.A01;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0G();
        AbstractC53893NsP.A00(AbstractC166987dD.A0r(this.A05));
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
        int A02 = C0f9.A02(-267003067);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireContext();
        this.A03 = requireArguments.getBoolean("is_existing_track");
        this.A00 = (AudioOverlayTrack) AbstractC153636vY.A00(requireArguments, AudioOverlayTrack.class, "selected_audio_track");
        C0f9.A09(1145919330, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1637810603);
        C14360o3.A0B(layoutInflater, 0);
        if (!C1H6.A03()) {
            Context context = this.A02;
            if (context == null) {
                C14360o3.A0F("context");
                throw C00O.createAndThrow();
            }
            layoutInflater = AbstractC43593JPy.A0C(context, layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.fragment_profile_music_editor, false);
        C0f9.A09(412887394, A02);
        return A0C;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-882691741);
        super.onPause();
        C189988bH c189988bH = this.A01;
        if (c189988bH == null) {
            JQ0.A0t();
            throw C00O.createAndThrow();
        }
        c189988bH.A0I();
        C0f9.A09(1891218031, A02);
    }
}
