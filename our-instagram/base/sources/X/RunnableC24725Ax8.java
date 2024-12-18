package X;

import android.graphics.Bitmap;
import android.os.Looper;

/* renamed from: X.Ax8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24725Ax8 implements Runnable {
    public final /* synthetic */ C23460AaX A00;
    public final /* synthetic */ A6Y A01;
    public final /* synthetic */ C196748n4 A02;

    public RunnableC24725Ax8(C23460AaX c23460AaX, A6Y a6y, C196748n4 c196748n4) {
        this.A00 = c23460AaX;
        this.A02 = c196748n4;
        this.A01 = a6y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23460AaX c23460AaX = this.A00;
        C179987yo c179987yo = c23460AaX.A01;
        C196748n4 c196748n4 = this.A02;
        byte[] bArr = (byte[]) c196748n4.A04(C196748n4.A0X);
        C176877tj c176877tj = c23460AaX.A03;
        boolean z = c23460AaX.A06;
        BCQ bcq = c23460AaX.A00;
        A6Y a6y = this.A01;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw AbstractC166987dD.A18("Method handleNativePhotoTakenOnBackground must be invoked on a background thread");
        }
        if (!AbstractC23117AKb.A03()) {
            Bitmap A01 = AbstractC23117AKb.A01(c176877tj, c176877tj, bArr, z);
            if (A01 != null) {
                A6X A012 = AHM.A01(c196748n4);
                C179987yo.A01(c179987yo);
                APL.A01(A01, bcq, A012, a6y);
            } else {
                C179987yo.A01(c179987yo);
                APL.A03(bcq, AbstractC166987dD.A18("Failed to generate photo bitmap."));
            }
            InterfaceC178737wl interfaceC178737wl = c179987yo.A03;
            if (interfaceC178737wl != null && c23460AaX.A05 && c23460AaX.A07) {
                interfaceC178737wl.EbN(true);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A18("Method processJpegToBitmap must be invoked on a background thread");
    }
}
