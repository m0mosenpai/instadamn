package X;

import android.content.DialogInterface;

/* renamed from: X.FhU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35295FhU implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ EDR A01;

    public DialogInterfaceOnCancelListenerC35295FhU(C1P1 c1p1, EDR edr) {
        this.A00 = c1p1;
        this.A01 = edr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(new C115115Ig(this.A01));
        }
    }
}
