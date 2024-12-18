package X;

import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class YGI implements Runnable {
    public final /* synthetic */ C107504sv A00;

    public YGI(C107504sv c107504sv) {
        this.A00 = c107504sv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C107504sv c107504sv = this.A00;
        C107504sv c107504sv2 = C107504sv.A02;
        c107504sv.A00 = Choreographer.getInstance();
    }
}
