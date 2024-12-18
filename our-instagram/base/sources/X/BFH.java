package X;

import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes5.dex */
public final class BFH implements C07W {
    public final /* synthetic */ C6FG A00;

    public BFH(C6FG c6fg) {
        this.A00 = c6fg;
    }

    @OnLifecycleEvent(C07R.ON_PAUSE)
    public void onActivityPause() {
        AnonymousClass634.A02(this.A00).A0A();
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public void onActivityResume() {
        AnonymousClass634.A02(this.A00).A0B();
    }
}
