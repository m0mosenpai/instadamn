package X;

import android.widget.TextView;
import com.facebook.smartcapture.docauth.CreditCardScannerResult;

/* renamed from: X.M2t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49926M2t implements Runnable {
    public final /* synthetic */ CreditCardScannerResult A00;
    public final /* synthetic */ K5D A01;

    public RunnableC49926M2t(CreditCardScannerResult creditCardScannerResult, K5D k5d) {
        this.A01 = k5d;
        this.A00 = creditCardScannerResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5D k5d = this.A01;
        TextView textView = k5d.A09;
        C14360o3.A0A(textView);
        textView.setVisibility(0);
        TextView textView2 = k5d.A09;
        C14360o3.A0A(textView2);
        textView2.setText(this.A00.getDisplayFormat());
        TextView textView3 = k5d.A09;
        C14360o3.A0A(textView3);
        AbstractC43594JPz.A0H(textView3).setDuration(300L).start();
    }
}
