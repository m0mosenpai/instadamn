package X;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.56E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56E {
    public boolean A02;
    public final int A03;
    public static final List A07 = Arrays.asList("SM-N770F", "SM-A515F");
    public static final C56E A05 = new C56E(2);
    public static final C56E A06 = new C56E(3);
    public final Object A04 = new Object();
    public int A01 = 0;
    public int A00 = 0;

    public static void A00(final C56E c56e, boolean z) {
        if (!A07.contains(Build.MODEL)) {
            Object obj = c56e.A04;
            synchronized (obj) {
                if (c56e.A00 == 0) {
                    Thread thread = new Thread(new Runnable() { // from class: X.56F
                        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:140:0x0187
                            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                            */
                        /* JADX WARN: Not initialized variable reg: 10, insn: 0x017b: IGET (r1 I:X.56E) = (r10 I:X.56F) (LINE:379) X.56F.A00 X.56E, block:B:133:0x0178 */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
                        /* JADX WARN: Removed duplicated region for block: B:115:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Type inference failed for: r10v0, types: [X.56F] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 394
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C56F.run():void");
                        }
                    });
                    thread.setDaemon(true);
                    thread.start();
                    c56e.A00 = 1;
                }
                if (z) {
                    long j = 500;
                    while (c56e.A00 != 2 && j > 0) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            obj.wait(j);
                            j -= System.currentTimeMillis() - currentTimeMillis;
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public C56E(int i) {
        this.A02 = false;
        this.A03 = i;
        if (A07.contains(Build.MODEL) && i == 2) {
            this.A02 = true;
        }
    }
}
