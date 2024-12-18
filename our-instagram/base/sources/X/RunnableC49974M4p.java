package X;

import android.widget.AbsListView;
import androidx.fragment.app.Fragment;

/* renamed from: X.M4p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49974M4p implements Runnable {
    public final /* synthetic */ AbsListView A00;
    public final /* synthetic */ Fragment A01;

    public RunnableC49974M4p(AbsListView absListView, Fragment fragment) {
        this.A01 = fragment;
        this.A00 = absListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01.mView != null) {
            AbsListView absListView = this.A00;
            absListView.smoothScrollBy(0, 0);
            absListView.setSelection(0);
        }
    }
}
