package X;

import android.animation.Animator;

/* loaded from: classes11.dex */
public final class W1l {
    public InterfaceC58682mR A00;
    public final UP7 A01;

    public static final void A00(W1l w1l) {
        InterfaceC58682mR interfaceC58682mR = w1l.A00;
        if (interfaceC58682mR != null) {
            UP7 up7 = w1l.A01;
            if (up7.A04) {
                interfaceC58682mR.E4S();
            }
            int i = up7.A01;
            if (i == 0) {
                interfaceC58682mR.EH1();
            } else {
                interfaceC58682mR.EH0(i);
            }
            Animator.AnimatorListener animatorListener = up7.A02;
            if (animatorListener != null) {
                interfaceC58682mR.A8x(animatorListener);
            }
            interfaceC58682mR.EMk(up7.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.UP7, java.lang.Object] */
    public W1l() {
        ?? obj = new Object();
        obj.A03 = "";
        obj.A04 = true;
        obj.A01 = 1;
        obj.A02 = null;
        obj.A00 = 0.0f;
        this.A01 = obj;
    }
}
