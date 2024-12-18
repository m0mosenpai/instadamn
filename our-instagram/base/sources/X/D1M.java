package X;

import android.widget.PopupWindow;

/* loaded from: classes5.dex */
public final class D1M implements Runnable {
    public final /* synthetic */ PopupWindow A00;

    public D1M(PopupWindow popupWindow) {
        this.A00 = popupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.dismiss();
    }
}
