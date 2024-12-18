package com.instagram.autoplay.models;

import X.C14360o3;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class TopLeftComparator implements Comparator {
    public static final Companion Companion = new Object();
    public static final TopLeftComparator instance = new Object();

    /* loaded from: classes11.dex */
    public final class Companion {
        public final TopLeftComparator getInstance() {
            return TopLeftComparator.instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final int compareCoordinates(int i, int i2, int i3, int i4) {
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (i3 >= i4) {
            return i3 <= i4 ? 0 : 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(AutoplayWhichVideoMetadata autoplayWhichVideoMetadata, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata2) {
        AutoplayOnScreenItemWithMetadata onScreenMetadata;
        if (autoplayWhichVideoMetadata == null || autoplayWhichVideoMetadata.getOnScreenMetadata() == null) {
            if (autoplayWhichVideoMetadata2 != null && autoplayWhichVideoMetadata2.getOnScreenMetadata() != null) {
                if (autoplayWhichVideoMetadata == null) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        AutoplayOnScreenItemWithMetadata onScreenMetadata2 = autoplayWhichVideoMetadata.getOnScreenMetadata();
        if (onScreenMetadata2 != null) {
            if (autoplayWhichVideoMetadata2 != null && (onScreenMetadata = autoplayWhichVideoMetadata2.getOnScreenMetadata()) != null) {
                int i = onScreenMetadata2.y;
                C14360o3.A0A(onScreenMetadata);
                int i2 = onScreenMetadata.y;
                AutoplayOnScreenItemWithMetadata onScreenMetadata3 = autoplayWhichVideoMetadata.getOnScreenMetadata();
                C14360o3.A0A(onScreenMetadata3);
                int i3 = onScreenMetadata3.x;
                AutoplayOnScreenItemWithMetadata onScreenMetadata4 = autoplayWhichVideoMetadata2.getOnScreenMetadata();
                C14360o3.A0A(onScreenMetadata4);
                return compareCoordinates(i, i2, i3, onScreenMetadata4.x);
            }
            return -1;
        }
        return 1;
    }
}
