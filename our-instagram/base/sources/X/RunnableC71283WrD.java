package X;

import android.widget.TextView;

/* renamed from: X.WrD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71283WrD implements Runnable {
    public final /* synthetic */ C67727Uwt A00;

    public RunnableC71283WrD(C67727Uwt c67727Uwt) {
        this.A00 = c67727Uwt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67727Uwt c67727Uwt = this.A00;
        TextView textView = c67727Uwt.A02;
        if (textView != null) {
            textView.setText(c67727Uwt.A0X[c67727Uwt.A00].intValue());
        }
        c67727Uwt.A00 = (c67727Uwt.A00 + 1) % c67727Uwt.A0X.length;
        c67727Uwt.A0F.postDelayed(this, 3000L);
    }
}
