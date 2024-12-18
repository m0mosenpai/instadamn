package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import com.facebook.common.stringformat.StringFormatUtil;
import java.nio.Buffer;

/* renamed from: X.YIg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73535YIg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Xkr A02;
    public final /* synthetic */ C72172XRg A03;
    public final /* synthetic */ Buffer A04;

    public RunnableC73535YIg(Xkr xkr, C72172XRg c72172XRg, Buffer buffer, int i, int i2) {
        this.A03 = c72172XRg;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = xkr;
        this.A04 = buffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72827XoH c72827XoH;
        Throwable A15;
        C72172XRg c72172XRg = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (createBitmap != null) {
                try {
                    createBitmap.copyPixelsFromBuffer(this.A04);
                    C72827XoH c72827XoH2 = this.A02.A00;
                    Y2I y2i = c72827XoH2.A01;
                    y2i.A0L.DEW(7);
                    Handler handler = y2i.A0G;
                    handler.post(new YH7(createBitmap, c72827XoH2));
                    y2i.A0W = false;
                    handler.post(new YGB(c72827XoH2));
                    y2i.A0J.A04(c72827XoH2.A02);
                    y2i.A0W = false;
                    return;
                } catch (Throwable th) {
                    String obj = th.toString();
                    Integer valueOf = Integer.valueOf(this.A04.capacity());
                    Integer valueOf2 = Integer.valueOf(createBitmap.getAllocationByteCount());
                    Integer valueOf3 = Integer.valueOf(c72172XRg.A03);
                    Integer valueOf4 = Integer.valueOf(c72172XRg.A00);
                    Integer valueOf5 = Integer.valueOf(i);
                    Integer valueOf6 = Integer.valueOf(i2);
                    RectF rectF = c72172XRg.A04;
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Could not save photo, copyPixelsFromBuffer Failed: %s, ib.capacity: %d, bitmap-bytecount:%d, doesFitInMemory:%b, mWidth:%d, mHeight:%d, croppedWidth:%d, croppedHeight:%d, mCropRect:(l:%f,t:%f,r:%f,b:%f)", obj, valueOf, valueOf2, true, valueOf3, valueOf4, valueOf5, valueOf6, Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom));
                    C0K8.A0J("PhotoOutput", formatStrLocaleSafe, th);
                    c72827XoH = this.A02.A00;
                    A15 = AbstractC166987dD.A18(formatStrLocaleSafe);
                }
            }
        } catch (Exception e) {
            C0K8.A0F("IgBitmapUtilImpl", "Exception when creating bitmap", e);
        }
        c72827XoH = this.A02.A00;
        A15 = AbstractC166987dD.A15(AnonymousClass001.A02(i, i2, "Failed to create bitmap with dimensions: ", "x"));
        c72827XoH.A00(A15);
    }
}
