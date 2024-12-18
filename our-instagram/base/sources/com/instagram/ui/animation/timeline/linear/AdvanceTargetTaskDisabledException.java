package com.instagram.ui.animation.timeline.linear;

import X.J6T;

/* loaded from: classes7.dex */
public final class AdvanceTargetTaskDisabledException extends J6T {
    public static final AdvanceTargetTaskDisabledException A00 = new Throwable();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "The target task for the timeline advance is already disabled... Ignoring the advance!";
    }
}
