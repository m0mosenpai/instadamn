package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;

/* loaded from: classes7.dex */
public final class J0R implements C51D {
    public final ClipsViewerConfig A00;

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
        Integer num;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            num = clipsWatchAndBrowseData.A07;
        } else {
            num = null;
        }
        if (num == C05F.A01 && clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0H) {
            return EnumC27385C6o.A04;
        }
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0B) {
            return true;
        }
        return false;
    }

    @Override // X.C51E
    public final boolean doNotDragWhenDismissLocked() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0B) {
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
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A00;
        }
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final double getSwipeDownDistanceAdjustment() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A01;
        }
        return 0.5d;
    }

    @Override // X.C51E
    public final float getSwipeDownFlingVelocity() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A05;
        }
        return 3500.0f;
    }

    @Override // X.C51E
    public final double getSwipeUpDistanceAdjustment() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A02;
        }
        return 0.0d;
    }

    @Override // X.C51E
    public final float getSwipeUpFlingVelocity() {
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A00.A0K;
        if (clipsWatchAndBrowseData != null) {
            return clipsWatchAndBrowseData.A06;
        }
        return 3500.0f;
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

    public J0R(ClipsViewerConfig clipsViewerConfig) {
        this.A00 = clipsViewerConfig;
    }
}
