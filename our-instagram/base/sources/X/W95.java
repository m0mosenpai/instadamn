package X;

import android.media.MediaFormat;
import android.os.Build;

/* loaded from: classes11.dex */
public final class W95 {
    public static final W95 A06 = new W95(-1, -1, -1, -1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public static final void A00(MediaFormat mediaFormat, W95 w95) {
        if (Build.VERSION.SDK_INT >= 31) {
            int i = w95.A04;
            if (i > 0) {
                mediaFormat.setInteger("video-qp-i-min", i);
            }
            int i2 = w95.A01;
            if (i2 > 0) {
                mediaFormat.setInteger("video-qp-i-max", i2);
            }
            int i3 = w95.A05;
            if (i3 > 0) {
                mediaFormat.setInteger("video-qp-p-min", i3);
            }
            int i4 = w95.A02;
            if (i4 > 0) {
                mediaFormat.setInteger("video-qp-p-max", i4);
            }
            int i5 = w95.A03;
            if (i5 > 0) {
                mediaFormat.setInteger("video-qp-p-min", i5);
            }
            int i6 = w95.A00;
            if (i6 > 0) {
                mediaFormat.setInteger("video-qp-p-max", i6);
            }
        }
    }

    public W95(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A04 = i;
        this.A01 = i2;
        this.A05 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A00 = i6;
    }
}
