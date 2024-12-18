package X;

import android.view.Choreographer;
import java.util.List;

/* renamed from: X.575, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass575 implements Runnable, Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass572 A00;

    public AnonymousClass575(AnonymousClass572 anonymousClass572) {
        this.A00 = anonymousClass572;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        AnonymousClass572 anonymousClass572 = this.A00;
        anonymousClass572.A04.removeCallbacks(this);
        AnonymousClass572.A00(anonymousClass572);
        synchronized (anonymousClass572.A08) {
            if (!anonymousClass572.A02) {
                return;
            }
            anonymousClass572.A02 = false;
            List list = anonymousClass572.A01;
            anonymousClass572.A01 = anonymousClass572.A00;
            anonymousClass572.A00 = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
            }
            list.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass572 anonymousClass572 = this.A00;
        AnonymousClass572.A00(anonymousClass572);
        synchronized (anonymousClass572.A08) {
            if (anonymousClass572.A01.isEmpty()) {
                anonymousClass572.A05.removeFrameCallback(this);
                anonymousClass572.A02 = false;
            }
        }
    }
}
