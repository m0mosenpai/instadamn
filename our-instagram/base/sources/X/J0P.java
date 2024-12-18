package X;

/* loaded from: classes7.dex */
public final class J0P implements C51D {
    public final C39447HbZ A00;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean includeFragmentDragSpace() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final boolean useCustomScrollDetermination() {
        return true;
    }

    @Override // X.C51D
    public final EnumC27385C6o backPressDestination() {
        return this.A00.A05;
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        C39447HbZ c39447HbZ = this.A00;
        if (c39447HbZ.A0B && !c39447HbZ.A0A) {
            return true;
        }
        return false;
    }

    @Override // X.C51E
    public final boolean doNotDragWhenDismissLocked() {
        C39447HbZ c39447HbZ = this.A00;
        if (c39447HbZ.A0B && !c39447HbZ.A0A) {
            return true;
        }
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
    public final double getDragUpReleaseRatio() {
        return this.A00.A00;
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
        return false;
    }

    public J0P(C39447HbZ c39447HbZ) {
        this.A00 = c39447HbZ;
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
