package X;

import android.content.DialogInterface;

/* loaded from: classes12.dex */
public final class Y80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C72788Xn8 A00;

    public Y80(C72788Xn8 c72788Xn8) {
        this.A00 = c72788Xn8;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C72788Xn8 c72788Xn8 = this.A00;
        c72788Xn8.A00 = false;
        c72788Xn8.A03.A00.A0U.EJJ();
    }
}
