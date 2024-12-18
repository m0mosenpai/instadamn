package X;

import android.content.DialogInterface;

/* renamed from: X.FkL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC35464FkL implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ boolean[] A00;

    public DialogInterfaceOnMultiChoiceClickListenerC35464FkL(boolean[] zArr) {
        this.A00 = zArr;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00[i] = true;
    }
}
