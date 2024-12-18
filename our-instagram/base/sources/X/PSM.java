package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes9.dex */
public final class PSM implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass693 A01;
    public final /* synthetic */ C50641MXd A02;

    public PSM(View view, AnonymousClass693 anonymousClass693, C50641MXd c50641MXd) {
        this.A02 = c50641MXd;
        this.A01 = anonymousClass693;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass693 anonymousClass693;
        CountDownTimer countDownTimer = this.A02.A02;
        if (countDownTimer != null && (anonymousClass693 = this.A01) != null) {
            countDownTimer.start();
            ImageView imageView = (ImageView) this.A00;
            imageView.setVisibility(0);
            imageView.setImageDrawable(anonymousClass693);
            anonymousClass693.E4S();
        }
    }
}
