package X;

import android.view.View;

/* renamed from: X.Ltq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49477Ltq implements InterfaceC145226gh {
    public final /* synthetic */ L5X A00;
    public final /* synthetic */ L5X A01;
    public final /* synthetic */ C48754LhM A02;
    public final /* synthetic */ C48755LhN A03;

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void Cul() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C49477Ltq(L5X l5x, L5X l5x2, C48754LhM c48754LhM, C48755LhN c48755LhN) {
        this.A03 = c48755LhN;
        this.A00 = l5x;
        this.A01 = l5x2;
        this.A02 = c48754LhM;
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        this.A03.DW3(this.A00);
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC145226gh
    public final void DkJ(View view, int i) {
        AbstractC167007dF.A0J().postDelayed(new M6L(this.A01, this.A00, this.A02, this.A03), 200L);
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
