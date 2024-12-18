package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.Wwg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71584Wwg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ C3WU A03;

    public RunnableC71584Wwg(Typeface typeface, TextView textView, C3WU c3wu, int i) {
        this.A03 = c3wu;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
