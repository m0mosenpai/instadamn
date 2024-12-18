package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.Aup, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24594Aup implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C8TT A01;

    public RunnableC24594Aup(Bitmap bitmap, C8TT c8tt) {
        this.A01 = c8tt;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C185948Mo c185948Mo = this.A01.A0J;
        Bitmap bitmap = this.A00;
        C57012jc c57012jc = c185948Mo.A0x.A01;
        c57012jc.A03(0);
        ((ImageView) c57012jc.A01()).setImageBitmap(bitmap);
        c57012jc.A01().invalidate();
    }
}
