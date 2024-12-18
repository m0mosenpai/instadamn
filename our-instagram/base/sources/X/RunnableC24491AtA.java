package X;

import android.widget.TextView;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;

/* renamed from: X.AtA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24491AtA implements Runnable {
    public final /* synthetic */ CountdownTimerView A00;

    public RunnableC24491AtA(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00.A02;
        C14360o3.A0A(textView);
        textView.animate().alpha(0.0f).setDuration(400L);
    }
}
