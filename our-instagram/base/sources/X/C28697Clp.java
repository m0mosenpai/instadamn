package X;

import android.widget.PopupWindow;

/* renamed from: X.Clp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28697Clp implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C166867cy A00;

    public C28697Clp(C166867cy c166867cy) {
        this.A00 = c166867cy;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C166867cy.A02(this.A00, false);
    }
}
