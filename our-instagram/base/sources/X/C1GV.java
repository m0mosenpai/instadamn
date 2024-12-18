package X;

import android.os.SystemClock;
import com.instagram.common.api.base.BandwidthEstimatorUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1GV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GV implements C1G4 {
    public C1GX A00;
    public C1GX A01;
    public final boolean A03;
    public final C1G4 A04;
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    public final synchronized void A00(C1BV c1bv) {
        this.A05.add(c1bv);
    }

    public final synchronized void A01(EnumC89473yn enumC89473yn, double d, long j, long j2) {
        int ordinal = enumC89473yn.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                Iterator it = this.A05.iterator();
                while (it.hasNext()) {
                    ((C1BV) it.next()).Cz6(d, j, j2);
                }
            } else {
                Iterator it2 = this.A05.iterator();
                while (it2.hasNext()) {
                    ((C1BV) it2.next()).EHV(d);
                }
            }
        } else {
            Iterator it3 = this.A05.iterator();
            while (it3.hasNext()) {
                ((C1BV) it3.next()).Cz7(d, j, j2);
            }
        }
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        EnumC23341Bw enumC23341Bw = c1qy.A09;
        if (enumC23341Bw == EnumC23341Bw.Image || enumC23341Bw == EnumC23341Bw.Video || enumC23341Bw == EnumC23341Bw.VideoCoverImage) {
            c26511Qg.A01(this.A00);
        }
        if (this.A03 && enumC23341Bw == EnumC23341Bw.MediaUpload && c1qw.A07 == C05F.A01) {
            c26511Qg.A01(this.A01);
        }
        return this.A04.startRequest(c1qw, c1qy, c26511Qg);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1GX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1GX, java.lang.Object] */
    public C1GV(C1C3 c1c3, C1G4 c1g4) {
        this.A04 = c1g4;
        boolean z = c1c3.A00;
        this.A03 = z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new C19Q(this) { // from class: X.1GW
            public long A00;
            public long A01;
            public long A02;
            public final C1GV A03;
            public final boolean A05 = true;
            public final java.util.Set A04 = new HashSet();

            {
                this.A03 = this;
            }

            @Override // X.C19Q, X.C19O
            public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
                C14360o3.A0B(c1qy, 1);
                C14360o3.A0B(byteBuffer, 2);
                this.A00 += byteBuffer.remaining();
                if (c1qy.A00() == C1Ef.OnScreen) {
                    this.A01 += byteBuffer.remaining();
                }
            }

            @Override // X.C19Q, X.C19O
            public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
                double d;
                C14360o3.A0B(c1qw, 0);
                C14360o3.A0B(c1qy, 1);
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.A02;
                long j = this.A00;
                if (j >= 50000 && elapsedRealtime > 50) {
                    d = (j * 1.0d) / elapsedRealtime;
                } else {
                    d = -1.0d;
                }
                java.util.Set set = this.A04;
                set.remove(c1qw);
                if (d != -1.0d) {
                    C1GV c1gv = this.A03;
                    EnumC89473yn enumC89473yn = EnumC89473yn.EXPERIMENTAL;
                    long j2 = this.A00;
                    set.size();
                    c1gv.A01(enumC89473yn, d, j2, elapsedRealtime);
                }
                if (set.isEmpty()) {
                    if (d != -1.0d && this.A05) {
                        C1GV c1gv2 = this.A03;
                        EnumC89473yn enumC89473yn2 = EnumC89473yn.STANDARD;
                        long j3 = this.A00;
                        set.size();
                        c1gv2.A01(enumC89473yn2, d, j3, elapsedRealtime);
                    }
                    long j4 = this.A01;
                    if (j4 >= 50000 && elapsedRealtime > 50) {
                        double d2 = (j4 * 1.0d) / elapsedRealtime;
                        if (d2 != -1.0d) {
                            C1GV c1gv3 = this.A03;
                            EnumC89473yn enumC89473yn3 = EnumC89473yn.ONSCREEN;
                            long j5 = this.A00;
                            set.size();
                            c1gv3.A01(enumC89473yn3, d2, j5, elapsedRealtime);
                        }
                    }
                    this.A01 = 0L;
                    this.A00 = 0L;
                }
            }

            @Override // X.C19Q, X.C19O
            public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
                C14360o3.A0B(c1qw, 0);
                java.util.Set set = this.A04;
                set.add(c1qw);
                if (set.size() == 1) {
                    this.A02 = SystemClock.elapsedRealtime();
                }
            }
        });
        ?? obj = new Object();
        obj.A00 = arrayList;
        this.A00 = obj;
        if (z) {
            final boolean z2 = c1c3.A01;
            arrayList2.add(new C19Q(this, z2) { // from class: X.1GY
                public long A00;
                public long A01;
                public final boolean A02;
                public final C1GV A03;
                public final java.util.Set A05 = new HashSet();
                public final Map A04 = new HashMap();

                @Override // X.C19Q, X.C19O
                public final void onFailed(C1QW c1qw, IOException iOException) {
                    C14360o3.A0B(c1qw, 0);
                    java.util.Set set = this.A05;
                    set.remove(c1qw);
                    if (set.isEmpty()) {
                        this.A00 = 0L;
                    }
                }

                @Override // X.C19Q, X.C19O
                public final void onFirstByteFlushed(C1QW c1qw, long j) {
                    C14360o3.A0B(c1qw, 0);
                    java.util.Set set = this.A05;
                    set.add(c1qw);
                    this.A04.put(c1qw, 0L);
                    if (set.size() == 1) {
                        this.A01 = j;
                        this.A00 = 0L;
                    }
                }

                @Override // X.C19Q, X.C19O
                public final void onLastByteAcked(C1QW c1qw, long j, long j2) {
                    C14360o3.A0B(c1qw, 0);
                    java.util.Set set = this.A05;
                    set.remove(c1qw);
                    this.A04.remove(c1qw);
                    if (set.isEmpty()) {
                        long j3 = (j2 - j) - this.A01;
                        long j4 = this.A00;
                        if ((this.A02 || j4 > 0) && j3 > 50 && (j4 * 1.0d) / j3 != -1.0d) {
                            C1GV c1gv = this.A03;
                            set.size();
                            synchronized (c1gv) {
                                Iterator it = c1gv.A02.iterator();
                                while (it.hasNext()) {
                                    C23231Bc c23231Bc = (C23231Bc) it.next();
                                    synchronized (c23231Bc) {
                                        BandwidthEstimatorUtil bandwidthEstimatorUtil = c23231Bc.A01;
                                        bandwidthEstimatorUtil.addUploadSample(j3, j4);
                                        c23231Bc.A00 = bandwidthEstimatorUtil.getUploadBandwidthEstimate();
                                        c23231Bc.A02.A0B("last_measured_upload_bandwidth", (float) bandwidthEstimatorUtil.getUploadBandwidthEstimate());
                                    }
                                }
                            }
                        }
                        this.A00 = 0L;
                    }
                }

                @Override // X.C19Q, X.C19O
                public final void onSucceeded(C1QW c1qw) {
                    C14360o3.A0B(c1qw, 0);
                    java.util.Set set = this.A05;
                    set.remove(c1qw);
                    if (set.isEmpty()) {
                        this.A00 = 0L;
                    }
                }

                @Override // X.C19Q, X.C19O
                public final void onUploadProgress(C1QW c1qw, long j, long j2) {
                    C14360o3.A0B(c1qw, 0);
                    Map map = this.A04;
                    Number number = (Number) map.get(c1qw);
                    if (number == null) {
                        number = 0L;
                    }
                    this.A00 += j - number.longValue();
                    map.put(c1qw, Long.valueOf(j));
                }

                {
                    this.A03 = this;
                    this.A02 = z2;
                }
            });
        }
        ?? obj2 = new Object();
        obj2.A00 = arrayList2;
        this.A01 = obj2;
    }
}
