package X;

import android.graphics.drawable.TransitionDrawable;

/* renamed from: X.LzY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49827LzY implements Runnable {
    public final /* synthetic */ TransitionDrawable A00;

    public RunnableC49827LzY(TransitionDrawable transitionDrawable) {
        this.A00 = transitionDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.reverseTransition(500);
    }
}
