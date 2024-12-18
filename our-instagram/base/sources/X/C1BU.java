package X;

import com.instagram.common.api.base.BandwidthEstimatorUtil;

/* renamed from: X.1BU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BU implements C1BV {
    public static C1BU A0A;
    public double A00;
    public double A01;
    public long A02;
    public long A03;
    public double A04;
    public long A05;
    public long A06;
    public BandwidthEstimatorUtil A07;
    public C1BX A08;
    public final C1BW A09;

    public final synchronized double A01() {
        double downloadBandwidthEstimate;
        downloadBandwidthEstimate = this.A07.getDownloadBandwidthEstimate();
        if (downloadBandwidthEstimate == 0.0d) {
            downloadBandwidthEstimate = this.A04;
        }
        return downloadBandwidthEstimate;
    }

    public final synchronized boolean A02() {
        boolean z;
        z = false;
        if (this.A09.A00(A01()) == C05F.A0Y) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r2 == X.C05F.A0N) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A03() {
        /*
            r3 = this;
            monitor-enter(r3)
            double r1 = r3.A01()     // Catch: java.lang.Throwable -> L17
            X.1BW r0 = r3.A09     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r2 = r0.A00(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> L17
            if (r2 == r0) goto L14
            java.lang.Integer r1 = X.C05F.A0N     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r2 != r1) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r3)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BU.A03():boolean");
    }

    public final synchronized boolean A04() {
        boolean z;
        z = false;
        if (this.A09.A00(A01()) == C05F.A01) {
            z = true;
        }
        return z;
    }

    @Override // X.C1BV
    public final synchronized void Cz6(double d, long j, long j2) {
        this.A02 += j;
        this.A03 += j2;
        BandwidthEstimatorUtil bandwidthEstimatorUtil = this.A07;
        bandwidthEstimatorUtil.addDownloadSample(j2, j);
        double downloadBandwidthEstimate = bandwidthEstimatorUtil.getDownloadBandwidthEstimate();
        this.A04 = downloadBandwidthEstimate;
        C1BX c1bx = this.A08;
        if (c1bx != null) {
            c1bx.A0B("last_measured_bandwidth", (float) downloadBandwidthEstimate);
        }
    }

    @Override // X.C1BV
    public final synchronized void Cz7(double d, long j, long j2) {
        long j3 = this.A06;
        if (j3 != 0) {
            d = ((this.A05 / j3) + d) / 2.0d;
        }
        this.A01 = d;
        this.A05 += j;
        this.A06 = j3 + j2;
        C1BX c1bx = this.A08;
        if (c1bx != null) {
            c1bx.A0B("last_measured_experimental_bandwidth", (float) d);
        }
    }

    @Override // X.C1BV
    public final void EHV(double d) {
    }

    public static synchronized C1BU A00() {
        C1BU c1bu;
        synchronized (C1BU.class) {
            A0A.getClass();
            c1bu = A0A;
        }
        return c1bu;
    }

    public C1BU(BandwidthEstimatorUtil bandwidthEstimatorUtil, C1BR c1br) {
        this.A00 = -1.0d;
        this.A04 = -1.0d;
        this.A01 = -1.0d;
        this.A09 = new C1BW(c1br);
        C1BX A01 = C1BX.A01("network_bandwidth_recorder");
        this.A08 = A01;
        double A02 = A01.A02("last_measured_bandwidth", -1.0f);
        this.A04 = A02;
        this.A00 = A02;
        this.A01 = this.A08.A02("last_measured_experimental_bandwidth", -1.0f);
        this.A07 = bandwidthEstimatorUtil;
    }
}
