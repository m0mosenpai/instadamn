package X;

import android.view.ViewGroup;

/* renamed from: X.GnT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37984GnT implements Runnable {
    public final /* synthetic */ C7ET A00;

    public RunnableC37984GnT(C7ET c7et) {
        this.A00 = c7et;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7ET c7et = this.A00;
        ViewGroup viewGroup = c7et.A0G;
        if (viewGroup != null) {
            viewGroup.removeView(c7et.A08);
        }
        c7et.A08 = null;
        c7et.A0C = null;
    }
}
