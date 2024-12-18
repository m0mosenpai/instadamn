package X;

import android.view.View;

/* renamed from: X.P2r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56404P2r implements InterfaceC145226gh {
    public final /* synthetic */ C18920wW A00;
    public final /* synthetic */ OY9 A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void DkJ(View view, int i) {
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

    public C56404P2r(C18920wW c18920wW, OY9 oy9, String str) {
        this.A00 = c18920wW;
        this.A01 = oy9;
        this.A02 = str;
    }

    @Override // X.InterfaceC145226gh
    public final void Cul() {
        OY9.A01(AbstractC166987dD.A0f(this.A00, "ig_add_collaborator_edit_confirmation_impression"), this.A02);
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        OY9.A01(AbstractC166987dD.A0f(this.A00, "ig_add_collaborator_edit_confirmation_dismiss_tap"), this.A02);
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

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
