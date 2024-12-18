package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.If7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41791If7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3K0 A00;

    public DialogInterfaceOnClickListenerC41791If7(C3K0 c3k0) {
        this.A00 = c3k0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3K0 c3k0 = this.A00;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = c3k0.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
