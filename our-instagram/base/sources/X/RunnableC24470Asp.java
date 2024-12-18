package X;

import android.widget.PopupWindow;

/* renamed from: X.Asp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24470Asp implements Runnable {
    public final /* synthetic */ PopupWindow A00;

    public RunnableC24470Asp(PopupWindow popupWindow) {
        this.A00 = popupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.dismiss();
    }
}
