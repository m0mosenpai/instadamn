package X;

import android.content.DialogInterface;

/* renamed from: X.FiH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35340FiH implements DialogInterface.OnClickListener {
    public final /* synthetic */ C59782oL A00;
    public final /* synthetic */ C59762oJ A01;
    public final /* synthetic */ C04020Js A02;

    public DialogInterfaceOnClickListenerC35340FiH(C59782oL c59782oL, C59762oJ c59762oJ, C04020Js c04020Js) {
        this.A00 = c59782oL;
        this.A01 = c59762oJ;
        this.A02 = c04020Js;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A00 = false;
        dialogInterface.dismiss();
        C59762oJ.A00(this.A01, this.A02, true);
    }
}
