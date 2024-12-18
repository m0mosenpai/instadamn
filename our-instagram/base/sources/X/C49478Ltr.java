package X;

import android.view.View;

/* renamed from: X.Ltr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49478Ltr implements InterfaceC145226gh, C51D, C51E {
    public final int A00;
    public final Object A01;

    public C49478Ltr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void Cul() {
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        switch (this.A00) {
            case 0:
                ((C48757LhP) this.A01).A05.D01();
                return;
            case 1:
                return;
            case 2:
                AbstractC56932jR.A06((View) this.A01, 500L);
                return;
            default:
                C45510KCz.A03((C45510KCz) this.A01).A05(true);
                return;
        }
    }

    @Override // X.InterfaceC145226gh
    public final void DkJ(View view, int i) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 1);
                ((C48757LhP) this.A01).A05.D01();
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                if (i == 0) {
                    return;
                }
                C45510KCz.A03((C45510KCz) this.A01).A05(true);
                return;
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        switch (this.A00) {
            case 1:
            case 2:
                return false;
            default:
                return true;
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
        if (1 - this.A00 == 0) {
            ((C7XS) this.A01).D01();
        }
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

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
