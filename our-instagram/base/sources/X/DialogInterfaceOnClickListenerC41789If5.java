package X;

import android.content.DialogInterface;

/* renamed from: X.If5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41789If5 implements DialogInterface.OnClickListener {
    public final int A00;

    public DialogInterfaceOnClickListenerC41789If5(int i) {
        this.A00 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (1 - this.A00 != 0) {
            AbstractC31175DnJ.A0n(dialogInterface);
        } else {
            C14360o3.A0B(dialogInterface, 0);
        }
    }
}
