package X;

import android.widget.ImageView;

/* renamed from: X.J1c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43036J1c implements InterfaceC43588JPt {
    public final /* synthetic */ IJ3 A00;
    public final /* synthetic */ C146036i0 A01;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C43036J1c(IJ3 ij3, C146036i0 c146036i0) {
        this.A01 = c146036i0;
        this.A00 = ij3;
    }

    @Override // X.InterfaceC43588JPt
    public final void Dei() {
        Integer num;
        IJ3 ij3 = this.A00;
        Integer num2 = ij3.A04;
        if (num2 == C05F.A0C) {
            ImageView imageView = ij3.A00;
            imageView.setImageDrawable(new C130205uQ(AbstractC166997dE.A0L(imageView), ij3.A01, ij3.A03, C05F.A01, num2));
        } else {
            C130205uQ c130205uQ = ij3.A02;
            if (new C146066i4(ij3.A01).A01(ij3.A03)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            if (num != c130205uQ.A00) {
                c130205uQ.A00 = num;
                C130205uQ.A00(c130205uQ);
            }
        }
        ij3.A00.setContentDescription(ij3.A02.A0B());
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
