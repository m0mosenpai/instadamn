package X;

import android.view.View;

/* renamed from: X.Asv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24476Asv implements Runnable {
    public final /* synthetic */ C189988bH A00;

    public RunnableC24476Asv(C189988bH c189988bH) {
        this.A00 = c189988bH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24026AlJ c24026AlJ = this.A00.A0Y;
        if (c24026AlJ != null) {
            View view = c24026AlJ.A05;
            view.setEnabled(true);
            view.setVisibility(0);
        }
    }
}
