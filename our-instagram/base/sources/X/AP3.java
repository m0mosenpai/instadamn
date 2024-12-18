package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AP3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C149166nQ A01;

    public AP3(DialogInterface.OnDismissListener onDismissListener, C149166nQ c149166nQ) {
        this.A01 = c149166nQ;
        this.A00 = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        C149166nQ c149166nQ = this.A01;
        c149166nQ.A00 = null;
        c149166nQ.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
