package X;

import android.content.DialogInterface;

/* renamed from: X.Ofj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55270Ofj implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ OXR A01;

    public DialogInterfaceOnClickListenerC55270Ofj(DialogInterface.OnClickListener onClickListener, OXR oxr) {
        this.A01 = oxr;
        this.A00 = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OXR oxr = this.A01;
        if (oxr != null) {
            oxr.A08(C05F.A0H, C05F.A0Y);
        }
        DialogInterface.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
