package X;

import android.content.DialogInterface;

/* renamed from: X.ANu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23155ANu implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8JT A00;

    public DialogInterfaceOnClickListenerC23155ANu(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8JT c8jt = this.A00;
        AnonymousClass229.A01(c8jt.A1D).A1m("EXIT_DIALOG_CANCEL");
        C8JT.A0n(c8jt);
    }
}
