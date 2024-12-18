package X;

import android.widget.TextView;

/* loaded from: classes9.dex */
public final class PNU implements Runnable {
    public final /* synthetic */ TextView A00;

    public PNU(TextView textView) {
        this.A00 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00;
        textView.getPaint().setShader(AMo.A01(AbstractC166997dE.A0L(textView), textView.getPaint().measureText(textView.getText().toString()), AbstractC166987dD.A08(textView)));
    }
}
