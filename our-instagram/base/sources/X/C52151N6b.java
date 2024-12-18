package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.SfxSeekBarView;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.N6b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52151N6b extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "ClipsSFXEditorFragment";
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public RecyclerView A04;
    public ShimmerFrameLayout A05;
    public C51135Mie A06;
    public OA2 A07;
    public SfxSeekBarView A08;
    public C87H A09;
    public C87D A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C = C57521Pfv.A00(this, 46);
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_sound_effects_editor";
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
        ((C8BE) this.A0D.getValue()).A06(C05F.A0u);
        InterfaceC09390do interfaceC09390do = this.A0F;
        C51024MgX c51024MgX = (C51024MgX) interfaceC09390do.getValue();
        C55062OaI.A00(c51024MgX.A00).autoResume();
        C51024MgX.A00(c51024MgX, new NIR(C05F.A01));
        OA2 oa2 = new OA2();
        this.A07 = oa2;
        oa2.A01 = this;
        View requireViewById = view.requireViewById(R.id.clips_sfx_done_button);
        C14360o3.A0A(requireViewById);
        A00(requireViewById, C57747Pja.A00(this, 38));
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.clips_sfx_play_pause_button);
        this.A00 = A0I;
        if (A0I == null) {
            str = "buttonPlayPause";
        } else {
            A00(A0I, C57747Pja.A00(this, 39));
            ImageView A0I2 = AbstractC31173DnH.A0I(view, R.id.clips_sfx_button_undo);
            this.A01 = A0I2;
            str = "buttonUndo";
            if (A0I2 != null) {
                A0I2.setEnabled(false);
                ImageView imageView = this.A01;
                if (imageView != null) {
                    A00(imageView, C57747Pja.A00(this, 40));
                    this.A03 = AbstractC166997dE.A0T(view, R.id.clips_sfx_video_start_time_label);
                    this.A02 = AbstractC166997dE.A0T(view, R.id.clips_sfx_video_end_time_label);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.requireViewById(R.id.shimmer_layout);
                    this.A05 = shimmerFrameLayout;
                    if (shimmerFrameLayout == null) {
                        str = "shimmerEffectLayout";
                    } else {
                        shimmerFrameLayout.A02();
                        this.A04 = AbstractC31172DnG.A0G(view, R.id.clips_sfx_recycler_view);
                        C51135Mie c51135Mie = new C51135Mie(requireContext(), this, this, C16930sl.A00);
                        this.A06 = c51135Mie;
                        RecyclerView recyclerView = this.A04;
                        if (recyclerView == null) {
                            str = "effectsGrid";
                        } else {
                            recyclerView.setAdapter(c51135Mie);
                            recyclerView.A10(new C195638l4(28, false));
                            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 0, false));
                            this.A08 = (SfxSeekBarView) view.requireViewById(R.id.clips_sfx_seek_bar_view);
                            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
                            AbstractC166987dD.A1Z(new C25024B5f(A0Z, null, 44), AbstractC141776au.A00(A0Z));
                            C51024MgX c51024MgX2 = (C51024MgX) interfaceC09390do.getValue();
                            C87D c87d = this.A0A;
                            if (c87d == null) {
                                str = "clipsAudioVolumeViewModel";
                            } else {
                                if (MSY.A00(c87d.A01.A0g) <= 0.0f) {
                                    C51024MgX.A00(c51024MgX2, NIV.A00);
                                }
                                C87H c87h = this.A09;
                                if (c87h != null) {
                                    AbstractC31180DnO.A1F(getViewLifecycleOwner(), c87h.A0A, C57747Pja.A00(this, 36), 62);
                                    C87H c87h2 = this.A09;
                                    if (c87h2 != null) {
                                        AbstractC31180DnO.A1F(getViewLifecycleOwner(), c87h2.A0G, C57747Pja.A00(this, 37), 62);
                                        JQ0.A11(this, PZJ.A01(this, null, 38), ((C51024MgX) interfaceC09390do.getValue()).A06);
                                        JQ0.A11(this, PZJ.A01(this, null, 39), ((C51024MgX) interfaceC09390do.getValue()).A05);
                                        return;
                                    }
                                }
                                C14360o3.A0F("videoPlaybackViewModel");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
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
        AbstractC43593JPy.A0T(this.A0E).A1R(EnumC50631MWs.A0I, "SOUND_EFFECTS_SOUNDBOARD_DONE");
        C51024MgX c51024MgX = (C51024MgX) this.A0F.getValue();
        ClipsAudioStore clipsAudioStore = c51024MgX.A02;
        C01U c01u = c51024MgX.A03;
        ArrayList A0q = AbstractC167017dG.A0q(c01u);
        Iterator<E> it = c01u.iterator();
        while (it.hasNext()) {
            C09530e4 A17 = AbstractC43592JPx.A17(it);
            int A0F = AbstractC25230BEn.A0F(A17);
            C51757Mtg c51757Mtg = (C51757Mtg) A17.A01;
            A0q.add(new C9ZT((C211729Zg) c51757Mtg.A00, c51757Mtg.A02, 1.0f, A0F));
        }
        clipsAudioStore.A09.A02.Egh(A0q);
        C87H c87h = this.A09;
        if (c87h == null) {
            C14360o3.A0F("videoPlaybackViewModel");
            throw C00O.createAndThrow();
        }
        c87h.A01();
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C52151N6b() {
        C57521Pfv c57521Pfv = new C57521Pfv(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B5y(new B5y(this, 0), 1));
        this.A0F = AbstractC25225BEi.A0a(new B5y(A00, 2), c57521Pfv, new C57256Pbe(31, null, A00), AbstractC25225BEi.A1D(C51024MgX.class));
        this.A0D = AbstractC25225BEi.A0a(new C57521Pfv(this, 49), new C57521Pfv(this, 47), new C57256Pbe(30, null, this), AbstractC25225BEi.A1D(C8BE.class));
        this.A0B = C57521Pfv.A00(this, 45);
        this.A0E = AbstractC60492pY.A02(this);
    }

    public static final void A00(View view, InterfaceC16660sJ interfaceC16660sJ) {
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new KKr(interfaceC16660sJ, 0);
        A0s.A02 = 0.9f;
        A0s.A00();
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
        int A02 = C0f9.A02(442660082);
        super.onCreate(bundle);
        setModuleNameV2("clips_sound_effects_editor");
        this.A09 = MSZ.A0Z(AbstractC31175DnJ.A0A(this), new C87G().getClass());
        this.A0A = (C87D) MSW.A0F(AbstractC50522MSa.A0V(this, this.A0E), requireActivity()).A00(C87D.class);
        C0f9.A09(1971071336, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-725284413);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_post_capture_sound_effects_fragment, viewGroup, false);
        C0f9.A09(-905093120, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-841645775);
        super.onDestroyView();
        if (this.A07 == null) {
            C14360o3.A0F("playlistSelectorPopupMenu");
            throw C00O.createAndThrow();
        }
        C0f9.A09(325575307, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1966938949);
        super.onPause();
        ((C51024MgX) this.A0F.getValue()).A00.A01();
        C0f9.A09(319792274, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1009745507);
        super.onResume();
        ((C51024MgX) this.A0F.getValue()).A01();
        C0f9.A09(1375612176, A02);
    }
}
