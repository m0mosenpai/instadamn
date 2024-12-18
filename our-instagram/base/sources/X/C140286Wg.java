package X;

import com.facebook.blescan.BleScanOperation;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140286Wg extends C93R {
    public int A00 = 0;
    public Throwable A01;
    public Throwable A02;
    public Throwable A03;
    public BleScanOperation A04;
    public C140296Wh A05;
    public QFS A06;
    public final O1K A07;
    public final C108454uW A08;
    public final ScheduledExecutorService A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;

    @Override // X.C93R
    public final synchronized void A03() {
        C140296Wh c140296Wh = this.A05;
        if (c140296Wh != null && !c140296Wh.isDone()) {
            this.A05.cancel(true);
        }
        QFS qfs = this.A06;
        if (qfs != null && !qfs.isDone()) {
            this.A06.cancel(true);
        }
        BleScanOperation bleScanOperation = this.A04;
        if (bleScanOperation != null && !bleScanOperation.isDone()) {
            this.A04.cancel(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
    
        r19 = java.lang.Boolean.valueOf(r5.hasCapability(17));
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C140286Wg r32, X.SX8 r33, java.lang.Object r34, java.lang.Object r35, java.lang.Object r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140286Wg.A00(X.6Wg, X.SX8, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0192, code lost:
    
        r0 = r10.A02.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0198, code lost:
    
        if (r0 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019a, code lost:
    
        r10.A03 = r10.A0A.schedule(new X.TLC(r10), r0, java.util.concurrent.TimeUnit.MILLISECONDS);
        r3 = new X.Q1g(r10);
        r10.A00 = r3;
        X.C0DJ.A00(r3, r10.A05, new android.content.IntentFilter("android.net.wifi.SCAN_RESULTS"));
        r1 = r10.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c2, code lost:
    
        if (X.C108454uW.A00(r1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c8, code lost:
    
        if (r1.A02() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ca, code lost:
    
        r1 = (android.net.wifi.WifiManager) r1.A01.getSystemService(r13);
        r0 = X.AbstractC09830fh.$redex_init_class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d8, code lost:
    
        if (X.C0T8.A01() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f5, code lost:
    
        r1 = r1.startScan();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f9, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01da, code lost:
    
        r2 = X.C0T8.A01;
        r2.readLock().lock();
        r0 = X.C0T8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e5, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e7, code lost:
    
        r1 = r0.Do8(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ed, code lost:
    
        r2.readLock().unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ec, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0220, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0221, code lost:
    
        X.C0T8.A01.readLock().unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x022a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        throw new X.C61254Rjs(X.C05F.A0Y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        throw new X.C61254Rjs(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0158, code lost:
    
        if (((android.net.wifi.WifiManager) r1.getSystemService(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_WIFI)).isScanAlwaysAvailable() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014a, code lost:
    
        if (((android.net.wifi.WifiManager) r1.getSystemService(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_WIFI)).isWifiEnabled() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0160, code lost:
    
        if (r10.A02.A00 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0162, code lost:
    
        r15 = r10.A01.A01(false);
        r10.A09.A00(r15);
        r2 = r10.A02.A01;
        r14 = r10.A07;
        r1 = X.AbstractC62181S1c.A00(r15, r2, r14.now());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
    
        if (r1.isEmpty() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0184, code lost:
    
        r0 = X.C63282Sgh.A01(r10.A06, r14, r1);
        X.QFS.A00(r10);
        r10.A01(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024a A[Catch: all -> 0x03b1, TryCatch #9 {, blocks: (B:4:0x0003, B:5:0x001e, B:16:0x00d9, B:17:0x00da, B:18:0x0100, B:40:0x0232, B:41:0x0233, B:43:0x024a, B:44:0x0254, B:79:0x0375, B:80:0x0376, B:115:0x03af, B:116:0x03b0, B:121:0x038a, B:183:0x03ac, B:7:0x001f, B:10:0x0027, B:13:0x0033, B:15:0x004c, B:20:0x0101, B:22:0x011a, B:24:0x0128, B:26:0x0130, B:28:0x0136, B:31:0x013e, B:33:0x015a, B:35:0x0162, B:37:0x017e, B:39:0x0184, B:124:0x0192, B:126:0x019a, B:128:0x01c4, B:130:0x01ca, B:139:0x01ed, B:132:0x01f5, B:143:0x0221, B:144:0x022a, B:145:0x01fc, B:147:0x0204, B:150:0x014c, B:152:0x020a, B:158:0x0212, B:160:0x0218, B:165:0x022c, B:166:0x0058, B:168:0x0071, B:169:0x0077, B:170:0x007d, B:175:0x008d, B:176:0x008e, B:180:0x03a9, B:181:0x03aa, B:172:0x007e, B:174:0x008b, B:177:0x03a0, B:178:0x03a7, B:46:0x0255, B:47:0x0270, B:77:0x0342, B:78:0x0343, B:112:0x034f, B:113:0x0350, B:120:0x0355, B:118:0x036f), top: B:3:0x0003, inners: #3, #5 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.YFz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.YFz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.YFz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A04(X.SX8 r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140286Wg.A04(X.SX8, java.lang.String):void");
    }

    public C140286Wg(O1K o1k, C108454uW c108454uW, ScheduledExecutorService scheduledExecutorService, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        this.A07 = o1k;
        this.A0B = interfaceC08830cm;
        this.A0C = interfaceC08830cm2;
        this.A0A = interfaceC08830cm3;
        this.A08 = c108454uW;
        this.A09 = scheduledExecutorService;
    }
}
