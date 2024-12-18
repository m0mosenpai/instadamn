package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.igeditseekbar.IgVerticalChunkySlider;

/* loaded from: classes9.dex */
public final class N6W extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "ClipsAudioEnhanceFragment";
    public IgTextView A00;
    public IgVerticalChunkySlider A01;
    public IgTextView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A06;
    public final String A07;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C57523Pfx.A00(this, 19), C57523Pfx.A00(this, 18), new C57256Pbe(8, null, this), AbstractC25225BEi.A1D(ClipsCreationViewModel.class));
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(C57523Pfx.A00(this, 20), C57523Pfx.A00(this, 17), new C57256Pbe(9, null, this), AbstractC25225BEi.A1D(C8BE.class));

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        float f;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C8BE) this.A04.getValue()).A06(C05F.A1F);
        InterfaceC09390do interfaceC09390do = this.A03;
        ((C50986Mft) interfaceC09390do.getValue()).A00();
        C50986Mft c50986Mft = (C50986Mft) interfaceC09390do.getValue();
        if (C18U.A06(C06090Tz.A06, c50986Mft.A01, 36330329492964156L)) {
            c50986Mft.A00.A00();
        }
        IgVerticalChunkySlider igVerticalChunkySlider = (IgVerticalChunkySlider) view.findViewById(R.id.audio_enhance_slider);
        this.A01 = igVerticalChunkySlider;
        if (igVerticalChunkySlider != null) {
            C56782PHz.A01(igVerticalChunkySlider, this, 2);
            IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.done_button);
            this.A02 = A0Y;
            if (A0Y == null) {
                str = "doneButton";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            ViewOnClickListenerC55457OkB.A01(A0Y, 26, this);
            this.A00 = AbstractC31172DnG.A0Y(view, R.id.description);
            C50986Mft c50986Mft2 = (C50986Mft) interfaceC09390do.getValue();
            IgVerticalChunkySlider igVerticalChunkySlider2 = this.A01;
            if (igVerticalChunkySlider2 != null) {
                C190178bb c190178bb = (C190178bb) c50986Mft2.A02.A0b.getValue();
                if (c190178bb != null) {
                    f = c190178bb.A00;
                } else {
                    f = 0.0f;
                }
                igVerticalChunkySlider2.setCurrentValue((int) (f * 100.0f));
                JQ0.A11(this, new PYw(this, null, 13), c50986Mft2.A05);
                return;
            }
        }
        str = "slider";
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
        return this.A07;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
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
        float f;
        C22C A0T = AbstractC43593JPy.A0T(this.A06);
        A0T.A1R(((C22F) A0T).A04.A0C, "AUDIO_ENHANCE_DONE_BUTTON_TAP");
        C50986Mft c50986Mft = (C50986Mft) this.A03.getValue();
        ClipsAudioStore clipsAudioStore = c50986Mft.A02;
        Number number = (Number) c50986Mft.A03.A0I.A02();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        clipsAudioStore.A07(f);
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N6W() {
        C57523Pfx A00 = C57523Pfx.A00(this, 16);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57523Pfx.A00(C57523Pfx.A00(this, 21), 22));
        this.A03 = AbstractC25225BEi.A0a(C57523Pfx.A00(A002, 23), A00, new C57256Pbe(10, null, A002), AbstractC25225BEi.A1D(C50986Mft.class));
        this.A07 = "clips_audio_enhance";
        this.A06 = AbstractC60492pY.A02(this);
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
        int A02 = C0f9.A02(-419878051);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_enhance_fragment, viewGroup, false);
        C0f9.A09(582017020, A02);
        return inflate;
    }
}
