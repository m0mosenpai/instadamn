package X;

import android.content.DialogInterface;

/* renamed from: X.Fhb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35302Fhb implements DialogInterface.OnClickListener {
    public final /* synthetic */ C143376dc A00;

    public DialogInterfaceOnClickListenerC35302Fhb(C143376dc c143376dc) {
        this.A00 = c143376dc;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C14360o3.A0B(dialogInterface, 0);
        C148676mc c148676mc = this.A00.A02;
        if (c148676mc == null) {
            C14360o3.A0F("audLogging");
            throw C00O.createAndThrow();
        }
        c148676mc.A00();
        dialogInterface.dismiss();
    }
}
