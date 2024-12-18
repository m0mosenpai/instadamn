package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AP5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C148376m7 A01;

    public AP5(DialogInterface.OnDismissListener onDismissListener, C148376m7 c148376m7) {
        this.A01 = c148376m7;
        this.A00 = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C148376m7 c148376m7 = this.A01;
        c148376m7.A01 = null;
        c148376m7.A02 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
