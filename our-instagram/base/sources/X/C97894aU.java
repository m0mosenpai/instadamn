package X;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4aU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C97894aU implements InterfaceC97904aV {
    public static HashMap A0k = new HashMap();
    public int A02;
    public long A05;
    public C2A4 A08;
    public C4TM A09;
    public C461429y A0A;
    public AbstractC98234b2 A0B;
    public C97994ae A0C;
    public C92124As A0D;
    public C4WE A0E;
    public IOException A0F;
    public IOException A0G;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final int A0Q;
    public final int A0R;
    public final long A0S;
    public final InterfaceC92404Bv A0T;
    public final C4V3 A0U;
    public final C4TG A0V;
    public final C4XB A0W;
    public final C4XX A0X;
    public final C4XZ A0Y;
    public final C97924aX A0Z;
    public final C122355gV A0a;
    public final C4YR A0b;
    public final InterfaceC92354Bq A0c;
    public final InterfaceC96934Xd A0d;
    public final C97934aY[] A0f;
    public final C4XC A0g;
    public final C2BC A0h;
    public final int[] A0i;
    public final C4X9 A0j;
    public final Map A0e = new HashMap();
    public long A04 = -9223372036854775807L;
    public long A0O = -9223372036854775807L;
    public long A0P = 0;
    public int A03 = 0;
    public long A06 = -9223372036854775807L;
    public long A07 = -9223372036854775807L;
    public int A00 = 0;
    public HashMap A0H = new HashMap();
    public int A01 = -1;
    public int A0N = 0;

    public final void A08(long j, Map map) {
        try {
            List list = (List) map.get(AbstractC111324zv.A00(3318));
            if (list != null && list.size() > 0) {
                long parseLong = Long.parseLong((String) list.get(0));
                if (parseLong > j) {
                    int i = this.A0U.A09;
                    while (i > 0 && parseLong > j) {
                        this.A0H.put(Long.valueOf(j), Long.valueOf(parseLong));
                        i--;
                        j++;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // X.InterfaceC97914aW
    public boolean D3B(AbstractC98234b2 abstractC98234b2, C65878Tvh c65878Tvh, C4XO c4xo, long j, boolean z, boolean z2) {
        Boolean bool;
        Object obj;
        String str;
        String str2;
        int i;
        C122355gV c122355gV;
        HashMap A07 = A07();
        if (C2C5.A02(C2C1.A0Q)) {
            A0A(A07);
            C4C6 c4c6 = abstractC98234b2.A06.A07;
            A07.put("is_predicted", Boolean.valueOf(c4c6.A0U));
            A07.put("segment_predicted_number", Integer.valueOf(c4c6.A02));
            IOException iOException = c65878Tvh.A03;
            if (iOException != null) {
                A07.put("exception", iOException.getLocalizedMessage());
                StringWriter stringWriter = new StringWriter();
                iOException.printStackTrace(new PrintWriter(stringWriter));
                A07.put("stack_trace", stringWriter.toString());
            }
        }
        boolean z3 = false;
        if (!z) {
            str = "non_cancelable";
        } else {
            C4V3 c4v3 = this.A0U;
            boolean z4 = c4v3.A0G;
            if (!z4) {
                this.A0P++;
            }
            long j2 = this.A0O;
            long j3 = abstractC98234b2.A02;
            if (j2 != j3) {
                z3 = true;
            }
            this.A0O = j3;
            final IOException iOException2 = c65878Tvh.A03;
            boolean z5 = iOException2 instanceof C93204Fw;
            if (z5) {
                C93204Fw c93204Fw = (C93204Fw) iOException2;
                Map map = c93204Fw.A01;
                boolean A02 = W6R.A02(map);
                int i2 = c93204Fw.A00;
                A07.put("response_code", Integer.valueOf(i2));
                if (i2 == 404) {
                    if (z4) {
                        this.A0P++;
                    }
                    if (abstractC98234b2 instanceof AbstractC98514bU) {
                        long j4 = ((AbstractC98514bU) abstractC98234b2).A04;
                        if (j4 > 0) {
                            A08(j4, map);
                        }
                    }
                }
                if (i2 == 404) {
                    if (this.A0P < 5) {
                        C122355gV c122355gV2 = this.A0a;
                        if (c122355gV2 != null && c122355gV2.A01(abstractC98234b2, true)) {
                            this.A0K = true;
                            A07.put("cancel", "true");
                            A07.put("reason", "requested_manifest_refresh");
                            return true;
                        }
                        if (this.A0D.A0R) {
                            A07.put("cancel", "true");
                            A07.put("reason", "dynamic_manifest");
                            return true;
                        }
                    }
                    if (!this.A0D.A0R && abstractC98234b2.A06.A07.A0U && c4v3.A0L) {
                        str2 = "static_manifest_and_predicted";
                        A07.put("reason", str2);
                        z3 = true;
                    }
                    this.A0F = c93204Fw;
                    str2 = "fatal";
                    A07.put("reason", str2);
                    z3 = true;
                } else {
                    if (i2 != 410 && i2 != 417 && i2 != 403) {
                        if (i2 == 504 && (c122355gV = this.A0a) != null && c122355gV.A01(abstractC98234b2, z3)) {
                            z3 = true;
                            this.A0K = true;
                            str = "504";
                        } else {
                            if (this.A0P >= 5) {
                                this.A0F = c93204Fw;
                                A07.put("reason", "too_many_retries");
                            } else if (i2 == 503) {
                                if (A02) {
                                    this.A0N++;
                                    A07.put("reason", "one_503");
                                    if (this.A0R != 3 && (i = c4v3.A05) > 0 && this.A0N >= i) {
                                        this.A0F = c93204Fw;
                                    } else {
                                        z3 = false;
                                    }
                                }
                            } else if (i2 == 416 && A02) {
                                str2 = "416";
                                A07.put("reason", str2);
                                z3 = true;
                            }
                            A07.put("cancel", true);
                            A07.put("exception", c93204Fw);
                            return true;
                        }
                    }
                    this.A0F = c93204Fw;
                    str2 = "fatal";
                    A07.put("reason", str2);
                    z3 = true;
                }
                A07.put("cancel", Boolean.valueOf(z3));
                return z3;
            }
            C122355gV c122355gV3 = this.A0a;
            if (c122355gV3 != null && c122355gV3.A01(abstractC98234b2, false)) {
                str2 = "fall_through_manifest_refrsh";
                A07.put("reason", str2);
                z3 = true;
                A07.put("cancel", Boolean.valueOf(z3));
                return z3;
            }
            if (!this.A0D.A0R && (abstractC98234b2 instanceof AbstractC98474bQ) && z5 && ((C93204Fw) iOException2).A00 == 404) {
                C97934aY c97934aY = this.A0f[this.A0E.CNJ(abstractC98234b2.A05)];
                long BsK = c97934aY.A02.BsK(c97934aY.A00);
                if (BsK != -1 && BsK != 0) {
                    if (((AbstractC98474bQ) abstractC98234b2).A00() > ((c97934aY.A02.B6h() + c97934aY.A01) + BsK) - 1) {
                        z3 = true;
                        this.A0L = true;
                        str = "missing_segment_workaround";
                    }
                }
            }
            if (j != -9223372036854775807L) {
                C4WE c4we = this.A0E;
                bool = Boolean.valueOf(c4we.AE3(c4we.CNJ(abstractC98234b2.A05), j));
            } else {
                bool = null;
            }
            C4B6 c4b6 = abstractC98234b2.A05;
            if (z5) {
                obj = Integer.valueOf(((C93204Fw) iOException2).A00);
            } else {
                obj = "N/A";
            }
            android.util.Log.w("DefaultDashChunkSource", String.format("BlockListTrack: blockListed=%s, skipChunkedTrackBlockListUtil=%b, chunk.trackFormat=%s, responseCode=%s", bool, true, c4b6, obj));
            if (bool != null) {
                int CNJ = this.A0E.CNJ(c4b6);
                int i3 = -1;
                if (bool.booleanValue()) {
                    i3 = CNJ;
                }
                this.A01 = i3;
                this.A0G = iOException2;
                final String str3 = this.A0f[CNJ].A07.A03;
                final String format = String.format("BlockListTrack:[%b, %d of %d, %s]", bool, Integer.valueOf(CNJ), Integer.valueOf(this.A0E.length()), c4b6.toString());
                this.A0X.A0D(new WcG(new InterfaceC98114aq() { // from class: X.WcJ
                    @Override // X.InterfaceC98114aq
                    public final void accept(Object obj2) {
                        ((C4TV) obj2).A01(iOException2, str3, format);
                    }
                }));
            }
            z3 = Boolean.TRUE.equals(bool);
            str = "skip_chunked_track_block";
        }
        A07.put("reason", str);
        A07.put("cancel", Boolean.valueOf(z3));
        return z3;
    }

    public final long A01(long j) {
        C92124As c92124As = this.A0D;
        long j2 = c92124As.A04;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - Util.A07(j2 + c92124As.A02(this.A02).A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A02(X.C98034ai r16, X.AbstractC98474bQ r17, X.C97934aY r18, long r19, long r21) {
        /*
            r15 = this;
            r8 = r18
            android.util.Pair r1 = r15.A03(r8)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r6 = 1
            if (r17 != 0) goto L8d
            r0 = r19
            long r0 = r8.A04(r0)
            long r0 = java.lang.Math.min(r0, r2)
            long r13 = java.lang.Math.max(r4, r0)
        L27:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r21
            int r7 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r7 == 0) goto L8b
            long r11 = r8.A04(r0)
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 >= 0) goto L8b
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r0}
            java.lang.String r0 = "Discontinuity was detected, align to the minimumLoadPosition %d: segment num %d -> %d"
            java.lang.String.format(r0, r1)
        L4f:
            X.4TG r0 = r15.A0V
            if (r0 == 0) goto Lc3
            boolean r0 = r0.A00
            if (r0 == 0) goto Lc3
            X.4V3 r1 = r15.A0U
            int r0 = r1.A03
            if (r0 <= 0) goto L9b
            int r9 = r1.A04
            if (r9 <= 0) goto L9b
            long r6 = r8.A03(r2)
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r6 = r6 - r0
            int r0 = r9 * 1000
            long r9 = (long) r0
            long r0 = r6 - r9
            long r0 = r8.A04(r0)
            long r0 = java.lang.Math.min(r0, r2)
            long r0 = java.lang.Math.max(r4, r0)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto Lc3
            long r4 = r8.A04(r6)
            long r2 = java.lang.Math.min(r4, r2)
            long r4 = java.lang.Math.max(r0, r2)
            return r4
        L8b:
            r11 = r13
            goto L4f
        L8d:
            long r13 = r17.A00()
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L27
            boolean r0 = r15.A0I
            if (r0 == 0) goto Lc4
            r13 = r4
            goto L27
        L9b:
            X.4As r0 = r15.A0D
            boolean r0 = r0.A0S
            if (r0 == 0) goto Lc3
            r0 = 10
            long r4 = r2 - r0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lc3
            r0 = r16
            if (r16 == 0) goto Laf
            r0.A02 = r6
        Laf:
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Using latest %d segments from total of %d segments"
            java.lang.String.format(r0, r1)
            return r4
        Lc3:
            return r11
        Lc4:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97894aU.A02(X.4ai, X.4bQ, X.4aY, long, long):long");
    }

    public final Pair A03(C97934aY c97934aY) {
        long j;
        long currentTimeMillis;
        InterfaceC97364Yw interfaceC97364Yw = c97934aY.A02;
        long B6h = interfaceC97364Yw.B6h() + c97934aY.A01;
        long BsK = interfaceC97364Yw.BsK(c97934aY.A00);
        if (BsK == -1) {
            long j2 = this.A0S;
            if (j2 != 0) {
                currentTimeMillis = SystemClock.elapsedRealtime() + j2;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            C92124As c92124As = this.A0D;
            long j3 = c92124As.A04;
            UUID uuid = C4YL.A04;
            long A07 = ((currentTimeMillis * 1000) - Util.A07(j3)) - Util.A07(c92124As.A02(this.A02).A00);
            long j4 = this.A0D.A0E;
            if (j4 != -9223372036854775807L) {
                B6h = Math.max(B6h, c97934aY.A04(A07 - Util.A07(j4)));
            }
            j = c97934aY.A04(A07);
        } else {
            j = BsK + B6h;
        }
        return new Pair(Long.valueOf(B6h), Long.valueOf(j - 1));
    }

    public final C98224b1 A04(C4B6 c4b6, C97934aY c97934aY, C4B0 c4b0, C4B0 c4b02, InterfaceC92354Bq interfaceC92354Bq, Object obj, int i, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        long j4;
        long j5;
        C4B0 c4b03 = c4b0;
        C4BB c4bb = c97934aY.A03;
        if (c4b0 != null) {
            C4B0 A01 = c4b03.A01(c4b02, c97934aY.A07.A03);
            if (A01 != null) {
                c4b03 = A01;
            }
        } else {
            c4b03 = c4b02;
        }
        C4BB c4bb2 = c97934aY.A03;
        boolean z4 = c4bb2 instanceof C4BA;
        if (z4) {
            str = ((C4BA) c4bb2).A06;
        } else {
            str = null;
        }
        if (z4) {
            str2 = ((C4BA) c4bb2).A05;
        } else {
            str2 = null;
        }
        if (z4) {
            j4 = ((C4BA) c4bb2).A00;
        } else {
            j4 = -1;
        }
        long j6 = c4b03.A01;
        if (z3 && j3 == 0 && j4 > 0) {
            j5 = (j4 - j6) + 1;
        } else {
            j5 = -1;
        }
        String str3 = c97934aY.A07.A03;
        C4B6 c4b62 = c4bb.A02;
        String str4 = c4b62.A0N.A07;
        long j7 = c4b62.A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new C98224b1(c4b6, c97934aY.A06, interfaceC92354Bq, AbstractC98904cA.A00(c4b03, c4bb, new C4C6(C4C4.A02, new C4C2(), str4, str, str2, null, "", "", null, null, 0, 0, (int) (j / 1000), i2, -1, -1, -1, -1, -1, -1, j7, elapsedRealtime, -1L, -1L, -1L, j2, j5, z, false, z2, false, false), str3, 0), obj, i);
    }

    public final C97934aY A05(int i) {
        C97934aY[] c97934aYArr = this.A0f;
        C97934aY c97934aY = c97934aYArr[i];
        C92134At A02 = this.A0Y.A02(c97934aY.A03.A04);
        if (A02 != null && !A02.equals(c97934aY.A07)) {
            long j = c97934aY.A04;
            long j2 = c97934aY.A00;
            C4BB c4bb = c97934aY.A03;
            C4XG c4xg = c97934aY.A06;
            long j3 = c97934aY.A01;
            C97934aY c97934aY2 = new C97934aY(c97934aY.A05, c4xg, c97934aY.A02, A02, c4bb, j, j2, j3, c97934aY.A08);
            c97934aYArr[i] = c97934aY2;
            return c97934aY2;
        }
        return c97934aY;
    }

    public final ArrayList A06() {
        List list = this.A0D.A02(this.A02).A03;
        ArrayList arrayList = new ArrayList();
        for (int i : this.A0i) {
            arrayList.addAll(((C4BF) list.get(i)).A07);
        }
        return arrayList;
    }

    public final HashMap A07() {
        String format;
        HashMap hashMap = new HashMap();
        int i = this.A0R;
        if (i == 2) {
            format = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else if (i == 1) {
            format = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else if (i == 3) {
            format = "text";
        } else {
            format = String.format("other %s", Integer.valueOf(i));
        }
        hashMap.put("track", format);
        return hashMap;
    }

    public final void A09(C98494bS c98494bS) {
        C4WE c4we;
        int Bsd;
        int i = this.A01;
        if (i != -1 && i != (Bsd = (c4we = this.A0E).Bsd())) {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(Bsd);
            String str = c98494bS.A02;
            android.util.Log.w("DefaultDashChunkSource", String.format("LaneSwitch: mLastBlockedTrackIndex=%d, trackSelection.getSelectedIndex()=%d, abrDecisionReason=%s, selectedFormat=%s, lastError=%s", valueOf, valueOf2, str, c4we.Bsc().toString(), this.A0G.getMessage()));
            C4WE c4we2 = this.A0E;
            int i2 = this.A01;
            if (c4we2.CNI(i2) != -1) {
                final C4B6 B7x = c4we2.B7x(i2);
                final C4B6 Bsc = c4we2.Bsc();
                final String str2 = this.A0f[i2].A07.A03;
                final String format = String.format("BlockListTrack:[abrDecisionReason: %s]", str);
                final IOException iOException = this.A0G;
                this.A0X.A0D(new WcG(new InterfaceC98114aq() { // from class: X.WcL
                    @Override // X.InterfaceC98114aq
                    public final void accept(Object obj) {
                        ArrayList arrayList;
                        C4B6 c4b6 = C4B6.this;
                        C4B6 c4b62 = Bsc;
                        String str3 = str2;
                        String str4 = format;
                        IOException iOException2 = iOException;
                        C98704bq A00 = C4TV.A00(c4b6);
                        C98704bq A002 = C4TV.A00(c4b62);
                        C95794Sn c95794Sn = ((C4TV) obj).A05;
                        C2BE AvX = c95794Sn.A19.A07.AvX();
                        if (AvX != null) {
                            arrayList = AvX.A03();
                        } else {
                            arrayList = new ArrayList();
                        }
                        C117275Sm A0L = c95794Sn.A0L(EnumC117265Sl.A0E, C4Y3.A00(iOException2, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
                        c95794Sn.A0v.Dul(A00, A002, str3, str4, A0L.A01.A00, A0L.A00.name(), A0L.A02, A0L.A03, arrayList);
                    }
                }));
            }
            this.A01 = -1;
        }
    }

    public final void A0A(HashMap hashMap) {
        String str;
        C97814aM c97814aM;
        C4B6 c4b6;
        String str2;
        int i;
        CS4 cs4;
        C92124As c92124As = this.A0D;
        if (c92124As == null) {
            hashMap.put("manifest", "null");
            return;
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        if (c92124As.A0R) {
            str = "dynamic";
        } else {
            str = "static";
        }
        hashMap.put("manifest_type", str);
        for (int i2 = 0; i2 < this.A0D.A0Q.size(); i2++) {
            Iterator it = this.A0D.A02(i2).A03.iterator();
            while (it.hasNext()) {
                for (C4BB c4bb : ((C4BF) it.next()).A07) {
                    if ((c4bb instanceof C97814aM) && (str2 = (c4b6 = (c97814aM = (C97814aM) c4bb).A02).A0T) != null) {
                        C4BE c4be = c97814aM.A00;
                        if ((c4be instanceof C4BD) && (cs4 = ((C4BD) c4be).A00) != null) {
                            i = cs4.A01;
                        } else {
                            i = -1;
                        }
                        hashMap2.put(str2, Integer.valueOf(i));
                        hashMap3.put(str2, Integer.valueOf(c4b6.A05));
                        hashMap4.put(str2, Integer.valueOf(c4b6.A0N.A01));
                    }
                }
            }
        }
        hashMap.put("end_numbers", hashMap2);
        hashMap.put("bitrates", hashMap3);
        hashMap.put("max_bandwidths", hashMap4);
    }

    public final boolean A0B(C97934aY c97934aY) {
        if (this.A0E.length() <= 1) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        for (C97934aY c97934aY2 : this.A0f) {
            int i2 = c97934aY2.A03.A02.A05;
            if (i > i2) {
                i = i2;
            }
        }
        if (i != c97934aY.A03.A02.A05) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC97914aW
    public long AZz(C4TT c4tt, long j) {
        for (C97934aY c97934aY : this.A0f) {
            if (c97934aY.A02 != null) {
                long A04 = c97934aY.A04(j);
                long C8V = c97934aY.A02.C8V(A04 - c97934aY.A01);
                if (C8V < j && A04 < c97934aY.A00()) {
                    C8V = c97934aY.A02.C8V((A04 + 1) - c97934aY.A01);
                }
                return c4tt.A00(j, C8V, C8V);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r1.A00 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ac, code lost:
    
        if (r35 <= r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0234, code lost:
    
        if (r0.A00 != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0253  */
    @Override // X.InterfaceC97914aW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void BWr(X.C98034ai r64, X.AbstractC98474bQ r65, java.util.List r66, long r67, long r69, long r71, long r73) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97894aU.BWr(X.4ai, X.4bQ, java.util.List, long, long, long, long):void");
    }

    @Override // X.InterfaceC97914aW
    public final void D3A(AbstractC98234b2 abstractC98234b2) {
        final C98444bN c98444bN;
        this.A0P = 0L;
        this.A0O = -9223372036854775807L;
        this.A0N = 0;
        this.A0G = null;
        if (abstractC98234b2 instanceof C98224b1) {
            int CNJ = this.A0E.CNJ(abstractC98234b2.A05);
            C97934aY[] c97934aYArr = this.A0f;
            C97934aY c97934aY = c97934aYArr[CNJ];
            if (c97934aY.A02 == null) {
                C4XG c4xg = c97934aY.A06;
                InterfaceC98454bO interfaceC98454bO = ((C4XE) c4xg).A00;
                if ((interfaceC98454bO instanceof C98444bN) && (c98444bN = (C98444bN) interfaceC98454bO) != null) {
                    if (this.A0U.A0I) {
                        C4BB c4bb = c97934aY.A03;
                        final long j = c4bb.A01;
                        c97934aYArr[CNJ] = new C97934aY(c97934aY.A05, c4xg, new InterfaceC97364Yw(c98444bN, j) { // from class: X.4bP
                            public final long A00;
                            public final C98444bN A01;

                            @Override // X.InterfaceC97364Yw
                            public final long B6Y(long j2, long j3) {
                                return 0L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long B6h() {
                                return 0L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BX6(long j2, long j3) {
                                return -9223372036854775807L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final int BfL(long j2) {
                                return -1;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsP(long j2) {
                                return -1L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final boolean isExplicit() {
                                return true;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long AeO(long j2, long j3) {
                                return this.A01.A00;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long Azu(long j2, long j3) {
                                return this.A01.A03[(int) j2];
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsK(long j2) {
                                return this.A01.A00;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsO(long j2, long j3) {
                                C98444bN c98444bN2 = this.A01;
                                return Util.A04(c98444bN2.A05, j2 + this.A00, true);
                            }

                            @Override // X.InterfaceC97364Yw
                            public final C4B0 BsR(long j2) {
                                return new C4B0(null, this.A01.A04[(int) j2], r2.A02[r1]);
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long C8V(long j2) {
                                return this.A01.A05[(int) j2] - this.A00;
                            }

                            {
                                this.A01 = c98444bN;
                                this.A00 = j;
                            }
                        }, c97934aY.A07, c4bb, c97934aY.A04, c97934aY.A00, c97934aY.A01, c97934aY.A08);
                    } else {
                        final long j2 = c97934aY.A03.A01;
                        c97934aY.A02 = new InterfaceC97364Yw(c98444bN, j2) { // from class: X.4bP
                            public final long A00;
                            public final C98444bN A01;

                            @Override // X.InterfaceC97364Yw
                            public final long B6Y(long j22, long j3) {
                                return 0L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long B6h() {
                                return 0L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BX6(long j22, long j3) {
                                return -9223372036854775807L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final int BfL(long j22) {
                                return -1;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsP(long j22) {
                                return -1L;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final boolean isExplicit() {
                                return true;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long AeO(long j22, long j3) {
                                return this.A01.A00;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long Azu(long j22, long j3) {
                                return this.A01.A03[(int) j22];
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsK(long j22) {
                                return this.A01.A00;
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long BsO(long j22, long j3) {
                                C98444bN c98444bN2 = this.A01;
                                return Util.A04(c98444bN2.A05, j22 + this.A00, true);
                            }

                            @Override // X.InterfaceC97364Yw
                            public final C4B0 BsR(long j22) {
                                return new C4B0(null, this.A01.A04[(int) j22], r2.A02[r1]);
                            }

                            @Override // X.InterfaceC97364Yw
                            public final long C8V(long j22) {
                                return this.A01.A05[(int) j22] - this.A00;
                            }

                            {
                                this.A01 = c98444bN;
                                this.A00 = j2;
                            }
                        };
                    }
                    this.A07 = c98444bN.A01;
                }
            }
        }
        C122355gV c122355gV = this.A0a;
        if (c122355gV != null) {
            long j3 = c122355gV.A00;
            if (j3 == -9223372036854775807L || abstractC98234b2.A02 > j3) {
                c122355gV.A00 = abstractC98234b2.A02;
            }
            c122355gV.A04.A01 = true;
        }
        HashMap A07 = A07();
        if (abstractC98234b2 instanceof AbstractC98474bQ) {
            A07.put("segment_identifier", Long.valueOf(((AbstractC98474bQ) abstractC98234b2).A00));
        }
        A07.put("start_time_us", Long.valueOf(abstractC98234b2.A04));
        A07.put("end_time_us", Long.valueOf(abstractC98234b2.A02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r15 < (r13 + r0)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r3 <= r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if ((r11.A06 + r2) >= r9) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(X.C97934aY r12, long r13, long r15, boolean r17) {
        /*
            r11 = this;
            long r9 = java.lang.System.currentTimeMillis()
            int r1 = r11.A03
            X.4V3 r4 = r11.A0U
            int r0 = r4.A08
            r8 = 1
            r7 = 0
            if (r1 < r0) goto Lf
            r7 = 1
        Lf:
            int r2 = r4.A07
            if (r2 < 0) goto L1c
            long r0 = r11.A06
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r6 = 0
            if (r2 < 0) goto L1d
        L1c:
            r6 = 1
        L1d:
            int r0 = r4.A06
            if (r0 <= 0) goto L28
            long r0 = (long) r0
            long r13 = r13 + r0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r5 = 0
            if (r0 >= 0) goto L29
        L28:
            r5 = 1
        L29:
            int r2 = r4.A0A
            if (r2 <= 0) goto L3f
            X.4BB r1 = r12.A03
            boolean r0 = r1 instanceof X.C97814aM
            if (r0 == 0) goto La1
            X.4aM r1 = (X.C97814aM) r1
            X.4BE r0 = r1.A00
            long r3 = r0.A03
        L39:
            long r1 = (long) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r0 > 0) goto L40
        L3f:
            r4 = 1
        L40:
            if (r7 == 0) goto L49
            if (r6 == 0) goto L49
            if (r5 == 0) goto L49
            r3 = 1
            if (r4 != 0) goto L4a
        L49:
            r3 = 0
        L4a:
            X.4BB r0 = r12.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L94
            if (r17 != 0) goto L94
            if (r3 != 0) goto L94
            java.util.HashMap r2 = r11.A07()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "predictive_counter_far_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "manifest_fresh_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "segment_close_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "segment_duration_small_enough"
            r2.put(r0, r1)
            long r0 = r11.A06
            long r9 = r9 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "freshness"
            r2.put(r0, r1)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "cache_start"
            r2.put(r0, r1)
        L94:
            X.4BB r0 = r12.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto La4
            if (r17 != 0) goto La4
            if (r3 == 0) goto La4
            return r8
        La1:
            r3 = 0
            goto L39
        La4:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97894aU.A0C(X.4aY, long, long, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.4aX] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.4ae] */
    public C97894aU(C4XC c4xc, C4X9 c4x9, C2A4 c2a4, InterfaceC92404Bv interfaceC92404Bv, final C4V3 c4v3, C4TM c4tm, C4TG c4tg, C4XB c4xb, C461429y c461429y, C4WZ c4wz, C4XX c4xx, C4XI c4xi, C4XZ c4xz, C122355gV c122355gV, C4YR c4yr, C92124As c92124As, C4WE c4we, InterfaceC92354Bq interfaceC92354Bq, InterfaceC96934Xd interfaceC96934Xd, C2BC c2bc, List list, int[] iArr, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0d = interfaceC96934Xd;
        this.A0D = c92124As;
        this.A0Y = c4xz;
        this.A0i = iArr;
        this.A0E = c4we;
        this.A0R = i2;
        this.A0c = interfaceC92354Bq;
        this.A02 = i;
        this.A0S = j;
        this.A0Q = i3;
        this.A0a = c122355gV;
        this.A0M = z2;
        this.A0I = z3;
        this.A0U = c4v3;
        this.A0V = c4tg;
        this.A0b = c4yr;
        this.A0A = c461429y;
        this.A09 = c4tm;
        this.A08 = c2a4;
        this.A0Z = new Object(c4v3) { // from class: X.4aX
            public final C42191x9 A00;
            public final C42181x8 A01;

            {
                this.A01 = c4v3.A0D;
                this.A00 = c4v3.A0C;
            }
        };
        this.A0T = interfaceC92404Bv;
        this.A0X = c4xx;
        this.A0g = c4xc;
        this.A0W = c4xb;
        this.A0j = c4x9;
        this.A0h = c2bc;
        long A00 = c92124As.A00(i);
        long j2 = c92124As.A02(i).A00;
        this.A05 = -9223372036854775807L;
        ArrayList A06 = A06();
        this.A0f = new C97934aY[c4we.length()];
        for (int i4 = 0; i4 < this.A0f.length; i4++) {
            C4BB c4bb = (C4BB) A06.get(c4we.BHT(i4));
            List list2 = c4bb.A04;
            C92134At A02 = c4xz.A02(list2);
            C97934aY[] c97934aYArr = this.A0f;
            if (A02 == null) {
                A02 = (C92134At) list2.get(0);
            }
            C4B6 c4b6 = c4bb.A02;
            c97934aYArr[i4] = new C97934aY(this.A0T, c4xi.AMr(c4b6, c4wz, c122355gV, list, i2, c4v3.A02, z, false, z4, false), c4bb.A00(), A02, c4bb, j2, A00, 0L, z3);
            this.A0e.put(c4b6.A0T, this.A0f[i4]);
        }
        C42191x9 c42191x9 = c4v3.A0C;
        ?? obj = new Object();
        obj.A00 = c42191x9;
        this.A0C = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:74|75)(1:3)|(5:5|6|(1:8)(1:69)|9|(5:11|(1:15)|20|17|18)(15:21|(3:26|(1:65)(1:30)|22)|31|(2:33|(1:37))|38|(1:63)|42|(1:46)|62|48|(1:50)|51|(1:59)|60|61))|70|71|6|(0)(0)|9|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r117.A03(r125) <= r131) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b2, code lost:
    
        if (r117.A03(r0) <= r131) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0125, code lost:
    
        r109 = r117.A03(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC98514bU A00(X.C98494bS r112, X.C2A4 r113, X.InterfaceC92404Bv r114, X.C4TM r115, X.C4B6 r116, X.C97934aY r117, X.InterfaceC92354Bq r118, java.lang.Object r119, java.lang.String r120, int r121, int r122, int r123, int r124, long r125, long r127, long r129, long r131, long r133, long r135, long r137, long r139, long r141, long r143, boolean r145, boolean r146, boolean r147, boolean r148) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97894aU.A00(X.4bS, X.2A4, X.4Bv, X.4TM, X.4B6, X.4aY, X.4Bq, java.lang.Object, java.lang.String, int, int, int, int, long, long, long, long, long, long, long, long, long, long, boolean, boolean, boolean, boolean):X.4bU");
    }
}
