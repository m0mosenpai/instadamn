package X;

import android.widget.TextView;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;

/* renamed from: X.Anw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24173Anw implements InterfaceC185428Kk {
    public final /* synthetic */ CountdownTimerView A00;

    public C24173Anw(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    @Override // X.InterfaceC185428Kk
    public final void Dt9(int i) {
        CountdownTimerView countdownTimerView = this.A00;
        TextView textView = countdownTimerView.A02;
        C14360o3.A0A(textView);
        textView.setText(String.valueOf(i));
        C14360o3.A0A(textView);
        textView.animate().alpha(1.0f).setDuration(400L).withEndAction(new RunnableC24491AtA(countdownTimerView));
    }
}
