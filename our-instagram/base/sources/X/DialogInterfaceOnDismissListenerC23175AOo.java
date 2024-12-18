package X;

import android.content.DialogInterface;

/* renamed from: X.AOo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23175AOo implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public DialogInterfaceOnDismissListenerC23175AOo(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.invoke();
    }
}
