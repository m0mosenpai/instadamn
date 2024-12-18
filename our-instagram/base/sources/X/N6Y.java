package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes9.dex */
public final class N6Y extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "VoiceEffectsTabFragment";
    public ImageView A01;
    public ClipsCreationViewModel A02;
    public C51159Mj2 A03;
    public C87H A04;
    public String A05;
    public final InterfaceC09390do A08 = AbstractC25225BEi.A0a(new B5y(this, 17), new B5y(this, 16), new C57256Pbe(35, null, this), AbstractC25225BEi.A1D(C87D.class));
    public int A00 = 2131953309;
    public final InterfaceC09390do A07 = AbstractC25225BEi.A0a(new B5y(this, 18), new B5y(this, 15), new C57256Pbe(36, null, this), AbstractC25225BEi.A1D(C8BE.class));
    public final String A06 = "postcap_voice_effects_tab";
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        Bundle requireArguments = requireArguments();
        this.A05 = requireArguments.getString("args_camera_session_id", "");
        this.A00 = requireArguments.getInt("args_audio_hub_tab_text", -1);
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C8BE) this.A07.getValue()).A06(C05F.A15);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.voice_effects_grid_recyclerview);
        AbstractC50523MSb.A0r(this, A0G);
        C51159Mj2 c51159Mj2 = this.A03;
        if (c51159Mj2 == null) {
            str = "voiceEffectsGridAdapter";
        } else {
            A0G.setAdapter(c51159Mj2);
            ViewOnClickListenerC55460OkF.A00(view.requireViewById(R.id.vfx_done_button), 22, this);
            View A0c = AbstractC166987dD.A0c(view, R.id.voice_effects_tab_description);
            AbstractC31180DnO.A1F(getViewLifecycleOwner(), AbstractC31172DnG.A0E(((C87D) this.A08.getValue()).A01.A0k), new BAO(47, A0c, this), 63);
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.vfx_play_pause_button);
            this.A01 = A0I;
            if (A0I == null) {
                str = "buttonPlayPause";
            } else {
                ViewOnClickListenerC55460OkF.A00(A0I, 23, this);
                C87H c87h = this.A04;
                if (c87h == null) {
                    str = "videoPlaybackViewModel";
                } else {
                    AbstractC31180DnO.A1F(getViewLifecycleOwner(), c87h.A0A, C57747Pja.A00(this, 47), 63);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
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
        return AbstractC166987dD.A0n(this.A09);
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C87H c87h = this.A04;
        if (c87h == null) {
            C14360o3.A0F("videoPlaybackViewModel");
            throw C00O.createAndThrow();
        }
        c87h.A03();
        return false;
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
        Integer num;
        String str;
        int A02 = C0f9.A02(1156550913);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A02 = (ClipsCreationViewModel) AbstractC50522MSa.A0K(this, requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        EnumC192868gS[] values = EnumC192868gS.values();
        ClipsCreationViewModel clipsCreationViewModel = this.A02;
        if (clipsCreationViewModel == null) {
            str = "clipsCreationViewModel";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C19270xB A0D = AbstractC31171DnF.A0D(this.A06);
            String str2 = this.A05;
            if (str2 == null) {
                str = "cameraSessionId";
            } else {
                int i = this.A00;
                if (i == 2131953306) {
                    num = C05F.A00;
                } else if (i == 2131953307) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
                this.A03 = new C51159Mj2(A0D, A0r, clipsCreationViewModel, num, str2, values);
                this.A04 = MSZ.A0Z(AbstractC31175DnJ.A0A(this), C87G.class);
                C0f9.A09(668090893, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2076522277);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_voice_effects_tab_fragment, false);
        C0f9.A09(-2028485866, A02);
        return A0R;
    }
}
