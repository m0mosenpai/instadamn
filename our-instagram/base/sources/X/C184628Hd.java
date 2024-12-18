package X;

import android.os.Message;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.8Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184628Hd implements InterfaceC184638He {
    public Guideline A00;
    public C8A3 A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC56392iX A04;
    public final int A05;
    public final UserSession A06;

    public C184628Hd(ViewStub viewStub, UserSession userSession, int i) {
        C14360o3.A0B(viewStub, 1);
        C14360o3.A0B(userSession, 2);
        this.A06 = userSession;
        this.A05 = i;
        this.A04 = AbstractC56372iV.A01(viewStub, false, false);
    }

    @Override // X.InterfaceC184638He
    public final A8D Dzh(A5H a5h) {
        boolean z = false;
        if (!this.A03) {
            z = true;
            this.A02 = true;
            InterfaceC56392iX interfaceC56392iX = this.A04;
            View requireViewById = interfaceC56392iX.getView().requireViewById(R.id.hands_free_timer);
            C14360o3.A07(requireViewById);
            CountdownTimerView countdownTimerView = (CountdownTimerView) requireViewById;
            Guideline guideline = (Guideline) interfaceC56392iX.getView().requireViewById(R.id.hands_free_container_guideline);
            this.A00 = guideline;
            if (guideline != null) {
                float f = 1.0f;
                if (this.A01 == C8A3.A04) {
                    f = 0.5f;
                }
                guideline.setGuidelinePercent(f);
            }
            countdownTimerView.A03 = new C24142AnR(a5h);
            GradientSpinner gradientSpinner = countdownTimerView.A04;
            C14360o3.A0A(gradientSpinner);
            gradientSpinner.A06();
            C14360o3.A0A(gradientSpinner);
            gradientSpinner.setVisibility(0);
            TextView textView = countdownTimerView.A02;
            C14360o3.A0A(textView);
            textView.setAlpha(0.0f);
            C14360o3.A0A(textView);
            textView.setTextSize(0, countdownTimerView.getResources().getDimensionPixelSize(R.dimen.abc_star_medium));
            C14360o3.A0A(textView);
            textView.setVisibility(0);
            C185458Kn c185458Kn = new C185458Kn(new C24171Anu(countdownTimerView), new C24173Anw(countdownTimerView), countdownTimerView.A00, 1000);
            countdownTimerView.A05 = c185458Kn;
            c185458Kn.A02.sendMessage(Message.obtain());
        }
        return new A8D("", this.A05, z);
    }

    @Override // X.InterfaceC184638He
    public final String getName() {
        return "HandsFreeFormatController";
    }
}
