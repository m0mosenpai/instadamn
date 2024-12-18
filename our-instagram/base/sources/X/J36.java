package X;

import android.app.Dialog;

/* loaded from: classes7.dex */
public final class J36 implements Runnable {
    public final /* synthetic */ C3K0 A00;

    public J36(C3K0 c3k0) {
        this.A00 = c3k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3K0 c3k0 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = c3k0.A02;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
    }
}
