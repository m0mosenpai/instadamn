package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHd implements DialogInterface.OnClickListener {
    public final /* synthetic */ XDl A00;
    public final /* synthetic */ C145036gO A01;

    public WHd(XDl xDl, C145036gO c145036gO) {
        this.A01 = c145036gO;
        this.A00 = xDl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.D1m();
    }
}
