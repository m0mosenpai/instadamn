package X;

import android.widget.PopupWindow;

/* renamed from: X.OlF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55521OlF implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C79993ho A00;

    public C55521OlF(C79993ho c79993ho) {
        this.A00 = c79993ho;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C79993ho c79993ho = this.A00;
        c79993ho.A00 = null;
        c79993ho.A01 = null;
    }
}
