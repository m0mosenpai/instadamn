package X;

import android.widget.Button;

/* renamed from: X.FBy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34330FBy {
    public static void A00(FMQ fmq, E2A e2a) {
        int i = fmq.A00;
        Button button = e2a.A00;
        button.setText(i);
        C0fQ.A00(fmq.A02, button);
        e2a.A01.setText(fmq.A01);
        if (fmq.A03) {
            button.setAlpha(0.3f);
        }
    }
}
