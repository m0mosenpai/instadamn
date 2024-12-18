package X;

import android.content.DialogInterface;

/* renamed from: X.FkE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35457FkE implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C6WG A00;

    public DialogInterfaceOnDismissListenerC35457FkE(C6WG c6wg) {
        this.A00 = c6wg;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.A01 = false;
    }
}
