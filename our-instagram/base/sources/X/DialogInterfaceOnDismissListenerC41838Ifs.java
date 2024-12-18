package X;

import android.content.DialogInterface;

/* renamed from: X.Ifs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC41838Ifs implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C79853ha A00;

    public DialogInterfaceOnDismissListenerC41838Ifs(C79853ha c79853ha) {
        this.A00 = c79853ha;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.A01.A05(new C42240InQ(false));
    }
}
