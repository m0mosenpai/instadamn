package X;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.M5i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49993M5i implements Runnable {
    public final /* synthetic */ C49110Lnn A00;
    public final /* synthetic */ C49166Loj A01;
    public final /* synthetic */ KTI A02;

    public RunnableC49993M5i(C49110Lnn c49110Lnn, C49166Loj c49166Loj, KTI kti) {
        this.A00 = c49110Lnn;
        this.A02 = kti;
        this.A01 = c49166Loj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KTI kti = this.A02;
        C49166Loj c49166Loj = this.A01;
        boolean z = kti.A08;
        TextView textView = c49166Loj.A04;
        if (z) {
            String str = kti.A07;
            LinearLayout linearLayout = c49166Loj.A02;
            textView.setText(AbstractC41758IeZ.A06(textView, str, R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding, linearLayout.getWidth() - (linearLayout.getPaddingStart() + linearLayout.getPaddingEnd())));
        } else {
            textView.setText(kti.A07);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setTypeface(textView.getTypeface(), 1);
    }
}
