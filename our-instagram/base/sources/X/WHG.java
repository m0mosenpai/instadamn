package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHG implements DialogInterface.OnCancelListener {
    public final /* synthetic */ XDl A00;
    public final /* synthetic */ C145036gO A01;

    public WHG(XDl xDl, C145036gO c145036gO) {
        this.A01 = c145036gO;
        this.A00 = xDl;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.D1m();
    }
}
