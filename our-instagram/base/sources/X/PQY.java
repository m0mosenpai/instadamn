package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PQY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OD1 A01;

    public PQY(OD1 od1, int i) {
        this.A01 = od1;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01.A00;
        int height = view.getHeight();
        int i = this.A00;
        if (height < i) {
            view.setMinimumHeight(i);
        }
    }
}
