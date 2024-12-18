package X;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* renamed from: X.AvX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24637AvX implements Runnable {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ C180657zt A01;

    public RunnableC24637AvX(Dialog dialog, C180657zt c180657zt) {
        this.A01 = c180657zt;
        this.A00 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        WeakReference weakReference = this.A01.A03;
        if (weakReference.get() != null && (activity = (Activity) weakReference.get()) != null && !activity.isFinishing()) {
            C0fJ.A00(this.A00);
        }
    }
}
