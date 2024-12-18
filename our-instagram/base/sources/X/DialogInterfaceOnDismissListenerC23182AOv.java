package X;

import android.content.DialogInterface;

/* renamed from: X.AOv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23182AOv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C8YE A00;

    public DialogInterfaceOnDismissListenerC23182AOv(C8YE c8ye) {
        this.A00 = c8ye;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C8YE c8ye = this.A00;
        AKB akb = c8ye.A00;
        if (akb != null) {
            akb.A03 = false;
        }
        c8ye.A0A.E1m();
    }
}
