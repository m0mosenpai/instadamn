package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* loaded from: classes9.dex */
public final class PIR implements InterfaceC43588JPt {
    public final /* synthetic */ C51707Msc A00;
    public final /* synthetic */ P49 A01;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public PIR(C51707Msc c51707Msc, P49 p49) {
        this.A01 = p49;
        this.A00 = c51707Msc;
    }

    @Override // X.InterfaceC43588JPt
    public final void Dei() {
        Object value;
        C51736MtJ c51736MtJ;
        List list;
        C50920Mep c50920Mep = this.A01.A06;
        UpcomingEvent upcomingEvent = c50920Mep.A02;
        if (upcomingEvent != null) {
            boolean A01 = c50920Mep.A01.A06.A01(upcomingEvent);
            C05A c05a = c50920Mep.A04;
            do {
                value = c05a.getValue();
                c51736MtJ = (C51736MtJ) value;
                boolean z = c51736MtJ.A05;
                list = c51736MtJ.A04;
                if (z != A01) {
                    list = AbstractC001800i.A0T(new P4F(A01), list);
                }
            } while (!c05a.AIi(value, C51736MtJ.A01(c51736MtJ, c51736MtJ.A02, list, A01)));
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
