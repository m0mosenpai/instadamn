package X;

import android.os.Build;

/* loaded from: classes12.dex */
public final class YH9 implements Runnable {
    public final /* synthetic */ C72669Xkk A00;
    public final /* synthetic */ Exception A01;

    public YH9(C72669Xkk c72669Xkk, Exception exc) {
        this.A00 = c72669Xkk;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2I y2i = this.A00.A00;
        YNV ynv = y2i.A0H;
        Exception exc = this.A01;
        ynv.DEf(exc);
        if (y2i.A0I.A00.CUZ(92)) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown") && !Build.MODEL.contains("google_sdk")) {
                String str2 = Build.MODEL;
                if (!str2.contains("Emulator") && !str2.contains(AbstractC58317Pt9.A00(457)) && !Build.MANUFACTURER.contains("Genymotion")) {
                    if ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT)) {
                        y2i.A0L.EmV("MediaPipeline::handleMessage", exc, true);
                    }
                }
            }
        }
    }
}
