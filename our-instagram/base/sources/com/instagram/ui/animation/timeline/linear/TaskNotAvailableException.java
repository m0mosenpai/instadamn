package com.instagram.ui.animation.timeline.linear;

import X.J6T;

/* loaded from: classes7.dex */
public final class TaskNotAvailableException extends J6T {
    public static final TaskNotAvailableException A00 = new Throwable();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Task not available in this timeline yet... Set up timeline with this task first!";
    }
}
