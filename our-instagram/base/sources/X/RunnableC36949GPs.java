package X;

import android.view.View;
import android.widget.ViewSwitcher;

/* renamed from: X.GPs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36949GPs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewSwitcher A01;
    public final /* synthetic */ View[] A02;

    public RunnableC36949GPs(ViewSwitcher viewSwitcher, View[] viewArr, int i) {
        this.A01 = viewSwitcher;
        this.A00 = i;
        this.A02 = viewArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setDisplayedChild(0);
        for (int i = 0; i < this.A00; i++) {
            this.A02[i].setClickable(true);
        }
    }
}
