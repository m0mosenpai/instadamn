package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class Wv6 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C69443VnS A01;

    public Wv6(View view, C69443VnS c69443VnS) {
        this.A00 = view;
        this.A01 = c69443VnS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height = (this.A00.getHeight() / 2) / 2;
        if (height != 0) {
            this.A01.A09.setPadding(0, height, 0, 0);
        }
    }
}
