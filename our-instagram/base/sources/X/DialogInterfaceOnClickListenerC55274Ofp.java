package X;

import android.content.DialogInterface;

/* renamed from: X.Ofp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55274Ofp implements DialogInterface.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C146946jW A01;

    public DialogInterfaceOnClickListenerC55274Ofp(C41181vS c41181vS, C146946jW c146946jW) {
        this.A01 = c146946jW;
        this.A00 = c41181vS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C146946jW.A00(this.A00, this.A01, false);
    }
}
