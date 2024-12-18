package X;

import android.widget.AbsListView;

/* renamed from: X.J3j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43094J3j implements Runnable {
    public final /* synthetic */ AbsListView A00;

    public RunnableC43094J3j(AbsListView absListView) {
        this.A00 = absListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.smoothScrollToPositionFromTop(5, 0);
    }
}
