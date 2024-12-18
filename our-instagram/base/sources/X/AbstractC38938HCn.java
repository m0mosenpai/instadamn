package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.HCn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38938HCn extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "VariantSelectorFragment";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void A01(JGT jgt) {
        if (this instanceof HZ8) {
            ((HZ8) this).A00.A02 = jgt;
        } else {
            if (this instanceof HZ9) {
                ((HZ9) this).A01.A00 = jgt;
                return;
            }
            HZA hza = (HZA) this;
            hza.A02.A00 = jgt;
            hza.A03.A00 = jgt;
        }
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
        if (this instanceof HZ8) {
            return true;
        }
        if (this instanceof HZ9) {
            if (((HZ9) this).A00 != null) {
                return !r1.canScrollVertically(-1);
            }
            return false;
        }
        HZA hza = (HZA) this;
        RecyclerView recyclerView = hza.A00;
        if (recyclerView != null && !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        RecyclerView recyclerView2 = hza.A01;
        if (recyclerView2 != null && !recyclerView2.canScrollVertically(-1)) {
            return true;
        }
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
}
