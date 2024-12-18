package X;

import android.widget.PopupWindow;

/* renamed from: X.ATy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23287ATy implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C23287ATy(C170327il c170327il) {
        this.A00 = 0;
        this.A01 = c170327il;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.A00 != 0) {
            AbstractC166987dD.A1Y(this.A01);
            return;
        }
        C170327il c170327il = (C170327il) this.A01;
        C25814BbV c25814BbV = c170327il.A02;
        C167297di c167297di = c170327il.A00;
        c25814BbV.A0h(c167297di.A0K, c167297di.A0N, false);
    }

    public C23287ATy(InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = interfaceC16820sZ;
        } else {
            this.A01 = interfaceC16820sZ;
        }
    }
}
