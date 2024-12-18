package X;

import android.widget.TextView;

/* renamed from: X.D1m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29585D1m implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ CharSequence A01;

    public RunnableC29585D1m(TextView textView, CharSequence charSequence) {
        this.A00 = textView;
        this.A01 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setText(this.A01);
    }
}
