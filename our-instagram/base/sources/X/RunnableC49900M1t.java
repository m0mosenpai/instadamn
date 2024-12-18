package X;

import android.widget.TextView;

/* renamed from: X.M1t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49900M1t implements Runnable {
    public final /* synthetic */ C3OO A00;

    public RunnableC49900M1t(C3OO c3oo) {
        this.A00 = c3oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = ((C44751JrY) this.A00).A03;
        if (textView.getLineCount() == 1) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append((Object) textView.getText());
            textView.setText(AbstractC166997dE.A0x(System.getProperty(AbstractC111324zv.A00(230)), A1C));
        }
    }
}
