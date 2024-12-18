package X;

import android.animation.ValueAnimator;

/* renamed from: X.Cpu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28946Cpu implements YPb {
    public boolean A00;
    public boolean A01;
    public final ValueAnimator A02;

    @Override // X.YPb
    public final void cancel() {
        this.A00 = false;
        this.A01 = true;
        this.A02.cancel();
    }

    @Override // X.YPb
    public final void start() {
        this.A00 = true;
        this.A01 = false;
        this.A02.start();
    }

    @Override // X.YPb
    public final void A92(InterfaceC73603YNf interfaceC73603YNf) {
        this.A02.addListener(new BQ4(0, this, interfaceC73603YNf));
    }

    public C28946Cpu(ValueAnimator valueAnimator) {
        this.A02 = valueAnimator;
    }

    @Override // X.YPb
    public final boolean isActive() {
        return this.A00;
    }
}
