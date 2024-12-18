package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.IfB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41795IfB implements DialogInterface.OnClickListener {
    public final /* synthetic */ C41155IJu A00;
    public final /* synthetic */ C3K0 A01;

    public DialogInterfaceOnClickListenerC41795IfB(C41155IJu c41155IJu, C3K0 c3k0) {
        this.A01 = c3k0;
        this.A00 = c41155IJu;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3K0 c3k0 = this.A01;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AbstractC40642I0a.A00(c3k0.A0B, this.A00, c3k0.A0D, true);
        Dialog dialog = c3k0.A01;
        if (dialog != null) {
            C0fJ.A00(dialog);
        }
        Dialog dialog2 = c3k0.A02;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }
}
