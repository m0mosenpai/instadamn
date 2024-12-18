package X;

import android.view.ViewParent;

/* renamed from: X.Wq0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71209Wq0 implements Runnable {
    public final /* synthetic */ WO8 A00;

    public RunnableC71209Wq0(WO8 wo8) {
        this.A00 = wo8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
