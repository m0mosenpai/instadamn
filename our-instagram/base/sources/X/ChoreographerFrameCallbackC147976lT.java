package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC147976lT implements Choreographer.FrameCallback {
    public final /* synthetic */ C147966lS A00;

    public ChoreographerFrameCallbackC147976lT(C147966lS c147966lS) {
        this.A00 = c147966lS;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C147966lS c147966lS = this.A00;
        C141596ac c141596ac = c147966lS.A05;
        if (c141596ac != null) {
            Integer num = c141596ac.A0V;
            boolean z = false;
            if (num == C05F.A0N) {
                z = true;
            }
            if (z) {
                c147966lS.A04();
                C41551w4 c41551w4 = ((ReelViewerFragment) c147966lS.A0B).A0a;
                if (c41551w4 != null) {
                    C41181vS c41181vS = c147966lS.A04;
                    if (c41181vS != null) {
                        if (AbstractC130925vf.A0k(c41181vS, c41551w4)) {
                            InterfaceC147516kc interfaceC147516kc = c147966lS.A0E;
                            interfaceC147516kc.EKe("resume", false);
                            Handler handler = ((TextureViewSurfaceTextureListenerC147506ka) interfaceC147516kc).A0s;
                            handler.removeMessages(0);
                            handler.sendEmptyMessage(0);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            if (c147966lS.A07()) {
                C141596ac c141596ac2 = c147966lS.A05;
                if (c141596ac2 != null) {
                    long j2 = c147966lS.A02;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c147966lS.A02 = elapsedRealtime;
                    long j3 = c147966lS.A03 + (elapsedRealtime - j2);
                    c147966lS.A03 = j3;
                    float f = c147966lS.A00;
                    c141596ac2.A02(((f + ((float) j3)) - 250.0f) / (f + c147966lS.A01));
                    if (c147966lS.A03 > c147966lS.A01 + C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) {
                        c141596ac2.A05(C05F.A0C);
                        InterfaceC1119053c interfaceC1119053c = c147966lS.A0D;
                        C41181vS c41181vS2 = c147966lS.A04;
                        if (c41181vS2 != null) {
                            interfaceC1119053c.Dbs(c41181vS2);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    Choreographer.getInstance().postFrameCallback(this);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
