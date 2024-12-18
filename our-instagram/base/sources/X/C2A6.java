package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.2A6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A6 {
    public static C2A6 A09;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C2AF A04;
    public C2A4 A05;
    public C2A9 A06;
    public String A07;
    public final C2A7 A08;

    public static void A01(C2A6 c2a6, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (c2a6) {
            c2a6.A01++;
            if (j3 > 0 && !z && !z2) {
                long j5 = i - j2;
                long j6 = j5 + i2;
                long j7 = j2 + j3 + j6;
                long j8 = j6 > 0 ? (i3 * 8000) / j6 : 0L;
                int sqrt = i3 > 0 ? (int) Math.sqrt(i3) : 0;
                c2a6.A04.addSample(j5, j6, i3, j4, j, z3, z4);
                if (z3 && z4) {
                    c2a6.A03 = Math.max(c2a6.A03, j7);
                    if (j8 > 0) {
                        c2a6.A06.A01(sqrt, (float) j8);
                        float A00 = c2a6.A06.A00();
                        c2a6.A02 = Float.isNaN(A00) ? -1L : A00;
                        c2a6.A00++;
                    }
                }
            }
        }
    }

    public static synchronized C2A6 A00() {
        C2A6 c2a6;
        synchronized (C2A6.class) {
            c2a6 = A09;
            if (c2a6 == null) {
                c2a6 = new C2A6(C2A7.A00);
                A09 = c2a6;
            }
        }
        return c2a6;
    }

    public C2A6(C2A7 c2a7) {
        this();
        this.A08 = c2a7;
    }

    public C2A6() {
        this.A02 = -1L;
        this.A03 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = new C2A9();
        final C2A7 c2a7 = C2A7.A00;
        this.A04 = new C2AF(c2a7) { // from class: X.2AE
            public final C2A7 A04;
            public Deque A01 = new LinkedList();
            public Deque A02 = new LinkedList();
            public VideoBandwidthEstimate A00 = new VideoBandwidthEstimate();
            public boolean A03 = false;

            @Override // X.C2AF
            public final synchronized void addSample(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
                if (j > 0 && j2 > j && j3 > 0) {
                    if (z) {
                        Deque deque = this.A02;
                        if (!deque.isEmpty()) {
                            deque.getLast();
                        }
                        deque.add(new C2C2(j, j3, SystemClock.elapsedRealtime()));
                    }
                    if (z2) {
                        long j6 = (8000 * j3) / (j2 - j);
                        Deque deque2 = this.A01;
                        if (!deque2.isEmpty()) {
                            deque2.getLast();
                        }
                        deque2.add(new C2C4(j6, j3, SystemClock.elapsedRealtime()));
                    }
                    A00();
                    this.A03 = true;
                }
            }

            @Override // X.C2AF
            public final synchronized VideoBandwidthEstimate getBandwidthEstimate(AbrContextAwareConfiguration abrContextAwareConfiguration) {
                VideoBandwidthEstimate videoBandwidthEstimate;
                A00();
                if (!this.A03) {
                    videoBandwidthEstimate = this.A00;
                } else {
                    Deque<C2C4> deque = this.A01;
                    boolean z = false;
                    if (!deque.isEmpty()) {
                        Deque<C2C2> deque2 = this.A02;
                        if (!deque2.isEmpty()) {
                            double[] dArr = new double[deque2.size()];
                            double[] dArr2 = new double[deque.size()];
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            double d = 0.0d;
                            double d2 = 0.0d;
                            int i = 0;
                            for (C2C4 c2c4 : deque) {
                                double exp = Math.exp(((elapsedRealtime - ((C2C3) c2c4).A00) / 1000.0d) * (-0.1d)) * c2c4.A01 * 1.0d * 1.0d;
                                d2 += Math.log(c2c4.A00) * exp;
                                d += exp;
                                dArr2[i] = exp;
                                i++;
                            }
                            double d3 = 0.0d;
                            int i2 = 0;
                            double d4 = 0.0d;
                            for (C2C2 c2c2 : deque2) {
                                double exp2 = Math.exp(((elapsedRealtime - ((C2C3) c2c2).A00) / 1000.0d) * (-0.25d)) * c2c2.A01 * 1.0d * 1.0d;
                                d4 += Math.log(c2c2.A00) * exp2;
                                d3 += exp2;
                                dArr[i2] = exp2;
                                i2++;
                            }
                            long exp3 = (long) Math.exp(d2 / d);
                            long exp4 = (long) Math.exp(d4 / d3);
                            Iterator it = deque.iterator();
                            long j = -1;
                            int i3 = 0;
                            while (it.hasNext()) {
                                j = (long) (j + ((dArr2[i3] * Math.pow((((C2C4) it.next()).A00 - exp3) / 1000, 2.0d)) / d));
                                i3++;
                            }
                            Iterator it2 = deque2.iterator();
                            long j2 = -1;
                            int i4 = 0;
                            while (it2.hasNext()) {
                                j2 = (long) (j2 + ((dArr[i4] * Math.pow(((C2C2) it2.next()).A00 - exp4, 2.0d)) / d3));
                                i4++;
                            }
                            videoBandwidthEstimate = new VideoBandwidthEstimate(exp4, (long) d3, (long) Math.sqrt(j2), exp3, (long) d, 1000 * ((long) Math.sqrt(j)), (deque.size() + deque2.size()) / 2, abrContextAwareConfiguration);
                            this.A00 = videoBandwidthEstimate;
                            if (abrContextAwareConfiguration == null) {
                                z = true;
                            }
                            this.A03 = z;
                        }
                    }
                    videoBandwidthEstimate = new VideoBandwidthEstimate();
                    this.A00 = videoBandwidthEstimate;
                    this.A03 = z;
                }
                return videoBandwidthEstimate;
            }

            @Override // X.C2AF
            public final void reset(C42081wy c42081wy) {
                this.A00 = new VideoBandwidthEstimate();
                this.A03 = false;
                this.A01.clear();
                this.A02.clear();
            }

            {
                this.A04 = c2a7;
            }

            private void A00() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                while (true) {
                    Deque deque = this.A01;
                    if (deque.size() <= 10 || elapsedRealtime - ((C2C3) deque.getFirst()).A00 <= 20000) {
                        break;
                    }
                    deque.removeFirst();
                    this.A03 = true;
                }
                while (true) {
                    Deque deque2 = this.A02;
                    if (deque2.size() > 10 && elapsedRealtime - ((C2C3) deque2.getFirst()).A00 > 20000) {
                        deque2.removeFirst();
                        this.A03 = true;
                    } else {
                        return;
                    }
                }
            }
        };
    }
}
