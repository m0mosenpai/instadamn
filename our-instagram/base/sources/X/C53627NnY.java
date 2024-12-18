package X;

import android.os.CountDownTimer;

/* renamed from: X.NnY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53627NnY {
    public long A00;
    public long A01;
    public CountDownTimer A02;
    public O1M A03;

    public final void A00() {
        CountDownTimer countDownTimer = this.A02;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A02 = null;
    }
}
