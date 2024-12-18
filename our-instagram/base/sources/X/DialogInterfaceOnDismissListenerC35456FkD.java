package X;

import android.content.DialogInterface;

/* renamed from: X.FkD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35456FkD implements DialogInterface.OnDismissListener {
    public final int A00;

    public DialogInterfaceOnDismissListenerC35456FkD(int i) {
        this.A00 = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A00 == 0) {
            AbstractC34902FZo.A00 = false;
        }
    }
}
