package X;

import android.content.DialogInterface;

/* loaded from: classes9.dex */
public final class PSK implements Runnable {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ MXB A01;
    public final /* synthetic */ Integer A02;

    public PSK(DialogInterface.OnClickListener onClickListener, MXB mxb, Integer num) {
        this.A01 = mxb;
        this.A02 = num;
        this.A00 = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MXB.A04(this.A00, this.A01, this.A02);
    }
}
