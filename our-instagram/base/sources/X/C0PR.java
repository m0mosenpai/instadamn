package X;

import android.content.Context;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0PR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PR {
    public static int A0H;
    public static boolean A0I;
    public C0MK A00;
    public ScheduledExecutorService A01;
    public final Context A02;
    public final C0MV A03;
    public final C04480Lp A04;
    public final C0PQ A05;
    public final Runnable A06;
    public final java.util.Set A07;
    public final Executor A08;
    public final AtomicInteger A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;
    public final InterfaceC08830cm A0D;
    public final InterfaceC08830cm A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final int A02(File file) {
        int length;
        File[] listFiles = file.listFiles(new C14920p6(4));
        if (listFiles == null) {
            length = 0;
        } else {
            length = listFiles.length;
        }
        int i = length + 1;
        new File(file, AnonymousClass001.A0O("_attempt", i)).createNewFile();
        if (C0PA.A04 && (file.getName().startsWith("critical_anr_app_death") || file.getName().startsWith("critical_unexplained") || file.getName().startsWith("critical_java_app_death") || file.getName().startsWith("critical_native"))) {
            HashMap hashMap = new HashMap();
            hashMap.put("count", String.valueOf(i));
            hashMap.put("report_id", file.getName());
            C0PA.A00("ReportSender.attempt", hashMap);
        }
        return i;
    }

    public C0PR(Context context, C0MV c0mv, C04480Lp c04480Lp, Runnable runnable, Executor executor, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6, boolean z, boolean z2) {
        C0PQ c0pq = new C0PQ();
        this.A07 = new HashSet();
        this.A09 = new AtomicInteger();
        this.A02 = context;
        this.A0E = interfaceC08830cm;
        this.A0B = interfaceC08830cm2;
        this.A0A = interfaceC08830cm3;
        this.A0C = interfaceC08830cm4;
        this.A0D = interfaceC08830cm6;
        this.A03 = c0mv;
        this.A08 = executor;
        this.A06 = runnable;
        this.A04 = c04480Lp;
        this.A05 = c0pq;
        this.A0F = z;
        this.A0G = z2;
        this.A00 = (C0MK) interfaceC08830cm5.get();
    }

    public static void A00(C0PR c0pr, String str, Throwable th) {
        if (c0pr.A0G) {
            DirectReports.A01((String) c0pr.A0E.get(), (String) c0pr.A0B.get(), (String) c0pr.A0A.get(), (String) c0pr.A0C.get(), "sending_error", AnonymousClass001.A0R("Error sending reports from ", str), th, null);
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x02db: IGET (r0 I:boolean) = (r6 I:X.0PR) (LINE:731) X.0PR.A0G boolean, block:B:177:0x02d3 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f A[Catch: all -> 0x02d2, IOException -> 0x02e6, TRY_ENTER, TryCatch #6 {all -> 0x02d2, blocks: (B:6:0x0017, B:8:0x0027, B:10:0x002a, B:12:0x002e, B:14:0x0047, B:16:0x004a, B:18:0x004e, B:20:0x0053, B:42:0x0100, B:45:0x00fd, B:69:0x00ed, B:70:0x011c, B:72:0x0129, B:75:0x0140, B:78:0x0155, B:80:0x015c, B:82:0x0163, B:84:0x0176, B:85:0x0179, B:87:0x0180, B:90:0x018b, B:106:0x01e6, B:107:0x01ee, B:109:0x01f4, B:113:0x023f, B:115:0x0243, B:117:0x024d, B:119:0x0257, B:121:0x0261, B:123:0x026b, B:124:0x0278, B:128:0x0287, B:130:0x028b, B:132:0x0295, B:134:0x029f, B:136:0x02a9, B:138:0x02b3, B:139:0x02c0, B:143:0x0201, B:144:0x0209, B:146:0x020f, B:148:0x021b, B:150:0x0221, B:152:0x0226, B:167:0x0108, B:169:0x0114, B:174:0x02c4), top: B:5:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129 A[Catch: all -> 0x02d2, IOException -> 0x02e6, TryCatch #6 {all -> 0x02d2, blocks: (B:6:0x0017, B:8:0x0027, B:10:0x002a, B:12:0x002e, B:14:0x0047, B:16:0x004a, B:18:0x004e, B:20:0x0053, B:42:0x0100, B:45:0x00fd, B:69:0x00ed, B:70:0x011c, B:72:0x0129, B:75:0x0140, B:78:0x0155, B:80:0x015c, B:82:0x0163, B:84:0x0176, B:85:0x0179, B:87:0x0180, B:90:0x018b, B:106:0x01e6, B:107:0x01ee, B:109:0x01f4, B:113:0x023f, B:115:0x0243, B:117:0x024d, B:119:0x0257, B:121:0x0261, B:123:0x026b, B:124:0x0278, B:128:0x0287, B:130:0x028b, B:132:0x0295, B:134:0x029f, B:136:0x02a9, B:138:0x02b3, B:139:0x02c0, B:143:0x0201, B:144:0x0209, B:146:0x020f, B:148:0x021b, B:150:0x0221, B:152:0x0226, B:167:0x0108, B:169:0x0114, B:174:0x02c4), top: B:5:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, X.09u] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0PR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(final X.C0N5 r23, final X.C0PR r24, final X.C0PV r25, final java.io.File r26) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PR.A01(X.0N5, X.0PR, X.0PV, java.io.File):boolean");
    }

    public final void A04(boolean z) {
        C0BJ.A00("cleanupSentReports");
        if (z) {
            try {
                C0K8.A0D("lacrima", "Cleanup sent reports blocking");
            } finally {
                C0BI.A00();
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C04590Mb.A02().execute(new Runnable() { // from class: X.0PN
            @Override // java.lang.Runnable
            public final void run() {
                int length;
                C0PR c0pr = C0PR.this;
                CountDownLatch countDownLatch2 = countDownLatch;
                if (!c0pr.A05.A00("cleanup")) {
                    File file = ((C0PI) c0pr.A0D.get()).A01;
                    try {
                        c0pr.A03.A02();
                    } catch (IOException e) {
                        C0PC.A00().DEh("ReportSenderCleanup", e, null);
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            try {
                                File[] listFiles2 = file2.listFiles(new C14920p6(4));
                                if (listFiles2 == null) {
                                    length = 0;
                                } else {
                                    length = listFiles2.length;
                                }
                                C0MV c0mv = c0pr.A03;
                                boolean z2 = false;
                                if (length >= 3) {
                                    z2 = true;
                                    c0pr.A06.run();
                                }
                                if (new File(file2, "_sent").exists() || z2) {
                                    if (C0PR.A0I) {
                                        C0K8.A0P("lacrima", "Would have deleted: %s", file2.getPath());
                                    } else if (new File(file2, "_sent").exists()) {
                                        synchronized (C0MV.class) {
                                            Iterator it = C0MV.A05.iterator();
                                            while (it.hasNext()) {
                                                it.next();
                                            }
                                            c0mv.A04(file2, "reports");
                                        }
                                    } else if (z2) {
                                        c0mv.A03(file2);
                                    }
                                }
                            } catch (IOException e2) {
                                C0K8.A0H("lacrima", "Error while deleting report directory", e2);
                                C0PC.A00().DEh("ReportSenderPurge", e2, null);
                            }
                        }
                        countDownLatch2.countDown();
                    }
                }
            }
        });
        if (z) {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                C0K8.A0D("lacrima", "Cleanup sent reports done");
            } catch (InterruptedException e) {
                C0PC.A00().DEh("ReportSenderBlockingCleanup", e, null);
            }
        }
    }

    public final void A03(final C0M6 c0m6, final boolean z) {
        String str;
        String name = c0m6.name();
        if (z) {
            str = ".blocking";
        } else {
            str = "";
        }
        C0BJ.A00(AnonymousClass001.A0g("sendPendingReports.", name, str));
        if (z) {
            try {
                C0K8.A0P("lacrima", "Send pending reports blocking %s", c0m6.A00);
            } finally {
                C0BI.A00();
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A08.execute(new AbstractRunnableC04600Mc() { // from class: X.0M5
            @Override // X.AbstractRunnableC04600Mc
            public final HashMap A00() {
                HashMap hashMap = new HashMap();
                hashMap.put("task", "sendPendingReports");
                hashMap.put("blocking", Boolean.toString(z));
                hashMap.put("category", c0m6.name());
                return hashMap;
            }

            /* JADX WARN: Code restructure failed: missing block: B:165:0x01bd, code lost:
            
                if (r20 == 0) goto L85;
             */
            /* JADX WARN: Code restructure failed: missing block: B:221:0x013e, code lost:
            
                if (r16 == false) goto L58;
             */
            /* JADX WARN: Removed duplicated region for block: B:138:0x02de  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x02b4 A[Catch: IOException -> 0x0341, all -> 0x0382, TRY_LEAVE, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Removed duplicated region for block: B:162:0x01a2 A[Catch: all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x0171, TryCatch #8 {all -> 0x0171, blocks: (B:61:0x0118, B:67:0x0156, B:69:0x0160, B:71:0x0168, B:211:0x0140, B:213:0x014a, B:217:0x012a, B:219:0x0134), top: B:60:0x0118 }] */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0168 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x02a9 A[Catch: IOException -> 0x0341, all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02d0 A[Catch: all -> 0x0382, TRY_ENTER, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02f1 A[Catch: all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02f5 A[Catch: all -> 0x0382, TRY_LEAVE, TryCatch #0 {all -> 0x0382, blocks: (B:3:0x001d, B:5:0x002c, B:6:0x002e, B:9:0x0030, B:11:0x004a, B:13:0x0052, B:15:0x005a, B:17:0x0068, B:20:0x0079, B:21:0x0076, B:25:0x007e, B:27:0x008c, B:29:0x009a, B:31:0x00a2, B:33:0x00aa, B:35:0x00ac, B:40:0x00bd, B:38:0x00c6, B:46:0x00d4, B:48:0x00e9, B:50:0x00f9, B:52:0x00fc, B:55:0x0105, B:57:0x0109, B:59:0x010e, B:74:0x016d, B:75:0x0196, B:81:0x02a5, B:83:0x02a9, B:85:0x02b0, B:87:0x02d0, B:91:0x02df, B:93:0x02f1, B:96:0x02f5, B:106:0x0331, B:135:0x0370, B:136:0x0373, B:139:0x02b4, B:142:0x02c1, B:144:0x02c6, B:145:0x02c9, B:150:0x033e, B:159:0x033b, B:153:0x0342, B:162:0x01a2, B:164:0x01b7, B:166:0x01bf, B:168:0x01cd, B:169:0x01d5, B:171:0x01e3, B:173:0x01f1, B:174:0x0202, B:176:0x020e, B:177:0x0210, B:182:0x0257, B:186:0x0351, B:187:0x0271, B:188:0x0212, B:201:0x024b, B:206:0x0353, B:207:0x0356, B:209:0x0285, B:227:0x017a, B:232:0x0177, B:234:0x018d, B:235:0x017b, B:237:0x0180, B:240:0x0188, B:245:0x0295, B:250:0x0292, B:252:0x0297, B:95:0x034b, B:262:0x0376, B:180:0x024f, B:181:0x0256, B:131:0x035e, B:132:0x036e, B:190:0x021f, B:195:0x0229, B:199:0x0231, B:200:0x023a, B:8:0x002f, B:98:0x02fa, B:99:0x02fc, B:110:0x0316, B:111:0x031c, B:117:0x0325, B:127:0x035c), top: B:2:0x001d, inners: #3, #4, #5, #6, #9, #10, #16, #20 }] */
            /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, X.0PV] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 914
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0M5.run():void");
            }
        });
        if (z) {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                C0K8.A0D("lacrima", "Send pending reports done");
            } catch (InterruptedException e) {
                C0PC.A00().DEh("ReportSenderSendPending", e, null);
            }
        }
    }
}
