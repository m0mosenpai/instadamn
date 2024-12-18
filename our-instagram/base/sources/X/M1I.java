package X;

import android.widget.TextView;

/* loaded from: classes8.dex */
public final class M1I implements Runnable {
    public final /* synthetic */ TextView A00;

    public M1I(TextView textView) {
        this.A00 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(8);
    }
}
