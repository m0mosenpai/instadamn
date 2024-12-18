package X;

import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.view.HelpButton;

/* renamed from: X.LzT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49822LzT implements Runnable {
    public final /* synthetic */ K5V A00;

    public RunnableC49822LzT(K5V k5v) {
        this.A00 = k5v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        K5V k5v = this.A00;
        Interpolator interpolator = K5V.A0Q;
        HelpButton helpButton = k5v.A0A;
        if (helpButton == null) {
            str = "helpButton";
        } else {
            Handler handler = helpButton.A04;
            Runnable runnable = helpButton.A05;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            View view = k5v.A00;
            if (view == null) {
                str = "rootView";
            } else {
                View A00 = AbstractC47961LGz.A00(view, R.id.placeholder);
                AbstractC43594JPz.A0G(A00).setDuration(300L).setListener(new JX2(A00, 0));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
