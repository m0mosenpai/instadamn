package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Wv3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71499Wv3 implements Runnable {
    public final /* synthetic */ C70299WQe A00;
    public final /* synthetic */ C164307Wt A01;

    public RunnableC71499Wv3(C70299WQe c70299WQe, C164307Wt c164307Wt) {
        this.A01 = c164307Wt;
        this.A00 = c70299WQe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C164307Wt c164307Wt = this.A01;
        C70299WQe c70299WQe = this.A00;
        Fragment fragment = c164307Wt.A01;
        if (fragment.getActivity() != null) {
            fragment.mLifecycleRegistry.A09(c70299WQe);
            c164307Wt.A00 = c70299WQe;
        }
    }
}
