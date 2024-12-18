package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.traffic.knob.DebugStrOptions;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92414Bw implements C2BB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0G;
    public long A0H;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public long A0Q;
    public long A0R;
    public long A0S;
    public long A0T;
    public EnumC92424Bx A0V;
    public EnumC91984Ae A0W;
    public IOException A0X;
    public Long A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public EnumC46372Az A19;
    public final long A1A;
    public final C2B4 A1B;
    public final VpsEventCallback A1C;
    public final String A1D;
    public final String A1E;
    public final AtomicBoolean A1F;
    public final AtomicBoolean A1G;
    public final boolean A1H;
    public final InterfaceC92404Bv A1I;
    public final InterfaceC460429o A1J;
    public final boolean A1L;
    public long A0E = 0;
    public long A0F = 0;
    public long A18 = 0;
    public int A06 = 0;
    public int A07 = -1;
    public long A0U = -1;
    public int A05 = 0;
    public long A0I = -1;
    public long A0J = -1;
    public long A0K = -1;
    public long A0L = -1;
    public Long A0Y = null;
    public int A17 = -2;
    public final C2A7 A1K = C2A7.A00;

    public static HashMap A00(C92414Bw c92414Bw) {
        HashMap hashMap = new HashMap();
        String str = c92414Bw.A0s;
        if (str == null) {
            str = "<null>";
        }
        hashMap.put("url", str);
        hashMap.put("predicted_number", Integer.valueOf(c92414Bw.A04));
        hashMap.put("tigon_transaction_id", 0);
        return hashMap;
    }

    public static void A01(C92414Bw c92414Bw, long j, boolean z) {
        String str;
        VpsEventCallback vpsEventCallback = c92414Bw.A1C;
        if (vpsEventCallback != null) {
            long j2 = c92414Bw.A0M;
            if (j2 <= 0) {
                j2 = c92414Bw.A0R;
            }
            IOException iOException = c92414Bw.A0X;
            EnumC91984Ae enumC91984Ae = c92414Bw.A0W;
            if (iOException != null) {
                str = iOException.getMessage();
            } else {
                str = "";
            }
            String str2 = c92414Bw.A1E;
            long j3 = c92414Bw.A1A;
            String A00 = AbstractC26601Qp.A00(c92414Bw.A0s);
            boolean z2 = c92414Bw.A11;
            String str3 = c92414Bw.A1D;
            int i = c92414Bw.A02;
            long j4 = c92414Bw.A0R;
            long max = Math.max(j2 - j4, -1L);
            long max2 = Math.max(c92414Bw.A0S - j4, -1L);
            long max3 = Math.max(j - j4, -1L);
            int i2 = c92414Bw.A0B;
            EnumC92424Bx enumC92424Bx = c92414Bw.A0V;
            boolean z3 = c92414Bw.A1F.get();
            boolean z4 = c92414Bw.A1G.get();
            String str4 = c92414Bw.A0n;
            long j5 = c92414Bw.A0D;
            long j6 = c92414Bw.A0E;
            int i3 = enumC91984Ae.A00;
            int i4 = c92414Bw.A17;
            long j7 = c92414Bw.A0N;
            int i5 = c92414Bw.A0A;
            String str5 = c92414Bw.A0f;
            String str6 = c92414Bw.A0r;
            String str7 = c92414Bw.A0d;
            int i6 = c92414Bw.A08;
            long j8 = c92414Bw.A0C;
            boolean z5 = c92414Bw.A0y;
            int i7 = c92414Bw.A00;
            long j9 = c92414Bw.A0O;
            long j10 = c92414Bw.A0P;
            boolean z6 = c92414Bw.A13;
            boolean z7 = c92414Bw.A14;
            boolean z8 = c92414Bw.A15;
            String str8 = c92414Bw.A0b;
            long j11 = c92414Bw.A0T;
            String str9 = c92414Bw.A0a;
            long j12 = c92414Bw.A0I;
            long j13 = c92414Bw.A0J;
            long j14 = c92414Bw.A0K;
            int i8 = c92414Bw.A01;
            long j15 = c92414Bw.A0H;
            String str10 = c92414Bw.A0o;
            boolean z9 = c92414Bw.A0w;
            boolean z10 = c92414Bw.A0x;
            boolean z11 = c92414Bw.A12;
            boolean z12 = c92414Bw.A0u;
            boolean z13 = c92414Bw.A0z;
            boolean z14 = c92414Bw.A0v;
            boolean z15 = c92414Bw.A10;
            int i9 = c92414Bw.A09;
            int i10 = c92414Bw.A04;
            long j16 = c92414Bw.A0L;
            String str11 = c92414Bw.A0h;
            String str12 = c92414Bw.A0m;
            String str13 = c92414Bw.A0c;
            long j17 = c92414Bw.A0F;
            String str14 = c92414Bw.A0e;
            int i11 = c92414Bw.A06;
            long j18 = c92414Bw.A0G;
            int i12 = c92414Bw.A03;
            int i13 = c92414Bw.A07;
            String str15 = c92414Bw.A0j;
            String str16 = c92414Bw.A0k;
            String str17 = c92414Bw.A0i;
            String str18 = c92414Bw.A0l;
            String str19 = c92414Bw.A0q;
            String str20 = c92414Bw.A0t;
            int i14 = c92414Bw.A05;
            long max4 = Math.max(c92414Bw.A18 - c92414Bw.A0R, -1L);
            vpsEventCallback.callback(new C4CA(enumC92424Bx, c92414Bw.A19, c92414Bw.A0Y, c92414Bw.A0Z, str2, A00, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, c92414Bw.A0p, c92414Bw.A0g, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, j, j3, max, max2, max3, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, max4, c92414Bw.A0U, z2, z3, z4, z5, z6, z7, z8, z, z9, z10, z11, z12, z13, z14, z15));
        }
    }

    public static void A02(C92414Bw c92414Bw, HashMap hashMap) {
        if (c92414Bw.A0Q == 0) {
            c92414Bw.A0Q = SystemClock.elapsedRealtime();
        }
        hashMap.put("transfer_start_time_ms", Long.valueOf(c92414Bw.A0S));
        hashMap.put("request_start_time_ms", Long.valueOf(c92414Bw.A0M));
        hashMap.put("transfer_end_time_ms", Long.valueOf(c92414Bw.A0Q));
        hashMap.put("transfer_end_lastcall_time_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        hashMap.put("first_chunk_transfer_end_time_ms", Long.valueOf(c92414Bw.A18));
        hashMap.put("total_bytes", Integer.valueOf(c92414Bw.A02));
    }

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
        int i2;
        this.A02 += i;
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null && this.A0W == EnumC91984Ae.LIVE_VIDEO && this.A16) {
            vpsEventCallback.callback(new R86(this.A1E, i));
        }
        if (this.A0v && (i2 = this.A05) > 0 && this.A02 >= i2) {
            this.A18 = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.C2BB
    public final void DHL(EnumC92424Bx enumC92424Bx, long j, long j2, long j3) {
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null) {
            EnumC91984Ae enumC91984Ae = this.A0W;
            vpsEventCallback.callback(new FirstDataSegmentCacheCheckEndEvent(enumC92424Bx, this.A1E, enumC91984Ae.A00, this.A1A, j, j2, j3));
        }
    }

    @Override // X.C2BB
    public final void DHM(long j, long j2) {
        VpsEventCallback vpsEventCallback = this.A1C;
        if (vpsEventCallback != null) {
            vpsEventCallback.callback(new FirstDataSegmentCacheCheckStartEvent(this.A1E, this.A1A, j, j2, this.A0W.A00));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    @Override // X.C2BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DvA(java.io.IOException r5) {
        /*
            r4 = this;
            r4.A0X = r5
            boolean r0 = r5 instanceof X.C93204Fw
            r2 = 0
            if (r0 == 0) goto L44
            r1 = r5
            X.4Fw r1 = (X.C93204Fw) r1
            java.util.Map r3 = r1.A01
            java.lang.String r0 = "x-fb-one"
            java.lang.String r0 = X.W6R.A01(r0, r3)
            if (r0 == 0) goto L19
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L19
            goto L1c
        L19:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A0k = r0
            boolean r0 = X.W6R.A02(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A0i = r0
            java.lang.String r0 = "x-fb-one-variant"
            java.lang.String r0 = X.W6R.A01(r0, r3)
            r4.A0l = r0
            int r1 = r1.A00
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L44
            long r0 = X.C4J9.A00(r3, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0Z = r0
        L44:
            long r0 = android.os.SystemClock.elapsedRealtime()
            A01(r4, r0, r2)
            java.util.HashMap r2 = A00(r4)
            java.lang.String r1 = r5.getLocalizedMessage()
            java.lang.String r0 = "error_message"
            r2.put(r0, r1)
            A02(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92414Bw.DvA(java.io.IOException):void");
    }

    @Override // X.C2BD
    public final void DvD(String str, Object obj) {
        try {
            if ("X-FB-Connection-Quality".equals(str)) {
                this.A0d = (String) obj;
                return;
            }
            if ("up-ttfb".equals(str) && obj != null) {
                this.A0T = Long.parseLong((String) obj);
                return;
            }
            if ("x-fb-session-id".equals(str) && obj != null) {
                this.A0a = (String) obj;
                return;
            }
            if ("x-fb-edge-hit".equals(str) && obj != null) {
                this.A0h = (String) obj;
                return;
            }
            if ("x-fb-origin-hit".equals(str) && obj != null) {
                this.A0m = (String) obj;
                return;
            }
            if ("x-fb-response-time-ms".equals(str) && obj != null) {
                this.A0F = Long.parseLong((String) obj);
                return;
            }
            if ("x-fb-dynamic-latest-segment-id".equals(str) && obj != null) {
                this.A06 = Integer.parseInt((String) obj);
                return;
            }
            if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
                this.A05 = Integer.parseInt((String) obj);
            } else if ("x-fb-dynamic-client-wallclock-offset-ms".equalsIgnoreCase(str) && obj != null) {
                this.A0Y = Long.valueOf(Long.parseLong((String) obj));
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // X.C2BB
    public final void DvF(EnumC92424Bx enumC92424Bx, C4C7 c4c7) {
        VpsEventCallback vpsEventCallback;
        String str;
        EnumC91984Ae A00;
        C2B8 c2b8;
        android.net.Uri uri = c4c7.A06;
        String obj = uri.toString();
        uri.getHost();
        C4C6 c4c6 = c4c7.A07;
        long j = c4c6.A08;
        int i = c4c6.A07;
        long j2 = c4c7.A04;
        long j3 = c4c7.A03;
        String str2 = c4c6.A0M;
        int i2 = c4c6.A05;
        long j4 = c4c6.A0A;
        boolean z = c4c6.A0T;
        int i3 = c4c6.A00;
        C4C2 c4c2 = c4c6.A0I;
        long j5 = c4c6.A0C;
        int i4 = c4c6.A09;
        boolean z2 = c4c6.A0V;
        boolean z3 = c4c6.A0S;
        boolean z4 = c4c6.A0U;
        int i5 = c4c6.A06;
        int i6 = c4c6.A02;
        long j6 = c4c6.A0E;
        long j7 = c4c6.A0B;
        int i7 = c4c6.A01;
        int i8 = c4c6.A04;
        long j8 = c4c6.A0G;
        Map map = c4c6.A0Q;
        try {
            AbstractC460729r.A01("HttpTransferEventTracker.onTransferRequested");
            this.A0s = obj;
            this.A0R = SystemClock.elapsedRealtime();
            this.A0U = j8;
            if (j3 >= 0) {
                this.A0E = j3;
            } else {
                this.A0E = 0L;
            }
            if (this.A0W == EnumC91984Ae.DASH_UNKNOWN && i4 != -1) {
                this.A0W = EnumC91984Ae.A00(i4);
            }
            this.A0S = 0L;
            this.A0M = -1L;
            this.A0Q = 0L;
            this.A02 = 0;
            this.A0N = j;
            this.A0A = i;
            this.A0B++;
            this.A0X = null;
            this.A0Z = null;
            this.A0V = enumC92424Bx;
            this.A0D = j2;
            this.A0r = str2;
            this.A08 = i2;
            this.A0C = j4;
            this.A0y = z;
            this.A12 = z2;
            this.A0u = z3;
            this.A10 = z4;
            this.A09 = i5;
            this.A04 = i6;
            this.A0L = j6;
            this.A0G = j7;
            this.A03 = i7;
            this.A07 = i8;
            if (j5 < 0) {
                this.A00 = i3;
            } else {
                int i9 = i3 - ((int) (this.A0R - j5));
                this.A00 = i9;
                if (i9 < 0) {
                    this.A00 = 0;
                }
            }
            this.A01 = i3;
            this.A0H = j5;
            C2B4 c2b4 = this.A1B;
            if (c2b4 != null) {
                VideoBandwidthEstimate A002 = c2b4.A00();
                this.A0b = A002.toString();
                this.A0O = A002.bandwidthBps;
                this.A0P = A002.ttfbMs;
                if (this.A1H && ((A00 = EnumC91984Ae.A00(i4)) == EnumC91984Ae.DASH_VIDEO || A00 == EnumC91984Ae.PROGRESSIVE || A00 == EnumC91984Ae.LIVE_VIDEO)) {
                    if (c2b4.A03 == null) {
                        c2b8 = C2B4.A04;
                    } else {
                        c2b8 = new C2B8(new InbandTelemetryBweEstimate(new InbandTelemetryBweEstimate.Builder()));
                    }
                    this.A0b = AnonymousClass001.A0R(this.A0b, AnonymousClass001.A0R(", itbe=", c2b8.A00.getDebugStr(new DebugStrOptions(new DebugStrOptions.Builder()))));
                }
            } else {
                this.A0O = -1L;
                this.A0P = -1L;
                this.A0b = "";
            }
            this.A11 = c4c2.A02;
            this.A0T = 0L;
            this.A0a = null;
            this.A0I = -1L;
            this.A0J = -1L;
            this.A0K = -1L;
            this.A0j = null;
            this.A0k = null;
            this.A0i = null;
            this.A0l = null;
            this.A0g = null;
            this.A0p = null;
            if (map.containsKey("os_param")) {
                this.A0j = (String) map.get("os_param");
                if (!this.A0s.contains("os_param") && !TextUtils.isEmpty(this.A0j)) {
                    this.A0s = AnonymousClass001.A0g(this.A0s, "&os_param=", this.A0j);
                }
            }
            if (map.containsKey("x-fb-psid")) {
                this.A0p = (String) map.get("x-fb-psid");
            }
            A00(this);
            AbstractC460729r.A00();
            if (this.A1L && this.A0N == 0 && (vpsEventCallback = this.A1C) != null) {
                IOException iOException = this.A0X;
                EnumC91984Ae enumC91984Ae = this.A0W;
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "";
                }
                long j9 = this.A0R;
                String str3 = this.A1E;
                long j10 = this.A1A;
                String A003 = AbstractC26601Qp.A00(this.A0s);
                boolean z5 = this.A11;
                String str4 = this.A1D;
                int i10 = this.A0B;
                EnumC92424Bx enumC92424Bx2 = this.A0V;
                boolean z6 = this.A1F.get();
                boolean z7 = this.A1G.get();
                String str5 = this.A0n;
                long j11 = this.A0D;
                long j12 = this.A0E;
                int i11 = enumC91984Ae.A00;
                long j13 = this.A0N;
                int i12 = this.A0A;
                String str6 = this.A0f;
                String str7 = this.A0r;
                int i13 = this.A08;
                long j14 = this.A0C;
                boolean z8 = this.A0y;
                int i14 = this.A00;
                long j15 = this.A0O;
                long j16 = this.A0P;
                boolean z9 = this.A13;
                boolean z10 = this.A14;
                boolean z11 = this.A15;
                String str8 = this.A0b;
                long j17 = this.A0T;
                long j18 = this.A0I;
                long j19 = this.A0J;
                long j20 = this.A0K;
                int i15 = this.A01;
                long j21 = this.A0H;
                String str9 = this.A0o;
                boolean z12 = this.A0w;
                boolean z13 = this.A0x;
                boolean z14 = this.A12;
                boolean z15 = this.A0u;
                boolean z16 = this.A0z;
                boolean z17 = this.A0v;
                boolean z18 = this.A10;
                int i16 = this.A09;
                int i17 = this.A04;
                long j22 = this.A0L;
                vpsEventCallback.callback(new HttpTransferRequestedEvent(enumC92424Bx2, str3, A003, str, str4, str5, str6, str7, str8, str9, this.A0c, this.A0e, this.A0j, this.A0k, this.A0i, this.A0l, this.A0q, this.A0t, i10, i11, i12, i13, i14, i15, i16, i17, this.A06, this.A03, this.A07, this.A05, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, this.A0F, this.A0G, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18));
            }
        } catch (Throwable th) {
            AbstractC460729r.A00();
            throw th;
        }
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
        VpsEventCallback vpsEventCallback;
        String str;
        this.A0v = z2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A0S = elapsedRealtime;
        C4C6 c4c6 = c4c7.A07;
        if (c4c6 != null) {
            this.A17 = c4c6.A09;
        }
        if (this.A1L && this.A0N == 0 && (vpsEventCallback = this.A1C) != null) {
            long j = this.A0M;
            if (j <= 0) {
                j = this.A0R;
            }
            IOException iOException = this.A0X;
            EnumC91984Ae enumC91984Ae = this.A0W;
            if (iOException != null) {
                str = iOException.getMessage();
            } else {
                str = "";
            }
            String str2 = this.A1E;
            long j2 = this.A1A;
            String A00 = AbstractC26601Qp.A00(this.A0s);
            boolean z3 = this.A11;
            String str3 = this.A1D;
            long j3 = this.A0R;
            long max = Math.max(j - j3, -1L);
            long max2 = Math.max(this.A0S - j3, -1L);
            int i = this.A0B;
            EnumC92424Bx enumC92424Bx = this.A0V;
            boolean z4 = this.A1F.get();
            boolean z5 = this.A1G.get();
            String str4 = this.A0n;
            long j4 = this.A0D;
            long j5 = this.A0E;
            int i2 = enumC91984Ae.A00;
            long j6 = this.A0N;
            int i3 = this.A0A;
            String str5 = this.A0f;
            String str6 = this.A0r;
            String str7 = this.A0d;
            int i4 = this.A08;
            long j7 = this.A0C;
            boolean z6 = this.A0y;
            int i5 = this.A00;
            long j8 = this.A0O;
            long j9 = this.A0P;
            boolean z7 = this.A13;
            boolean z8 = this.A14;
            boolean z9 = this.A15;
            String str8 = this.A0b;
            long j10 = this.A0T;
            String str9 = this.A0a;
            long j11 = this.A0I;
            long j12 = this.A0J;
            long j13 = this.A0K;
            int i6 = this.A01;
            long j14 = this.A0H;
            String str10 = this.A0o;
            boolean z10 = this.A0w;
            boolean z11 = this.A0x;
            boolean z12 = this.A12;
            boolean z13 = this.A0u;
            boolean z14 = this.A0z;
            boolean z15 = this.A0v;
            boolean z16 = this.A10;
            int i7 = this.A09;
            int i8 = this.A04;
            long j15 = this.A0L;
            String str11 = this.A0h;
            String str12 = this.A0m;
            String str13 = this.A0c;
            long j16 = this.A0F;
            String str14 = this.A0e;
            int i9 = this.A06;
            long j17 = this.A0G;
            vpsEventCallback.callback(new C114955Hl(enumC92424Bx, this.A0Y, this.A0Z, str2, A00, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, this.A0j, this.A0k, this.A0i, this.A0l, this.A0q, this.A0t, i, i2, i3, i4, i5, i6, i7, i8, i9, this.A03, this.A07, this.A05, elapsedRealtime, j2, max, max2, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16));
        }
        VpsEventCallback vpsEventCallback2 = this.A1C;
        if (vpsEventCallback2 != null && this.A0W == EnumC91984Ae.LIVE_MANIFEST && this.A16) {
            vpsEventCallback2.callback(new R85(this.A1E, System.currentTimeMillis()));
        }
        A00(this);
    }

    public C92414Bw(C2B4 c2b4, VpsEventCallback vpsEventCallback, EnumC91984Ae enumC91984Ae, InterfaceC92404Bv interfaceC92404Bv, C92304Bk c92304Bk, InterfaceC460429o interfaceC460429o, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A1C = vpsEventCallback;
        this.A1E = c92304Bk.A07;
        this.A1A = j;
        this.A11 = z;
        this.A1D = str2;
        this.A1F = atomicBoolean;
        this.A1G = atomicBoolean2;
        String str6 = c92304Bk.A03;
        this.A0n = str6 == null ? "" : str6;
        this.A0o = c92304Bk.A04;
        this.A0q = str;
        this.A0f = str3;
        this.A1B = c2b4;
        this.A0V = EnumC92424Bx.NOT_APPLY;
        this.A0W = enumC91984Ae;
        this.A13 = z2;
        this.A14 = z3;
        this.A15 = z4;
        this.A1J = interfaceC460429o;
        this.A0w = z5;
        this.A0x = z6;
        this.A0z = z7;
        this.A1H = z8;
        this.A1L = z9;
        this.A0c = str4;
        this.A0e = c92304Bk.A02.name();
        this.A0t = str5;
        this.A1I = interfaceC92404Bv;
        this.A19 = c92304Bk.A00;
    }

    @Override // X.C2BB
    public final void Dv8() {
        A01(this, SystemClock.elapsedRealtime(), true);
        A02(this, A00(this));
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A0X == null) {
            A01(this, elapsedRealtime, false);
        }
        A02(this, A00(this));
    }

    @Override // X.C2BB
    public final void ETY(String str) {
        this.A0g = str;
    }
}
