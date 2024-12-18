package X;

import com.instagram.common.api.base.BandwidthEstimatorUtil;

/* renamed from: X.1Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23231Bc {
    public static C23231Bc A03;
    public double A00;
    public BandwidthEstimatorUtil A01;
    public C1BX A02;

    public final synchronized double A01() {
        double uploadBandwidthEstimate;
        uploadBandwidthEstimate = this.A01.getUploadBandwidthEstimate();
        if (uploadBandwidthEstimate == 0.0d) {
            uploadBandwidthEstimate = this.A00;
        }
        return uploadBandwidthEstimate;
    }

    public static synchronized C23231Bc A00() {
        C23231Bc c23231Bc;
        synchronized (C23231Bc.class) {
            A03.getClass();
            c23231Bc = A03;
        }
        return c23231Bc;
    }
}
