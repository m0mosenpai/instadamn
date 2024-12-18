package X;

import android.view.Window;

/* loaded from: classes9.dex */
public final class PLE implements Runnable {
    public final /* synthetic */ Window A00;

    public PLE(Window window) {
        this.A00 = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setFlags(8192, 8192);
    }
}
