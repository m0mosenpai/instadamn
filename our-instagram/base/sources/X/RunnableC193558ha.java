package X;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import com.instagram.common.gallery.Medium;

/* renamed from: X.8ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC193558ha implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ CancellationSignal A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ InterfaceC193488hT A03;

    public RunnableC193558ha(Bitmap bitmap, CancellationSignal cancellationSignal, Medium medium, InterfaceC193488hT interfaceC193488hT) {
        this.A01 = cancellationSignal;
        this.A03 = interfaceC193488hT;
        this.A02 = medium;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellationSignal cancellationSignal = this.A01;
        if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
            this.A03.Dt1(this.A00, this.A02, false);
        }
    }
}
