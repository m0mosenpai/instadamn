package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class QBY extends AbstractC63880SvE {
    public Bitmap A00;
    public final int A01;
    public final long A02;
    public final Handler A03;

    @Override // X.InterfaceC65634Tpv
    public final void DPb(Drawable drawable) {
        this.A00 = null;
    }

    @Override // X.InterfaceC65634Tpv
    public final /* bridge */ /* synthetic */ void Dgc(InterfaceC65328Ti9 interfaceC65328Ti9, Object obj) {
        this.A00 = (Bitmap) obj;
        Handler handler = this.A03;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.A02);
    }

    public QBY(Handler handler, int i, long j) {
        this.A03 = handler;
        this.A01 = i;
        this.A02 = j;
    }
}
