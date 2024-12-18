package X;

import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Anu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24171Anu implements InterfaceC185448Km {
    public final /* synthetic */ CountdownTimerView A00;

    public C24171Anu(CountdownTimerView countdownTimerView) {
        this.A00 = countdownTimerView;
    }

    @Override // X.InterfaceC185448Km
    public final void onFinish() {
        CountdownTimerView countdownTimerView = this.A00;
        BBI bbi = countdownTimerView.A03;
        if (bbi != null) {
            C8IE.A01(((C24142AnR) bbi).A00.A00);
        }
        GradientSpinner gradientSpinner = countdownTimerView.A04;
        C14360o3.A0A(gradientSpinner);
        gradientSpinner.A08();
        C14360o3.A0A(gradientSpinner);
        gradientSpinner.setVisibility(8);
    }
}
