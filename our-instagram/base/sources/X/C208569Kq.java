package X;

import android.os.CountDownTimer;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.9Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208569Kq {
    public CountDownTimer A00;
    public Interpolator A01 = new PathInterpolator(0.9f, 0.0f, 1.0f, 0.1f);
    public final C208599Kt A02;

    public final void A00() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A00 = null;
            this.A02.A00(1.0f);
        }
    }

    public C208569Kq(C208599Kt c208599Kt) {
        this.A02 = c208599Kt;
    }
}
