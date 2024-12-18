package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.M4j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49968M4j implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L8E A01;

    public RunnableC49968M4j(L8E l8e, int i) {
        this.A01 = l8e;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L8E l8e = this.A01;
        View view = l8e.A03;
        int width = view.getWidth();
        int height = view.getHeight();
        l8e.A04.setClipBounds(new Rect(0, 0, (this.A00 * width) / 100, height));
    }
}
