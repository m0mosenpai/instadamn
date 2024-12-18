package X;

import android.app.Dialog;

/* renamed from: X.8jb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC194758jb implements Runnable {
    public final /* synthetic */ C183758Da A00;

    public RunnableC194758jb(C183758Da c183758Da) {
        this.A00 = c183758Da;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC09390do interfaceC09390do = this.A00.A02;
        if (((Dialog) interfaceC09390do.getValue()).isShowing()) {
            ((Dialog) interfaceC09390do.getValue()).dismiss();
        }
    }
}
