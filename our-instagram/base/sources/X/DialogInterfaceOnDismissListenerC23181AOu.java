package X;

import android.content.DialogInterface;

/* renamed from: X.AOu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23181AOu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C85J A00;

    public DialogInterfaceOnDismissListenerC23181AOu(C85J c85j) {
        this.A00 = c85j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C85J c85j = this.A00;
        c85j.A00 = System.currentTimeMillis();
        c85j.A01 = false;
    }
}
