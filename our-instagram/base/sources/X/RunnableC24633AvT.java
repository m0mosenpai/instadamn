package X;

import android.view.View;

/* renamed from: X.AvT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24633AvT implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C8C8 A01;

    public RunnableC24633AvT(View view, C8C8 c8c8) {
        this.A01 = c8c8;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00 = this.A00.getWidth();
    }
}
