package com.instagram.ui.animation.timeline.linear;

import X.J6T;

/* loaded from: classes7.dex */
public final class MultipleAdvanceInTimelineException extends J6T {
    public static final MultipleAdvanceInTimelineException A00 = new Throwable();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Only one advance is permitted in the timeline lifecycle... Ignoring the subsequent advances!";
    }
}
