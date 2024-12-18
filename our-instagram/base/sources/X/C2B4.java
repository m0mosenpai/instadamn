package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.net.MalformedURLException;

/* renamed from: X.2B4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B4 implements C2B5 {
    public static final C2B8 A04 = new C2B8(new InbandTelemetryBweEstimate(new InbandTelemetryBweEstimate.Builder()));
    public C2BA A00;
    public final C2A6 A01;
    public final AbrContextAwareConfiguration A02;
    public final InterfaceC460429o A03;

    @Override // X.C2B5
    public final void A8V(Handler handler, C4WB c4wb) {
    }

    @Override // X.C2B5
    public final void EFK(C4WB c4wb) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2BA] */
    public C2B4(AbrContextAwareConfiguration abrContextAwareConfiguration, InterfaceC460429o interfaceC460429o) {
        final C2A7 c2a7 = C2A7.A00;
        this.A00 = new C2BB(this, c2a7) { // from class: X.2BA
            public int A01;
            public long A03;
            public long A05;
            public long A06;
            public boolean A07;
            public boolean A08;
            public boolean A09;
            public final C2B4 A0A;
            public final C2A7 A0B;
            public long A04 = 0;
            public long A02 = 0;
            public int A00 = 0;

            @Override // X.C2BB
            public final void DHL(EnumC92424Bx enumC92424Bx, long j, long j2, long j3) {
            }

            @Override // X.C2BB
            public final void DHM(long j, long j2) {
            }

            @Override // X.C2BB
            public final void Dv8() {
                A00(true);
            }

            @Override // X.C2BB
            public final void ETY(String str) {
            }

            {
                this.A0B = c2a7;
                this.A0A = this;
            }

            @Override // X.C2BC
            public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
                int i2;
                int i3 = this.A01 + i;
                this.A01 = i3;
                if (this.A04 <= 0 && this.A09 && (i2 = this.A00) > 0 && i3 >= i2) {
                    this.A04 = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.C2BC
            public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
                if (this.A05 != 0) {
                    A00(false);
                }
            }

            @Override // X.C2BB
            public final void DvA(IOException iOException) {
                if (this.A05 != 0) {
                    A00(true);
                }
            }

            @Override // X.C2BD
            public final void DvD(String str, Object obj) {
                if (this.A08 && "x-fb-response-time-ms".equalsIgnoreCase(str) && obj != null) {
                    try {
                        this.A02 = Long.parseLong((String) obj);
                    } catch (NumberFormatException unused) {
                    }
                }
                if ("x-bwe-mean".equalsIgnoreCase(str) && obj != null) {
                    try {
                        for (String str2 : ((String) obj).split(";")) {
                            String[] split = str2.split(":");
                            if (split.length != 2) {
                                break;
                            }
                            if (split[0].equalsIgnoreCase("aggressive")) {
                                Long.parseLong(split[1]);
                            }
                            if (split[0].equalsIgnoreCase("mean")) {
                                Long.parseLong(split[1]);
                            }
                            if (split[0].equalsIgnoreCase("conservative")) {
                                Long.parseLong(split[1]);
                            }
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                if ("x-bwe-std-dev".equalsIgnoreCase(str) && obj != null) {
                    try {
                        Long.parseLong((String) obj);
                    } catch (NumberFormatException unused3) {
                    }
                }
                if ("x-mrtt-ms".equalsIgnoreCase(str) && obj != null) {
                    try {
                        Long.parseLong((String) obj);
                    } catch (NumberFormatException unused4) {
                    }
                }
                if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
                    try {
                        this.A00 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused5) {
                    }
                }
            }

            @Override // X.C2BB
            public final void DvF(EnumC92424Bx enumC92424Bx, C4C7 c4c7) {
                String obj = c4c7.A06.toString();
                boolean z = c4c7.A07.A0U;
                try {
                    new java.net.URL(obj);
                } catch (MalformedURLException unused) {
                }
                boolean z2 = false;
                if (enumC92424Bx != EnumC92424Bx.NOT_CACHED) {
                    z2 = true;
                }
                this.A07 = z2;
                this.A05 = SystemClock.elapsedRealtime();
                this.A02 = 0L;
                this.A08 = z;
            }

            @Override // X.C2BC
            public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
                this.A09 = z2;
                this.A06 = SystemClock.elapsedRealtime();
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
            
                if (r8 <= 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0080, code lost:
            
                if (r29 == false) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A00(boolean r32) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2BA.A00(boolean):void");
            }
        };
        this.A01 = C2A6.A00();
        this.A03 = interfaceC460429o;
        this.A02 = abrContextAwareConfiguration;
    }

    public final VideoBandwidthEstimate A00() {
        VideoBandwidthEstimate bandwidthEstimate;
        C2A6 c2a6 = this.A01;
        AbrContextAwareConfiguration abrContextAwareConfiguration = this.A02;
        synchronized (c2a6) {
            bandwidthEstimate = c2a6.A04.getBandwidthEstimate(abrContextAwareConfiguration);
        }
        if (bandwidthEstimate.bandwidthBps <= 0) {
            bandwidthEstimate = new VideoBandwidthEstimate();
        }
        bandwidthEstimate.bandwidthMeter = this;
        return bandwidthEstimate;
    }

    @Override // X.C2B5
    public final long AgD() {
        long j;
        C2A6 c2a6 = this.A01;
        synchronized (c2a6) {
            j = c2a6.A02;
        }
        return j;
    }

    @Override // X.C2B5
    public final /* bridge */ /* synthetic */ C2BC CAV() {
        return this.A00;
    }
}
