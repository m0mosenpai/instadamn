package X;

import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0WT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WT {
    public final int A00;
    public final MultiBufferLogger A01;
    public final String A02;
    public final ThreadLocal A03 = new ThreadLocal();
    public final long A04;
    public final int[] A05;

    public static boolean A01(C0WT c0wt, int i) {
        int[] iArr = c0wt.A05;
        if ((iArr.length < 1 || iArr[0] != -1) && Arrays.binarySearch(iArr, i) < 0) {
            return false;
        }
        return true;
    }

    public static boolean A02(C0WT c0wt, C0XX c0xx) {
        if (c0wt.A04 != ((c0xx.BIb() << 32) | c0xx.getMarkerId())) {
            return false;
        }
        return true;
    }

    public C0WT(MultiBufferLogger multiBufferLogger, String str, int[] iArr, int i, long j) {
        this.A04 = j;
        this.A02 = str;
        this.A00 = i;
        this.A05 = iArr;
        this.A01 = multiBufferLogger;
    }

    public static void A00(C0WT c0wt, C0XX c0xx, long j) {
        String str;
        List C53 = c0xx.C53();
        if (C53 != null) {
            ThreadLocal threadLocal = c0wt.A03;
            StringBuilder sb = (StringBuilder) threadLocal.get();
            if (sb == null) {
                sb = new StringBuilder();
                threadLocal.set(sb);
            }
            sb.setLength(0);
            for (int i = 0; i < C53.size() && (str = (String) C53.get(i)) != null && sb.length() + str.length() <= 1024; i++) {
                if (str.length() > 0) {
                    if (i != 0) {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                MultiBufferLogger multiBufferLogger = c0wt.A01;
                multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(7, 58, 0L, 0, c0xx.getMarkerId(), 0, j), "tags"), sb.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r4.A04.get() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r1 & X.C0g9.A01) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r4.A05(r3) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r0 = (com.facebook.profilo.ipc.TraceContext) r4.A06.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        r1 = r1 | r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2 >= 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C0XX r11) {
        /*
            r10 = this;
            int r0 = r11.getMarkerId()
            boolean r0 = A01(r10, r0)
            if (r0 == 0) goto L68
            X.0Vc r4 = X.C06360Vc.A0A
            if (r4 == 0) goto L68
            boolean r2 = A02(r10, r11)
            int r3 = r11.getMarkerId()
            r5 = 0
            java.lang.String r1 = r4.A05(r3)
            if (r1 == 0) goto L23
            java.lang.String r0 = "loom_id"
            r11.ABZ(r0, r1)
        L23:
            int r0 = r11.CCe()
            long r8 = (long) r0
            r0 = 16
            long r8 = r8 << r0
            r0 = 281474976645120(0xffffffff0000, double:1.39067116124321E-309)
            long r8 = r8 & r0
            boolean r0 = r11.CfK()
            if (r0 != 0) goto L3a
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r8 = r8 | r0
        L3a:
            if (r2 != 0) goto L51
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A04
            int r0 = r0.get()
            r2 = 0
            r1 = 0
            if (r0 != 0) goto L69
        L46:
            int r0 = X.C0g9.A01
            r1 = r1 & r0
            if (r1 == 0) goto L54
            java.lang.String r0 = r4.A05(r3)
            if (r0 == 0) goto L54
        L51:
            r0 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r8 = r8 | r0
        L54:
            long r3 = r11.BUr()
            com.facebook.profilo.logger.MultiBufferLogger r0 = r10.A01
            r1 = 4
            r2 = 46
            int r6 = r11.getMarkerId()
            r7 = r5
            r0.writeStandardEntry(r1, r2, r3, r5, r6, r7, r8)
            A00(r10, r11, r8)
        L68:
            return
        L69:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r4.A06
            java.lang.Object r0 = r0.get(r2)
            com.facebook.profilo.ipc.TraceContext r0 = (com.facebook.profilo.ipc.TraceContext) r0
            if (r0 == 0) goto L76
            int r0 = r0.A01
            r1 = r1 | r0
        L76:
            int r2 = r2 + 1
            r0 = 4
            if (r2 >= r0) goto L46
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WT.A03(X.0XX):void");
    }
}
