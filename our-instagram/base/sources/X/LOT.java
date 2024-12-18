package X;

import android.view.View;
import com.facebook.quicklog.reliability.CancelReason;

/* loaded from: classes8.dex */
public final class LOT implements View.OnClickListener {
    public final /* synthetic */ C143316dW A00;

    public LOT(C143316dW c143316dW) {
        this.A00 = c143316dW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1361840880);
        ViewOnKeyListenerC148356m5 viewOnKeyListenerC148356m5 = this.A00.A0o;
        C54765OIa A00 = AbstractC47088Krj.A00(viewOnKeyListenerC148356m5.A03);
        A00.A01.flowEndCancel(A00.A00, CancelReason.USER_CANCELLED);
        viewOnKeyListenerC148356m5.A07.CMc();
        C0f9.A0C(-425235744, A05);
    }
}
