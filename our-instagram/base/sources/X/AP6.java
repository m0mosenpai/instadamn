package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AP6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C149146nO A01;

    public AP6(DialogInterface.OnDismissListener onDismissListener, C149146nO c149146nO) {
        this.A01 = c149146nO;
        this.A00 = onDismissListener;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C149146nO c149146nO = this.A01;
        c149146nO.A00 = null;
        c149146nO.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
