package X;

import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;

/* loaded from: classes6.dex */
public final class GOR implements Runnable {
    public final /* synthetic */ Scene A00;
    public final /* synthetic */ Transition A01;

    public GOR(Scene scene, Transition transition) {
        this.A00 = scene;
        this.A01 = transition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransitionManager.go(this.A00, this.A01);
    }
}
