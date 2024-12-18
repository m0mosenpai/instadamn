package X;

import android.content.DialogInterface;

/* renamed from: X.OfI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55244OfI implements DialogInterface.OnCancelListener {
    public final /* synthetic */ OXR A00;

    public DialogInterfaceOnCancelListenerC55244OfI(OXR oxr) {
        this.A00 = oxr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        OXR oxr = this.A00;
        if (oxr != null) {
            oxr.A08(C05F.A0H, C05F.A0Y);
        }
    }
}
