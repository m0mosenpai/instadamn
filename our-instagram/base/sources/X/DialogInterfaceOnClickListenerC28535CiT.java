package X;

import android.content.DialogInterface;

/* renamed from: X.CiT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC28535CiT implements DialogInterface.OnClickListener {
    public final /* synthetic */ C166957d9 A00;

    public DialogInterfaceOnClickListenerC28535CiT(C166957d9 c166957d9) {
        this.A00 = c166957d9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A01.invoke();
        dialogInterface.dismiss();
    }
}
