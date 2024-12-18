package X;

import android.os.SystemClock;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97884aT extends C97894aU {
    public static HashMap A00 = new HashMap();

    @Override // X.C97894aU, X.InterfaceC97914aW
    public final boolean D3B(AbstractC98234b2 abstractC98234b2, C65878Tvh c65878Tvh, C4XO c4xo, long j, boolean z, boolean z2) {
        String str;
        int i;
        long j2;
        boolean z3;
        boolean valueOf;
        String str2;
        String str3;
        int i2;
        C122355gV c122355gV;
        C4V3 c4v3 = this.A0U;
        if (c4v3.A0S) {
            return super.D3B(abstractC98234b2, c65878Tvh, c4xo, j, z, true);
        }
        HashMap A07 = A07();
        A0A(A07);
        C4C6 c4c6 = abstractC98234b2.A06.A07;
        boolean z4 = c4c6.A0U;
        A07.put("is_predicted", Boolean.valueOf(z4));
        A07.put("segment_predicted_number", Integer.valueOf(c4c6.A02));
        final IOException iOException = c65878Tvh.A03;
        if (iOException != null) {
            A07.put("exception", iOException.getLocalizedMessage());
            StringWriter stringWriter = new StringWriter();
            iOException.printStackTrace(new PrintWriter(stringWriter));
            A07.put("stack_trace", stringWriter.toString());
        }
        boolean z5 = false;
        if (!z) {
            str3 = "non_cancelable";
        } else {
            boolean z6 = c4v3.A0G;
            if (!z6) {
                this.A0P++;
            }
            long j3 = this.A0O;
            long j4 = abstractC98234b2.A02;
            boolean z7 = false;
            if (j3 != j4) {
                z7 = true;
            }
            this.A0O = j4;
            boolean z8 = iOException instanceof C93204Fw;
            if (z8) {
                C93204Fw c93204Fw = (C93204Fw) iOException;
                Map map = c93204Fw.A01;
                boolean A02 = W6R.A02(map);
                int i3 = c93204Fw.A00;
                A07.put("response_code", Integer.valueOf(i3));
                if (i3 == 404) {
                    if (z6) {
                        this.A0P++;
                    }
                    if (abstractC98234b2 instanceof AbstractC98514bU) {
                        long j5 = ((AbstractC98514bU) abstractC98234b2).A04;
                        if (j5 > 0) {
                            A08(j5, map);
                        }
                    }
                }
                if (i3 == 404) {
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
                    if (!this.A0D.A0R && z4 && c4v3.A0L) {
                        str2 = "static_manifest_and_predicted";
                        A07.put("reason", str2);
                        z3 = true;
                        valueOf = Boolean.valueOf(z3);
                    }
                    this.A0F = c93204Fw;
                    str2 = "fatal";
                    A07.put("reason", str2);
                    z3 = true;
                    valueOf = Boolean.valueOf(z3);
                } else {
                    if (i3 != 410 && i3 != 417 && i3 != 403) {
                        if (i3 == 504 && (c122355gV = this.A0a) != null && c122355gV.A01(abstractC98234b2, z7)) {
                            z3 = true;
                            this.A0K = true;
                            A07.put("reason", "504");
                            valueOf = true;
                        } else {
                            if (this.A0P >= 5) {
                                this.A0F = c93204Fw;
                                A07.put("reason", "too_many_retries");
                            } else if (i3 == 503) {
                                if (A02) {
                                    this.A0N++;
                                    A07.put("reason", "one_503");
                                    if (this.A0R != 3 && (i2 = c4v3.A05) > 0 && this.A0N >= i2) {
                                        this.A0F = c93204Fw;
                                    }
                                    z3 = false;
                                    valueOf = Boolean.valueOf(z3);
                                }
                            } else if (i3 == 416 && A02) {
                                str2 = "416";
                                A07.put("reason", str2);
                                z3 = true;
                                valueOf = Boolean.valueOf(z3);
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
                    valueOf = Boolean.valueOf(z3);
                }
                A07.put("cancel", valueOf);
                return z3;
            }
            C122355gV c122355gV3 = this.A0a;
            if (c122355gV3 != null && c122355gV3.A01(abstractC98234b2, false)) {
                str2 = "fall_through_manifest_refrsh";
            } else {
                if (!this.A0D.A0R && (abstractC98234b2 instanceof AbstractC98474bQ) && z8 && ((C93204Fw) iOException).A00 == 404) {
                    C97934aY c97934aY = this.A0f[this.A0E.CNJ(abstractC98234b2.A05)];
                    long BsK = c97934aY.A02.BsK(c97934aY.A00);
                    if (BsK != -1 && BsK != 0) {
                        if (((AbstractC98474bQ) abstractC98234b2).A00() > ((c97934aY.A02.B6h() + c97934aY.A01) + BsK) - 1) {
                            z5 = true;
                            this.A0L = true;
                            str3 = "missing_segment_workaround";
                        }
                    }
                }
                C4WE c4we = this.A0E;
                C4B6 c4b6 = abstractC98234b2.A05;
                int CNJ = c4we.CNJ(c4b6);
                C97934aY[] c97934aYArr = this.A0f;
                C97934aY c97934aY2 = c97934aYArr[CNJ];
                C4XZ c4xz = this.A0Y;
                C92134At A022 = c4xz.A02(c97934aY2.A03.A04);
                if (A022 != null && !c97934aY2.A07.equals(A022)) {
                    str2 = "base_url_has_changed";
                } else {
                    C4WE c4we2 = this.A0E;
                    List list = c97934aY2.A03.A04;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = c4we2.length();
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (c4we2.CQd(i5, elapsedRealtime)) {
                            i4++;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        hashSet.add(Integer.valueOf(((C92134At) list.get(i6)).A00));
                    }
                    int size = hashSet.size();
                    HashSet hashSet2 = new HashSet();
                    ArrayList A002 = C4XZ.A00(c4xz, list);
                    for (int i7 = 0; i7 < A002.size(); i7++) {
                        hashSet2.add(Integer.valueOf(((C92134At) A002.get(i7)).A00));
                    }
                    int size2 = size - hashSet2.size();
                    int i8 = length - i4;
                    if (i8 <= 1 && size - size2 <= 1) {
                        str = "no_fallback_options_are_available";
                    } else {
                        if (z8 && ((i = ((C93204Fw) iOException).A00) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
                            char c = 1;
                            if (size - size2 > 1) {
                                j2 = 300000;
                            } else {
                                c = 2;
                                if (i8 > 1) {
                                    j2 = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
                                    size = length;
                                    size2 = i4;
                                }
                            }
                            if (size - size2 > 1) {
                                if (c == 2) {
                                    C4WE c4we3 = this.A0E;
                                    z3 = c4we3.AE3(c4we3.CNJ(c4b6), j2);
                                } else {
                                    C92134At c92134At = c97934aY2.A07;
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                    String str4 = c92134At.A02;
                                    Map map2 = c4xz.A01;
                                    long j6 = elapsedRealtime2;
                                    if (map2.containsKey(str4)) {
                                        j6 = Math.max(elapsedRealtime2, ((Number) map2.get(str4)).longValue());
                                    }
                                    map2.put(str4, Long.valueOf(j6));
                                    int i9 = c92134At.A00;
                                    if (i9 != Integer.MIN_VALUE) {
                                        Integer valueOf2 = Integer.valueOf(i9);
                                        Map map3 = c4xz.A00;
                                        if (map3.containsKey(valueOf2)) {
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, ((Number) map3.get(valueOf2)).longValue());
                                        }
                                        map3.put(valueOf2, Long.valueOf(elapsedRealtime2));
                                    }
                                    z3 = true;
                                }
                                valueOf = Boolean.valueOf(z3);
                                android.util.Log.w("DefaultDashChunkSourceUpgraded", String.format("Track: blockListed=%s, chunk.trackFormat=%s, responseCode=%s", valueOf, c4b6, Integer.valueOf(i)));
                                int i10 = -1;
                                if (z3) {
                                    i10 = CNJ;
                                }
                                this.A01 = i10;
                                this.A0G = iOException;
                                final String str5 = c97934aYArr[CNJ].A07.A03;
                                final String format = String.format("Track:[%b, %d of %d, %s]", valueOf, Integer.valueOf(CNJ), Integer.valueOf(this.A0E.length()), c4b6.toString());
                                this.A0X.A0D(new WcG(new InterfaceC98114aq() { // from class: X.WcK
                                    @Override // X.InterfaceC98114aq
                                    public final void accept(Object obj) {
                                        ((C4TV) obj).A01(iOException, str5, format);
                                    }
                                }));
                                A07.put("cancel", valueOf);
                                return z3;
                            }
                        }
                        str = "no_fallback_resources_are_available";
                    }
                    A07.put("reason", str);
                    z3 = false;
                    valueOf = Boolean.valueOf(z3);
                    A07.put("cancel", valueOf);
                    return z3;
                }
            }
            A07.put("reason", str2);
            z3 = true;
            valueOf = Boolean.valueOf(z3);
            A07.put("cancel", valueOf);
            return z3;
        }
        A07.put("reason", str3);
        A07.put("cancel", Boolean.valueOf(z5));
        return z5;
    }

    @Override // X.C97894aU, X.InterfaceC97914aW
    public final long AZz(C4TT c4tt, long j) {
        if (this.A0U.A0R) {
            return super.AZz(c4tt, j);
        }
        for (C97934aY c97934aY : this.A0f) {
            if (c97934aY.A02 != null) {
                long BsK = c97934aY.A02.BsK(c97934aY.A00);
                if (BsK != 0) {
                    long A04 = c97934aY.A04(j);
                    long C8V = c97934aY.A02.C8V(A04 - c97934aY.A01);
                    if (C8V < j && (BsK == -1 || A04 < ((c97934aY.A02.B6h() + c97934aY.A01) + BsK) - 1)) {
                        C8V = c97934aY.A02.C8V((A04 + 1) - c97934aY.A01);
                    }
                    return c4tt.A00(j, C8V, C8V);
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0304, code lost:
    
        if (r0.A00 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        if (r1.A00 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023f, code lost:
    
        if (r37 <= r3) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    @Override // X.C97894aU, X.InterfaceC97914aW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BWr(X.C98034ai r68, X.AbstractC98474bQ r69, java.util.List r70, long r71, long r73, long r75, long r77) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97884aT.BWr(X.4ai, X.4bQ, java.util.List, long, long, long, long):void");
    }
}
