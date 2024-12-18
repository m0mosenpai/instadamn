package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AP4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C149136nN A01;

    public AP4(DialogInterface.OnDismissListener onDismissListener, C149136nN c149136nN) {
        this.A01 = c149136nN;
        this.A00 = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C149136nN c149136nN = this.A01;
        c149136nN.A00 = null;
        c149136nN.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
