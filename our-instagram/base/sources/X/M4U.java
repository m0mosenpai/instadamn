package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class M4U implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C7GN A01;

    public M4U(View view, C7GN c7gn) {
        this.A00 = view;
        this.A01 = c7gn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7GN c7gn = this.A01;
        c7gn.A0F();
        C7GN.A04(c7gn);
    }
}
