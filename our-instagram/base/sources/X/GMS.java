package X;

import android.widget.TextSwitcher;

/* loaded from: classes6.dex */
public final class GMS implements Runnable {
    public final /* synthetic */ TextSwitcher A00;

    public GMS(TextSwitcher textSwitcher) {
        this.A00 = textSwitcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setText("😂     😮     😍");
    }
}
