package X;

import android.widget.AbsListView;

/* renamed from: X.J4j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43120J4j implements Runnable {
    public final /* synthetic */ AbsListView A00;
    public final /* synthetic */ C1I2 A01;

    public RunnableC43120J4j(AbsListView absListView, C1I2 c1i2) {
        this.A01 = c1i2;
        this.A00 = absListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1I2 c1i2 = this.A01;
        c1i2.onScrollStateChanged(this.A00, 0);
        c1i2.mScrollIdleDebouncer = null;
    }
}
