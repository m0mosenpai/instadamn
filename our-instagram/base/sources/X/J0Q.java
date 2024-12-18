package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J0Q implements C51D {
    public final UserSession A00;

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
        if (C18U.A06(C06090Tz.A06, this.A00, 36321537695295031L)) {
            return EnumC27385C6o.A04;
        }
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
    public final double getSwipeUpDistanceAdjustment() {
        return C18U.A00(C06090Tz.A06, this.A00, 37165962625679770L);
    }

    @Override // X.C51E
    public final float getSwipeUpFlingVelocity() {
        return (float) C18U.A00(C06090Tz.A06, this.A00, 37165962625548697L);
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

    public J0Q(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }
}
