package X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.4rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106884rp {
    public void A00() {
        Handler handler;
        RunnableC106874ro runnableC106874ro = (RunnableC106874ro) this;
        View view = (View) runnableC106874ro.A00.get();
        if (view != null && (handler = view.getHandler()) != null) {
            handler.post(runnableC106874ro);
        }
    }

    public void A01(Throwable th) {
    }
}
