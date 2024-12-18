package X;

import android.content.DialogInterface;

/* renamed from: X.Fhr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35316Fhr implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC110564yT A00;

    public DialogInterfaceOnClickListenerC35316Fhr(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
        this.A00 = viewOnAttachStateChangeListenerC110564yT;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A0R.setEnabled(true);
    }
}
