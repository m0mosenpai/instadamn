package X;

import android.content.Context;

/* renamed from: X.M0l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49866M0l implements Runnable {
    public final /* synthetic */ KC1 A00;

    public RunnableC49866M0l(KC1 kc1) {
        this.A00 = kc1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            AbstractC31176DnK.A12(context, C3DN.A00);
        }
    }
}
