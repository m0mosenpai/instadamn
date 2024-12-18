package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.CxD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29380CxD implements C51D {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ Boolean A01;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C29380CxD(UserDetailFragment userDetailFragment, Boolean bool) {
        this.A00 = userDetailFragment;
        this.A01 = bool;
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return !this.A01.booleanValue();
    }

    @Override // X.C51E
    public final boolean doNotDragWhenDismissLocked() {
        return !this.A01.booleanValue();
    }

    @Override // X.C51E
    public final boolean doNotFlingWhenDismissLocked() {
        return !this.A01.booleanValue();
    }

    @Override // X.C51E
    public final double getSwipeUpDistanceAdjustment() {
        return Double.valueOf(C18U.A00(C06090Tz.A06, this.A00.A0I, 37164940424118654L)).doubleValue();
    }

    @Override // X.C51E
    public final float getSwipeUpFlingVelocity() {
        return Double.valueOf(C18U.A00(C06090Tz.A06, this.A00.A0I, 37164940423987581L)).floatValue();
    }

    @Override // X.C51D
    public final EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A04;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }
}
