package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.Lw7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49614Lw7 implements C51D {
    public final /* synthetic */ C47988LJq A00;
    public final /* synthetic */ KDS A01;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    public C49614Lw7(C47988LJq c47988LJq, KDS kds) {
        this.A01 = kds;
        this.A00 = c47988LJq;
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
        C47974LIk c47974LIk = this.A01.A00;
        if (c47974LIk == null) {
            C14360o3.A0F("reactionsPickerController");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A03(c47974LIk.A09);
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        FrameLayout frameLayout = this.A00.A0N;
        if (frameLayout.getVisibility() == 8) {
            frameLayout.setVisibility(0);
        }
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C47988LJq c47988LJq = this.A00;
        int i3 = c47988LJq.A02;
        if (i3 == -1) {
            c47988LJq.A02 = i;
            i3 = i;
        }
        float f = (i3 - i) / i3;
        if (C18U.A06(C06090Tz.A05, c47988LJq.A0Q, 36326738900301886L)) {
            f /= 0.65f;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        float f2 = c47988LJq.A01;
        float f3 = c47988LJq.A00;
        float f4 = f3 + ((f2 - f3) * f);
        c47988LJq.A04(c47988LJq.A0A, f4);
        int height = c47988LJq.A0N.getHeight();
        View view = c47988LJq.A04;
        if (view != null) {
            view.setTranslationY(f4 + height);
        }
        View view2 = c47988LJq.A04;
        if (view2 != null) {
            view2.setAlpha(f);
        }
        c47988LJq.A0R.getView().setAlpha(f);
        c47988LJq.A0L.setAlpha(f);
        if (c47988LJq.A0b || c47988LJq.A0c || c47988LJq.A0d) {
            LKK lkk = c47988LJq.A08;
            if (lkk != null) {
                float f5 = 1.0f - f;
                IgTextView igTextView = lkk.A05;
                if (igTextView != null) {
                    int i4 = lkk.A02;
                    if (i4 == 0) {
                        i4 = igTextView.getHeight();
                        lkk.A02 = i4;
                    }
                    igTextView.setHeight((int) (i4 * f5));
                    igTextView.setAlpha(f5);
                }
            }
            C14360o3.A0F("reactionsTrayController");
            throw C00O.createAndThrow();
        }
        LKK lkk2 = c47988LJq.A08;
        if (lkk2 != null) {
            lkk2.A05(1.0f - f);
            IgSegmentedTabLayout2 igSegmentedTabLayout2 = this.A01.A02;
            if (igSegmentedTabLayout2 != null) {
                igSegmentedTabLayout2.setTranslationY((-f) * i);
                return;
            }
            return;
        }
        C14360o3.A0F("reactionsTrayController");
        throw C00O.createAndThrow();
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
}
