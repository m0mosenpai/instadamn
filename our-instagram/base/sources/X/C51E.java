package X;

/* renamed from: X.51E, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C51E {
    boolean doNotDismissOnDraggingDown();

    boolean doNotDragWhenDismissLocked();

    boolean doNotFlingWhenDismissLocked();

    int dragLockBouncePx();

    double getDragUpReleaseRatio();

    int getExtraDragSpace();

    double getSwipeDownDistanceAdjustment();

    float getSwipeDownFlingVelocity();

    double getSwipeUpDistanceAdjustment();

    float getSwipeUpFlingVelocity();

    boolean includeFragmentDragSpace();

    boolean isScrolledToBottom();
}
