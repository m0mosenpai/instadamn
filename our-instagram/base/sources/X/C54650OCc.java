package X;

import android.content.Context;

/* renamed from: X.OCc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54650OCc {
    public final ScaleGestureDetectorOnScaleGestureListenerC81153jk A00;
    public final C676533f A01;
    public final C54649OCb A02;
    public final C56778PHv A03;

    public C54650OCc(Context context, C676533f c676533f, C54649OCb c54649OCb) {
        this.A01 = c676533f;
        this.A02 = c54649OCb;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = new ScaleGestureDetectorOnScaleGestureListenerC81153jk(context);
        this.A00 = scaleGestureDetectorOnScaleGestureListenerC81153jk;
        C56778PHv c56778PHv = new C56778PHv(this);
        this.A03 = c56778PHv;
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(c56778PHv);
    }
}
