package X;

import android.widget.AbsListView;

/* loaded from: classes8.dex */
public final class M2W implements Runnable {
    public final /* synthetic */ AbsListView A00;

    public M2W(AbsListView absListView) {
        this.A00 = absListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbsListView absListView = this.A00;
        absListView.smoothScrollBy(0, 0);
        absListView.setSelection(0);
    }
}
