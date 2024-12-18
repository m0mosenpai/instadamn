package X;

import android.widget.TextView;

/* renamed from: X.M3f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49938M3f implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ String A01;

    public RunnableC49938M3f(TextView textView, String str) {
        this.A00 = textView;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00;
        textView.setText(this.A01);
        AbstractC125325le A0Z = JQ0.A0Z(textView);
        A0Z.A04 = 0;
        A0Z.A0U(0.0f, 1.0f, -1.0f);
        A0Z.A0V(0.0f, 1.0f, -1.0f);
        A0Z.A0H();
    }
}
