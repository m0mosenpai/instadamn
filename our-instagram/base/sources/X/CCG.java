package X;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

/* loaded from: classes5.dex */
public abstract class CCG {
    public static final C28946Cpu A00(Interpolator interpolator, C2XI c2xi, InterfaceC73603YNf interfaceC73603YNf, float f, long j) {
        C14360o3.A0B(c2xi, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AbstractC166987dD.A09(c2xi.A00), f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new BFF(c2xi, 1));
        C28946Cpu c28946Cpu = new C28946Cpu(ofFloat);
        if (interfaceC73603YNf != null) {
            c28946Cpu.A92(interfaceC73603YNf);
        }
        return c28946Cpu;
    }
}
