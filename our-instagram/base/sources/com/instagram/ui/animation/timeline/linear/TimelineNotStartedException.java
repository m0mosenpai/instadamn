package com.instagram.ui.animation.timeline.linear;

import X.J6T;

/* loaded from: classes7.dex */
public final class TimelineNotStartedException extends J6T {
    public static final TimelineNotStartedException A00 = new Throwable();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Timeline is not started yet... Start timeline first!";
    }
}
