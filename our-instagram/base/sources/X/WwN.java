package X;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes11.dex */
public final class WwN implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ XCU A01;
    public final /* synthetic */ File A02;

    public WwN(Bitmap bitmap, XCU xcu, File file) {
        this.A01 = xcu;
        this.A02 = file;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onSuccess(this.A02);
        this.A00.recycle();
    }
}
