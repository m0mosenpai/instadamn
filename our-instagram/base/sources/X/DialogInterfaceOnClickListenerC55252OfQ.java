package X;

import android.content.DialogInterface;

/* renamed from: X.OfQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55252OfQ implements DialogInterface.OnClickListener {
    public final int A00;

    public DialogInterfaceOnClickListenerC55252OfQ(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                if (dialogInterface == null) {
                    return;
                }
                dialogInterface.dismiss();
                return;
            case 1:
                return;
            case 2:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
