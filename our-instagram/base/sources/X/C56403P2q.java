package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P2q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56403P2q implements InterfaceC145226gh {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void Cul() {
    }

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

    public C56403P2q(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        String str;
        UserSession userSession = this.A00;
        boolean z = this.A01;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (z) {
            str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
        } else {
            str = "EXIT_DIALOG_CANCEL";
        }
        A01.A1m(str);
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
