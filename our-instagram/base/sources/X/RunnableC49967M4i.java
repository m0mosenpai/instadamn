package X;

import android.view.View;

/* renamed from: X.M4i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49967M4i implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C148146lk A01;

    public RunnableC49967M4i(View view, C148146lk c148146lk) {
        this.A01 = c148146lk;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC46701KlK.A00(this.A00, false).start();
        C2UY.A01.A03();
    }
}
