package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public final class TQV implements Runnable {
    public Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ Runnable A03;

    public TQV(Handler handler, Fragment fragment, Runnable runnable) {
        this.A02 = fragment;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        this.A00 = new Throwable(AnonymousClass001.A0r("Runnable instantiated on thread id: ", ", name: ", currentThread.getName(), currentThread.getId()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Fragment fragment = this.A02;
            Context context = fragment.getContext();
            boolean z = true;
            boolean A1W = AbstractC167007dF.A1W(fragment.mView);
            boolean A1Z = AbstractC25229BEm.A1Z(context);
            if (!(context instanceof ContextWrapper) || ((ContextWrapper) context).getBaseContext() != null) {
                z = false;
            }
            if (A1W && !A1Z && !z) {
                this.A03.run();
            } else {
                this.A01.post(this);
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            C0K8.A0D("CDSThreadTracing", "--- start debug trace");
            C0K8.A0H("CDSThreadTracing", "Thread tracing stacktrace", th2);
            C0K8.A0D("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }
}
